package Oop;

public class L2_wrapper {
    public static void main(String args[]){
        // int a = 10;
        // int b = 20;
        Integer a = 10;
        Integer b = 20;
        Integer num = 45; // wrapper class

        swap(a, b);
        System.out.println(a+" "+b);


        // final int bonus = 2;
        // bonus = 3;
        final A kunal = new A("kunal kushwaha");
        kunal.name = "Ayush";
        // when a  non primitive is final, you cannot reassign it;
        // kunal = new A("new object");

    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;

    }
}

class A {
    final int num =0;
    String name;
    public A (String name) {
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("object is destroyed");
    }
}
