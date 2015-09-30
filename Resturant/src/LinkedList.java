import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.soap.Node;
public class LinkedList <T>
{
	private T name;
	LinkedListNode<T> head, previous, tail, current, node;
	public LinkedList(T name)
	{
		this.name=name;
	}
	public LinkedList()
	{
		this.name= null;
	}
	public boolean Search(T Input)
	{
		//String search = (String) ("You're searching in the " + Input + " category.");
		String search = (String) ("You're searching for the food " + Input + ".");
		//System.out.println("categorylist " + search);
		if (search!=null){
		//	System.out.println("categorylist " + search);
			return true;}
		//else{
			System.out.println("(linkedlist) " + search);
			return false;//}
		//search is a return boolean method if you can find your food item
	}
	/*public String stackinterface() throws EmptyListException//formerly deqeue
	{
		// this.head.setData("s");
		//String element = "hi";	
		/*try
		{
			System.out.println("the list from inside the dequeue method is  = "
					+ toString() + "\n");
		}
		catch (IndexOutOfBoundsException e)
		{
			throw new EmptyListException("emtpy exception the list is empty");
		}//
		if (toString()== "")
		{
			//throw new EmptyListException("emtpy exception the list is empty");
			 System.out.println("the list is empty");
		}
		else
		{
			System.out.println("the list from inside the dequeue method is  = "
					+ toString() + "\n");
		};
		// element= this.head.getData();
		// this.head=this.head.getPointer();
		return toString();
	}*/
	public T isEmpty() throws EmptyListException
	{
		if (toString()=="")
		{
			//throw new EmptyListException ("(is empty method )the list is empty");
			System.out.println("(is empty method )the list is empty");
		}
		else
		{	
			System.out.println("the list from inside the isempty method is  = "+toString()+"\n");
		}
		return (T) toString();
	}
	public void Add(T data)
	{
		LinkedListNode<T> node= new LinkedListNode<T>(data);
		System.out.println("node= "+node.getData());
		if (head!=null)
		{
			node.setPointer(head);
			//System.out.println("node= "+((LinkedListNode) node.getPointer()).getData());
			//head is assigned to node
			//if it already isnt empty
		}
		//head gets assigned to node whether or not it has something
		this.head=node;
		//nodeList.add(this.head);
		//System.out.println("this.head= "+this.head.getData());
	}
	public T getString()
	{
		return (T) toString();
	}
	public void delete(T key)
	{
		if (head==null)
		{
			System.out.println("the list is empty");
		}
		else if(head!=null)
		{
			//current gets the latest head added
			current=head;
			System.out.println("delete head ="+head.getData());
			System.out.println(" delete current=head "+current.getData());
			//System.out.println("previous "+previous.getData());			
			while(current!=null&& !current.getData().equals(key))//exclamation point is the reason delete method works
			{//current goes though this loop until it equals the string that was passed in
				//then it gets moved to previous and current has to get the next current value
				//that will break out of this loop
				System.out.println("linkedlistloop");
				previous=current;
				System.out.println("current.getpointer ="+current.getPointer());
				System.out.println("previous ="+previous.getData());
				current=(LinkedListNode) current.getPointer();
				System.out.println("current.getNext ="+current);	
			}
		}
		 if(current==head && current.getData().equals(key))
		{//heads aren't equal so they get us out of this loop
			System.out.println("new head.getnext= "+head);
			head=(LinkedListNode) head.getPointer();
			System.out.println("new head.getnext= "+head);
		}
		else if(current!=null)
		{
			System.out.println("previous setnext= "+previous.getData());
			previous.setPointer(current.getPointer());
			System.out.println("previous setnext= "+((LinkedListNode) previous.getPointer()).getData());
		}
		else
		{
			System.out.println("list is empty no more deleting");
		}
	}	
	public String toString()
	{
		String list ="";
		current = this.head;
		while(current!=null)
		{
			list+=current.getData()+"; ";
			current= (LinkedListNode) current.getPointer();
		}
		//System.out.println("the list from inside the toString method is  = "+list+"\n");
		System.out.println("toString list ="+list);
		//System.out.println("current= "+current);
		return list;
	}
}
