//hanhatquang20205116
//bai 6.3 Write a program to display a triangle with a height of n stars (*), n is entered by users
import java.util.Scanner;

public class text7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        Character c = '*';

        System.out.println("Enter height of the triangle : ");
        size = sc.nextInt();
        

        int i, j, k;

        for (i = 0; i < size + 1; i++) {
            for (j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (2 * i - 1); k++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
