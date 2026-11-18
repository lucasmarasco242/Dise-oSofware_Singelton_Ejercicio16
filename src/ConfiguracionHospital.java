public class ConfiguracionHospital {
    private static ConfiguracionHospital instancia;
    private String nombre;
    private int apertura;
    private int cierre;
    private int duracionTurno;

    private ConfiguracionHospital() {
        this.nombre = "Hospital Regional";
        this.apertura = 8;
        this.cierre = 20;
        this.duracionTurno = 30;
    }

    public static ConfiguracionHospital getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionHospital();
        }
        return instancia;
    }

    public void setNombre(String n) {
        if (n != null && !n.isEmpty()) {
            this.nombre = n;
        }
    }

    public void setHorarios(int a, int c) {
        if (c > a) {
            this.apertura = a;
            this.cierre = c;
            System.out.println("Horarios actualizados correctamente.");
        } else {
            System.out.println("Error: El horario de cierre debe ser posterior al de apertura.");
        }
    }

    public void setDuracionTurno(int d) {
        if (d > 0) {
            this.duracionTurno = d;
            System.out.println("Duración de turnos actualizada correctamente.");
        } else {
            System.out.println("Error: La duración de los turnos debe ser un valor positivo.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getApertura() {
        return apertura;
    }

    public int getCierre() {
        return cierre;
    }

    public int getDuracionTurno() {
        return duracionTurno;
    }
}