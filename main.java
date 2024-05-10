
// Definición de la clase abstracta Vehiculo
abstract class Vehiculo {
    // Método abstracto para acelerar (debe ser implementado por las clases hijas)
    abstract void acelerar();

    // Método abstracto para frenar (debe ser implementado por las clases hijas)
    abstract void frenar();
}

// Clase Coche que hereda de Vehiculo
class Coche extends Vehiculo {
    // Implementación del método acelerar de la clase Vehiculo
    void acelerar() {
        System.out.println("El coche acelera.");
    }

    // Implementación del método frenar de la clase Vehiculo
    void frenar() {
        System.out.println("El coche frena.");
    }
}

// Clase principal que contiene el método main
public class main {
    public static void main(String[] args) {
        // Creación de un objeto Vehiculo que apunta a un objeto de tipo Coche
        Vehiculo vehiculo = new Coche();
        // Llamada al método acelerar del objeto vehiculo (que en tiempo de ejecución es un Coche)
        vehiculo.acelerar();
        // Llamada al método frenar del objeto vehiculo (que en tiempo de ejecución es un Coche)
        vehiculo.frenar();
    }
}
