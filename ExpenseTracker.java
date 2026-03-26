import java.io.*;
import java.util.*;

public class ExpenseTracker {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("Expenses.txt", true);

        System.out.print("Enter Expense: ");
        String item = sc.nextLine();

        System.out.print("Enter Amount: ");
        int amt = sc.nextInt();

        fw.write(item + " - " + amt + "\n");
        fw.close();

        System.out.println("Expense Saved!");
    }
}
