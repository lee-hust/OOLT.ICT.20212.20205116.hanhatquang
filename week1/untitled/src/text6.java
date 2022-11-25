// bai 2.2.6
// phuong trinh bac hai
import java.util.Scanner;
import java.lang.Math;
public class text6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 double numbers: \n");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(a == 0) {
            if (b == 0) {
                if(c == 0){
                    System.out.println("Phuong trinh vo so nghiem\n");
                }
                else{
                    System.out.println("phuong trinh vo nghiem\n");
                }
            }
            else{
                System.out.println("Phuong trinh co nghiem: \n"+(-c/b));
            }

        }
        else {
            double d = b*b - 4*a*c;
            if(d < 0){
                System.out.println("Phuong trinh vo nghiem \n");
            }
            else{
                System.out.println("Nghiem 1: \n"+((-b+Math.sqrt(d))/(2*a)));
                System.out.println("Nghiem 1: \n"+((-b-Math.sqrt(d))/(2*a)));
            }
        }

    }
}
