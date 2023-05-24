+//count the vowels in the given character  

package javaseleniumTask;

public class CharacterVowels {
public static void main(String[]args) {
	String message=" hello all welcome ";
	char c[]=message.toCharArray();
	int sum=0;
	for(char c1:c) {
		if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u')
			sum++;
	}
	System.out.println(" Displaying the given message: " + message);
System.out.println(" There are  " + sum + " vowels here");
}

}
