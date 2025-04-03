package datastr;

public class MyVerticeNode <Ttype> {
	private Ttype verticeElement;
	private MyEdgeNode firstEdgeNode = null;
	private boolean isVisited = false;
	
	public Ttype getVerticeElement() {
		return verticeElement;
	}
	
	public MyEdgeNode getFirstEdgeNode() {
		return firstEdgeNode;
	}
	
		
	public boolean isVisited() {
		return isVisited;
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
	
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	public MyVerticeNode(Ttype verticeElement) {
		setVerticeElement(verticeElement);
	}
	
	public String toString()
	{
		return "" + verticeElement;
	}
	

}
