public class reversetriangle{
    public static void main(String[] v){
        int i,k,j,n=6;
        //outer loop
        for(i=0;i<=n;i++){
            //inner loop
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(k=n-i;k>=0;k--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}