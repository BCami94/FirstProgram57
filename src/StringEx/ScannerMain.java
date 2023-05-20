package StringEx;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int str = scanner.nextInt();
        System.out.println("Numarul introdus a fost " + str);
    }
}
