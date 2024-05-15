import java.util.Scanner;
public class SwitchExampleConTeclado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" select your option:");
        int opcion = scanner.nextInt();
        
        switch (opcion) { //switch donde se escoge un caso
            case 1://si se escoge este caso, se corre el caso
                System.out.println("you select the option 1");
                break;//termina el codigo

            case 2:
                System.out.println("you select the option 2");
                break;
            case 3:
                System.out.println("you select the option 3");
                break;
            default:// opcion de invalidacion 
                System.out.println("invalid option");
        }
    }
}