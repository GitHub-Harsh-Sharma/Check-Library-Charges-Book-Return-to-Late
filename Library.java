import java.io.*;
class Library
{
    public static void main(String args[])throws IOException
    {
        int day;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter the day no:");
        day=Integer.parseInt(br.readLine());
        if((day>1)&&(day<5))
        System.out.print("20$ charge");
        else if((day>6)&&(day<10))
        System.out.print("50$ charge");
        else if((day>11)&&(day<30))
        System.out.print("150$ charge");
        else if(day>30)
        System.out.print("Member ship canclled");
    }
}