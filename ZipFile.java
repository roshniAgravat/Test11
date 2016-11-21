import java.util.zip.*;
import java.io.*;
import java.util.*;
class ZipFile
{
	public static void main(String [] args)
	{
		try
		{
			String zipfile="D:/vish/roshni.zip";
			String srcdir="D:/roshni";
			
			byte[] buffer=new byte[256];
			
			FileOutputStream fos=new FileOutputStream(zipfile);
			ZipOutputStream zout = new ZipOutputStream(fos);
			
			File dir=new File(srcdir);
			
			if(!dir.isDirectory())
			{
				System.out.println(srcdir+ " This Directiory is not here");
			}
			else
			{
				File[] files=dir.listFiles();
				for(int i=0;i<files.length;i++)
				{
					System.out.println("Add \n"+files[i].getName());
					FileInputStream fis = new FileInputStream(files[i]);
					
					zout.putNextEntry(new ZipEntry(files[i].getName()));				
					int length;
					while((length=fis.read(buffer))>0)
					{
						zout.write(buffer,0,length);
					}
					zout.closeEntry();
					fis.close();
				}
			}
			zout.close();
			System.out.println(" \n \t Zip File is created");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}