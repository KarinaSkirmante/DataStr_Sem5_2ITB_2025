package datastr;

public class MyVerticeNode <Ttype> {
	private Ttype verticeElement;
	private MyEdgeNode firstEdgeNode = null;
	
	public Ttype getVerticeElement() {
		return verticeElement;
	}
	
	public MyEdgeNode getFirstEdgeNode() {
		return firstEdgeNode;
	}
	
	public void setVerticeElement(Ttype verticeElement) {
		if(verticeElement != null)
		{
			this.verticeElement = verticeElement;
		}
		else
		{
			this.verticeElement = (Ttype) new Object();
		}
	}

	public void setFirstEdgeNode(MyEdgeNode firstEdgeNode) {
		this.firstEdgeNode = firstEdgeNode;
	}
	
	public MyVerticeNode(Ttype verticeElement) {
		setVerticeElement(verticeElement);
	}
	
	public String toString()
	{
		return "" + verticeElement;
	}
	

}
