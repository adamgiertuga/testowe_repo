import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Helo World!");
        System.out.println("Podaj liczbę, którą należy spierwiastkować: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Math.sqrt(number));

    }
}
