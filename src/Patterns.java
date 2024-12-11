// // public class Patterns {
// //     public static void main(String[] args) {


// //         for(int i=1;i<=5;i++){
// //             for(int j=1;j<=i;j++){
// //                 System.out.print("* ");
// //             }
// //             System.out.println();
// //         }
        
// //     }
    
// // }


// // right pascal triangle

// import java.util.*;
// public class Patterns {

//     // public static void printPattern(int n)
//     // {
//     //     int i, j;
//     //     int num = 1;
//     //     for (i = 1; i <= n; i++) {
//     //         for (j = 1; j <= i; j++) {
//     //             System.out.print("* ");
//     //         }

//     //         System.out.println();
//     //     }

//     //     // outer loop to handle lower part
//     //     for (i = n-1; i >= 1; i--) {
//     //         // inner loop to print stars
//     //         for (j = 1; j <= i; j++) {
//     //             System.out.print("* ");
//     //         }

//     //         System.out.println();
//     //     }
//     // }

//     public static void main(String args[])
//     {
//         int i, j;
//         int n=4;
//         for (i=1;i<=n;i++) {
//             for (j=1;j<=i;j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (i=n-1;i>=1;i--) {
//             for (j=1;j<=i;j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }



// }

// public class Patterns {
//     public static void main(String args[]) {
//         int i, j;
//         int n = 4;
//         for (i=1;i<=n;i++) {
//             for (j=1;j<=n-i;j++) {
//                 System.out.print("  ");
//             }
//             for (j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         for (i=n-1;i>=1;i--) {
//             for (j=1;j<=n-i;j++) {
//                 System.out.print("  "); 
//             }
//             for (j=1;j<=i;j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



public class Patterns {
    public static void main(String args[]) {
        int i, j;
        int n = 4;
        for (i=1;i<=n;i++) {
            for (j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


