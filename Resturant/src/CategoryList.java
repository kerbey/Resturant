public class CategoryList
{
	private String name;
	CategoryNode head, previous, tail, current, node;
	public CategoryList(String name)
	{
		this.name=name;
	}
	public CategoryList()
	{
		this.name= null;
	}
	public boolean Search(String Input)
	{
		String search = "You're searching in the " + Input + " category.";
		if (search!=null){
			//System.out.println("categorylist " + search);
			return true;
		}
		//else{
		//String search = (String) ("You're searching in the " + Input + " category.");
		System.out.println("categorylist " + search);
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
	public String isEmpty() throws EmptyListException
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
		return toString();
	}
	public void Add(String data)
	{
		CategoryNode node= new CategoryNode(data);
		System.out.println("node= "+node.getData());
		if (head!=null)
		{
			node.setPointer(head);
			//System.out.println("node= "+((CategoryNode) node.getPointer()).getData());
			//head is assigned to node
		//if it already isnt empty
		}
		//head gets assigned to node whether or not it has something
		this.head=node;
		//nodeList.add(this.head);
		//System.out.println("this.head= "+this.head.getData());
	}
	/*public String getString()
	{
		return toString();
	}*/
	public void delete(String key)
	{
			if (head==null)
			{
				System.out.println("the list is empty");
			}
			else
			{
				//current gets the latest head added
				current=head;
				//System.out.println("delete head ="+head.getData());
				//System.out.println(" delete current=head "+current.getData());
				//System.out.println("previous "+previous.getData());			
				while(current!=null&& !current.getData().equals(key))
				{//current goes though this loop until it equals the string that was passed in
				//then it gets moved to previous and current has to get the next current value
			//that will break out of this loop
					previous=current;
					//System.out.println("current.getNext ="+current.getData());
					////System.out.println("previous ="+previous.getData());
					current=(CategoryNode) current.getPointer();
					//System.out.println("current.getNext ="+current);	
				}
			}
			if(current==head && current.getData().equals(key))
			{//heads aren't equal so they get us out of this loop
				System.out.println("new head.getnext= "+head);
				head=(CategoryNode) head.getPointer();
			}
			else if(current!=null)
			{
			//	System.out.println("previous setnext= "+previous.getData());
				previous.setPointer(current.getPointer());
				//System.out.println("previous setnext= "+((CategoryNode) previous.getPointer()).getData());
			}
			else
			{
				System.out.println("list is empty can't delete");
			}
		}	
	public String toString()
	{
		String list ="";
		 current = this.head;
		while(current!=null)
		{
			list+=current.getData()+"; ";
			current= (CategoryNode) current.getPointer();
		}
		//System.out.println("the list from inside the toString method is  = "+list+"\n");
		//System.out.println("current= "+current);
		return list;
	}
	///////////////////////*/
	// CategoryNode head;//, previous, tail, current, node; //generics problem
	/*String name;
	//CategoryNode<String> category, current, data;
	private String data, current;
	public CategoryList(String name)
	{
		this.name = name;
		//category = new CategoryNode<String>();
	}
	public CategoryList()
	{
		this.name = null;
		//category = new CategoryNode<String>();
	}
	public String getString()
	{
		return toString();
	}
	public String stackinterface() throws EmptyListException//formerly deqeue
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
		if (toString()==null)
		{
			throw new EmptyListException("emtpy exception the list is empty");
			// System.out.println("the list is empty");
		}
		else
		{
			System.out.println("the list from inside the dequeue method is  = "
					+ toString() + "\n");
		};
		// element= this.head.getData();
		// this.head=this.head.getPointer();
		return toString();
	}
	public boolean isEmpty() {
		return toString() == null;
	}

	@SuppressWarnings("unused")
	public boolean Search(String Input)
	{
		String search = (String) ("You're searching in the " + Input + " category.");
		System.out.println("categorylist " + search);
		if (search==null)
		{
			return false;
		}
		else
		{//String search = (String) ("You're searching in the " + Input + " category.");
		System.out.println("categorylist " + search);
			return true;
		}
		//search is a return boolean method if you can find your food item
	}
	public String toString()
	{
		String list = "";
		current = data;//data=name
		while (current != null)
		{
			list += current + "; ";
			//current = current.getPointer();
		}
		// System.out.println("the list from inside the toString method is  = "+list+"\n");
		// System.out.println("current= "+current);
		return list;
	}
	public void Add(String data) {// stacking to add to array
		CategoryNode node = new CategoryNode(data);
		System.out.println("node= " + node.getData());
		if (data != null)
		{
			node.setPointer(data);//adding head
			System.out.println("node= " + node.getPointer());
			// head is assigned to node if it already isnt empty
		}
		// head gets assigned to node whether or not it has something
		this.data = node.getPointer();
		// LinkedList(this.head);
		// nodeList.add(this.head);
		System.out.println("this.head= " + this.data);
	}
	public void delete(String data) throws EmptyListException
	{
		String iterator;
		String previous;
		if (data == null)
		{
			throw new EmptyListException(
					"cannot delete: emtpy exception the list is empty");
		} else {
			iterator=data;
			while (iterator != null && !iterator.equals(data)) {  
				previous = iterator;//interator takes previous place
				//iterator = iterator.getPointer();
			}
		}
	}
	/*public String toString()
	{
		if (category.ToString().isEmpty())
		{
			System.out.println("the list is empty");
		}
		else
		{
			System.out
			.println("the list from inside the toString method is  = "
					+ category.ToString() + "\n");
		}
		;
		return category.ToString();
	}*/

	// @SuppressWarnings("hiding")
	/*class CategoryNode<T> {
		CategoryNode<T> head, current;

		/*public CategoryNode() {
			head = null;
		}

		public CategoryNode<T> isEmpty() {
			return this.head = null;
		}

		public CategoryNode()
		{

		}
		public void insert(T data) {// stacking to add to array
			CategoryNode<T> node = new CategoryNode<T>(data);
			System.out.println("node= " + node.getData());
			if (head != null) {
				node.setPointer(head);
				System.out.println("node= " + node.getPointer().getData());
				// head is assigned to node if it already isnt empty
			}
			// head gets assigned to node whether or not it has something
			this.head = node;
			// LinkedList(this.head);
			// nodeList.add(this.head);
			System.out.println("this.head= " + this.head.getData());
		}


		public void delete(T data) throws EmptyListException {
			CategoryNode<T> iterator;
			CategoryNode<T> previous;
			if (head == null) {
				throw new EmptyListException(
						"cannot delete: emtpy exception the list is empty");

			} else {
				iterator = head;

				while (iterator != null && !iterator.getData().equals(data)) {  
					previous = iterator;//interator takes previous place

					iterator = iterator.getPointer();

				}
			}

		}
		@SuppressWarnings("unchecked")
		public String ToString() {
			String list = "";
			current = this.head;
			while (current != null) {
				list += current.getData() + "; ";
				current = current.getPointer();
			}
			// System.out.println("the list from inside the toString method is  = "+list+"\n");
			// System.out.println("current= "+current);
			return list;
		}
	}*/
}