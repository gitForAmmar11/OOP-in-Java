package FInalQuestionSolve.Spring2022;

interface Vehicle{
    void fuelType();
}

public class Question1B {
    public static void main(String[] args) {
        Vehicle cng;
        cng = new Vehicle() {
            @Override
            public void fuelType() {
                System.out.println("Uses LPG");
            }
        };
        Vehicle airplane;
        airplane = new Vehicle() {
            @Override
            public void fuelType() {
                System.out.println("Uses Jet Fuel");
            }
        };

        cng.fuelType();
        airplane.fuelType();
    }
}
