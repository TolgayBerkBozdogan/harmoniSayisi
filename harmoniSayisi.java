import java.util.Scanner;
public class harmoniSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("N sayısını giriniz : ");
        n = input.nextInt();
        double result=0;
        for(double i =1; i<=n; i++){
            result += (1/i);
        }
        System.out.print("Harmonik sonuç : " + result);

    }
}
