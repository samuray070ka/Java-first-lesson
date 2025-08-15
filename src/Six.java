import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-raqamni kiriting: ");
        int a = 0;
        a = scanner.nextInt();
        System.out.print("2-raqamni kiriting: ");
        int b = 0;
        b = scanner.nextInt();
        System.out.print("3-raqamni kiriting: ");
        int c = 0;
        c = scanner.nextInt();
        System.out.print("4-raqamni kiriting: ");
        int d = 0;
        d = scanner.nextInt();
        System.out.print("5-raqamni kiriting: ");
        int e = 0;
        e = scanner.nextInt();
        int result;
        result = (a + b + c + d + e) / 5;

        System.out.print("Taxmin qilib ko'ring nechi son chiqishini: ");
        int son =  scanner.nextInt();
        if (result == son){
            System.out.println("✅ Shunchaki qoyil to'g'ri javob!");
        }else {
            System.out.println("❌ Xato javob berdingiz mayli keyingi safar topasiz! \n" + "To'g'ri javob " + result);
        }
    }
}