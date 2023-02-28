class Strictfp_example {
    public void m1(int number) {
        System.out.println(10.0 / number);
    }

    public static void main(String[] args) {
        Strictfp_example m = new Strictfp_example();
        m.m1(6);
        Test t = new Test();
        System.out.println(t.getNumber());
    }
}
