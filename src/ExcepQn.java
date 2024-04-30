class NegativeValueException extends Exception{
    public NegativeValueException(String s){
        super(s);
    }
}
public class ExcepQn {
    void check(int length,int breadth)throws NegativeValueException{
        if((length<0)||(breadth<0)){
            throw new NegativeValueException("Valid");
        }
        else {
           int c= length*breadth;
           System.out.println(c);
        }
    }
    public static void main(String args[]){
        ExcepQn eq=new ExcepQn();
        try{
            eq.check(8,9);
        }
        catch (NegativeValueException n){
            System.out.println("Invalid");
        }
    }
}
