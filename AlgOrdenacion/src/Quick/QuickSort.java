package Quick;

/**
 *   El metodo de ordenacion QuickSort es de tipo Indirecto, con complejidad subCuadratica que utiliza la recursion.
 *   Es uno de los más eficientes que se conoce, es utilizado por los lenguajes de programacion como algoritmo de ordenacion por defecto.
 *   Presenta una mejora con respecto al MergeSort, ya que no utiliza un tercer arreglo c.
 *   Consiste en dividir el array en 2 mitades a y b separadas por un elemento llamado pivote.
 *   El pivote debe separar el array en 2 mitades exactamente iguales, es la idea.
 *   Se ordenan por separado cada una de las mitades, para luego convinar: a + pivote + b.
 *   La recursion está presente de manera parecida al Mergesort, porque a su vez cada mitad a y b, se vuelven a dividir en otras mitades con un pivote que las separa.
 *   Al final, todas las mitades se van uniendo hasta formar al final el array ordenado.
 */

public class QuickSort
{
    //================================================================================================

    // Declaramos un array de enteros con 10 elementos los cuales están desordenados.
    public static int[] array = new int[]{1320, -570, 790, 470, -360, -130, 180, 950, -220, 330};

    //================================================================================================

    // Metodo QuickSort:
    public static void sort(int[] array, int izq, int der) // Los parametros izq y der representan: izq --> índice menor del array ; der --> índice mayor del array. En nuestro ejemplo, izq va a valer 0 y der 9, ya que el array tiene 10 elementos.
    {
        int pivote = array[izq]; // Tomamos primer elemento como pivote.
        int i = izq; // i realiza la búsqueda de izquierda a derecha.
        int j = der; // j realiza la búsqueda de derecha a izquierda.
        int aux; // Variable auxiliar.

        while (i < j)  // Mientras no se crucen las búsquedas:
        {
            while (array[i] <= pivote && i < j) // Busca elemento mayor que pivote.
            {
                i++;
            }
            while (array[j] > pivote) // Busca elemento menor que pivote.
            {
                j--;
            }

            if (i < j) // Si no se han cruzado los intercambia.
            {
                aux= array[i];
                array[i]=array[j];
                array[j]=aux;
            }
        }

        array[izq] = array[j]; // Se coloca el pivote en su lugar de forma que tendremos los menores a su izquierda y los mayores a su derecha.
        array[j] = pivote;

        // Parte recursiva:

        if (izq < j-1)
        {
            sort(array, izq, j - 1); // Ordenamos subarray izquierdo.
        }
        if (j+1 < der)
        {
            sort(array,j+1,der); // Ordenamos subarray derecho.
        }

        /* Aclaracion: No se explicará en su totalidad el algoritmo QuickSort, ya que su explicacion excede de este ambito,
        * pero de manera resumida, a la hora de ordenar cada mitad que separa el pivote, los índices izq y der recorren el arreglo en sus respectivas partes,
        * izq busca el elemento mayor del lado izquierdo y derecha busca el minimo del lado derecho, y los intercambia.
        * Al final quedarán los menores al pivote del lado izquierdo del pivote y los mayores al pivto del lado derecho del mismo, o sea, queda ordenado el array.
         */
    }

    //================================================================================================
}
