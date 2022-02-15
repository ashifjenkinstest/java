package logics;

public class TestMySingletonClass {

    public static void main(String args[]){
        MySingletonClass mySingletonClass1 = MySingletonClass.getMySingletonClass();
        MySingletonClass mySingletonClass2 = MySingletonClass.getMySingletonClass();
        String s = mySingletonClass1.s;
        System.out.println(mySingletonClass1.s);
        System.out.println(mySingletonClass2.s);

        System.out.println(mySingletonClass1.hashCode());
        System.out.println(mySingletonClass2.hashCode());
    }
}
