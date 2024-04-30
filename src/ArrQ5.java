public class ArrQ5 {
    public static void main(String args[]){
        int i,j,sum=0;
        int a[][]={{1,3,1},{3,2,4}};
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
        }
        System.out.println("Sum="+sum);
    }
}
