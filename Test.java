public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Surya!!!");
        // initialized a square method object
        kiran k = new kiran();
        k.square(40);
    }
}
class kiran{
    void square(int number){
        //square method
        System.out.println("The square of the given number is: "+number*number);
    }
}