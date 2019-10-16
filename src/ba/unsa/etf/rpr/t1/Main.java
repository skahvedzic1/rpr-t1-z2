package ba.unsa.etf.rpr.t1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);
        int n=ulaz.nextInt();

         //unos broja
        for(int i=1; i<=n; i++) {
            if(i%sumaCifara(i)==0) {
                System.out.println(i);
            }
        }
    }

    public static int sumaCifara(int n) {
        int suma_cifara=0,cifra=0;

        while(n!=0) {
            suma_cifara+=n%10;
            n/=10;

        }

        return suma_cifara;

    }
}
