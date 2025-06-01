package FInalQuestionSolve.Spring2021;

import java.util.Scanner;

public class Question4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            System.out.println("Enter current charge percent: ");
            int chargeAmount = sc.nextInt();
            try {
                if(chargeAmount <= 20)
                    throw new LowBatteryException(chargeAmount);
                else
                    System.out.println("Enough charge in battery.");
            } catch (LowBatteryException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class LowBatteryException extends Exception{
    int chargeAmount;
    LowBatteryException(int chargeAmount){
        this.chargeAmount = chargeAmount;
    }
    @Override
    public String getMessage() {
        return "Battery is low! Should be above 20. Current value: " + chargeAmount;
    }
}
