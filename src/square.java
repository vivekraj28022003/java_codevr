import java.util.Scanner;
public class square {
    public static void main(String[] args){
        int a;
        int i;
        int j;
        Scanner sc=new Scanner(System .in);
        a=sc.nextInt();
        for(i=0;i<=a;i++){
            for(j=0;j<=a;j++){
                System .out.println("*");
            }
            System .out.println("\n");
        }
    }
}
