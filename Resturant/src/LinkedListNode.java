public class LinkedListNode <T>
{
	private T data;
	private LinkedListNode<T> node;//data is head
	//private CategoryNode<T> node;
	//CategoryNode<T> head, current;
	/*public CategoryNode() {
			head = null;
		}*/
	public LinkedListNode(T data)
	{
		this.data=data;
		this.node=null;
	}
	public T getData() {
		return data;
	}

	public LinkedListNode<T> getPointer() {
		return node;
	}

	public void setPointer(LinkedListNode<T> node) {
		this.node = node;
	}

	public void setData(T data) {
		this.data = data;
	}
}
