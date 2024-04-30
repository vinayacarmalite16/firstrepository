public class NewClass {
    public static void main(String args[]){
        try{
            throw new MyException("Custom Message");
        }
        catch (MyException e){
            System.out.println(e);
        }
    }
}
