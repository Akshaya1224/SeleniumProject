//cgpt prm
//Repeated consecutive character 

package javaseleniumTask;

	public class Repeatedconsechar {
	public static void main(String[] args) {
	String str="heellloooo";
	char[] chars=str.toCharArray(); //convert the input the str into character array
	int count=1;
	for(int i=0;i<chars.length-1;i++) {
		if(chars[i]==chars[i+1]) {
			count++;
		}else {
			if(count>1) {
			System.out.println("Repeated consecutive character : " + chars[i] +",count: " + count );
		}
			count=1;
	}
	}
	if(count > 1) {
		System.out.println("Repeated consecutive character : " + chars[chars.length-1] + ",count :" + count);
	}
	}
	}