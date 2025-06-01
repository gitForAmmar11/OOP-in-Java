package FInalQuestionSolve.Spring2021;

class C{
    static int outer_x = 10;
    int outer_y = 20;
    private int outer_private = 30;

    class D{
        void display(){
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_y = " + outer_y);
            System.out.println("outer_private = " + outer_private);
        }
    }
}

public class Question1B {
    public static void main(String[] args) {
        C outerObj = new C();
        C.D obj = outerObj.new D();
        obj.display();
    }
}
