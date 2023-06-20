package Merge;

/**
 *   El metodo de ordenacion MergeSort es de tipo Indirecto, con complejidad subCuadratica que utiliza la recursion.
 *   Consiste en dividir el array en 2 mitades a y b, ordenarlas por separado con recursividad y convinarlas para obtener un array c ordenado.
 *   El arreglo original se divide recursivamente en partes cada vez más pequeñas que son ordenadas, para luego ser convinadas hasta formar c.
 */

public class MergeSort
{
    //================================================================================================

    // Declaramos un array de enteros con 10 elementos los cuales están desordenados.
    public static int[] array = new int[]{1250, -500, 750, 450, -350, -100, 150, 900, -200, 300};

    //================================================================================================

    // Metodo MergeSort:
    public static int[] sort(int[] array)
    {
        // Primero, definimos el caso base para la recursion:
        if (array.length <= 1)
        {
            return array;
        }
        else
        {
            // Necesitamos definir las 2 mitades por las cuales se dividira el array:
            int[] left;
            int[] right = new int[array.length / 2]; // La mitad derecha siempre será del tamaño de la mitad del array.

            // Pero, la mitad la longitud de la mitad izquierda va a depender de si el array tiene longitud par o no, de ser impar, el sobrante debe ir a la mitad izquierda.
            if (array.length % 2 == 0)
            {
                left = new int[array.length / 2];
            }
            else
            {
                left = new int[array.length / 2 + 1];
            }

            // Debemos ahora llenar las mitades con los elementos que les corresponden (que provienen del array original):

            int i;
            for (i = 0; i < left.length; i++) // Se llena el arreglo left:
            {
                left[i] = array[i];
            }

            // Aclaracion: A esta altura, el indice i apunta a la posicion del elemento primero de la segunda mitad del arreglo original.

            int k = 0;
            for (int j = i; j < array.length; j++) // Se llena el arreglo right: El índice j va a valer lo mismo que i, ya que el arreglo derecho se debe llenar con los elementos de la mitad en adelante del arreglo original.
            {
                right[k] = array[j];
                k++;
            }

            // Parte recursiva:
            return merge(sort(left), sort(right));

            // Se llama al metodo Merge, quien ordena las mitades y las une en un solo arreglo ordenado.
            // Al llamar nuevamente al metodo sort en sus parametros, se estara dividiendo nuevamente los subArrays en otros subArrays aún más pequeños.
            // Este paso se repite hasta que se llegue al caso base, donde el array tiene longitud 1, es decir, se considera ya ordenado.
            // Para luego retroceder e ir ordenando esos subArrays pequeños y formar al final, el array c que está ordenado.
        }
    }

    // Metodo Merge (Convinar las mitades ordenadas):
    public static int[] merge(int[] a, int[] b)
    {
        int i = 0; // Indice para left.
        int j = 0; // Indice para right.

        int[] c = new int[a.length + b.length]; // Declaramos c quien será el arreglo ordenado y tendra la longitud de la suma de las partes del arreglo desordenado original.

        for (int k = 0; k < c.length; k++) // Procedemos a llenar c con los elementos de las partes pero ordenados.
        {
            if (a[i] < b[j])
            {
                c[k] = a[i];
                i++;
            }
            else
            {
                c[k] = b[j];
                j++;
            }

            if (i == a.length) // Verifica si se colocó el último elemento de a, lo que significa que ya podemos colocar todos los restantes de b.
            {
                k++; // Aumentamos el índice k para pasar al siguiente elemento de c.

                for (j = j; j < b.length; j++)
                {
                    c[k] = b[j];
                    k++;
                }
            }
            else if (j == b.length) // Verifica si se colocó el último elemento de b, lo que significa que ya podemos colocar todos los restantes de a.
            {
                k++; // Aumentamos el índice k para pasar al siguiente elemento de c.

                for (i = i; i < a.length; i++)
                {
                    c[k] = a[i];
                    k++;
                }
            }
        }

        return c; // Retornamos el array ordenado.
    }

    //================================================================================================
}
