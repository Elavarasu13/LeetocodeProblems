package Leetcode_Problems;

public class MergeString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Object ob  = new Object();
		String word1 = "abc";
		String word2 = "pqr";
		
	System.out.println(mergeAlternately(word1,word2));

	}
	
	public static String mergeAlternately(String word1, String word2) 
	{
		String result = "";
		int  i =0;
		int j = 0;
		while(i <word1.length() && j <word2.length())
		{
			result += word1.charAt(i++);
			result += word2.charAt(j++);
		}
		while(i<word1.length())
			result+=word1.charAt(i++);
		while(j<word2.length())
			result+=word2.charAt(j++);
		
		return result;
	}
	
}
