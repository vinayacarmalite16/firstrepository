public class Q1Excep {
    int num;
    public static void main(String args[]){
        try{
            int num=50/0;
        }
        catch (ArithmeticException e){
            System.out.println("Invalid");
        }
    }
}
