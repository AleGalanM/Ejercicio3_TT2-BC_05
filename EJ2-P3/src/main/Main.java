package ISOII_BC.ISOII_BC;
import java.util.Scanner;
import ISOII_BC.ISOII_BC.model.FuerzaGravitatoria;
import ISOII_BC.ISOII_BC.model.InputOutputHandler;

public class Main {

    public static void main(String[] args) {
        InputOutputHandler ioHandler = new InputOutputHandler();
        FuerzaGravitatoria fuerzaGravitatoria = new FuerzaGravitatoria();

        try {
            double masa1 = ioHandler.leerDato("Introduzca la masa del primer cuerpo (kg): ");
            double masa2 = ioHandler.leerDato("Introduzca la masa del segundo cuerpo (kg): ");
            double distancia = ioHandler.leerDato("Introduzca la distancia entre los cuerpos (m): ");

            double fuerza = fuerzaGravitatoria.calcularFuerzaGravitatoria(masa1, masa2, distancia);
            ioHandler.mostrarResultado("La fuerza de atracción gravitatoria es: " + fuerza + " N");
        } catch (InvalidInputException e) {
            ioHandler.mostrarResultado("Error: " + e.getMessage());
        }
    }
}
