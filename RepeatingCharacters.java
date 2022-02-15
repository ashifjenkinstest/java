package logics;

import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatingCharacters {

    public static void main(String asdfs[]){

        int arr[] = new int[]{
            1,3,23,11,44,3,23,2,3
        };
        printRepeatingChars(arr);

        secondMinimum(arr);


    }

    static void printRepeatingChars(int arr[]){

        List<Integer> integers = new ArrayList<>();

        Set<Integer> integerSet = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            if(integers.contains(arr[i])){
               // System.out.print(arr[i] + " ");
                integerSet.add(arr[i]);
            }else{
                integers.add(arr[i]);
            }
        }

        integerSet.stream().forEach(i -> System.out.print(i+" "));
    }

    static void secondMinimum(int arr[]){

        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();


//        integerLinkedHashSet =
//            (LinkedHashSet<Integer>) Arrays.stream(arr).mapToObj(i -> new Integer(i)).collect(Collectors.toSet());
//
//        integerLinkedHashSet.stream().sorted().mapToInt(i -> new Integer(i)).limit(1).forEach(System.out::println);

        for (int i = 0;i<arr.length;i++){
            integerLinkedHashSet.add(arr[i]);
        }
        System.out.println();
        integerLinkedHashSet.stream().sorted().mapToInt(i -> new Integer(i)).forEach(i->System.out.print(i + ", "));







    }

}
