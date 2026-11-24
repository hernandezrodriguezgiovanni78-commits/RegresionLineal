package Ajuste_de_funciones;

/**
 * Clase que implementa el cálculo de Regresión Lineal Simple
 * utilizando el método de Mínimos Cuadrados (incluyendo Pearson y R2).
 */
public class RegresionLineal {

    /**
     * Calcula la regresión y retorna los coeficientes [beta0, beta1, r, r2].
     *
     * @param x Arreglo con los valores independientes.
     * @param y Arreglo con los valores dependientes.
     * @return Arreglo double[] con los indicadores estadísticos.
     */
    public static double[] calcularMinimosCuadrados(double[] x, double[] y) {
        if (x.length != y.length || x.length == 0) {
            System.out.println("Error: los arreglos deben tener el mismo tamaño y no estar vacíos.");
            return new double[]{0.0, 0.0, 0.0, 0.0};
        }

        int n = x.length;
        double sumX = 0, sumY = 0, sumX2 = 0, sumY2 = 0, sumXY = 0;

        // Acumulamos las sumatorias necesarias
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];
            sumXY += x[i] * y[i];
        }

        // Fórmulas oficiales de Mínimos Cuadrados
        double beta1 = (n * sumXY - sumX * sumY) / (n * sumX2 - (sumX * sumX));
        double beta0 = (sumY - beta1 * sumX) / n;

        // Cálculo del coeficiente de correlación de Pearson (r) y R^2
        double numeradorR = (n * sumXY) - (sumX * sumY);
        double denominadorR = Math.sqrt(((n * sumX2) - (sumX * sumX)) * ((n * sumY2) - (sumY * sumY)));
        double pearsonR = (denominadorR != 0) ? (numeradorR / denominadorR) : 0.0;
        double r2 = pearsonR * pearsonR;

        System.out.println("--- RESULTADOS DE MÍNIMOS CUADRADOS Y CORRELACIÓN ---");
        System.out.printf("Sumatorias: n=%d, X=%.2f, Y=%.2f, X2=%.2f, Y2=%.2f, XY=%.2f\n",
                n, sumX, sumY, sumX2, sumY2, sumXY);
        System.out.printf("Pendiente (beta1): %.4f\n", beta1);
        System.out.printf("Ordenada al origen (beta0): %.4f\n", beta0);
        System.out.printf("Modelo obtenido: Y = %.4f + %.4fX\n", beta0, beta1);
        System.out.printf("Coeficiente de Pearson (r): %.4f\n", pearsonR);
        System.out.printf("Coeficiente de Determinación (r2): %.4f\n", r2);

        return new double[]{beta0, beta1, pearsonR, r2};
    }

    /**
     * Realiza una estimación/predicción evaluando el modelo con un valor de X.
     */
    public static double predecir(double beta0, double beta1, double xValor) {
        return beta0 + beta1 * xValor;
    }
}
