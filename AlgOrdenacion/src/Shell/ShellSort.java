package Shell;

/**
 *   El metodo de ordenacion ShellSort es de tipo Indirecto, es una mejora del algoritmo de insercion.
 *   Consiste en comparar un elemento con otro, pero que está a una cierta distancia llamada 'salto'.
 *   Se van realizando comparaciones con este salto hasta que en una pasada no se intercambie ningun elemento, es decir, ese salto ya no se puede aprovechar más.
 *   Entonces el salto se reduce a la mitad, para asi de nuevo, ir comparando elementos con ese nuevo salto e intercambiarlos.
 *   El proceso se repite hasta que el salto valga 1.
 *   El arreglo estara ordenado cuando se relice el último pase, con salto 1, lo que en realidad corresponde al algoritmo de insercion (ya que se podria decir que el mismo trabaja con saltos iguales a 1).
 */

public class ShellSort
{
    //================================================================================================

    // Declaramos un array de enteros con 10 elementos los cuales están desordenados.
    public static int[] array = new int[]{345, -130, 255, 70, -320, 170, -245, 460, 520, -30};

    //================================================================================================

    // Metodo ShellSort:
    public static void sort()
    {
        // Declaramos nuestro salto, un auxiliar y un boolean cambio para verificar la utilidad del salto:
        int salto;
        int aux;
        boolean cambio;

        // Dentro del primer for, le damos valor al salto, que debe comenzar siempre valiendo la mitad de la longitud del arreglo.
        for (salto = array.length/2; salto != 0; salto = salto/2) // Luego como se explicó arriba, una vez el salto no sirve más para una iteracion X, se reduce a la mitad para volver a comenzar.
        {
            cambio = true; // Cambio verifica que el salto siga siendo util.

            while (cambio)
            {
                cambio = false; // Si como dijimos antes, el salto no intercambia ningun elemento, es porque este perdio su itilidad, por ende cambio ahora es falso, lo que permite que se vuelva al bucle for inicial.

                for (int i = salto; i < array.length; i++) // Dentro del segundo bucle for, se comparan los elementos con distancia correspondiente al salto.
                {
                    if (array[i-salto] > array[i]) // Si de esa comparacion, uno resulta más grande que otro, se intercambian.
                    {
                        aux = array[i];
                        array[i] = array[i-salto];
                        array[i-salto] = aux;

                        cambio = true; // Cambio es verdadero porque realizo un intercambio de elementos.
                    }
                }
            }
        }
    }

    //================================================================================================
}
