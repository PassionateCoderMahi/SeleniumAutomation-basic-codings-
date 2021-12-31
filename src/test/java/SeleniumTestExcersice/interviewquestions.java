package SeleniumTestExcersice;

public class interviewquestions {

	public static void main(String[] args) {
		//print not repeated character;
		//String[] s= {"abcab"};
	//String a= findrepeatedChar(s);
		System.out.println("the letter is: "+findrepeatedChar("abcab"));
		
	}
		
	public static char findrepeatedChar(String s)
		{
		for( int i=0;i<s.length();i++)
		{
		
		if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
		{
		
			return s.charAt(i);
			
			
		}
		
		}

		return'-';
		}
}
