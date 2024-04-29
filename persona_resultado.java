import java.util.Scanner;

public class persona_resultado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "", apellido = "";
        float numUno = 0, numDos = 0, numTres = 0, resultado = 0;
        int edad = 0;
        System.out.println(("¿cual es tu nombre?"));
        nombre = in.nextLine();
        System.out.println(("¿cual es tu apellido?"));
        apellido = in.nextLine();
        System.out.println(("¿cual es tu edad?"));
        edad = in.nextInt();

        System.out.println(("digite el primer numero de la multiplicacion: "));
        numUno = in.nextFloat();

        System.out.println(("digite el segundo numero de la multiplicacion: "));
        numDos = in.nextFloat();

        System.out.println(("digite el segundo numero de la multiplicacion: "));
        numTres = in.nextFloat();

        resultado = (numUno * numDos * numTres) / 3;

        System.out.println(("Bienvenido " + nombre + " " + apellido + "tienes " + edad + " años" + "\n"
                + "El resultado de la multiplicacion y su promedio es : " + resultado));

    }
}
