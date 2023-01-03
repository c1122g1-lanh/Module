import java.util.Scanner;

public class changeMoneys {
    public static void main(String[] args) {
        float Usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap USD : ");
        Usd = scanner.nextFloat();
        float Vnd = Usd * 23000;
        System.out.println(Usd + " Usd = " + Vnd + " VND ");
    }
}

