public class MultiArr {
    public static void main(String args[]){
        int i,j;
        int a[][]={{1,2,3,4},{5,6,7}};
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " \t ");
            }
            System.out.println();
        }
        int element = a[0][2];
        System.out.println("The element at row 1, column 2 is: " + element);

    }
}
