public class Downwardstriangle{
    public static void main(String[] c){
        int i,j,k,n=6;
        for(i=0;i<=n;i++){
 
            for(k=n-i;k>=0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}