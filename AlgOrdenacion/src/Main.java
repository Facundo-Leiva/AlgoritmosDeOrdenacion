import java.util.Arrays;
import Burbuja.BubbleSort;
import Insercion.InsertionSort;
import Merge.MergeSort;
import Quick.QuickSort;
import Seleccion.SelectionSort;
import Shell.ShellSort;

public class Main
{
    public static void main(String[] args)
    {
        //========================================================================================================

        // Algoritmos de Ordenacion Directos: Complejidad algoritmica O(n^2).

        // Burbuja: Recordemos que los elementos eran {300, 150 , -100 , 500 , 225 , 50 , -250 , 175, 425, 0}.
        BubbleSort.sort(); // Ordenamos el array.
        System.out.println("\nMetodo Burbuja: " + Arrays.toString(BubbleSort.array)); // Lo mostramos.

        // Insercion: Recordemos que los elementos eran {335, 190, -55, 465, -245, 10, 115, 505, 275, -135}.
        InsertionSort.sort(); // Ordenamos el array.
        System.out.println("\nMetodo Por Insercion: " + Arrays.toString(InsertionSort.array)); // Lo mostramos.

        // Seleccion: Recordemos que los elementos eran {240, -110, 15, 185, -275, 385, 90, 265, 430, -45}.
        SelectionSort.sort(); // Ordenamos el array.
        System.out.println("\nMetodo Por Seleccion: " + Arrays.toString(SelectionSort.array)); // Lo mostramos.

        //========================================================================================================

        // Algoritmos de Ordenacion Indirectos: Complejidad algoritmica O(n^2) para ShellSort, para los demás O(n*(log2n)) --> subCuadratico.

        // ShellSort: Recordemos que los elementos eran {345, -130, 255, 70, -320, 170, -245, 460, 520, -30}.
        ShellSort.sort(); // Ordenamos el array.
        System.out.println("\nMetodo ShellSort: " + Arrays.toString(ShellSort.array)); // Lo mostramos.

        // MergeSort: Recordemos que los elementos eran {1250, -500, 750, 450, -350, -100, 150, 900, -200, 300};
        System.out.println("\nMetodo MergeSort: " + Arrays.toString(MergeSort.sort(MergeSort.array))); // Ordenamos el array y lo mostramos.

        // QuickSort: Recordemos que los elementos eran {1320, -570, 790, 470, -360, -130, 180, 950, -220, 330}.
        QuickSort.sort(QuickSort.array, 0, 9); // Ordenamos el array.
        System.out.println("\nMetodo QuickSort: " + Arrays.toString(QuickSort.array)); // Lo mostramos.

        //========================================================================================================
    }
}
