public class CategoryNode <T>
{
	private T data;
	private CategoryNode node, foodNode;//data is head
	//private CategoryNode<T> node;
	//CategoryNode<T> head, current;
	/*public CategoryNode() {
			data = null;
		}*/
	public CategoryNode(T data)
	{
		this.data=data;
		this.node=null;
	}
	/*public CategoryNode(String data, String foodNode)//test constructor
	{
		this.data=data;
		this.node=null;
		this.foodNode=null;
	}*/
	public T getData() {
		return data;
	}

	public CategoryNode getPointer() {
		return node;
	}

	public void setPointer(CategoryNode node) {
		this.node = node;
	}

	public void setData(T data) {
		this.data = data;
	//pointer for next node and another pointer gets to linked list class
	}
	/*public CategoryNode getFoodPointer() {
		return foodNode;
	}
	public void setFoodPointer(CategoryNode foodNode) {
		this.foodNode = foodNode;
	}*/
}
