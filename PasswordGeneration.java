import java.util.*;
class PasswordGeneration
{
    public static void main(String ar[])
    {
        int length = 10;
        System.out.println("New Password:");
        System.out.println(passwordGeneration(length));

    }

    static char[] passwordGeneration(int length)
    {
        String capital_Alphabets = "ABCDEFGHIJKLMNOPQRSTWXYZ";
        String small_Alphabets = "abcdefghijklmnopqrstwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = capital_Alphabets + small_Alphabets + numbers + symbols;

        Random random_obj = new Random();

        char password[] = new char[length];

        for(int i=0; i<length; i++)
        {
            password[i] = values.charAt(random_obj.nextInt(values.length()));
        }

        return password;
    }
    
}