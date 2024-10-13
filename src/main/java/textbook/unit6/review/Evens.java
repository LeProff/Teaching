package textbook.unit6.review;

public class Evens {

    public static void main(String[] args) {

        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) System.out.print(num + " ");
            num++;
        }
    }
}
