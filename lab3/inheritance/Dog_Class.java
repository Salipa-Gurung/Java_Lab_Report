class Dog_Class extends Animal_Class
{
	Dog_Class()
	{
		//super must be declared at first 
		super("Bark", "great_nose", 21.5);
	}
}

class Cat_Class extends Animal_Class
{
	Cat_Class()
	{
		super("Meow", "Whisker", 20.5);
	}
}