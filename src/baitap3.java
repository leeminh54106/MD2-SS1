import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều dài");
        float chieudai = scanner.nextFloat();

        System.out.println("nhập chiều cao");
        float chieucao = scanner.nextFloat();

        float C = (chieudai + chieucao) *2;
        float S = chieudai * chieucao;

        System.out.println("diện tích là: " +S +"\n" +"chu vi là: " +C);
    }
}
