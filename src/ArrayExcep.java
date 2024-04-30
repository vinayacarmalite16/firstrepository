public class ArrayExcep {
    void check(int arr[])throws ArrayIndexOutOfBoundsException{
      System.out.println(arr[5]);
      throw new ArrayIndexOutOfBoundsException("Valid");
    }
    public static void main(String args[]){
        ArrayExcep a=new ArrayExcep();
        int arr[]={12,34,14};
        int i;
        //for(i=0;i<4;i++){
            try{
               a.check(arr);
            }
            catch(ArrayIndexOutOfBoundsException ai){
                System.out.println(ai.getMessage());
                System.out.println(a);
            }
        //}
    }
}
