// public class Diamond {
//     public static void main(String args[]) {
//         int i, j;
//         int n = 4; 
//         for (i=1;i<=n;i++) {
//             for (j=1;j<=n-i;j++) {
//                 System.out.print("  "); 
//             }
//             for (j=1;j<=2*i-1;j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (i = n - 1; i >= 1; i--) {
//             for (j = 1; j <= n - i; j++) {
//                 System.out.print("  "); 
//             }
//             for (j=1;j<=2*i-1;j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


//USING WHILE LOOP 

// public class Diamond {
//     public static void main(String args[]) {
//         int i = 1, j;
//         int n = 4;

//         while (i <= n) {
//             j = 1;
//             while (j <= n - i) {
//                 System.out.print("  ");
//                 j++;
//             }
//             j = 1;
//             while (j <= 2 * i - 1) {
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//         i = n - 1;
//         while (i >= 1) {
//             j = 1;
//             while (j <= n - i) {
//                 System.out.print("  ");
//                 j++;
//             }
//             j = 1;
//             while (j <= 2 * i - 1) {
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             i--;
//         }
//     }
// }


public class Diamond {
    public static void main(String[] args) {
        int i,j;
        int n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            for(j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
}