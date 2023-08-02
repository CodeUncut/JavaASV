public class patternButterFly {

    // no. of lines =n
    public static void butterFly(int n){
        // 1st half
        for(int i =1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("1");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j =1;j<=i;j++){
                System.out.print("1");
            }
            System.out.println();
        }
        // 2nd half

        for(int i=n;i>=1;i--){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("1");
            }
            //space
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i;j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        butterFly(4);
    }
}
