import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Surya!!!");
        // initialized a square method object
        kiran k = new kiran();
        System.out.println("Enter a number!!!");
        //way to read from console in java
        Scanner sc = new Scanner(System.in);
        // MAKES the input as INT
        int num = sc.nextInt();
        k.square( num);
    }
}
class kiran{
    void square(int number){
        System.out.println("The square of the given number is: "+number*number);
    }
}

class surya{

}
