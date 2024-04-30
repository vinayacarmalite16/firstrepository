public class ArrQ6 {
    public static void main(String args[]){
        int i;
        int a[]={3,2,7,5};
        System.out.println("Original array:");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.println("Reversed array:");
        for (i=a.length-1;i>=0;--i){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}
