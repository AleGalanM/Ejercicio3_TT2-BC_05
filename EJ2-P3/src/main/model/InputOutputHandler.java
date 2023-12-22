package ISOFT2_2022_ET.ISOFT2_2022_ET.model;

import java.util.Scanner;

public class InputOutputHandler {

    private Scanner scanner;

    public InputOutputHandler() {
        scanner = new Scanner(System.in);
    }

    public double leerDato(String mensaje) {
        System.out.println(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, introduzca un número válido.");
            scanner.next(); // Descartar entrada no válida
        }
        return scanner.nextDouble();
    }

    public void mostrarResultado(String mensaje) {
        System.out.println(mensaje);
    }
}
