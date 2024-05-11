package animal;

//Definición de la clase Animal
class Animal {
    // Método para hacer sonido genérico
    void hacerSonido() {
        System.out.println("Haciendo un sonido genérico...");
    }
}

// Definición de la clase Perro que hereda de Animal
class Perro extends Animal {
    // Método para hacer sonido específico de perro
    @Override
    void hacerSonido() {
        System.out.println("Guau!");
    }
}

// Definición de la clase Gato que hereda de Animal
class Gato extends Animal {
    // Método para hacer sonido específico de gato
    @Override
    void hacerSonido() {
        System.out.println("Miauuuu");
    }
}

// Clase principal Main
public class others {
    public static void main(String[] args) {
        // Crear instancia de Perro y asignarla a una referencia de tipo Animal
        Animal animal1 = new Perro();
        // Crear instancia de Gato y asignarla a una referencia de tipo Animal
        Animal animal2 = new Gato();

        // Llamar al método hacerSonido de la instancia de Perro
        // Salida esperada: Guau!
        animal1.hacerSonido();
        // Llamar al método hacerSonido de la instancia de Gato
        // Salida esperada: Miauuuu
        animal2.hacerSonido();
    }
}