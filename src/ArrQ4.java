public class ArrQ4 {
    public static void main(String args[]){
        int i,j;
        int a[][]={{1,7,5},{4,1,8}};
        int b[][]=new int[a.length][a[0].length];
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                b[i][j]=a[i][j];
                //System.out.print(a[i][j]+"\t");
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
