class InvalidProductException extends Exception{

    public InvalidProductException(String s) {
        super(s);
    }
}
public class Example1 {
    void productCheck(int weight) throws InvalidProductException{
        if(weight<100){
            throw new InvalidProductException("Product Invalid");
        }
    }
    public static void main(String args[]){
        Example1 e=new Example1();
        try{
            e.productCheck(50);
        }
        catch (InvalidProductException ie){
            System.out.println("Caught the exception");
            System.out.println(ie.getMessage());
        }
    }
}
