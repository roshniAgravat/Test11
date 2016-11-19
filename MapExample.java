
import java.util.*;
public class MapExample
{
	public static void main(String [] args)
	{
		Map<String,String> m=new HashMap<String,String>();
		m.put("FirstName","Roshni");
		m.put("LastName","Agravat");
		m.put("id","1");
		
		//m.get("FirstName");
		//System.out.println(m);
		//System.out.println(m.get("FirstName")+ " " +m.get("LastName"));
		print(m);
	}
	 public static void print(Map map)
	 {
		/*System.out.println(map.get("FirstName"));
		System.out.println(map.get("LastName"));
		System.out.println(map.get("id"));*/
		
		Set<Map.Entry> entrySet=map.entrySet();
		for(Map.Entry e:entrySet)
		{
			System.out.println(e.getKey()+"==="+e.getValue());
		}
	 }
}