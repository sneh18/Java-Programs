
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

class ZipFileExtractor
{
	public static void main(String[] args)
	{
		String filePath = "D:\\zipFile.zip";
		String destinationDirectory = "D:\\zipFiles";
		
		
		try 
		{
            extractZipFile(filePath, destinationDirectory);
        } 
		catch(Exception ex) 
		{
            ex.printStackTrace();
        }
	}

	public static void extractZipFile(String zipFilePath, String destinationDirectory) throws IOException
	{
		File destDir = new File(destinationDirectory);
        if (destDir.exists() == false) 
		{
            destDir.mkdir();
        }
        
		ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath));
        ZipEntry entry = zis.getNextEntry();
        
        while (entry != null) 
		{    
			System.out.println("File extracted at Path : " + destinationDirectory + " :: " + entry.getName());
			
			String filePath = destinationDirectory + File.separator + entry.getName();
			
            if (entry.isDirectory() == false) 
			{
               
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
				
				byte[] bytesIn = new byte[2048];
				
				int read = 0;
				
				while ((read = zis.read(bytesIn)) != -1) 
				{
					bos.write(bytesIn, 0, read);
				}
				bos.close();
            } 
			else 
			{
                File directory = new File(filePath);
                directory.mkdir();
            }
			
            zis.closeEntry();
            entry = zis.getNextEntry();
        }
        zis.close();
		
	}
}