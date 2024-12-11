import java.util.Random;

public class RandomOperators {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(100); 
        int num2 = random.nextInt(100); 

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        int operator = random.nextInt(10); 
        switch (operator) {
            case 0:
                System.out.println("Add: " + (num1 + num2));
                break;  
            case 1:
                System.out.println("Subtract: " + (num1 - num2));
                break;
            case 2:
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 3:
                System.out.println("Division: " + (num2 != 0 ? (double) num1 / num2 : "Undefined"));
                break;
            case 4:
                System.out.println("Modulus: " + (num2 != 0 ? num1 % num2 : "Undefined"));
                break;
            case 5:
                System.out.println("Is Num 1 equal to Num 2? " + (num1 == num2));
                break;
            case 6:
                System.out.println("Is Num 1 not equal to Num 2? " + (num1 != num2));
                break;
            case 7:
                System.out.println("Is Num 1 greater than Num 2? " + (num1 > num2));
                break;
            case 8:
                System.out.println("Is Num 1 less than Num 2? " + (num1 < num2));
                break;
            case 9:
                System.out.println("Is Num 1 greater than or equal to Num 2? " + (num1 >= num2));
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
