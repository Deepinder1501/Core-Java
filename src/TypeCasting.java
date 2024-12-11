import java.util.*;
public class TypeCasting {
    //assigning a value of one type to a variabke of another type is called type casting 
    public static void main(String[] args){
        // int a=10;
        // double b=a;
        // System.out.println(a);
        // System.out.println(b);

        // int c=5;
        // int d=3;
        // System.out.println(c&d);
        // System.out.println(c|d);
        // System.out.println(c<<2);
        // System.out.println(c>>2);  
        
        // Scanner sc= new Scanner(System.in);
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        // int z=x+y;

        // System.out.println(z);

        // int str=sc.next();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Group: ");
        String group = scanner.nextLine();

        System.out.println("Enter Age: ");
        int age = scanner.nextInt();

        System.out.println("Enter Roll Number: ");
        long rollNumber = scanner.nextInt();

        scanner.nextLine();

        // System.out.println("Enter College Name: ");
        // String collegeName = scanner.nextLine();

        System.out.println("Enter Marital Status (Single/Married): ");
        boolean maritalStatus = scanner.nextBoolean();

        System.out.println("Enter Fees: ");
        long Fees = scanner.nextInt();

        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Group: " + group);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        // System.out.println("College Name: " + collegeName);
        System.out.println("Marital Status: " + maritalStatus);
        System.out.println("Fees: " + Fees);
        

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter the first number: ");
        // int num1 = scanner.nextInt();

        // System.out.println("Enter the second number: ");
        // int num2 = scanner.nextInt();

        // int addition = num1 + num2;
        // int subtraction = num1 - num2;
        // int multiplication = num1 * num2;
        // double division = (num2 != 0) ? (double) num1 / num2 : Double.NaN; 

        // boolean andOperation = (num1 != 0) && (num2 != 0);
        // boolean orOperation = (num1 != 0) || (num2 != 0);

        // System.out.println("\n--- Results ---");
        // System.out.println("Addition: " + addition);
        // System.out.println("Subtraction: " + subtraction);
        // System.out.println("Multiplication: " + multiplication);
        // System.out.println("Division: " + (num2 != 0 ? division : "Undefined (division by zero)"));
        // System.out.println("Logical AND (non-zero check): " + andOperation);
        // System.out.println("Logical OR (non-zero check): " + orOperation);

        scanner.close();

//write prog for add , subt , mult ,division ,and , or operations on two numbers input by user and print all these values using java 
    }
}//write a program student name , class , age , roll number ,college name , marital status print these using java 
//while we are doing right shift the number given will be half of the original number whereas in left shift number becomes double of the original number    

//using random or scanner class create a rock paper scissor game in java 