package Burbuja;

/**
 *   El metodo de ordenacion burbuja es de tipo directo y de los más sencillos.
 *   Consiste en comparar elementros adyacentes entre sí y permutarlos segun corresponda.
 *   El arreglo estara ordenado cuando en la última iteracion no haya elementos para permutar,
 *   es decir, los elementos quedaron ordenados segun el criterio utilizado.
 */

public class BubbleSort
{
    //================================================================================================

    // Declaramos un array de enteros con 10 elementos los cuales están desordenados.
    public static int[] array = new int[]{300, 150 , -100 , 500 , 225 , 50 , -250 , 175, 425, 0};

    //================================================================================================

    // Metodo Burbuja:
    public static void sort()
    {
        // El primero bucle for, indica las iteraciones que realizara sobre el total del array.

        for (int i = 0; i < array.length-1; i++) // Aclaracion: Se utiliza "array.lenght-1", ya que no es necesario que se hagan TODAS las iteracciones, a la penultima ya estara ordenado el array, entonces nos ahorramos una iteracion.
        {
            // El segundo bucle for, será el encargado de 'ordenar' como tal los elementos, interactua con ellos.

            for (int j = 0; j < array.length-1; j++) // Aclaracion: "array.lenght-1" por la misma razon que antes.
            {
                if (array[j] > array[j+1]) // Si el número actual es mayor al siguiente, se intercambian.
                {
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }

    //================================================================================================
}
