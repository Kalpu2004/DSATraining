public class StarPattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= n; j++) {
                for (int s = 0; s < i * 4; s++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
