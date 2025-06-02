public class PatternQuestions {
    public static void main(String[] args) {
        System.out.println("First Pattern\n");
        pattern1();
        System.out.println();
        System.out.println("Second Pattern\n");
        pattern2();
    }

    public static void pattern1() {
        int column = 1;
        while (column <= 5) {
            System.out.print("*");
            int rows = 1;
            while (rows < column) {
                System.out.print(" *");
                rows++;
            }
            System.out.println();
            column++;
        }
    }

    public static void pattern2() {
        int column = 5;
        while (column >= 1) {
            System.out.print("*");
            int rows = 1;
            while (rows < column) {
                System.out.print(" *");
                rows++;
            }
            System.out.println();
            column--;
        }
    }
}
