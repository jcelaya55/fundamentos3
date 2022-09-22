package fundamentos_3;
import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Ponga un numero al cual quiere llegar ");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            int fibon = metodofibo(i);
            System.out.print(" " + fibon);
        }
    }

    public static int metodofibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return metodofibo(n - 1) + metodofibo(n - 2);
    }
}