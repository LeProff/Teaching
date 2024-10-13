package textbook.unit7.review;

import java.util.Scanner;

public class DisplayBox1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a height: ");
        int height = input.nextInt();
        System.out.print("Enter a width: ");
        int width = input.nextInt();

        drawBox(height, width);
    }

    public static void drawBox(int height, int width) {
        for (int i = 0; i < height; i++) {
            drawBar(width);
            System.out.println();
        }
    }

    public static void drawBar(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
    }
}
