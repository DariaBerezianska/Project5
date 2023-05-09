package part6_merge_sort;

import part2_selection_sort.Selection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] a = { 9, 0, 8, 3, 7, 1, 4 };
        System.out.println("Before selection sort: " + Arrays.toString(a));
        Merge.sort(a);
        System.out.println("After selection sort: " + Arrays.toString(a));
    }
}
