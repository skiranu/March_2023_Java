import java.util.Scanner;
public class Test {
    final static long x1;
    static
    { x1=2000000000000000000l;
        System.out.println(x1);
    }

    Test(){
        final int x = 6;
        System.out.println("Output from the class constructor!!!"+x);
    }

    public static void main(String[] args) {
        System.out.println("Hello Surya!!!");
        final int g;
        // initialized a square method object
        kiran k = new kiran();
        System.out.println("Enter a number!!!");
        //way to read from console in java
        Scanner sc = new Scanner(System.in);
        // MAKES the input as INT
        int num = sc.nextInt();
        k.square( num);
        Test t = new Test();
    }
     protected int getNumber(){
        return 33;
    }
}
class kiran{
    void square(int number){
        System.out.println("The square of the given number is: "+number*number);
    }
}

class surya{

}
