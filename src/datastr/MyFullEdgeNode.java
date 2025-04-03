package datastr;

public class MyFullEdgeNode {
	private MyEdgeNode edgeFromGraph;
	private int indexOfVerticeEdgeFrom;
	private boolean needToDelete = true;
	
	//TODO veikt nepieciesamās pārbaudes set funkcijās
	public MyEdgeNode getEdgeFromGraph() {
		return edgeFromGraph;
	}
	public void setEdgeFromGraph(MyEdgeNode edgeFromGraph) {
		this.edgeFromGraph = edgeFromGraph;
	}
	public int getIndexOfVerticeEdgeFrom() {
		return indexOfVerticeEdgeFrom;
	}
	public void setIndexOfVerticeEdgeFrom(int indexOfVerticeEdgeFrom) {
		this.indexOfVerticeEdgeFrom = indexOfVerticeEdgeFrom;
	}
	public boolean isNeedToDelete() {
		return needToDelete;
	}
	public void setNeedToDelete(boolean needToDelete) {
		this.needToDelete = needToDelete;
	}
	public MyFullEdgeNode(MyEdgeNode edgeFromGraph, int indexOfVerticeEdgeFrom) {
		setEdgeFromGraph(edgeFromGraph);
		setIndexOfVerticeEdgeFrom(indexOfVerticeEdgeFrom);
	}
	
	public String toString()
	{
		return edgeFromGraph + " " + indexOfVerticeEdgeFrom;
	}
	

}
