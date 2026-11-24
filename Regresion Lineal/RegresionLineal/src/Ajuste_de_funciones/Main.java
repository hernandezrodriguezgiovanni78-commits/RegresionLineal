package Ajuste_de_funciones;

public class Main {

    public static void main(String[] args) {
        // Conjunto de datos de prueba
        double[] x = {1, 2, 3, 4, 5, 6, 7};
        double[] y = {1.5, 3.8, 6.7, 9.0, 11.2, 13.6, 16.0};

        double[] resultados = RegresionLineal.calcularMinimosCuadrados(x, y);

        double beta0 = resultados[0];
        double beta1 = resultados[1];
        double xPrueba = 8.0;
        double yEstimado = RegresionLineal.predecir(beta0, beta1, xPrueba);

        System.out.printf("Predicción para X = %.2f -> Y estimado = %.4f\n", xPrueba, yEstimado);
    }
}
