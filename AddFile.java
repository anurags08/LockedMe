package application;

	// Importing new files
	import java.io.File;
	import java.io.BufferedReader;

	// Importing as it converts bits to strings
	import java.io.InputStreamReader;

	public class AddFile  {

		public static String path;
		public AddFile(String path) {
			this.path= path;
		}

		// Function To Make New File
		public static void newFile()
		{
			String  strName = "";

			// Try-catch Block
			try {

				// Creating BufferedReadered object
				BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
				System.out.println("Enter the file name:");

				// Reading File name
				strName = br.readLine();
			//	System.out.println("Enter the file path:");

				// Reading File Path
			//	strPath = br.readLine();

				// Creating File Object
				strName = strName.toLowerCase();
				File file1
					= new File(path + "" + strName);

				// Method createNewFile() method creates blank
				// file.
				file1.createNewFile();
				System.out.println("file added sucessfully!");
			}

			// Try-Catch Block
			catch (Exception ex1) {
				System.out.println("file not added due to : ");
			}
		}
//		public static void main(String[] args) {
//			
//			AddFile af= new AddFile("C:\\Users\\anurag singh\\eclipse-workspace\\application\\src\\data\\");
//			af.newFile();
//		}
		
	}

