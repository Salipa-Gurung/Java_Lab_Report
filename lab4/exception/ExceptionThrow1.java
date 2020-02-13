import java.io.*;

class ExceptionThrow1{
	void m()throws IOException
	{
		throw new IOException("Device Error");
	}

	void n()throws IOException
	{
		m();
	}

	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) 
		{
			ExceptionThrow1 obj = new ExceptionThrow1();
			obj.p();
			System.out.println("Normal flow");
		}
	}
