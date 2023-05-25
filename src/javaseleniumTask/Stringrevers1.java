//String reverse
//strng does not have reverse()method.we need to convert the string to string buffer  

package javaseleniumTask;

public class Stringrevers1 {
public static void main(String []args) {
	String input="aks";
	StringBuffer sbr=new StringBuffer(input); //conversion from string pbject to string buffer
	sbr.reverse();//reverse the string
	System.out.println("Enter the reversed string:"+ sbr);
}
}
