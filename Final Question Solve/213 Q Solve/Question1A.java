package FInalQuestionSolve.Fall2021;

interface P1{
    double h2(int x);
}
interface P2{
    String k1();
    void k2();
}

// Answer i, ii
interface P3 extends P1, P2 {

}
class Concrete implements P3{

    @Override
    public double h2(int x) {
        return 0;
    }

    @Override
    public String k1() {
        return null;
    }

    @Override
    public void k2() {

    }
}

public class Question1A {
}
