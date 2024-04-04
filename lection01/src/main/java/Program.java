public class Program {
    public static void main(String[] args) {
        int[][] array = new int[3][5];

        for (int[] ins: array) {
            for (int anInt : ins) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
    }

}
