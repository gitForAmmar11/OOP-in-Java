package FInalQuestionSolve.Spring2021;

abstract class A{
    public void printSum(int a, int b){
        System.out.println(a + b);
    }
    public abstract void printSum(int a, int b, int c);
    public abstract void printSum(int a, int b, int c, int d);
}

public class Question1A {
    public static void main(String[] args) {
        A obj = new A(){
          public void printSum(int a, int b, int c){

          }
          public void printSum(int a, int b, int c, int d){

          }
        };
    }
}
