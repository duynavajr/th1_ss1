import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // hiển thị ngày giờ
        Date date = new Date();
        System.out.println(date);

        // khai báo sử dụng biến
        int i = 10;
        float f = 20.5f;
        boolean b = true;
        char c = 'a';
        String s = "Hà nội";
        System.out.println("i :" + i);
        System.out.println("f :" + f);
        System.out.println("b :" + b);
        System.out.println("c :" + c);
        System.out.println("s :" + s);

        // sử dụng toán tử
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextFloat();
        System.out.println("Enter height");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Area is :"+area);
    }
}