import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số USD");
        Float USD = scanner.nextFloat();

        Float Change = USD * 23000;

        System.out.println(Change + "VND/USD");

    }
}
