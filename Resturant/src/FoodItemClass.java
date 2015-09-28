public class FoodItemClass
{
	String name, food;double price;
	public void Name(String Name)
	{
		 name=Name;
		 System.out.println("namemethod= "+name);
	}
	public void Price(double Price)
	{
		price=Price;
		System.out.println("price method price= "+price);
	}
	public void Quantity(double purchase, String name)
	{
		//LinkedList list= new LinkedList();
		System.out.println("quantitymethod = "+name+" quantity= "+purchase);
		Name(name);
	}
	public void Description(String string)
	{
		System.out.println("the description from the fooditem Class is = "+string+" for "+price);
	}
	public void Size(int size)
	{
		if (size==0)
		{
			System.out.println("you purchased a small "+name+" for $"+price);
		}
		else if (size==1)
		{
			System.out.println("you purchased a medium "+name+" for $"+price);
		}
		else if(size==2)
		{
			System.out.println("you purchased a large "+name+" for $"+price);
		}
		//System.out.println("size for "+name+" = "+size);
		//(size+price)
		//you want that in small medium or large windows pop up and you answer user decides some of these
	}
	public void SpecialOrder(String specialOrder)
	{
		System.out.println("you purchased "+specialOrder+" for $"+price);
	}
}