import java.io.*;

class mergeDemo{
	public static void main(String[] args){
		try
		{
			FileWriter obj1=new FileWriter("a.txt");
			obj1.write("11\n22\n33\n");
			obj1.close();
			
			FileWriter obj2=new FileWriter("b.txt");
			obj2.write("aa\nbb\ncc\n");
			obj2.close();
			
			try{
				FileWriter obj3= new FileWriter("c.txt");
				FileReader f1= new FileReader("a.txt");
				
				int i;
					while((i=f1.read()) != -1)
					obj3.write((char)i);
					f1.close();
				FileReader f2=new FileReader("b.txt");
				int j;
					while((j=f2.read()) != -1)
					obj3.write((char)j);
					f2.close();
				obj3.close();
			}
			catch(Exception e){
			System.out.println(e);
			}
			
			System.out.println("Merged");
		}catch(Exception e){
			System.out.println(e);
		}
			System.out.println("\nSuccessful");
	}
}