package bankingProgram;
import java.util.Scanner;
public class bank {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        double balance = 0.0;
        int choice;

        

        print("------------------");
        print("Banking Program");
        print("------------------\n");
        options();

        while (isRunning) {
            options();
            print("\nPlease enter your choice: ");
            
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> showBalance(balance);
                    case 2 -> balance += deposit();
                    case 3 -> balance -= withdraw(balance);
                    case 4 -> {
                        print("Exiting...");
                        isRunning = false;
                    }
                    default -> print("Invalid choice. Please try again.");
                }
            } else {
                print("Invalid input. Please enter a number.");
                sc.next();
            }
        }
        sc.close();
    }

    private static void options() {
        print("Options: ");
        print("1. Check balance");
        print("2. Deposit money");
        print("3. Withdraw money");
        print("4. Exit program");
        print("------------------\n");
    }
    private static void showBalance(double balance) {
        print("------------------\n");
        System.out.printf("Balance:\n$%.2f", balance);
        print("\n------------------\n");
    }
    private static double deposit(){

        double amount;
        print("Enter the amount to deposit: ");
        amount = sc.nextDouble();
        
        if(amount < 0){
            print("Invalid amount. Please try again.");
            return 0.0;
        } else {
            return amount;

        }
    }
    static double withdraw(double balance){
        double amount;
        print("Enter the amount to withdraw: ");
        amount = sc.nextDouble();

        if(amount < 0){
            print("Invalid amount. Please try again.");
            return 0.0;
        } else if(amount > balance){
            print("Insufficient funds. Please try again.");
            return 0.0;
        } else {
            return amount;
        }
    }
    public static void print(String s) {
        System.out.println(s);
    }
    public static void print(double i) {
        System.out.println(i);
    }   
    public static void print(int i) {
        System.out.println(i);
    }
    public static void print(String a, double b){
        System.out.println(String.format(a, b));
    }
}
