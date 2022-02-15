package logics;

import java.util.ArrayList;
import java.util.List;

public class NthPrimeNumber {

    public static void main(String stap[]){
        nthPrimeNumber(100);
    }
    static void nthPrimeNumber(int nth){

        List<Integer> primeNumberList = new ArrayList<>();

        for(int i = 2;i<Integer.MAX_VALUE;i++){
            boolean isPrime=true;

            for(int factor = 2;factor<=i/2;factor++){
                if(i%factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNumberList.add(i);
            }
            if(primeNumberList.size()==nth)
                break;
        }
        primeNumberList.stream().map(n->(Object) n).limit(nth).forEach(System.out::println);

    }


}
