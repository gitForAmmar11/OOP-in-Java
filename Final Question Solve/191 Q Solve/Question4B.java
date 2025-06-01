package FInalQuestionSolve.Spring2021;

import java.util.Scanner;

public class Question4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.next();
            int a = Integer.valueOf(s);
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] array = new int[5];
            int d = a / b;
            array[c] = d;
            System.out.println(array[c]);
        } catch (NumberFormatException e){
            System.out.println("Input was not an Integer."); // 1
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index should be less than 5");  // 4
        } catch (ArithmeticException e){
            System.out.println("Can not divide by 0"); // 3
        }
    }
}

// 2 = 2