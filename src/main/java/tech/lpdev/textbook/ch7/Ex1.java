package tech.lpdev.textbook.ch7;

public class Ex1 {

    public static void main(String[] args) {
        addRoof();
        addBase();
        addWalk();
    }

    private static void addRoof() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println("/______\\");
    }

    private static void addBase() {
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");
    }

    private static void addWalk() {
        System.out.println("   **");
        System.out.println("   ***********");
    }
}
