package logics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLaptopSort {

    public static void main(String asdfap[]){

        LaptopSort l1 = new LaptopSort(100,"F",10);
        LaptopSort l2 = new LaptopSort(20,"E",2);
        LaptopSort l3 = new LaptopSort(30,"D",1);
        LaptopSort l4 = new LaptopSort(40,"C",5);
        LaptopSort l5 = new LaptopSort(50,"B",4);
        LaptopSort l6 = new LaptopSort(60,"A",1);

        List<LaptopSort> laptopSorts = new ArrayList<>();
        laptopSorts.add(l1);laptopSorts.add(l2);laptopSorts.add(l3);laptopSorts.add(l4);laptopSorts.add(l5);laptopSorts.add(l6);

        for (LaptopSort l:laptopSorts){
            System.out.println(l);
        }
        Collections.sort(laptopSorts);


        System.out.println();
        for (LaptopSort l:laptopSorts){
            System.out.println(l);
        }


        Collections.sort(laptopSorts,(o1, o2) -> o1.getRam()>o2.getRam()?1:-1);

        System.out.println();
        for (LaptopSort l:laptopSorts){
            System.out.println(l);
        }


        Collections.sort(laptopSorts, Comparator.comparing(LaptopSort::getModel));

        System.out.println();
        for (LaptopSort l:laptopSorts){
            System.out.println(l);
        }


    }
}
