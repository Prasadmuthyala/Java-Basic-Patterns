public class Lefttriangle{
    public static void main(String[] c){
        int i,j,k,n=6;
        //outer loop
        for (i=0;i<n;i++){
            //inner space loop
            for(j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner star loop
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}