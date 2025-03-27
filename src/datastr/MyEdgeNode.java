package datastr;

public class MyEdgeNode {
	private int indexOfVerticeEdgeTo;
	private float weight;//TODO var uztaisīt kā Ttype, kas ļautu ielikt arī saliktus datus, piemēram, ceļa garums + max ātrums + stāvoklis
	private MyEdgeNode next = null;
	private MyEdgeNode previous = null;
	
	
	public int getIndexOfVerticeEdgeTo() {
		return indexOfVerticeEdgeTo;
	}
	public void setIndexOfVerticeEdgeTo(int indexOfVerticeEdgeTo) {
		if(indexOfVerticeEdgeTo >= 0)
		{
			this.indexOfVerticeEdgeTo = indexOfVerticeEdgeTo;
		}
		else
		{
			this.indexOfVerticeEdgeTo = 0;//TODO var apdomāt uz kādu citu vērtibu
		}
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		if(weight > 0 )
		{
			this.weight = weight;
		}
		else
		{
			this.weight = 0.0001f;
		}
	}
	public MyEdgeNode getNext() {
		return next;
	}
	public void setNext(MyEdgeNode next) {
		this.next = next;
	}
	public MyEdgeNode getPrevious() {
		return previous;
	}
	public void setPrevious(MyEdgeNode previous) {
		this.previous = previous;
	}
	
	public MyEdgeNode(int indexOfVerticeEdgeTo, float weight)
	{
		setIndexOfVerticeEdgeTo(indexOfVerticeEdgeTo);
		setWeight(weight);
	}
	
	
	public String toString() {
		return "[" + indexOfVerticeEdgeTo + "] " + weight;
	}

}
