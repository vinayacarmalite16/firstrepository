public class OddNumbers {
    public static void main(String args[]){
        int i,sum=0;
        for(i=1;i<=100;i++){
            while(i%2==0) {
                break;
            }
            sum=sum+i;
        }
        System.out.println("Sum="+sum);
    }

}
