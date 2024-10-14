package tech.lpdev.textbook.ch7.review;

public class SpanishNumbers {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) spanishNumbers(i);
    }

    public static void spanishNumbers(int num) {
        switch (num) {
            case 1 -> System.out.println("1. uno");
            case 2 -> System.out.println("2. dos");
            case 3 -> System.out.println("3. tres");
            case 4 -> System.out.println("4. cuatro");
            case 5 -> System.out.println("5. cinco");
            case 6 -> System.out.println("6. seis");
            case 7 -> System.out.println("7. siete");
            case 8 -> System.out.println("8. ocho");
            case 9 -> System.out.println("9. nueve");
            case 10 -> System.out.println("10. diez");
        }
    }
}
