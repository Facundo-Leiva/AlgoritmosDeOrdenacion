package Insercion;

/**
 *   El metodo de ordenacion por insercion es de tipo directo, resulta muy natural para el humano.
 *   Consiste en comenzar con 1 elemento el cual considera ordenado, luego inserta un nuevo elemento y lo ordena teniendo en cuenta el anterior.
 *   Nuevamente, vuelve a insertar otro elemento y lo ordena teniendo en cuenta los 2 anteriores, y asi secesivamente va insertando y ordenando elementos.
 *   El arreglo estara ordenado cuando inserte el último elemento y lo ordene teniendo en cuenta todos los anteriores.
 */

public class InsertionSort
{
    //================================================================================================

    // Declaramos un array de enteros con 10 elementos los cuales están desordenados.
    public static int[] array = new int[]{335, 190, -55, 465, -245, 10, 115, 505, 275, -135};

    //================================================================================================

    // Ordenacion por Insercion:
    public static void sort()
    {
        // En primer bucle for nos brinda el índice el cual nos dara el elemento a insertar para ordenarlo.

        for (int i = 0; i < array.length; i++)
        {
            // Necesitaremos la posicion del elemento y una variable auxiliar para ordenar.

            int pos = i;
            int aux = array[i];

            // Se exige que posicion sea mayor a 0, ya que no sirve de nada plantear que 'cero elementos están ordenados'.
            while (pos > 0 && array[pos-1] > aux) // Luego se verifica que, si el número a la izquierda con respecto al actual es mayor al actual, se intercambian para quedar ordenados.
            {
                array[pos] = array[pos-1]; // De cumplirse la consicion, se intercambian, para quedar el mayor a la derecha y el menor a la izquierda.
                pos--; // Pero necesitamos que el número insertado se siga comparando con todos los demás (insertados anteriormente), por eso decrementamos.
                // Todo el proceso se repite, hasta que el numero insertado se haya comparado con todos, y quede ordenado.
            }

            array[pos] = aux; // Para poder repetir el proceso, pero insertando otro número hasta que no haya más para insertar, debemos actualizamos la posicion.
        }
    }

    //================================================================================================
}
