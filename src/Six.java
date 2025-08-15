import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iltimos ismingizni kiriting: ");
        String name = scanner.nextLine();

        System.out.print("Iltimos Familyangisni kiriting: ");
        String lastName = scanner.nextLine();

        System.out.print("Iltimos yoshingizni kiritng: ");
        int age = scanner.nextInt();

        System.out.println("Sizning ismingiz: " + name);
        System.out.println("Sizning familyangiz: " + lastName);
        System.out.println("Sizning yoshingiz: " + age);

        if(age < 18){
            System.out.println("Siz hali voyaga yetmagansiz huquqiz yo'q!");
        }else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Iltimos yoshingizni tasdiqlash uchun id kartangizni seriya raqamini kiriting: ");
            String id  = sc.nextLine();
            if (id.contains("18")){
                System.out.println("Siz rostan ham voyaga yetgansiz");
            }else {
                System.out.println("Siz bizni aldamoqchi bo'lganiz uchun javob berasiz 🤬");
                System.out.print("Siz bu qilgan ishingizdan afsusdamisiz(ha / yoq): ");
                String response = scanner.nextLine();
                if (response.contains("ha")) {
                    System.out.println("Hech qachon yolg'on gapirmang!");
                } else {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("San nimaga aldading 🤬");
                    }
                }
            }
        }
    }
}