package part4_insertion_sort;

import part2_selection_sort.Selection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Integer[] a = {13, 75, 12, 4, 18, 6, 9, 10, 7, 14, 15};
        System.out.println("Before insertion sort: " + Arrays.toString(a));
        Selection.sort(a);
        System.out.println("After insertion sort: " + Arrays.toString(a));
    }
}
