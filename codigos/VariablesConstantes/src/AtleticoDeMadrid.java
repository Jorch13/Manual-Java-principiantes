public class AtleticoDeMadrid {

    // 1. Variable de clase (estática)
    // Esta variable pertenece a la clase y es compartida por todos los objetos de la clase.
    static String nombreDelEquipo = "Atlético de Madrid";

    // 2. Variable de instancia
    // Cada objeto tendrá un nombre de jugador único y la posición del jugador.
    String nombreDelJugador;
    String posicion;

    // 3. Constante
    // Esta constante indica el número máximo de jugadores permitidos en un equipo de fútbol.
    final int MAX_JUGADORES = 25;

    // Constructor para inicializar la variable de instancia
    public AtleticoDeMadrid(String nombre, String posicion) {
        this.nombreDelJugador = nombre; // Inicializando el nombre del jugador
        this.posicion = posicion; // Inicializando la posición del jugador
    }

    // Método que demuestra el uso de variables locales
    public void mostrarInformacionDelJugador() {
        // 4. Variable local
        // Esta variable solo es accesible dentro de este método.
        int numeroDeGoles = 10; // Supongamos que el jugador ha marcado 10 goles

        System.out.println("Nombre del jugador: " + nombreDelJugador); // Variable de instancia
        System.out.println("Posición: " + posicion); // Variable de instancia
        System.out.println("Goles marcados: " + numeroDeGoles); // Variable local
        System.out.println("Equipo: " + nombreDelEquipo); // Variable de clase
        System.out.println("Número máximo de jugadores permitidos en el equipo: " + MAX_JUGADORES); // Constante
    }

    public static void main(String[] args) {
        // Creación de un objeto de la clase AtleticoDeMadrid representando a un jugador
        AtleticoDeMadrid jugador1 = new AtleticoDeMadrid("Antoine Griezmann", "Delantero");

        // Llamada al método para mostrar la información del jugador
        jugador1.mostrarInformacionDelJugador();

        // Creación de otro objeto representando a un segundo jugador
        AtleticoDeMadrid jugador2 = new AtleticoDeMadrid("Jan Oblak", "Portero");
        jugador2.mostrarInformacionDelJugador();
    }
}


