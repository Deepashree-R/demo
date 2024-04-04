package Programs_50;

public class Number_of_upper_lowercase_in_string_011 {
public static void main(String[] args) {
	String s1="I am a traVeLLer";
	char arr[]=s1.toCharArray();
	int uppercase=0;
	int lowercase=0;
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>=65 && arr[i]<=90) {
			uppercase++;
		}
		else if(arr[i]>=97 && arr[i]<=122){
			lowercase++;
		}
	}
	System.out.println("uppercase count is "+uppercase);
	System.out.println("lowercase count is "+lowercase);
	
}
}
