package application;
import java.io.*;
import java.util.Scanner;

public class SearchFile implements FilenameFilter {
	
	public static String path;
	public static String initials;
	
	// constructor to initialize object
	public SearchFile(String initials)
	{
		this.initials = initials;
		path=initials;
	}
	
	// overriding the accept method of FilenameFilter
	// interface
	public boolean accept(File dir, String name)
	{
		return name.startsWith(initials);
	}
	
	
	
	public static void search(int  p) {
		
		File directory = new File(path);
		if(p==1)
    	{
			 String[] flist = directory.list();
			 if(flist==null)
			 {
				 System.out.println("Folder is empty!");
				 return;
			 }
    		 for (int i = 0; i < flist.length; i++) {
                 String filename = flist[i];
                 System.out.println(filename);
    		 }
    		return;
    	}
        
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter full file name");
		String fileName=in.nextLine();
		fileName = fileName.toLowerCase();
        String[] flist = directory.list();
        int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
  
        	
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                System.out.println(filename);
                if (filename.equalsIgnoreCase(fileName)) {
                    System.out.println(filename + " found");
                    flag = 1;
                }
            }
        		 
        
        	}
  
        if (flag == 0) {
            System.out.println("File Not Found");
        }
		
	}
}

