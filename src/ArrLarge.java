public class ArrLarge {
    public static void main(String args[]){
        int i,j,temp=0;
        int a[]={45,23,10,70,18};
        for(i=0;i<a.length;i++){
            for(j=i+1;i<a.length;i++){
                if(a[i]>a[j]){
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
        System.out.println("Largest element:"+temp);
    }
}
