import java.util.Random;
import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        System.out.print("1-raqamni kiriting: ");
        //        int a = 0;
        //        a = scanner.nextInt();
        //        System.out.print("2-raqamni kiriting: ");
        //        int b = 0;
        //        b = scanner.nextInt();
        //        System.out.print("3-raqamni kiriting: ");
        //        int c = 0;
        //        c = scanner.nextInt();
        //        System.out.print("4-raqamni kiriting: ");
        //        int d = 0;
        //        d = scanner.nextInt();
        //        System.out.print("5-raqamni kiriting: ");
        //        int e = 0;
        //        e = scanner.nextInt();
        //        int result;
        //        result = (a + b + c + d + e) / 5;
        //
        //        System.out.print("Taxmin qilib ko'ring nechi son chiqishini: ");
        //        int son =  scanner.nextInt();
        //        if (result == son){
        //            System.out.println("✅ Shunchaki qoyil to'g'ri javob!");
        //        }else {
        //            System.out.println("❌ Xato javob berdingiz mayli keyingi safar topasiz! \n" + "To'g'ri javob " + result);
        //        }

        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("...............");
        System.out.println("Siz bilan xozir bir o'yin o'ynaymiz, men hozir bitta raqam o'ylayman uni siz topishingiz kerak bo'ladi!");
        System.out.println("...............");
        System.out.println("1.Oson daraja: 1 dan 5 gacha raqam o'yladim toping!");
        System.out.println("2.O'rtacha daraja: 1 dan 15 gacha raqam o'yladim toping!");
        System.out.println("3.Qiyin daraja: 1 dan 30 gacha raqam o'yladim toping!");
        System.out.println("...............");
        System.out.print("Bittasini tanlang: ");
        int tanlov = scanner.nextInt();
        if (tanlov == 1){
            System.out.print("1 dan 5 gacha raqam kiriting: ");
            int easy =  scanner.nextInt();
            int numberEasy = randomNumber.nextInt(1, 6);
            if (easy == numberEasy){
                System.out.println("✅To'g'ri topdingiz man o'ylagan raqam shu edi: " + numberEasy);
            }
            else {
                System.out.print("⚠ Siz yozgan raqam xato yana bir bor urunib ko'ring: ");
                int imkon = scanner.nextInt();
                if (numberEasy == imkon){
                    System.out.println("✅To'g'ri topdingiz 2-urinishda bo'lsa ham man o'ylagan raqam shu edi: " + numberEasy);
                }else {
                    System.out.println("❌Xato man o'ylagan son bu edi: " + numberEasy);
                }
            }
        } else if (tanlov == 2) {
            System.out.print("1 dan 15 gacha raqam kiriting: ");
            int numberNormal = randomNumber.nextInt(1, 16);
            int normal =  scanner.nextInt();
            if (normal == numberNormal){
                System.out.println("✅To'g'ri topdingiz man o'ylagan raqam shu edi: " + numberNormal);
            }
            else {
                System.out.print("⚠ Siz yozgan raqam xato yana bir bor urunib ko'ring: ");
                int imkon = scanner.nextInt();
               if (numberNormal == imkon){
                   System.out.println("✅To'g'ri topdingiz 2-urinishda bo'lsa ham man o'ylagan raqam shu edi: " + numberNormal);
               }else{
                   System.out.println("❌Xato man o'ylagan son bu edi: " + numberNormal);
               }
            }
        }else if (tanlov == 3) {
            int numberHard = randomNumber.nextInt(1, 31);
            System.out.print("1 dan 30 gacha raqam kiriting: ");
            int hard =  scanner.nextInt();
            if (hard == numberHard){
                System.out.println("✅To'g'ri topdingiz man o'ylagan raqam shu edi: " + numberHard);
            }
            else {
                System.out.print("⚠ Siz yozgan raqam xato yana bir bor urunib ko'ring: ");
                int imkon = scanner.nextInt();
                if (numberHard == imkon){
                    System.out.println("✅To'g'ri topdingiz 2-urinishda bo'lsa ham man o'ylagan raqam shu edi: " + numberHard);
                }else{
                    System.out.println("❌Xato man o'ylagan son bu edi: " + numberHard);
                }
            }
        }
    }
}