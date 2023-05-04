import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        int i;
        int c=0;
        int a;
       Scanner sc=new Scanner(System .in);
       a=sc.nextInt();
        for(i=1;i<=a;i++)
            if (a % i == 0) {
                c++;
            }
        if (c==2)
        {
            System .out.println("prime number");
        }
        else
        {
           System .out.println("not prime");
        }

    }
}
