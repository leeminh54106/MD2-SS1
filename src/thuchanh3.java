import java.util.Scanner;

public class thuchanh3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào width:");
        float Width = scanner.nextFloat();

        System.out.println("nhập vào Height");
        float Height = scanner.nextFloat();

        float are = Width * Height;
        System.out.println("phép nhân là:" + are);

    }
}
