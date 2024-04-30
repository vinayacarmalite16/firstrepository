public class ArrDupli {
    public static void main(String args[]){
        int i,j;
        int a[]={2,15,24,2,15};
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
