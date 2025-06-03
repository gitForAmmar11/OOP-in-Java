package FInalQuestionSolve.Fall2021;

import java.util.Scanner;

public class Question2A {
    public static void main(String[] args) {
        calculator obj = new calculator();
        try{
            obj.divide();
        } catch (ArithmeticException e){

        } finally {
            System.out.println("Exception handled successfully");
        }

        try{
            obj.display_namelength();
        } catch (NullPointerException e){

        } finally {
            System.out.println("Exception handled successfully");
        }

    }
}

class calculator{
    String name;
    int num1;
    int num2;

    public calculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        this.num1 = input.nextInt();
        System.out.println("Enter the second number");
        this.num2 = input.nextInt();
    }

    public void divide(){
        System.out.println(num1 / num2);
    }

    public void display_namelength(){
        System.out.println(name.length());
    }
}
