package code.ibs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Write a Java method that accepts two integer arrays. Your task is to:
 *      Merge the two arrays.
 *      Remove duplicate values.
 *      Sort the final result in ascending order.
 *      Print each element of the final result on a new line.
 */
public class DistinctArraySorted {
    static Set<Integer> distinctSort(int[] arr1, int[] arr2){
        Set<Integer> sortedDistinct = new HashSet<>();
        for (int a : arr1){
            sortedDistinct.add(a);
        }
        for (int b : arr2){
            sortedDistinct.add(b);
        }
        return sortedDistinct;
    }

    static void distinctSortStream(int[] arr1, int[] arr2){
        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .asLongStream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
    public static void main(String[] args) {
        int[] array1 =  {2,11,3,2,4,5,45,3,2,11};
        int[] array2 =  {22,101,3,2,4,5,45,3,2,10};
        for(int n : distinctSort(array1, array2).stream().sorted().toList())
            System.out.println(n);
        distinctSortStream(array1, array2);
    }
}
