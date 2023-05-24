//given character is vowels or not 

package javaseleniumTask;

public class VowelsOrNot {
public static void main(String[]args) {
	char ch='e'; //ch is a variable,e is a value,''single quotes for characters,""for string 
	//checking ch is vowel r not 
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') { //==operator compares the datatypes/object
	System.out.println(ch + "  is vowel  ");
	}
	else 
	System.out.println(ch + " is not a vowel");
		
}
}
