class Animal_Class
{
	public double lifeExpectance;
	private String sound, feature;

		Animal_Class(String s, String f, double l)
		{
			sound = s;
			feature = f;
			lifeExpectance = l;
		}

		public void display()
		{
			System.out.println("This animal has sound " + sound);
			System.out.println("This animal has " + feature);
			System.out.println("lifeExpectance of the animal is " + lifeExpectance);
		}
}