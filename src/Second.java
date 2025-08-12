import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
public class Second {
    public static void main(String[] args) {
        //        class Person {
        //            private String name; // tashqaridan kira olmaymiz
        //
        //            public void setName(String n) {
        //                name = n;
        //            }
        //
        //            public String getName() {
        //                return name;
        //            }
        //        }
        //        Person p = new Person();  // obyekt yaratamiz
        //        p.setName("Muhammadsodiq"); // ismni set qilamiz
        //        System.out.println("Ism: " + p.getName()); // ismni chiqaramiz


        //        class PersonAge {
        //            private int age;
        //
        //            public void setAge(int a) {
        //                age = a;
        //            }
        //
        //            public int getAge() {
        //                return age;
        //            }
        //        }
        //        PersonAge pa = new PersonAge();
        //        Scanner form =  new Scanner(System.in);
        //        System.out.print("Enter your age: ");
        //        int age = form.nextInt();
        //        pa.setAge(age);
        //        if (pa.getAge() >= 18){
        //            System.out.println("Siz o'smir yoshdasiz!");
        //        }
        //        else {
        //            System.out.println("Siz hali o'smir yoshda emassiz!");
        //        }

        //        class Animal {
        //            public void speak() {
        //                System.out.println("Animal speaks");
        //            }
        //        }
        //        class Dog extends Animal {
        //            public void bark() {
        //                System.out.println("Dog barks");
        //            }
        //        }
        //        Dog myDog = new Dog();
        //        myDog.speak();  // Animal'dan meros olingan method
        //        myDog.bark();   // O'ziga xos method

        //        class Animal {
        //            public void makeSound() {
        //                System.out.println("Some sound");
        //            }
        //        }
        //
        //        class Cat extends Animal {
        //            public void makeSound() {
        //                System.out.println(12);
        //            }
        //        }
        //
        //        class Dog extends Animal {
        //            public void makeSound() {
        //                System.out.println("Woof");
        //            }
        //        }
        //        Animal myAnimal = new Animal();
        //        Animal myCat = new Cat();
        //        Animal myDog = new Dog();
        //        myAnimal.makeSound(); // Some sound
        //        myCat.makeSound();    // Meow
        //        myDog.makeSound();    // Woof

        //        Scanner input = new Scanner(System.in);
        //        System.out.print("Enter a animal voice: ");
        //        String animal = input.nextLine();
        //
        //            class Animal{
        //                public void voice(){
        //                    System.out.print("it is a no-one");
        //                }
        //            }
        //            class Cat extends Animal {
        //                public void voice(){
        //                    System.out.print("it is a cat");
        //                }
        //            }
        //            class Dog extends Animal {
        //                public void voice(){
        //                    System.out.print("it is a dog");
        //                }
        //            }
        //        Animal myCat = new Cat();
        //        Animal myDog = new Dog();
        //
        //        switch (animal){
        //            case "meow":
        //                System.out.print(myCat);
        //                break;
        //            case "vov":
        //                System.out.print(myDog);
        //                break;
        //            default:
        //                System.out.print("xatolik");
        //        }


        //                Scanner input = new Scanner(System.in);
        //                System.out.print("Transport turini kiriting (car, bicycle, plane): ");
        //                String transportType = input.nextLine();
        //
        //                class Transport {
        //                    public void move() {
        //                        System.out.println("Transport harakatlanmoqda");
        //                    }
        //                }
        //
        //                class Car extends Transport {
        //                    public void move() {
        //                        System.out.println("Mashina yo‘lda yurmoqda");
        //                    }
        //                }
        //
        //                class Bicycle extends Transport {
        //                    public void move() {
        //                        System.out.println("Velosiped pedal bilan harakatlanmoqda");
        //                    }
        //                }
        //
        //                class Plane extends Transport {
        //                    public void move() {
        //                        System.out.println("Samolyot uchmoqda");
        //                    }
        //                }
        //
        //                Transport myTransport;
        //                switch (transportType.toLowerCase()) {
        //                    case "car":
        //                        myTransport = new Car();
        //                        break;
        //                    case "bicycle":
        //                        myTransport = new Bicycle();
        //                        break;
        //                    case "plane":
        //                        myTransport = new Plane();
        //                        break;
        //                    default:
        //                        myTransport = new Transport(); // noto‘g‘ri kiritilsa
        //                }
        //                myTransport.move();


        //        class Tool {
        //            public void use(){
        //                System.out.println("Bu asbob ishlatilmoqda");
        //            }
        //        }
        //        class Hammer extends Tool{
        //            public void use(){
        //                System.out.println("Bolg'a mix qoqmoqda");
        //            }
        //        }
        //        class Saw extends Tool{
        //            public void use(){
        //                System.out.println("Arra yog'ochni kesmoqda");
        //            }
        //        }
        //        class Drill extends Tool{
        //            public void use(){
        //                System.out.println("Drel teshik qilmoqda");
        //            }
        //        }
        //        Scanner example = new Scanner(System.in);
        //        System.out.print("Birorta qurilmani nomini kiriting(saw, drill, hammer): ");
        //        String name = example.nextLine();
        //
        //        Tool tol;
        //        switch (name) {
        //            case "saw":
        //                tol = new Saw();
        //                break;
        //            case "drill":
        //                tol = new Drill();
        //                break;
        //            case "hammer":
        //                tol = new Hammer();
        //                break;
        //            default:
        //                tol = new Tool();
        //        }
        //        tol.use();

        //        abstract class Transport {
        //            public abstract void move(); // abstrakt metod
        //        }
        //
        //        class Car extends Transport {
        //            public void move() {
        //                System.out.println("Car is driving");
        //            }
        //        }
        //
        //        class Bicycle extends Transport {
        //            public void move() {
        //                System.out.println("Bicycle is pedaling");
        //            }
        //        }
        //
        //        class Plane extends Transport {
        //            public void move() {
        //                System.out.println("Plane is flying");
        //            }
        //        }
        //
        //                Transport myCar = new Car();
        //                Transport myBike = new Bicycle();
        //                Transport myPlane = new Plane();
        //
        //                myCar.move();     // Car is driving
        //                myBike.move();    // Bicycle is pedaling
        //                myPlane.move();   // Plane is flying

        //        abstract class Shape{
        //            public abstract void Draw();
        //        }
        //        class Circle extends Shape{
        //            public void Draw(){
        //                System.out.println("Circle");
        //            }
        //        }
        //        class Square extends Shape{
        //            public void Draw(){
        //                System.out.println("Square");
        //            }
        //        }
        //        class Triangle extends Shape{
        //            public void Draw(){
        //                System.out.println("Triangle");
        //            }
        //        }
        //
        //        Shape a = new Circle();
        //        Shape b = new Square();
        //        Shape c = new Triangle();
        //
        //        a.Draw();
        //        b.Draw();
        //        c.Draw();

        //        interface Transport {
        //            void move();  // bu faqat e’lon, tanasi yo‘q
        //        }
        //
        //        class Car implements Transport {
        //            public void move() {
        //                System.out.println("Car is moving");
        //            }
        //        }
        //
        //        class Bicycle implements Transport {
        //            public void move() {
        //                System.out.println("Bicycle is moving");
        //            }
        //        }
        //
        //        Transport cars = new Car();
        //        Transport bicycles = new Bicycle();
        //
        //        cars.move();
        //        bicycles.move();

        //        interface Transport{
        //            void move();
        //        }
        //        class Car implements Transport{
        //            public void move(){
        //                System.out.println("Car is moving on the road ");
        //            }
        //        }
        //        class Bicycle implements Transport{
        //            public void move(){
        //                System.out.println("Bicycle is moving on the bike lane");
        //            }
        //        }
        //        class Airplne implements Transport{
        //            public void move(){
        //                System.out.println("Airpline is moving in the airplane");
        //            }
        //        }
        //        Transport car = new Car();
        //        Transport bicycle = new Bicycle();
        //        Transport airplane = new Airplne();
        //
        //        car.move();
        //        bicycle.move();
        //        airplane.move();

        //        try {
        //            int a = 5;
        //            int b = 5;
        //            int c = a * b; // ⚠️ bu yerda xatolik chiqadi (0 ga bo‘lish)
        //            System.out.println("Natija: " + c);
        //        } catch (ArithmeticException e) {
        //            System.out.println("Xatolik: 0 ga bo‘lish mumkin emas!");
        //        } finally {
        //            System.out.println("Dastur tugadi.");
        //        }

        //        Scanner natija = new Scanner(System.in);
        //        System.out.print("Birinchi sonni kiriting: ");
        //        int a = natija.nextInt();
        //        System.out.print("Ikkinchi sonni kiriting: ");
        //        int b = natija.nextInt();
        //        try {
        //            int c = a / b;
        //            System.out.println("Natija: " + c);
        //        }catch (ArithmeticException e){
        //            System.out.println("Xatolik: 0 ga bo‘lish mumkin emas!");
        //        }finally {
        //            System.out.println("Dastur tugadi.");
        //        }

        //        String s = "Java Dasturlash";
        //
        //        // uzunlik
        //                System.out.println(s.length());          // 16
        //
        //        // kichik harfga
        //                System.out.println(s.toLowerCase());     // java dasturlash
        //
        //        // katta harfga
        //                System.out.println(s.toUpperCase());     // JAVA DASTURLASH
        //
        //        // kesish
        //                System.out.println(s.substring(5));      // asturlash
        //                System.out.println(s.substring(0, 4));   // Java
        //
        //        // almashtirish
        //                System.out.println(s.replace("a", "*")); // J*v* D*sturl*sh
        //
        //        // tekshirish
        //                System.out.println(s.contains("Dast"));  // true
        //                System.out.println(s.startsWith("Java"));// true
        //                System.out.println(s.endsWith("ash"));   // true

        //        ArrayList<String> mevalar = new ArrayList<>();
        //
        //        mevalar.add("Olma");
        //        mevalar.add("Banan");
        //        mevalar.add("Uzum");
        //
        //        System.out.println(mevalar);          // [Olma, Banan, Uzum]
        //        System.out.println(mevalar.get(1));   // Banan
        //        mevalar.set(1, "Anor");               // elementni o'zgartirish
        //        mevalar.remove("Uzum");               // elementni o'chirish
        //        System.out.println(mevalar.size());   // uzunlik
        //
        //        // ro'yxatni aylanish (for-each)
        //        for (String meva : mevalar) {
        //            System.out.println(meva);
        //        }


        //        HashMap<String, Integer> baholar = new HashMap<>();
        //
        //        baholar.put("Ali", 90);
        //        baholar.put("Vali", 85);
        //
        //        System.out.println(baholar.get("Ali")); // 90
        //        System.out.println(baholar.containsKey("Vali")); // true
        //
        //        // kalit-qiymatlarni aylanish
        //        for (String ism : baholar.keySet()) {
        //            System.out.println(ism + " -> " + baholar.get(ism));
        //        }


        //        LinkedList<String> ismlar = new LinkedList<>();
        //
        //        ismlar.add("Ali");
        //        ismlar.addFirst("Vali");
        //        ismlar.addLast("Gani");
        //
        //        System.out.println(ismlar); // [Vali, Ali, Gani]

        //        Scanner input = new Scanner(System.in);
        //        ArrayList<String> mevalar = new ArrayList<>();
        //
        //        System.out.print("Nechta meva kiritasiz? ");
        //        int n = input.nextInt();
        //        input.nextLine(); // bu scanner xatolikni oldini oladi
        //
        //        for (int i = 0; i < n; i++) {
        //            System.out.print((i+1) + "-mevani kiriting: ");
        //            String meva = input.nextLine();
        //            mevalar.add(meva);
        //        }
        //
        //        System.out.println("Siz kiritgan mevalar: " + mevalar);
        //        Scanner scanner = new Scanner(System.in);
        //        ArrayList<String> mahsulotlar = new ArrayList<>();
        //        while (true) {
        //            System.out.println("\n🛍️  MAHSULOTLAR RO'YXATI DASTURI");
        //            System.out.println("1. Mahsulot qo'shish");
        //            System.out.println("2. Mahsulotlarni ko'rish");
        //            System.out.println("3. Mahsulotni o'zgartirish");
        //            System.out.println("4. Mahsulotni o'chirish");
        //            System.out.println("5. Chiqish");
        //            System.out.print("Tanlovingizni kiriting: ");
        //            int tanlov = scanner.nextInt();
        //            scanner.nextLine(); // nextInt'dan keyin ishlatiladi
        //            if (tanlov == 1) {
        //                // 1. Mahsulot qo‘shish
        //                System.out.print("Mahsulot nomini kiriting: ");
        //                String nom = scanner.nextLine();
        //                mahsulotlar.add(nom);
        //                System.out.println("✅ Mahsulot qo'shildi.");
        //            } else if (tanlov == 2) {
        //                // 2. Mahsulotlarni ko‘rish
        //                if (mahsulotlar.isEmpty()) {
        //                    System.out.println("⚠️ Ro'yxat bo'sh.");
        //                } else {
        //                    System.out.println("📦 Mahsulotlar:");
        //                    for (int i = 0; i < mahsulotlar.size(); i++) {
        //                        System.out.println((i + 1) + ". " + mahsulotlar.get(i));
        //                    }
        //                }
        //            } else if (tanlov == 3) {
        //                // 3. Mahsulotni yangilash
        //                System.out.print("O'zgartirmoqchi bo'lgan mahsulot raqamini kiriting: ");
        //                int index = scanner.nextInt() - 1;
        //                scanner.nextLine();
        //                if (index >= 0 && index < mahsulotlar.size()) {
        //                    System.out.print("Yangi nomni kiriting: ");
        //                    String yangiNom = scanner.nextLine();
        //                    mahsulotlar.set(index, yangiNom);
        //                    System.out.println("✅ Mahsulot yangilandi.");
        //                } else {
        //                    System.out.println("❌ Noto'g'ri indeks.");
        //                }
        //            } else if (tanlov == 4) {
        //                // 4. Mahsulotni o'chirish
        //                System.out.print("O'chirmoqchi bo'lgan mahsulot raqamini kiriting: ");
        //                int index = scanner.nextInt() - 1;
        //                scanner.nextLine();
        //                if (index >= 0 && index < mahsulotlar.size()) {
        //                    mahsulotlar.remove(index);
        //                    System.out.println("🗑️ Mahsulot o'chirildi.");
        //                } else {
        //                    System.out.println("❌ Noto'g'ri indeks.");
        //                }
        //            } else if (tanlov == 5) {
        //                System.out.println("🚪 Dasturdan chiqildi.");
        //                break;
        //            } else {
        //                System.out.println("❌ Noto'g'ri tanlov.");
        //            }
        //        }

        //        Scanner scanner = new Scanner(System.in);
        //        ArrayList<String> mahsulotlar = new ArrayList<>();
        //
        //        while (true){
        //            System.out.println("Mahsulotlar ro'yxati");
        //            System.out.println("1. Mahsulot qo'shish");
        //            System.out.println("2. Mahsulotlar ro'yxati");
        //            System.out.println("3. Mahsulotni o'zgartirish");
        //            System.out.println("4. Mahsulotni o'chirish");
        //            System.out.println("5. Chiqish");
        //
        //            System.out.print("Tanlovingizni kiriting");
        //            int tanlov = scanner.nextInt();
        //            scanner.nextLine();
        //
        //            if (tanlov == 1){
        //                System.out.print("Mahsulot nomini kiriting: ");
        //                String mahsulot =  scanner.nextLine();
        //                mahsulotlar.add(mahsulot);
        //                System.out.println("Mahsulot qo'shildi!");
        //            } else if (tanlov == 2) {
        //                if (mahsulotlar.isEmpty()){
        //                    System.out.println("Mahsulotlar mavjud emas");
        //                }else{
        //                    for (int i = 0; i < mahsulotlar.size(); i++){
        //                        System.out.println((i+1) + ". " + mahsulotlar.get(i));
        //                    }
        //                }
        //            } else if (tanlov == 3) {
        //                System.out.print("Mahsulot indeks ni kiriting: ");
        //                int index =  scanner.nextInt() - 1;
        //                scanner.nextLine();
        //                if (index >= 0 && index < mahsulotlar.size()){
        //                    System.out.print("Yangi nom kiriting: ");
        //                    String yangi =  scanner.nextLine();
        //                    System.out.println(mahsulotlar.set(index, yangi));
        //                    System.out.println("Mahsulot qo'shildi!");
        //                }else {
        //                    System.out.println("Mahsulot indeks si xato");
        //                }
        //            }
        //            else if (tanlov == 4) {
        //                System.out.print("O'chirmoqchi bo'lgan malumotni indeksini kiriting: ");
        //                int remove =  scanner.nextInt() - 1 ;
        //                scanner.nextLine();
        //                if (remove >= 0 && remove < mahsulotlar.size()){
        //                    System.out.println(mahsulotlar.remove(remove));
        //                    System.out.println("Mahsulot o'chirildi!");
        //                }else {
        //                    System.out.println("Mahsulot indeks si xato");
        //                }
        //            }
        //            else if (tanlov == 5){
        //                System.out.println("Dastur yakunlandi");
        //                break;
        //            }
        //        }
    }
}