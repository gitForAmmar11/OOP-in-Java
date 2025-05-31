package FInalQuestionSolve.Spring2021;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("numbers.txt");
            Scanner sc = new Scanner(fr);

            while (sc.hasNext()){
                String str = sc.nextLine();
                String[] arrInt = str.split(",");
                int maxNum = Integer.parseInt(arrInt[0]);

                for(String s : arrInt){
                    if(maxNum < Integer.parseInt(s)){
                        maxNum = Integer.parseInt(s);
                    }
                }
                System.out.println(maxNum);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
