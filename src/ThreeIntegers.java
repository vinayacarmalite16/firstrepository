import java.util.Scanner;

public class ThreeIntegers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        Integer a=sc.nextInt();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the second number");
        Integer b=s.nextInt();
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the third number");
        Integer c=sca.nextInt();
        if(a>b)if(a>c) {
            System.out.println(a+ " is larger");
        }
        if(b>a)if(b>c){
            System.out.println(b+ " is larger");
        }
        if(c>a)if(c>b){
            System.out.println(c+ " is larger");
        }
    }
}
