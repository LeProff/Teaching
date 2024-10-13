package textbook.unit8;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();

        System.out.println("1. Show total in bank.");
        System.out.println("2. Add Penny");
        System.out.println("3. Add Nickel");
        System.out.println("4. Add Dime");
        System.out.println("5. Add Quarter");
        System.out.println("6. Take money out");
        System.out.println("Enter 0 to quit");
        while (true) {
            System.out.print("Enter your choice: ");
            int res = input.nextInt();

            switch (res) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    System.out.println("Total: " + bank.getBalance());
                }
                case 2 -> {
                    System.out.println("Added $0.01 to Piggy Bank");
                    bank.addPenny();
                }
                case 3 -> {
                    System.out.println("Added $0.05 to Piggy Bank");
                    bank.addNickel();
                }
                case 4 -> {
                    System.out.println("Added $0.10 to Piggy Bank");
                    bank.addDime();
                }
                case 5 -> {
                    System.out.println("Added $0.25 to Piggy Bank");
                    bank.addQuarter();
                }
                case 6 -> {
                    System.out.print("How much would you like to take out? ");
                    double amount = input.nextDouble();
                    if (amount > bank.getBalance()) {
                        System.out.println("There isn't enough in the piggy bank");
                        break;
                    }
                }
            }
        }
    }
}

@Getter
@Setter
class PiggyBank {
    private double balance;

    public PiggyBank() {
        balance = 0;
    }

    public void addPenny() {
        balance += 0.01;
    }

    public void addNickel() {
        balance += 0.05;
    }

    public void addDime() {
        balance += 0.10;
    }

    public void addQuarter() {
        balance += 0.25;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }
}
