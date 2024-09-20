public class DatosPrimitivos {
    public static void main(String[] args) throws Exception {
        /**
         * Lista de datos primitivos
         * - byte
         * - short
         * - int
         * - long
         * - float
         * - double
         * - boolean
         * - char
         */

        //  Definir valores
        byte edadPlantaMadre = 25;
        short alturaPlantaMadre = 150;
        int numeroPlantas = 50;
        long hectareasCultivo = 7800000000L;
        float temperatura = 36.6f;
        double precioKilo = 2.141592653589793;
        boolean temporadaCosecha = true;
        char genetica = 'S';

        // Imprimir los valores
        System.out.println("Edad planta madre: " + edadPlantaMadre);
        System.out.println("Altura planta madre: " + alturaPlantaMadre);
        System.out.println("Número de hijos: " + numeroPlantas);
        System.out.println("Hectáreas de cultivo: " + hectareasCultivo);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Precio kilo: " + precioKilo);
        System.out.println("¿Hay que cosechar? " + temporadaCosecha);
        System.out.println("Indica o Sativa: " + genetica);
    }
}





