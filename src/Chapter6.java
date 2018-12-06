import java.util.Scanner;

public class Chapter6 {

    public Chapter6() {
    }

    public void booleanExample() {
        Scanner scr = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            System.out.print("Please enter positive number: ");
            if (scr.hasNextDouble()) {
                double value = scr.nextDouble();
                if (value > 0) valid = true;
            }
            else {
                scr.nextLine();
            }
        }
    }
    public void forExample() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Insert initial balance: ");
        double balance = scr.nextDouble();
        System.out.print("Insert rate: ");
        double rate = scr.nextDouble();
        System.out.print("Insert number of years invested: ");
        int numberOfYears = scr.nextInt();

        for (int i = 1; i <= numberOfYears; i++) {
            double interest = balance * rate / 100;
            balance = balance + interest;
            System.out.println(balance);
        }
    }
}
