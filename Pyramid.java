public class Pyramid{
    public static void main(String[] c){
        int i,j,k,n=6;
        //outer loop
        for(i=0;i<=n;i++){
            //space loop
            for(j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            //star loop
            for(k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}