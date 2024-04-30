public class DiffArr {
    public static void main(String args[]){
        int i, j, temp = 0, k = 2;
        int a[] = {1,3,3,3};
        for(i = 0; i < 4; i++){
            for(j = i + 1; j < 4; j++){
                if(Math.abs(a[i] - a[j]) == k){
                    temp++;
                }
            }
        }
        System.out.println("Output: " + temp);
    }

}
