package FInalQuestionSolve.Fall2021;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("input.txt");
            Scanner sc = new Scanner(fr);
            PrintWriter out = new PrintWriter("output.txt");

            int i = 1;

            while(sc.hasNext()){
                out.println("Line " + i++ + ": " + (sc.nextInt()+sc.nextInt()));
            }

            out.close();
            sc.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
