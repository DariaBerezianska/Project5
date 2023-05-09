package part2_selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {5, 2, 7, 0, 3, 9};
        System.out.println("Before selection sort: " + Arrays.toString(a));
        Selection.sort(a);
        System.out.println("After selection sort: " + Arrays.toString(a));
    }
}
