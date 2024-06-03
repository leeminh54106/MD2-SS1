import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập điểm Toán");
        float t = scanner.nextFloat();

        System.out.println("nhập điểm Văn");
        float v = scanner.nextFloat();

        System.out.println("nhập điểm Anh");
        float a = scanner.nextFloat();

        float sum = t+v+a;
        float tb = sum/3;
        System.out.printf("Tổng điểm là %.2f \n Điểm trung bình là : %.2f", sum,tb);
    }
}
