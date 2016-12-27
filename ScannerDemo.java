import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class ScannerDemo{
    public static void main(String[] args) {
        int width, length, area;
        Scanner scan = new Scanner(System.in);
        System.out.println("please input width");
        width = scan.nextInt();
        System.out.println("please input length");
        length = scan.nextInt();
        area = getArea(width, length);
        System.out.println(area);
    }
    @Contract(pure = true)
    private static int getArea(int x, int y){
        return x * y;
    }
}