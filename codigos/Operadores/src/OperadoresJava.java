public class OperadoresJava {

    // 1. Función para Operadores Aritméticos
    public static void operadoresAritmeticos() {
        int a = 10;
        int b = 3;

        System.out.println("\n=== Operadores Aritméticos ===");
        System.out.println("Suma: " + (a + b)); // 13
        System.out.println("Resta: " + (a - b)); // 7
        System.out.println("Multiplicación: " + (a * b)); // 30
        System.out.println("División: " + (a / b)); // 3
        System.out.println("Resto: " + (a % b)); // 1
    }

    // 2. Función para Operadores Relacionales
    public static void operadoresRelacionales() {
        int a = 10;
        int b = 20;

        System.out.println("\n=== Operadores Relacionales ===");
        System.out.println("a es igual a b: " + (a == b)); // false
        System.out.println("a es diferente a b: " + (a != b)); // true
        System.out.println("a es mayor que b: " + (a > b)); // false
        System.out.println("a es menor o igual que b: " + (a <= b)); // true
    }

    // 3. Función para Operadores Lógicos
    public static void operadoresLogicos() {
        boolean x = false;
        boolean y = false;

        System.out.println("\n=== Operadores Lógicos ===");
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false
    }

    // 4. Función para Operadores de Asignación
    public static void operadoresAsignacion() {
        int a = 10;
        a += 5; // a = a + 5

        System.out.println("\n=== Operadores de Asignación ===");
        System.out.println("Nuevo valor de a: " + a); // 15
    }

    // 5. Función para Operadores Unarios
    public static void operadoresUnarios() {
        int a = 5;

        System.out.println("\n=== Operadores Unarios ===");
        System.out.println("a: " + a); // 5
        System.out.println("a++: " + a++); // 5 (usa a y luego incrementa)
        System.out.println("++a: " + ++a); // 7 (incrementa antes de usar)
        System.out.println("a--: " + a--); // 7 (usa a y luego decrementa)
        System.out.println("--a: " + --a); // 5 (decrementa antes de usar)
    }

    // 6. Función para Operador Ternario
    public static void operadorTernario() {
        int edad = 18;

        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println("\n=== Operador Ternario ===");
        System.out.println("Resultado: " + resultado); // Mayor de edad
    }

    // 7. Función para Operadores de Bits
    public static void operadoresDeBits() {
        int a = 5; // 0101 en binario
        int b = 3; // 0011 en binario

        System.out.println("\n=== Operadores de Bits ===");
        System.out.println("a & b: " + (a & b)); // AND bit a bit -> 0001
        System.out.println("a | b: " + (a | b)); // OR bit a bit -> 0111
        System.out.println("a ^ b: " + (a ^ b)); // XOR bit a bit -> 0110
        System.out.println("~a: " + (~a)); // Complemento -> 11111111111111111111111111111010 (inversión de bits)
        System.out.println("a << 1: " + (a << 1)); // Desplazamiento izquierda -> 1010
        System.out.println("a >> 1: " + (a >> 1)); // Desplazamiento derecha -> 0010
    }

    // Método principal para ejecutar todas las funciones
    public static void main(String[] args) {
        operadoresAritmeticos(); // Ejemplo de operadores aritméticos
        operadoresRelacionales(); // Ejemplo de operadores relacionales
        operadoresLogicos(); // Ejemplo de operadores lógicos
        operadoresAsignacion(); // Ejemplo de operadores de asignación
        operadoresUnarios(); // Ejemplo de operadores unarios
        operadorTernario(); // Ejemplo de operador ternario
        operadoresDeBits(); // Ejemplo de operadores de bits
    }
}
