public class MyException extends Exception{
    String s1;
    MyException(String s2){
        s1=s2;
    }
    public String toString(){
        return ("Output string="+s1);
    }
}