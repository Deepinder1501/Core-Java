public class Power {
    public static int  power(int x,int y){
        if(y==0){
            return 1;
        }
        return x*power(x,y-1);
    }
    public static void main(String[] args) {
        int res=power(2,3);
        System.out.print(res);
    }
}
