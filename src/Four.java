import java.util.Random;
import java.util.Scanner;
public class Four {
    public  static void main(String[] args){
        //        Random random = new Random();
        //        boolean
        //        number = random.nextBoolean();
        //        if (number){
        //            System.out.println("to'g'ri");
        //        }else {
        //            System.out.println("xato");
        //        }

        //        System.out.println(Math.PI);
        //        System.out.println(Math.E);
        //        double result;
        //        result = Math.pow(2, 5);
        //        result = Math.abs(-11110);
        //        result = Math.sqrt(9);
        //        result = Math.round(4.3);
        //        //        Faqat tepaga yaxlitlaydi
        //        result = Math.ceil(4.3);
        //        //        faqat pastga yaxlitlaydi
        //        result = Math.floor(4.3);
        //        result = Math.max(10, 20);
        //        result = Math.min(10, 20);
        //
        //        System.out.println(result);

        //        Scanner scanner = new Scanner(System.in);
        //        double a;
        //        double b;
        //        double c;
        //
        //        System.out.print("Enter a number A: ");
        //        a = scanner.nextDouble();
        //
        //        System.out.print("Enter a number A: ");
        //        b = scanner.nextDouble();
        //
        //        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        //
        //        System.out.println("Yig'indi: " + c + "cm");
        //        scanner.close();

        //        Scanner scanner = new Scanner(System.in);
        //
        //        double radius;
        //        double area;
        //        double volume;
        //        double circumference;
        //
        //        System.out.print("Enter the radius: ");
        //        radius = scanner.nextDouble();
        //
        //        circumference = 2 * Math.PI * radius;
        //        area = Math.PI * Math.pow(radius, 2);
        //        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        //        System.out.printf("The area of the circumference is: %.1fcm\n", circumference);
        //        System.out.printf("The area of the area is: %.1fcm\n", area);
        //        System.out.printf("The area of the volume is: %.1fcm\n", volume);

        //        String name = "Muhammadsodiq";
        //        int age = 17;
        //
        //        System.out.printf("%s is %d years old", name, age);

        //        double price = 9.99;
        //        double price1 = 71.2;
        //        double price2 = -81.23;
        //
        //        System.out.printf("%.1f\n", price);
        //        System.out.printf("%.1f\n", price1);
        //        System.out.printf("%.1f\n", price2);

        //        int son1 = 0;
        //        int son2 = 0;
        //        int son3 = 0;
        //        int son4 = 0;
        //        int son5 = 0;
        //        int son6 = 0;
        //        int result = 0;
        //        Scanner scanner = new  Scanner(System.in);
        //        System.out.print("Enter 1st number: ");
        //        son1 = scanner.nextInt();
        //        System.out.print("Enter 2st number: ");
        //        son2 = scanner.nextInt();
        //        System.out.print("Enter 3st number: ");
        //        son3 = scanner.nextInt();
        //        System.out.print("Enter 4st number: ");
        //        son4 = scanner.nextInt();
        //        System.out.print("Enter 5st number: ");
        //        son5 = scanner.nextInt();
        //        System.out.print("Enter 6st number: ");
        //        son6 = scanner.nextInt();
        //        result = (son1 + son2 + son3 + son4 + son5 + son6) / 6;
        //        System.out.println("Shu kiritgan barcha sonlarni o'rta arifmetiki: " + result + "ga teng!");
        //        scanner.close();

        //        Scanner scanner = new Scanner(System.in);
        //        String name = "";
        //        System.out.print("Enter your email: ");
        //        name = scanner.nextLine();
        //        if (name.contains("@")){
        //            String username = name.substring(0, name.indexOf("@"));
        //            String domain = name.substring(name.indexOf("@"));
        //            System.out.println(username);
        //            System.out.println(domain);
        //        }
        //        else {
        //            System.out.println("your email is invalid");
        //        }
        //        scanner.close();

        //        int score = 60;
        //        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        //        System.out.println(passOrFail);

        //        Scanner scan = new Scanner(System.in);
        //        System.out.print("Enter the day of the week: ");
        //
        //        String day = scan.nextLine();
        //
        //        switch (day){
        //            case "Monday",  "Tuesday", "Wednesday", "Thursday", "Friday" ->
        //                    System.out.println("It is a weekday 😢");
        //            case "Saturday", "Sunday" ->
        //                    System.out.println("It is the weekday 😄");
        //            default -> System.out.println(day + " is not a day");
        //        }

        //        Scanner scanner = new Scanner(System.in);
        //        int first;
        //        int second;
        //        String operator;
        //        int result;
        //        System.out.print("Enter the first number: ");
        //        first = scanner.nextInt();
        //        System.out.print("Enter an operator (+, -, /, *): ");
        //        operator = scanner.next();
        //        System.out.print("Enter the second number: ");
        //        second = scanner.nextInt();
        //
        //        switch (operator){
        //            case "+" -> System.out.println("Hisoblangan malumot: " + (first + second));
        //            case "-" -> System.out.println("Hisoblangan malumot: " + (first - second));
        //            case "*" -> System.out.println("Hisoblangan malumot: " + (first * second));
        //            case "/" -> System.out.println("Hisoblangan malumot: " + (first / second));
        //        }

        //        Random random = new Random();
        //        Scanner scanner = new Scanner(System.in);
        //
        //        int guess;
        //        int attempts = 0;
        //        int min = 1;
        //        int max = 100;
        //        int randomNumber = random.nextInt(min, max + 1);
        //
        //        System.out.println("Number guess game");
        //        System.out.printf("Guess a number between %d-%d\n", min, max);
        //
        //        do {
        //            System.out.print("Enter a guess: ");
        //            guess = scanner.nextInt();
        //            attempts++;
        //
        //            if (guess < randomNumber){
        //                System.out.println("TOO LOW! Try again");
        //            }
        //            else if (guess > randomNumber){
        //                System.out.println("TOO HIGH! Try again");
        //            }
        //            else {
        //                System.out.println("CORRECT! the number was " + randomNumber);
        //                System.out.println("# of attempts: " + attempts);
        //            }
        //        }while (guess != randomNumber);
        //
        //        scanner.close();

        //        Scanner scanner = new Scanner(System.in);
        //
        //        int rows;
        //        int columns;
        //        char symbol;
        //
        //        System.out.print("Enter the # of rows: ");
        //        rows = scanner.nextInt();
        //
        //        System.out.print("Enter the # of columns: ");
        //        columns = scanner.nextInt();
        //
        //        System.out.print("Enter the symbol to use: ");
        //        symbol = scanner.next().charAt(0);
        //
        //        for (int i = 0; i < rows; i++) {
        //            for (int j = 0; j < columns; j++) {
        //                System.out.print(symbol);
        //            }
        //            System.out.println();
        //        }

        //        String name = "Muhammadsodiq";
        //        int age = 17;
        //
        //        happyBirthday(name, age);
        //
        //        System.out.println(cube(3));

        //        String fullName = "Muhammadsodiq Ubaydullayev";
        //        System.out.println(fullName);

        //        int age;
        //        Scanner scanner = new Scanner(System.in);
        //        System.out.print("Enter your age: ");
        //        age = scanner.nextInt();
        //        if (ageCheck(age)){
        //            System.out.println("You may sign up!");
        //        }
        //        else {
        //            System.out.println("You are not allowed to do that!");
        //        }

    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }
}