package FInalQuestionSolve.Spring2021;

class MyTread implements Runnable{
    String name;
    public MyTread(String name){
        this.name = name;
    }
    public void run(int n){
        System.out.printf("Running: %s %d times.\n", name, n);
    }
    @Override
    public void run() {

    }
}

public class Question3A {
    public static void main(String[] args) {
        MyTread t1 = new MyTread("First Thread");
        Thread threadObj = new Thread(t1);
        threadObj.start();
        try {
            threadObj.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
