package logics;

public class DerangementNElements {



    public static void main(String afdf[]){
        System.out.println(DeArr(5));

    }

    static int DeArr(int n){
        if (n == 1) return 0;
        if (n == 2) return 1;
        else
            return (n-1) * (DeArr(n-1) + DeArr(n-2));
    }
}
