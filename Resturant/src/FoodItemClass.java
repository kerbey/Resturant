public class FoodItemClass
{
	String name, stringSize, food;double price, purchase;
	int size;
	public void Name(String Name)
	{
		 name=Name;
		// System.out.println("namemethod= "+name);
	}
	public void Price(double Price)
	{
		price=Price;
		System.out.println("initial price= "+price);
		DriverClass.line=("initial price= "+price);
		DriverClass.textStream.println(DriverClass.count+" "+DriverClass.line);
		DriverClass.count++;
	}
	//price, quantity, name,descrip,size
	//size quantity 
	public void Quantity(double purchase, String name)
	{
		Name(name);
		//LinkedList list= new LinkedList();
		System.out.println("quantity= "+purchase+" "+name+"(s)");
		DriverClass.line=("quantity= "+purchase+" "+name+"(s)");
		DriverClass.textStream.println(DriverClass.count+" "+DriverClass.line);
		DriverClass.count++;
		//Name(name);
	}
	public void Description(String string)
	{
		System.out.println("the description => a "+stringSize+" sized "+string+" for "+price);
		DriverClass.line=("the description => a "+stringSize+" sized "+string+" for "+price);
		DriverClass.textStream.println(DriverClass.count+ " "+DriverClass.line);
		DriverClass.count++;
		//Size(size);
		//System.out.println("you purchsed  "+purchase+" "+size+" "+name+" for $"+purchase+".");
	}
	public void Size(int size)
	{
		if (size==0)
		{
			stringSize="small";
			System.out.println("you purchased  "+stringSize+" "+name+" for $"+price);
			DriverClass.line=("you purchased  "+stringSize+" "+name+" for $"+price);
			DriverClass.textStream.println(DriverClass.count+" "+DriverClass.line);
			DriverClass.count++;
		}
		else if (size==1)
		{
			stringSize="medium";
			price=price+1;
			System.out.println("you purchased  "+stringSize+" "+name+" for $"+(price));
			DriverClass.line=("you purchased  "+stringSize+" "+name+" for $"+price);
			DriverClass.textStream.println(DriverClass.count+" "+DriverClass.line);
			DriverClass.count++;
		}
		else if(size==2)
		{
			stringSize="large";
			price=price+2;
			System.out.println("you purchased  "+stringSize+" "+name+" for $"+(price));
			DriverClass.line=("you purchased  "+stringSize+" "+name+" for $"+price);
			DriverClass.textStream.println(DriverClass.count+" "+DriverClass.line);
			DriverClass.count++;
		}
		Description(name);
		//you want that in small medium or large windows pop up and you answer user decides some of these
	}
	public void SpecialOrder(String specialOrder)
	{
		System.out.println("you purchased "+specialOrder+" for $"+price);
		DriverClass.line=("you purchased "+specialOrder+" for $"+price);
		DriverClass.textStream.println(DriverClass.count+" "+DriverClass.line);
		DriverClass.count++;
	}
}
