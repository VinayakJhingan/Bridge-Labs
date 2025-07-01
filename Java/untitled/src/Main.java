import java.util.*;
public class Main {

    static void addition(int a,int b){
        int sum = a+b;
        System.out.println("the sum of a and b is="+sum);
    }
    static void subtraction(int a, int b){
        int sub = a-b;
        System.out.println( "the sub of a and b is="+sub);
    }
    static void multiplication(int a, int b){
        int product = a*b;
        System.out.println("the product of a and b is="+product);
    }
    static void division(int a, int b){
        int div = a/b;
        System.out.println("the div55" +
                " of a and b is="+div);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the variable a: ");
        int a = sc.nextInt();
        System.out.println("Enter the variable b: ");
        int b = sc.nextInt();
        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);
        division(a,b);


    }





}