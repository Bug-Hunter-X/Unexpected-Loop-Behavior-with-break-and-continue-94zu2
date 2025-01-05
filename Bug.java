public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            if (i == 7) {
                continue; // Skip to the next iteration when i is 7
            }
        }
    }
}