package FInalQuestionSolve.Spring2022;



class MyStack{
    private int idx = 0;
    private char[] data = new char[6];

    public synchronized void push(char c){
        this.notify();
        if(idx != 5){
            data[idx] = c;
            idx++;
        }
    }

    public synchronized char pop(){
        if(idx == 0){
            //A
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        idx--;
        return data[idx];
    }
}

class Producer implements Runnable{
    private MyStack stack;

    public Producer(MyStack s){
        stack = s;
    }

    public void run(){
        char c;
        for (int i = 0; i < 50; i++){
            c = (char) (Math.random() * 26 + 'A');
            stack.push(c);
            System.out.println("Producer: " + c);
            // C
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    private MyStack stack;

    public Consumer(MyStack s){
        stack = s;
    }

    public void run(){
        char c;
        for(int i = 0; i < 50; i++){
            c = stack.pop();
            System.out.println("Consumer: " + c);
            // C
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Question5Or {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        Producer p = new Producer(s);
        Consumer c = new Consumer(s);
        // B
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
