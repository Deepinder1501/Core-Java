import java.util.Scanner;

public class NPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Prime nums upto " + n);

        for (int num=2;num<=n;num++) { 
            boolean flag = true;

            for (int i=2;i<num;i++) { 
                
                if (num % i ==0) { 
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num); 
            }
        }
        sc.close(); 
    }
}
