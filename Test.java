import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Surya!!!");
        kiran k = new kiran();
        System.out.println("Enter a number!!!");
        //way to read frrom console in java
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        k.square( num);
    }
}
class kiran{
    void square(int number){
        //square method
        System.out.println("The square of the given number is: "+number*number);
    }
}