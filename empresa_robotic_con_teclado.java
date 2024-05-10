import java.util.Scanner;

public class empresa_robotic_con_teclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bienvenido a robotic:");

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la clave del departamento:");
        int clave = scanner.nextInt();

        System.out.println("Ingrese los años de servicio:");
        int años = scanner.nextInt();

        int diasVacaciones = 0;

        switch (clave) {
            case 1:
                if (años == 1) {
                    diasVacaciones = 6;
                } else if (años >= 2 && años <= 6) {
                    diasVacaciones = 10;
                } else if (años >= 7) {
                    diasVacaciones = 20;
                }
                break;
            case 2:
                if (años == 1) {
                    diasVacaciones = 7;
                } else if (años >= 2 && años <= 6) {
                    diasVacaciones = 15;
                } else if (años >= 7) {
                    diasVacaciones = 22;
                }
                break;
            case 3:
                if (años == 1) {
                    diasVacaciones = 10;
                } else if (años >= 2 && años <= 6) {
                    diasVacaciones = 20;
                } else if (años >= 7) {
                    diasVacaciones = 30;
                }
                break;
            default:
                System.out.println("Clave de departamento no válida.");
                return;
        }

        System.out.println(nombre + " clave " + clave + ", tiene " + años + " años de servicio, Merece " + diasVacaciones + " días de vacaciones.");
    }
}
