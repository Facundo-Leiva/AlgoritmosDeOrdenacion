package Seleccion;

/**
 *   El metodo de ordenacion por seleccion es de tipo directo.
 *   Consiste en comenzar seleccionando el elemento más pequeño del conjunto, y lo coloca en la posicion 0 (donde corresponde que esté el elemento menor),
 *   para continuar seleccionando el segundo elemento más pequeño del conjunto y colocarlo en la posicion 1 (donde corresponde que esté el segundo elemento).
 *   El proceso se repite con todos los elementos.
 *   El arreglo estara ordenado cuando ya no haya elementos para verificar y colocar en X posicion.
 */

public class SelectionSort
{
    //================================================================================================

    // Declaramos un array de enteros con 10 elementos los cuales están desordenados.
    public static int[] array = new int[]{240, -110, 15, 185, -275, 385, 90, 265, 430, -45};

    //================================================================================================

    // Metodo por Seleccion:
    public static void sort()
    {
        // Necesitamos 2 variables: minimo, quien es el menor elemento del conjunto en la iteracion X del bucle, y auxiliar (para intercambiar).
        int minimo;
        int aux;

        for (int i = 0; i < array.length; i++) // Dentro del primer bucle for, vamos a suponer que el primer elemento seleccionado es el minimo.
        {
            minimo = i;

            for (int j = i + 1; j < array.length; j++) // El segundo bucle for, toma el siguiente del minimo.
            {
                if (array[j] < array[minimo]) // Comprueba si el que le sigue al supuesto minimo, es enrelidad más pequeño.
                {
                    minimo = j; // De ser asi, lo asigna como tal.
                }
            }

            // Una vez que ya tengamos el minimo, lo colocamos en la posicion i, que es la posicion que le corresponde al menor elemento del conjunto en la iteracion X.
            aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }
    }

    //================================================================================================
}
