package sample;
import java.Locale;
import java.ResourceBundle;


public class Locale {
public static void main(String args[])
{
Locale locale=new Locale(args[0]);
ResourceBundle rb=ResourceBundle.getBundle("Labels",locale);
System.out.println(rb.getString("hello"));
}
}
