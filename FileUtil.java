
import java.io.*;
public class FileUtil
{
	public static void main(String [] args)
	{
		try
		{
		InputStream is=null;
		OutputStream os=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
			try
			{
			 is=new FileInputStream("D:\\ISO\\ubuntu-11.04-server-i386.iso");
			 os=new FileOutputStream("D:\\buffered.ISO");
			  bis=new BufferedInputStream(is);
			  bos=new BufferedOutputStream(os);
			  
			  long start=new java.util.Date().getTime();
			  System.out.println("copy started");
			 copy(is,os);
			 bos.flush();
			 long end=new java.util.Date().getTime();
			  System.out.println((end-start)/1000);
			}
			finally
			{
				bis.close();
				bos.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void copy(InputStream is,OutputStream os)
	{
		try
		{
			try
			{
				byte barr[]=new byte[256];
				while(is.read(barr)!= -1)
				{
					os.write(barr);
				}
			}
			catch(Exception e)
			{}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}