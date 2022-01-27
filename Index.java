package application;

import java.util.Scanner;

public class Index {
	
	// first need to set file directry for storinh files
	
	public static String path ="C:/Users/anurag singh/eclipse-workspace/application/src/data/";

	
	public static void display() 
	
	{
		
		System.out.println("       Welcome     ");		
		System.out.println("developed by : Anurag \nemail : anurag.singh@keysight.com \n");
		System.out.println("Insert/search/delete your file press : 1");
		System.out.println();
		System.out.println("all files press : 2");
		System.out.println("exit Press : 0");
		System.out.println();
	}
	
	public static void userDisplay() {
		System.out.println("Insert Press : 1 ");
 		System.out.println("search Press : 2 ");
		System.out.println("delete Press : 3 ");
		System.out.println("main menu press : 4");
	}


	public static void main(String[] args) {


		boolean check=true;
		while(check)
		{
		display();
		
		
		
		Scanner in = new Scanner(System.in);
		int input= in.nextInt();
		if(input==0)
		{
			System.out.println("Thank you!");
			System.exit(0);
		}else if(input==2) {
			SearchFile sf= new SearchFile(path);
			sf.search(1);
		}
		
		else {
			if(input==1) {
			
               int ch=1;
				while(ch==1) {
					
				userDisplay();
				
				int i=in.nextInt();
				if(i==1) {
					AddFile af= new AddFile(path);
					af.newFile();
				//	newFile
					
					
				}else if(i==2) {
					
					SearchFile sf= new SearchFile(path);
					sf.search(0);
					continue;
					
					
				}else if(i==3) {
					System.out.print("Enter file name : ");
					
					String temp=in.next();
					temp=temp.toLowerCase();
					String s=path+temp;
					
					DeleteFile df= new DeleteFile(s);
					df.delete();
					
					
				}else if(i==4) {
					ch=0;
					break;
					
				}else {
					System.out.println("Wrong input \n please inter valid input again ");
					continue;
					
				}
				
				System.out.println("Do you want to continue press 1 ");
				int c= in.nextInt();
				if(c==1) {
					ch=1;
					
				}
				else {
					ch=0;
					break;
				}
				
				
			    }
			
				
			}
			else
			{
				continue;
			}
			
		}
		
		
		
		
			
		
		}
		

	}

}
