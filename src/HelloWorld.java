import java.util.Arrays;

public class HelloWorld
{
    public static void main(String[] args)
    {
       String myString = "Hello";

       byte[] byteArr = myString.getBytes();

       for (int i: byteArr) {
           System.out.println("String to byte array: " + i);//+ Arrays.toString(byteArr));
       }
    }
}
