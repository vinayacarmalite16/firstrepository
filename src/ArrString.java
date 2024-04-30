public class ArrString {
    public static void main(String args[]){
        String cars[]={"Volvo","Audi","BMW"};
        cars[0]="Swift";
       for(String i:cars){
           System.out.println(i);
       }
       System.out.println("Length="+cars.length);
    }
}
