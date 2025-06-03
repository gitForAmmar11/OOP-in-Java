package FInalQuestionSolve.Fall2021;

public class Question2B {
    public static void main(String[] args) {
        try{
            int acc[] = {100, 101, 102, 103, 104, 105};
            double balance[] = {2000, 1500, 900, 1560, 1765.50};
            System.out.println("Account No\t" + "Balance\t");
            for(int i = 0; i < 5; i++){
                System.out.println(acc[i] + "\t\t" + balance[i] + "\t");
                if(balance[i] < 1000){
                    throw new MinimumBalanceException();
                }
            }
        } catch (MinimumBalanceException e){
            System.out.println(e.getMessage());
        }
    }

    public static class MinimumBalanceException extends Exception{
        MinimumBalanceException(){
            super("Balance is low now");
//            System.out.println("Balance is low now");
        }
    }
}
