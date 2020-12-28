public class Star1{
    public static void main(String[] c){
        int i,j,n=4;
        //outer loop
        for(i=0;i<n;i++){
            //inner loop
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}