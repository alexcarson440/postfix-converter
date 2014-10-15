
public class Node<T> {
	//This is a self-referencing class used to implement a Link-List
	private Node<T> link = null; //reference to next "node"
	private T info; //data stored in current "node"
	
	public Node(T info) {
		this.info = info; 
	}
	 
	public void setInfo(T info) {
		this.info = info;
	}

	public T getInfo() {
		return info;
	}
	 
	public void setLink(Node<T> link) {
		this.link = link;
	}

	public Node<T> getLink() {
		return link;
	}
}
