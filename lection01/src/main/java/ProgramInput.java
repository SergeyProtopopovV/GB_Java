import java.util.Scanner;

public class ProgramInput {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        System.out.print("int a: ");
        int x = iScanner.nextInt();
        System.out.print("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);

        iScanner.close();
    }

}
