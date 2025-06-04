package FInalQuestionSolve.Spring2022;

class A{
    static final int m = 10; // static final

    void method1(int t){
        System.out.println(t);
    }
    static void method2(){
        // m can access here
    }
}

class B extends A{
    @Override
    final void method1(int t) {  // make it final
        System.out.println(t);
    }
}

final class C extends A{   // make it final
    @Override
    void method1(int t) {
        System.out.println(t);
    }
}


public class Question1A {
    public static void main(String[] args) {

    }
}
