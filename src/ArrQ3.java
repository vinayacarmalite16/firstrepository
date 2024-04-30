public class ArrQ3 {
    public static void main(String args[]){
        int i,j;
        int a[][]={{4,10,8},{20,15,7}};
        int b[][]={{2,5,3},{10,5,8}};
        int c[][]=new int[a.length][a[0].length];
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
