class final_Demo
{
	static final int num1 = 5;


			final int num2;

				final_Demo(){
					num2 = 4;
				}

		public static void main(String[] args) {
			System.out.println(num1);

			final_Demo obj = new final_Demo();

					System.out.println(obj.num2);
		}
}
