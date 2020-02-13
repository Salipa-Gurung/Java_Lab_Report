class exception1
{
	boolean div(){
		int a = 10;
		try{
			System.out.println(a/0);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			return true;
		}catch(Exception e1)
		{
			System.out.println(e1);
			return true;
			}
			finally
			{
				System.out.println("Finally block is printed in to the console after returning.");
			}

		return false;
	}
	public static void main(String[] args) {
		exception1 obj = new exception1();
		System.out.println(obj.div());
	}
}