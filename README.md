Ejercicio 16 - Configuración General de un Hospital

Explicación del programa

En este ejercicio se creó una clase llamada ConfiguracionHospital que aplica el patrón Singleton con inicialización diferida (lazy initialization) para centralizar y compartir los parámetros generales de la aplicación entre los módulos de recepción y consultorios sin utilizar librerías externas ni imports.
La clase cuenta con:
- Una variable estática privada llamada instancia que se inicializa únicamente cuando se solicita por primera vez.
- Atributos privados (nombre, apertura, cierre y duracionTurno) con sus respectivos getters y setters validados.
- Un constructor privado que impide la instanciación directa desde los módulos externos.
- Un método estático público llamado getInstancia() que evalúa si la instancia es nula antes de crearla, devolviendo siempre la misma referencia única.

Luego, dentro del método main, se simulan los módulos de recepción y consultorios obteniendo referencias al Singleton:
ConfiguracionHospital moduloRecepcion = ConfiguracionHospital.getInstancia();
ConfiguracionHospital moduloConsultorios = ConfiguracionHospital.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar mediante comparación de identidad que ambas referencias apuntan al mismo objeto, demostrar que las consultas posteriores no construyen nuevas instancias, y verificar que los cambios realizados en un módulo se reflejan instantáneamente en el otro.

Lógica utilizada

La lógica del programa consiste en:
- Restringir la creación de objetos externos mediante un constructor privado.
- Controlar la creación diferida mediante el método getInstancia() asegurando que la única instancia se cree bajo demanda.
- Aplicar validaciones estrictas en los setters para asegurar que la duración de los turnos sea estrictamente positiva y que el horario de cierre sea siempre posterior al de apertura.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia?: true

Configuración inicial (desde Consultorios):
Hospital: Hospital Regional
Horario: 8:00 hs a 20:00 hs
Duración de turnos: 30 minutos

Modificando configuración desde Recepción...
Horarios actualizados correctamente.
Duración de turnos actualizada correctamente.
Error: La duración de los turnos debe ser un valor positivo.
Error: El horario de cierre debe ser posterior al de apertura.

Verificando cambios reflejados (desde Consultorios):
Hospital: Hospital Central
Horario: 7:00 hs a 22:00 hs
Duración de turnos: 20 minutos

Captura de pantalla
<img width="652" height="592" alt="image" src="https://github.com/user-attachments/assets/7c591802-8097-494b-8e05-18b163ef9b19" />

