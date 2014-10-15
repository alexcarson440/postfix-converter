
public class LinkStack<T> {
	//This is a unbounded stack type object implemented as a link list.
	protected Node<T> top;//reference to the top of the stack

	public LinkStack()
	{
		top = null;
	}

	public void push(T element) { 
		//Places element at the top of this stack.
		Node<T> newNode = new Node<T>(element);
		newNode.setLink(top);
		top = newNode;
	}     

	public void pop(){  
		 // Removes top element from the stack.              
		if (!isEmpty())
		{
		   top = top.getLink();
		}
	}

	public T top() { 
		//Returns top element from the stack.
		if (!isEmpty())
			return top.getInfo();
		return null;
	}

	public boolean isEmpty() {
		//Returns true if this stack is empty.          
		return top == null;
	}
}
