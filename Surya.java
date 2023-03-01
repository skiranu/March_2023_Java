package Surya;
public class Surya {
    protected void getName() {
        System.out.println("This is from protected class");
    }
}
class Kiran extends Surya{
    public static void main(String[] args){
        // first method to access m1:
        Surya a = new Surya();
        a.getName();
        // second method to access m1:
        Kiran b = new Kiran();
        b.getName();
        // third method to access m1:
        Surya c = new Kiran();
        c.getName();

    }
}