import java.util.Scanner;

public class Larger {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        Integer a=sc.nextInt();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the second number");
        Integer b=s.nextInt();
        if (a>b){
            System.out.println("First is larger");
        }
        if(b>a){
            System.out.println("Second is larger");
        }
        if(a==b){
            System.out.println("Both are equal");
        }
    }
}
