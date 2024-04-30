public class TryCatchExample {
    public static void main(String args[]){
        try{
            int a[]={3,16,5};
            System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code:");
    }
}
