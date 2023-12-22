package ISOII_BC.ISOII_BC.model;

public class FuerzaGravitatoria {

    private static final double G = 6.67430e-11;

    public double calcularFuerzaGravitatoria(double masa1, double masa2, double distancia) throws InvalidInputException {
        if (masa1 <= 0 || masa2 <= 0 || distancia <= 0) {
            throw new InvalidInputException("Masa y distancia deben ser mayores que cero.");
        }

        return G * (masa1 * masa2) / Math.pow(distancia, 2);
    }
}
