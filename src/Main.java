import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //        String ism = "Muhammadsodiq";
        //        int yosh = 17;
        //        double bal = 99;
        //        boolean developer = true;
        //        char belgi = 'U';
        //        System.out.println("Sizning ismingiz: " + ism + '\n' + "Sizning yoshingiz: " + yosh + '\n'+ "Sizning to'plagan balingiz: " + bal +        '\n' + "Dasturulashni bilishingiz: " + developer + '\n' + "Sizning ismingizni bosh xarfi: " + belgi);

        //        int yosh = 17;
        //        if (yosh < 13){
        //            System.out.println("Siz yosh bolasiz");
        //        } else if (yosh >= 13 && yosh <= 18) {
        //            System.out.println("Siz o'smir ekansiz");
        //        } else if (yosh >= 18 && yosh <= 60) {
        //            System.out.println("Siz katta yoshdasiz");
        //        }else {
        //            System.out.println("Siz nafaqadasiz");
        //        }

        //        Scanner input = new Scanner(System.in);
        //        System.out.print("Ismingizni kiriting: ");
        //        String ism = input.nextLine();
        //        System.out.print("Yoshingizni kiriting: ");
        //        int yosh = input.nextInt();
        //        System.out.println("Salom: " + ism + '\n' + "Siz: " + yosh + "yosh dasiz");

        //        Scanner input = new Scanner(System.in);
        //        System.out.print("Ismingizni kiriting: ");
        //        String ism = input.nextLine();
        //        System.out.print("Familyangizni kiriting: ");
        //        String familya = input.nextLine();
        //        System.out.print("Yoshingizni kiriting: ");
        //        int yosh = input.nextInt();
        //        System.out.print("Kursdagi bahoyingizni kiriting: ");
        //        int baho = input.nextInt();
        //        System.out.println("Ismingiz: " + ism);
        //        System.out.println("Familyangiz: " + familya);
        //        System.out.println("Yoshingiz: " + yosh);
        //        System.out.println("Kursdagi bahoyingizni: " + baho);

        //        Scanner input = new Scanner(System.in);
        //        System.out.print("Yoshingizni kiriting: ");
        //        int yosh = input.nextInt();
        //        if (yosh < 18){
        //            System.out.println("Siz hali voyaga yetmagansiz !");
        //        } else if (yosh >= 18 && yosh < 65) {
        //            System.out.println("Siz voyaga yetgansiz !");
        //        } else {
        //            System.out.println("Siz pensiya yoshidasiz !");
        //        }

        //        Scanner input = new Scanner(System.in);
        //        System.out.print("Havo haroratini kiriting: ");
        //        int havo = input.nextInt();
        //        if (havo < 0){
        //            System.out.print("Havo juda sovuq!");
        //        } else if (havo <= 15) {
        //            System.out.print("Havo salqin!");
        //        } else if (havo <= 30) {
        //            System.out.print("Havo iliq!");
        //        }else {
        //            System.out.print("Havo issiq!");
        //        }

        //        Scanner input = new Scanner(System.in);
        //        System.out.print("Hohlagan kunni kiriting(1-7): ");
        //        int day = input.nextInt();
        //
        //        switch (day) {
        //            case 1:
        //                System.out.println("Dushanba");
        //                break;
        //            case 2:
        //                System.out.println("Seshanba");
        //                break;
        //            case 3:
        //                System.out.println("Chorshanba");
        //                break;
        //            case 4:
        //                System.out.println("Payshanba");
        //                break;
        //            case 5:
        //                System.out.println("Juma");
        //                break;
        //            case 6:
        //                System.out.println("Shanba");
        //                break;
        //            case 7:
        //                System.out.println("Yakshanba");
        //                break;
        //            default:
        //                System.out.println("Noto'g'ri raqam");
        //        }

        //        Scanner input = new Scanner(System.in);
        //        System.out.print("Hohlagan oyni kirit(12): ");
        //        int oy = input.nextInt();
        //
        //        switch (oy){
        //            case 1:
        //                System.out.println("Yanvar");
        //                break;
        //            case 2:
        //                System.out.println("Fevral");
        //                break;
        //            case 3:
        //                System.out.println("Mart");
        //                break;
        //            case 4:
        //                System.out.println("Aprel");
        //                break;
        //            case 5:
        //                System.out.println("May");
        //                break;
        //            case 6:
        //                System.out.println("Iyun");
        //                break;
        //            case 7:
        //                System.out.println("Iyul");
        //                break;
        //            case 8:
        //                System.out.println("Avgust");
        //                break;
        //            case 9:
        //                System.out.println("Sentabr");
        //                break;
        //            case 10:
        //                System.out.println("Oktabr");
        //                break;
        //            case 11:
        //                System.out.println("Noyabr");
        //                break;
        //            case 12:
        //                System.out.println("Dekabr");
        //                break;
        //            default:
        //                System.out.println("Uyga booor");
        //        }

        //        for (int i = 1; i <= 5; i++) {
        //            System.out.println("Salom, bu " + i + "-marta!");
        //        }
        //        int i = 1;

        //        while (i <= 5) {
        //            System.out.println("Salom, bu while tsikli " + i + "-marta!");
        //            i++;
        //        }

        //        for (int i = 1; i <= 10; i++){
        //            if ( i % 2 == 0){
        //                System.out.println("Faqat juft sonlar: " + i);
        //            }
        //        }

        //        Scanner input = new Scanner(System.in);
        //        System.out.print("ismingizni kiriting: ");
        //        String ism = input.nextLine();
        //        System.out.print("Yoshingizni kiriting: ");
        //        int yosh = input.nextInt();
        //        if (yosh < 18){
        //            System.out.println("Siz hali voyaga yetmagansiz");
        //        }else {
        //            System.out.println("Siz voyaga yetgansiz");
        //        }
        //        Scanner input_second = new Scanner(System.in);
        //        System.out.print("1 dan 7 gacha raqam kiriting (hafta kuni): ");
        //        int yoshSecond = input.nextInt();
        //        switch (yoshSecond){
        //            case 1:
        //                System.out.println("Dushanba");
        //                break;
        //            case 2:
        //                System.out.println("Seshanba");
        //                break;
        //            case 3:
        //                System.out.println("Chorshanba");
        //                break;
        //            case 4:
        //                System.out.println("Payshanba");
        //                break;
        //            case 5:
        //                System.out.println("Juma");
        //                break;
        //            case 6:
        //                System.out.println("Shanba");
        //                break;
        //            case 7:
        //                System.out.println("Yakshanba");
        //                break;
        //            default:
        //                System.out.println("Noto'g'ri raqam");
        //        }
        //        for (int i = 0; i <= 10; i++){
        //            if (i % 2 == 0){
        //                System.out.println(i);
        //            }
        //        }

        //        Scanner input = new Scanner(System.in);
        //        System.out.print("Ismingizni kiriting: ");
        //        String ism = input.nextLine();
        //
        //        System.out.print("Yoshingizni kiriting: ");
        //        int yosh = input.nextInt();
        //
        //        System.out.print("Vazningizni kiritin: ");
        //        double vazn = input.nextDouble();
        //
        //        System.out.println("Salom, " + ism + "! " + "Siz " + yosh + " yoshdasiz va " + vazn + "kg vazn ga egasiz!");

        //        class Car {
        //            String model;
        //            int year;
        //            String color;
        //
        //            public void drive(){
        //                System.out.println("Mening orzuyimdagi moshina " + model + '\n' + "shu yili ishlab chiqarilgan:" + year + "\n" + "va u shunaqa rangda " + color);
        //            }
        //        }
        //        Car myCar = new Car();
        //        myCar.model = "BMW";
        //        myCar.year = 2024;
        //        myCar.color = "red";
        //        myCar.drive();
    }
}