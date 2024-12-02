import java.io.PrintWriter;
public class write
{
    public static void main(String args[])
    {
        PrintWriter a = new PrintWriter(System.out);
        a.println("HELLO WORLD!");
        a.print("This is a");
        a.print("print statement.");
        a.close();
    }
}