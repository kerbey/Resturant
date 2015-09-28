public class LinkedListNode
{
	private String data;
	private LinkedListNode node;//data is head
	//private CategoryNode<T> node;
	//CategoryNode<T> head, current;
	/*public CategoryNode() {
			head = null;
		}*/
	public LinkedListNode(String data)
	{
		this.data=data;
		this.node=null;
	}
	public String getData() {
		return data;
	}

	public LinkedListNode getPointer() {
		return node;
	}

	public void setPointer(LinkedListNode node) {
		this.node = node;
	}

	public void setData(String data) {
		this.data = data;
	}
}