public class ArrSmall {
    public static void main(String args[]){
        int i,j,temp=0;
        int a[]={32,12,8,56,3};
        for (i=0;i<a.length;i++){
            for (j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Smallest element:"+temp);
    }
}
