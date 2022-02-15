package logics;

public class TestError
{
    static {
        System.out.println("Main is yet to execute.");
    }

    public static void main(String asdfas[]){

        String sdf = "nifty";
        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
        System.out.println(dayOfWeek.difficulty);
        System.out.println(dayOfWeek.equals(DayOfWeek.FRIDAY));


        if(sdf instanceof String){
            System.out.println(sdf);
        }

        String first = "Test";
        String second = "Test";
        if(first == second)
        {
            System.out.println("SAME");
        }else {
            System.out.println("NOT SAME");
        }

        String firstnew = new String("Test");
        String secondnew = new String("Test");
        if(firstnew == secondnew)
        {
            System.out.println("SAME");
        }else {
            System.out.println("NOT SAME");
        }




        try{

            System.out.println("A");
            badMethod();
            System.out.println("B");
        }catch (Exception e)
        {
            System.out.println("C");
        }finally{

            System.out.println("D");
        }

    }

    private static void badMethod() {

        throw new Error();
    }
}
