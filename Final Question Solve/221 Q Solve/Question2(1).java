package FInalQuestionSolve.Spring2022;

import java.io.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        try {
            PrintWriter f1 = new PrintWriter("even.txt");
            PrintWriter f2 = new PrintWriter("odd.txt");
            FileReader file = new FileReader("id.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                int id = sc.nextInt();
                if(id % 2 == 0) {
                    f1.println(id);
                } else {
                    f2.println(id);
                }
            }

            f1.close();
            f2.close();
            sc.close();
            file.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}