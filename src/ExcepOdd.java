public class ExcepOdd {
    void check(int n) throws ArithmeticException{
        if(n%2!=0){
            throw new ArithmeticException("Valid");
        }
    }
    public static void main(String args[]){
        ExcepOdd e=new ExcepOdd();
        try{
            e.check(3);
        }
        catch (ArithmeticException ae){
            System.out.println("Invalid");
        }
    }
}
