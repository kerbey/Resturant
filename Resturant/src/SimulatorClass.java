public class SimulatorClass
{
	public static void main(String args[]) throws EmptyListException
	{
		System.out.println("categorylist test");
		CategoryList test= new CategoryList();
		System.out.println("test= "+test.isEmpty());
		CategoryList  studentlog= new CategoryList("Student Log");
		studentlog.Add("dog");
		studentlog.Add("dog");
		studentlog.Add("car");
		studentlog.Add("plane");
		System.out.println("the list From THe main Class is = "+ studentlog.toString());
		System.out.println("to search method= "+studentlog.Search("plane"));
		studentlog.delete("car");
		System.out.println("the list with deleted item is now = "+	 studentlog.toString());

		System.out.println("linkedlist test");	
		LinkedList ClistEmpty= new LinkedList();
		System.out.println("test= "+ClistEmpty.isEmpty());
		CategoryList  Clist= new CategoryList("Student Log");
		Clist.Add("dog");
		Clist.Add("dog");
		Clist.Add("car");
		Clist.Add("plane");
		System.out.println("the list From THe main Class is = "+ Clist.toString());
		System.out.println("to search method= "+Clist.Search("plane"));
		Clist.delete("car");
		System.out.println("the list with deleted item is now = "+	 Clist.toString());
	}
}