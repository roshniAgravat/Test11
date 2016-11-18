import java.io.*;
import java.util.*;
class TestPerformance
{
	public static void main(String [] args)
	{
		ArrayList<String> arlst=new ArrayList<String>();
		LinkedList<String> lilst=new LinkedList<String>();
		print(arlst);
		print1(lilst);
	}
	public static void print(ArrayList<String> arlst)
	{
		for(int i=0;i<50;i++)
		{
			arlst.add("String");
			arlst.add("Integer");
			//System.out.println(arlst);

		}
		for(int i=0;i<5;i++)
		{
			arlst.get(i);
			System.out.println(arlst);
		}
	}
	public static void print1(LinkedList<String> lilst)
	{
	for(int i=0;i<50;i++)
		{
			lilst.add("Roshni");
			lilst.add("Agravat");
			//System.out.println(arlst);

		}
		for(int i=0;i<5;i++)
		{
			lilst.get(i);
			System.out.println(lilst);
		}
	}
}