import java.util.Scanner;

// bai 2.2.6
// phuong trinh bac nhat
public class text5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 double numbers: \n");
        double a = input.nextDouble();
        double b = input.nextDouble();
        if(a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem\n");
            } else {
                System.out.println("Phuong trinh vo nghiem\n");
            }
        }
        else {
            System.out.println("Nghiem phuong trinh \n"+(-b/a));
        }

    }

}
