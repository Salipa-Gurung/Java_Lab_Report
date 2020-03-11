import java.io.*;

class file_function
{
	public static void main(String[] args){
	try
	{
		FileWriter f1=new FileWriter("a.txt");
			f1.write("11\n22\n33\n");
			f1.close();

		FileWriter f2=new FileWriter("b.txt");
		BufferedWriter bw=new BufferedWriter(f2);
			bw.write("AA\nBB\n");
			bw.newLine();
			bw.write("CC");
			bw.close();
			
		FileReader fr=new FileReader("a.txt");
			int i;
			while((i=fr.read()) != -1)
				System.out.println((char)i);
				fr.close();
				System.out.println();

		FileReader fr1=new FileReader("b.txt");
		BufferedReader bw1=new BufferedReader(fr1);
			int j;
			while((j=bw1.read()) != -1)
				System.out.println((char)j);
				bw1.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		System.out.println("\nSuccessful");
}
}