import java.util.Scanner;
public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int n2 = scanner.nextInt();
        printRange(n1 < n2 ? n1 : n2, n1 < n2 ? n2 : n1);
    }
    public static void printRange(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
