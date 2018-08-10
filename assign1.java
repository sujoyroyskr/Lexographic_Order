import java.util.Scanner;

public class assign1
{

    public static int calcOnes (String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == '1')
                count++;

        return count;
    }

    public static String incrementBinary(String str)
    {
        int i = str.length() - 1, carry = 1;

        char [] temp = str.toCharArray();

        while (i >= 0 && carry == 1)
        {
            if (temp[i] == '1')
            {
                temp[i] = '0';
                i --;
            }
            else
            {
                temp[i] = '1';
                str = String.valueOf(temp);
                return str;
            }
        }
        return "String size out of bounds";
    }

    public static String question1MainFunc (String input)
    {
        int count_one = calcOnes(input);
        System.out.println ("Number of 1 : "+ count_one);
        
        while (true)
        {
            input  = incrementBinary(input);
            if (calcOnes(input) == count_one && !input.equals("String size out of bounds"))
                break;
        }

        return input;
    }

    public static void main (String [] args)
    {
        System.out.print ("\n Enter Binary String : ");
        Scanner keyboardScanner = new Scanner (System.in);

        String input = keyboardScanner.nextLine();
        
        String output = question1MainFunc (input);
        
        System.out.println ("output : "+output);
    }
}
