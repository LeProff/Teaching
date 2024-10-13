public class Teaching {

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("test");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}