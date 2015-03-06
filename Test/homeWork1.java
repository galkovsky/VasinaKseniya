import java.util.*;

public class homeWork1 {
    public static void main(String[] args) {

        Scanner arr = new Scanner(System.in);

        System.out.print("Вводим число а");
        String a = arr.nextLine();

        System.out.print("Вводим число b");
        String b = arr.nextLine();

        System.out.println("Вводим знак одной из перечисленных операций: + - * /");
        String operation = arr.nextLine();

        double d; //это наш ответ

        if(operation.equals("+")) {
            d = Double.parseDouble(a) + Double.parseDouble(b);
            System.out.print(d);
        }
        else if (operation.equals("-")){
            d = Double.parseDouble(a) - Double.parseDouble(b);
            System.out.print(d);
        }
        else if(operation.equals("*")) {
            d = Double.parseDouble(a) * Double.parseDouble(b);
            System.out.print(d);
        }
        else if(operation.equals("/")) {
            d = Double.parseDouble(a) / Double.parseDouble(b);
            System.out.print(d);
        }

    }
}

