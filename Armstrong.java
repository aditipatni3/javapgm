import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        isArmstrong(n);
        
        // for(int i=0;i<1000;i++){
        //     System.out.println(isArmstrong(i));
        // }
    }
    static Boolean isArmstrong(int n){
        int sum=0;
        int original=n;
        while(n>0){
        int rem=n%10;
        n=n/10;
        sum=sum+rem*rem*rem;
        }
        
        return (sum==original);
    }
}
