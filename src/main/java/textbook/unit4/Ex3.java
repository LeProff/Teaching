package textbook.unit4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double rent, tuition, books, extra, scholarships, finalCost;

        System.out.print("Rent: ");
        rent = Double.parseDouble(input.readLine());

        System.out.print("Tuition: ");
        tuition = Double.parseDouble(input.readLine());

        System.out.print("Books and other materiels: ");
        books = Double.parseDouble(input.readLine());

        System.out.print("Other expenses: ");
        extra = Double.parseDouble(input.readLine());

        System.out.print("Scholarships: ");
        scholarships = Double.parseDouble(input.readLine());

        finalCost = rent + tuition + books + extra - scholarships;
        System.out.println("The final cost will be: $" + finalCost);
    }
}
