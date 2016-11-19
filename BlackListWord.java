import java.io.*;
import java.util.*;
class BlackListWord
{
	static Set blackList=new HashSet();
	static
	{
		blackList.add("idiot");
		blackList.add("badword2");
		blackList.add("badword3");
		blackList.add("badword4");
	}
	public static void main(String []args)
	{
		String statement="john is idiot";
		if(hasBlackListWord(statement))
		{
			System.out.println("It word is used in blackList");
		}
		else
		{
			System.out.println(statement);
		}
		
	}

	public static boolean  hasBlackListWord(String str)
	{
		String [] words=str.split(" ");
		for(String word:words)
		{
		if(blackList.contains(word))
		{
			return true;
		}
		}
		return false;
	}
}