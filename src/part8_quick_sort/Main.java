package part8_quick_sort;

import part2_selection_sort.Selection;
import part6_merge_sort.Merge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {5, 4, 2, 9, 1, 7, 3, 8, 6};
        System.out.println("Before selection sort: " + Arrays.toString(a));
        Quick.sort(a);
        System.out.println("After selection sort: " + Arrays.toString(a));
    }
}
