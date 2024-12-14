public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        int sp=2*n-1;
        int st=0;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
            sp=sp-2;
            st++;
            }
            else {
                sp=sp+2;
                st--;
            }

            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                if(j!=n){
                    System.out.print("*");
                }
            }
            System.out.println();
        }


            // for(int i=1;i<=n;i++){
            //     for(int st=1;st<=n;st++){

            //     }
            // }

    }
}
