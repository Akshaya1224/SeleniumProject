package javaseleniumTask;

public class RepeatedConsChar {
	public static void main(String[] a ) 
	{
		String name="sureeeeshhhh";
		String finalstring="";
		int count=1;
		for(int i=0;i<name.length();i++)
		{
			
				if(i+1<name.length()&& name.charAt(i)==name.charAt(i+1))
				{
					count++;
					
				}
				else
				{
					finalstring+=name.charAt(i)+":"+count;
					count=1;
				}
			
		}
		System.out.println(" " + finalstring + " ");
	}
}
