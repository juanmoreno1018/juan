class conectores_logicos
{
    public static void main(String[] args) {
        // Definir las condiciones
        boolean condicion1 = true;
        boolean condicion2 = false;

        // Verificar si ambas condiciones se cumplen
        boolean resultado = verificarCondiciones(condicion1, condicion2);

        // Imprimir el resultado
        System.out.println("El resultado es: " + resultado);
    }

    // Método para verificar las condiciones
    public static boolean verificarCondiciones(boolean condicion1, boolean condicion2) {
        // Verificar si ambas condiciones se cumplen
        if (condicion1 && condicion2) {
            return true;
        } else {
            return false;
        }
    }
}