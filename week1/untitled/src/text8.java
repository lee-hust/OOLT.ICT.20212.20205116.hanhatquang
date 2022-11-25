//hanhatquang20205116
//6.4	Write a program to display the number of days of a month, which is entered by users
import java.util.Scanner;
public class text8
{
    public static void main(String s[])
    {
        int m=0 ,y,days=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a month ");
        String c = input.next();
        if(c.compareTo("January") == 0 || c.compareTo("Jan") == 0 || c.compareTo("Jan.") == 0 || c.compareTo("1") == 0){
            m = 1;
        }
        if(c.compareTo("February") == 0 || c.compareTo("Feb") == 0 || c.compareTo("Feb.") == 0 || c.compareTo("2") == 0){
            m = 2;
        }
        if(c.compareTo("March") == 0 || c.compareTo("Mar") == 0 || c.compareTo("Mar.") == 0 || c.compareTo("3") == 0){
            m = 3;
        }
        if(c.compareTo("April") == 0 || c.compareTo("Apr") == 0 || c.compareTo("Apr.") == 0 || c.compareTo("4") == 0){
            m = 4;
        }
        if(c.compareTo("May") == 0 || c.compareTo("May.") == 0 || c.compareTo("5") == 0){
            m = 5;
        }
        if(c.compareTo("June") == 0 || c.compareTo("Jun") == 0 || c.compareTo("Jun.") == 0 || c.compareTo("6") == 0){
            m = 6;
        }
        if(c.compareTo("July") == 0 || c.compareTo("Jul") == 0 || c.compareTo("Jul.") == 0 || c.compareTo("7") == 0){
            m = 7;
        }
        if(c.compareTo("August") == 0 || c.compareTo("Aug") == 0 || c.compareTo("Aug.") == 0 || c.compareTo("8") == 0){
            m = 8;
        }
        if(c.compareTo("September") == 0 || c.compareTo("Sep") == 0 || c.compareTo("Sep.") == 0 || c.compareTo("9") == 0){
            m = 9;
        }
        if(c.compareTo("October") == 0 || c.compareTo("Oct") == 0 || c.compareTo("Oct.") == 0 || c.compareTo("10") == 0){
            m = 10;
        }
        if(c.compareTo("November") == 0 || c.compareTo("Nov") == 0 || c.compareTo("Nov.") == 0 || c.compareTo("11") == 0){
            m = 11;
        }
        if(c.compareTo("December") == 0 || c.compareTo("Dec") == 0 || c.compareTo("Dec.") == 0 || c.compareTo("12") == 0){
            m = 12;
        }


        System.out.println("enter year");
        y=input.nextInt();
        if( m==1 || m==3 ||m==5 ||m==7||m==8||m==10||m==12)
        {
        days=31;
        }
        else
        if(m==4||m==6||m==9||m==11)
        {
        days=30;
        }
        else
        {
        if(m==2)
        {
        if(y%400==0&&y%100==0)
        {
            days=29;
        }
        else
        {
            if(y%4==0&&y%100!=0)
            {
                days=29;
            }
            else
                days=28;
        }
        }

        }
        System.out.println("Number of days in " + m+" month "+y+ "  year is :"+days);


    }
}

