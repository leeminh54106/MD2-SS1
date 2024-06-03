import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số cần chuyển đổi");
        float number = scanner.nextFloat();

        float binhphuong = number*number;
        float lapphuong = number*number*number;

        System.out.println("bình phương của " +number +" là: " + binhphuong);
        System.out.println("lập phương của " +number +" la: " +lapphuong);
    }
}
