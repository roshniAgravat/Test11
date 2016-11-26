class Dupwords
{
	public static void main(String [] args)
	{
		System.out.println("Example Remove Duplicate String");
		String s="Hi Hi Hello friends friends";
		System.out.println(s);
		countWords(s);
		
	}
	public static void countWords(String str)
	{
		String [] words= str.split("\\s");
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					if(i != j)
					{
						words[i] = " "; 
					}
				}
			}
		}
		System.out.println("Removing Words from above string");
		for(int i=0;i<words.length;i++)
		{
			if(words[i]!="")
			{
				System.out.println(words[i]+" ");
			}
		}
	}
}