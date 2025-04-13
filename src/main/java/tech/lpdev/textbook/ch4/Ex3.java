package tech.lpdev.textbook.ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double rent, tuition, books, extra, scholarships, finalCost;

        System.out.print("Rent: ");
        rent = input.nextDouble();

        System.out.print("Tuition: ");
        tuition = input.nextDouble();

        System.out.print("Books and other materiels: ");
        books = input.nextDouble();

        System.out.print("Other expenses: ");
        extra = input.nextDouble();

        System.out.print("Scholarships: ");
        scholarships = input.nextDouble();

        finalCost = rent + tuition + books + extra - scholarships;
        System.out.println("The final cost will be: $" + finalCost);
    }
}
