//calculate sum, difference, product, and quotient of 2 double numbers
//hanhatquang20205116
// bai 2.2.5

import java.util.Scanner;
public class text4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 double numbers: \n");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        input.close();
        System.out.println("The sum of numbers is: \n"+(num1+num2));
        System.out.println("The dif of numbers is: \n"+(num1-num2));
        System.out.println("The pro of numbers is: \n"+(num1*num2));
        System.out.println("The quo of numbers is: \n"+(num1/num2));


    }
}
