public class _HashPattern {
    public static void main(String[] args) {
        int n=3;
        int f=1;
        for(int i=1;i<=2*n;i++){
        for(int j=1;j<=n;j++){
            if(f==1){System.out.print("..");}
            else{System.out.print("##");}
            f=f*-1;
            // System.out.println();
        }f=f*-1;
        if(i%2==0){
            f*=-1;
        }
            System.out.println();
        }
    }
}
