import java.time.Year;
import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tên bạn là gì?");
        String name = scanner.nextLine();

        System.out.println("giới tính bạn là gì? (nam = true/ nữ = false)");
        Boolean sex = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("sở thích của bạn là gì?");
        String hoby = scanner.nextLine();

        System.out.println("bạn bao nhiêu tuổi?");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("xin chào," + name);
        System.out.println("giới tính của bạn là: " + (sex ? "nam" : "nữ"));
        System.out.println("sở thích của bạn là: " +hoby);
        System.out.println("bạn "+age +"tuổi" +", và năm sinh của bạn là: " + (Year.now().getValue()-age));
    }
}
