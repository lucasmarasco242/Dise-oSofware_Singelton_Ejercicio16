public class Main {
    public static void main(String[] args) {
        // Obteniendo la instancia mediante inicialización diferida desde Recepción y Consultorios
        ConfiguracionHospital moduloRecepcion = ConfiguracionHospital.getInstancia();
        ConfiguracionHospital moduloConsultorios = ConfiguracionHospital.getInstancia();

        System.out.println("¿Es la misma instancia?: " + (moduloRecepcion == moduloConsultorios));

        System.out.println("\nConfiguración inicial (desde Consultorios):");
        System.out.println("Hospital: " + moduloConsultorios.getNombre());
        System.out.println("Horario: " + moduloConsultorios.getApertura() + ":00 hs a " + moduloConsultorios.getCierre() + ":00 hs");
        System.out.println("Duración de turnos: " + moduloConsultorios.getDuracionTurno() + " minutos");

        System.out.println("\nModificando configuración desde Recepción...");
        moduloRecepcion.setNombre("Hospital Central");
        moduloRecepcion.setHorarios(7, 22);
        moduloRecepcion.setDuracionTurno(20);

        // Pruebas de validación (duración negativa y horario inválido)
        moduloRecepcion.setDuracionTurno(-15);
        moduloRecepcion.setHorarios(18, 10);

        System.out.println("\nVerificando cambios reflejados (desde Consultorios):");
        System.out.println("Hospital: " + moduloConsultorios.getNombre());
        System.out.println("Horario: " + moduloConsultorios.getApertura() + ":00 hs a " + moduloConsultorios.getCierre() + ":00 hs");
        System.out.println("Duración de turnos: " + moduloConsultorios.getDuracionTurno() + " minutos");
    }
}