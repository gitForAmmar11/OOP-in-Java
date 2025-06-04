package FInalQuestionSolve.Spring2022;

class CreditCard{
    private double credit_limit; //10000
    private double credit_current; // 0, 7000

    public CreditCard(double limit) throws InvalidTxnException{
        if(limit < 0) throw new InvalidTxnException(limit + " is not a valid amount for the requested transaction");
        credit_limit = limit;
        credit_current = 0;
    }

    public void withdraw(double amount) throws InvalidTxnException{
        if(amount < 0) throw new InvalidTxnException(amount + " is not a valid amount for the requested transaction");
        if((amount + credit_current) > credit_limit) throw new InvalidTxnException(amount + " cannot be withdrawn with current credit of " + credit_current + " for your limit of " + credit_limit);
        credit_current += amount;
    }
}

class InvalidTxnException extends Exception{
    InvalidTxnException(String str){
        super(str);
    }
}

public class Question3 {
    public static void main(String[] args) throws InvalidTxnException {
        try {
            CreditCard c1 = new CreditCard(-5000);
        } catch (InvalidTxnException e){
            System.out.println(e.getMessage());
        }

        CreditCard c2 = new CreditCard(10000);
        c2.withdraw(7000);

        try {
            c2.withdraw(4000);
        } catch (InvalidTxnException e){
            System.out.println(e.getMessage());
        }

    }
}
