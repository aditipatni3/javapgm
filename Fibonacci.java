import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int count=2;
        int a=0;
        int b=1;
        if(n==1){
            System.out.println(a);
        }
        else if(n==2){
            System.out.println(b);
        }

        
        else{
            
        while(count<n){
            int temp;
            temp=b;
            b=b+a;
            a=temp;
            count++;

        }
        System.out.println(b);
        }
    }
}
