public class Sort {
    public static void main(String args[]){
        int a[]={5,2,8,7,4,1};
        int temp=0,i;
        System.out.println("Elements of original array");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        System.out.println("Sorted array:");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
