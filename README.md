Tarea 2 Unidad 5: Regresión Lineal por Mínimos Cuadrados

- **Materia:** SCC-1017 Métodos Numéricos
- **Docente:** Víctor Hugo Vázquez Herrera
- **Alumno:** Giovanni Hernández Rodríguez
- **Carrera:** Ingeniería en Sistemas Computacionales

## Objetivo
Implementar en Java el cálculo de **Regresión Lineal Simple** mediante el método de Mínimos Cuadrados, integrando el cálculo del coeficiente de correlación de Pearson ($r$), el coeficiente de determinación ($r^2$) y la estimación de valores
## Estructura del proyecto
- src/Ajuste_de_funciones/RegresionLineal.java: Clase que calcula las sumatorias, los coeficientes de regresión ($\beta_0$ y $\beta_1$), el coeficiente de Pearson ($r$), el coeficiente de determinación ($r^2$) y realiza predicciones
- src/Ajuste_de_funciones/Main.java: Clase principal con datos de prueba para validar el modelo lineal y mostrar los resultados en consola


## Resultados
Sumatorias: n=7, X=28.00, Y=61.80, X2=140.00, Y2=708.98, XY=314.80
Pendiente (beta1): 2.4143
Ordenada al origen (beta0): -0.8286
Modelo obtenido: Y = -0.8286 + 2.4143X
Coeficiente de Pearson (r): 0.9995
Coeficiente de Determinación (r2): 0.9990
Predicción para X = 8.00 -> Y estimado = 18.4857
