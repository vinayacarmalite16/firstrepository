public class ValueOfZ {
    public static void main(String args[]){
        int x=5;
        int y=10;
        int z;
        System.out.println(z=(x++>5)&&(++y<10)?x:y);
    }
}
