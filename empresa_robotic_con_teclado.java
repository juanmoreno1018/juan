import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class empresa_robotic_con_teclado { // Define la clase principal
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.println("bienvenido a robotic:"); // Imprime un mensaje de bienvenida

        // Solicita al usuario que ingrese su nombre
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine(); // Lee el nombre del usuario

        // Solicita al usuario que ingrese la clave del departamento
        System.out.println("Ingrese la clave del departamento:");
        int clave = scanner.nextInt(); // Lee la clave del departamento

        // Solicita al usuario que ingrese los años de servicio
        System.out.println("Ingrese los años de servicio:");
        int años = scanner.nextInt(); // Lee los años de servicio

        int diasVacaciones = 0; // Inicializa una variable para los días de vacaciones

        // Comienza un bloque switch que evalúa la clave del departamento
        switch (clave) {
            case 1: // Caso para la clave del departamento 1
                // Dependiendo de los años de servicio, se asignan diferentes números de días de vacaciones
                if (años == 1) {
                    diasVacaciones = 6;
                } else if (años >= 2 && años <= 6) {
                    diasVacaciones = 10;
                } else if (años >= 7) {
                    diasVacaciones = 20;
                }
                break; // Termina este caso del bloque switch
            case 2: // Caso para la clave del departamento 2
                // Similar al caso anterior, pero con diferentes números de días de vacaciones
                if (años == 1) {
                    diasVacaciones = 7;
                } else if (años >= 2 && años <= 6) {
                    diasVacaciones = 15;
                } else if (años >= 7) {
                    diasVacaciones = 22;
                }
                break; // Termina este caso del bloque switch
            case 3: // Caso para la clave del departamento 3
                // Similar a los casos anteriores, pero con diferentes números de días de vacaciones
                if (años == 1) {
                    diasVacaciones = 10;
                } else if (años >= 2 && años <= 6) {
                    diasVacaciones = 20;
                } else if (años >= 7) {
                    diasVacaciones = 30;
                }
                break; // Termina este caso del bloque switch
            default: // Caso por defecto para cuando la clave del departamento no es válida
                System.out.println("Clave de departamento no válida.");
                return; // Termina la ejecución del programa
        }

        // Imprime los detalles del empleado, incluyendo los días de vacaciones que le corresponden
        System.out.println(nombre + " clave " + clave + ", tiene " + años + " años de servicio, Merece " + diasVacaciones + " días de vacaciones.");
    }
}
