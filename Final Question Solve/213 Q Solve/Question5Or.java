package FInalQuestionSolve.Fall2021;

import java.util.Scanner;


public class Question5Or {
    public static void main(String[] args) {
        NegativeFilter obj = new NegativeFilter();
        obj.start();

        EvenFilter efObj = new EvenFilter();
        Thread tObj = new Thread(efObj);
        tObj.start();
    }
}

class NegativeFilter extends Thread {
    Scanner sc = new Scanner(System.in);

    public void run(){
        while (true){
            int num = sc.nextInt();
            if(num >= 0){
                System.out.println(num);
            }
        }
    }
}

class EvenFilter implements Runnable {
    Scanner sc = new Scanner(System.in);

    public void run(){
        while (true){
            int num = sc.nextInt();
            if(num % 2 != 0){
                System.out.println(num);
            }
        }
    }
}