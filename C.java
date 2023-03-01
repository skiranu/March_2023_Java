package pack1;
import Surya.Surya;

class C extends Surya {
    public static void main(String[] args){
        // first method to access protected method
        Surya a = new Surya();
        //a.getName();
        Surya b = new C();
        //b.getName();
        C c = new C();
        c.getName();

    }
}