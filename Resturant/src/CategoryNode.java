public class CategoryNode //<T>
{
	private String data;
	private CategoryNode node;//data is head
	//private CategoryNode<T> node;
	//CategoryNode<T> head, current;
	/*public CategoryNode() {
			head = null;
		}*/
	public CategoryNode(String data)
	{
		this.data=data;
		this.node=null;
	}
	public String getData() {
		return data;
	}

	public CategoryNode getPointer() {
		return node;
	}

	public void setPointer(CategoryNode node) {
		this.node = node;
	}

	public void setData(String data) {
		this.data = data;
	}
}