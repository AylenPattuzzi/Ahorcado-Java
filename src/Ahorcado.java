import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner aue nos permite que el usuario ingrese un valor.
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y Asignaciones
        String paralabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[paralabraSecreta.length()];

        // Estructura de control de tipo iterariva (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "  ("+ paralabraSecreta.length() + " letras)"); // String.valueOf esto se
                                                                                           // utiliza cuando tenermos
                                                                                           // una palabra de chars
            System.out.println("Introduce una letra por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0)); // .next().charAt(0) sirva para que si la
                                                                          // persona escribe una palabra
            // solo le tome la primera letra de esa palabra ingresada.

            boolean letraCorrecta = false;

            // Estructura de control de tipo iterariva (bucle)
            for (int i = 0; i < paralabraSecreta.length(); i++) {

                // Estructura de control condicional
                if (paralabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            // .equals se utiliza para poder comparar cosas
            if (String.valueOf(letrasAdivinadas).equals(paralabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicitaciones, has adivinado la palabra secreta: " + paralabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("Que pena te has quedo sin intentos");
        }

        scanner.close();
    }
}
