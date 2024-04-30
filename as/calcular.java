class Figura {
    double calcularArea(){
        return 0;
    }
}

class Rectangulo extends Figura {
    double base;
    double altura;

    double calcularArea(){
        return base*altura;
    }
    
}

public class calcular {

    public static void calcular (String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.base = 5;
        rectangulo.altura = 3;
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    }
}