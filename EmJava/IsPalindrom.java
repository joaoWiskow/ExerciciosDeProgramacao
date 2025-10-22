package EmJava;
import java.util.Scanner;
public class IsPalindrom{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
System.out.println(
    "Digite a palavra para o teste: ");
String WordCommun=in.nextLine();
String w=WordCommun.toLowerCase();
if(isPalindrom(w)){
    System.out.println("Sim");
}
else{
    System.out.println("Não");
}
}
public static boolean isPalindrom(String w){
    String s=new StringBuilder(w).reverse().toString();
    if(w.equals(s)){
      return true;
    }
    return false;
}
}
