package datastr;

public class MyGraph <Ttype>{
	
	private MyVerticeNode[] vertices;
	private final int DEFAULT_SIZE = 7;
	private int size = DEFAULT_SIZE;
	private int counter = 0;
	
	public MyGraph()
	{
		vertices = new MyVerticeNode[size];
	}
	
	public MyGraph(int inputSize) 
	{
		if(inputSize > 0) {
			size = inputSize;
		}
		vertices = new MyVerticeNode[size];		
	}
	
	//TODO
	private boolean isFull() {
		return (size == counter);
	}
	
	private boolean isEmpty()
	{
		return (counter == 0);
	}
	
	public int lenght()
	{
		return counter;
	}
	
	
	private void resize() {
		if(size < 100)
		{
			size = size * 2;
		}
		else
		{
			size = (int)(size * 1.5); //135.7 -> 135
		}
		
		MyVerticeNode[] verticesNew = new MyVerticeNode[size];
		
		for(int i = 0 ; i < counter; i++) {
			verticesNew[i] = vertices[i];	
		}
		
		vertices = verticesNew;
		
		System.gc();
			
	}
	
	
	public void addVertice(Ttype element) throws Exception
	{
		if(element == null)
		{
			throw new Exception("Element can not be null");
		}
		
		if(isFull())
		{
			resize();
		}
		
		MyVerticeNode newVerticeNode = new MyVerticeNode(element);
		vertices[counter++] = newVerticeNode;
		
		
	}
	
	public void addEdge(Ttype elementFrom, Ttype elementTo, float weight) throws Exception {
		if(elementFrom == null || elementTo == null || weight <= 0) {
			throw new Exception("Wrong input params");
		}
		
		int indexOfElementFrom = getIndexOfVertice(elementFrom);
		int indexOfElementTo = getIndexOfVertice(elementTo);
		
		if(indexOfElementFrom == -1)
		{
			throw new Exception("Element from (" + elementFrom + ") doesn't exist");
		}
		
		if(indexOfElementTo == -1)
		{
			throw new Exception("Element to (" + elementTo + ") doesn't exist");
		}
		
		//pārbaudīsim, vai jau savienojuma mezgls neeksistē
		
		MyEdgeNode tempEdge = vertices[indexOfElementFrom].getFirstEdgeNode();
		
		while(tempEdge != null)
		{
			if(tempEdge.getIndexOfVerticeEdgeTo() == indexOfElementTo
					&& tempEdge.getWeight() == weight)
			{
				throw new Exception(
				"The edge between " + elementFrom + "->" + elementTo +  " already exists");
			}
				
			
			tempEdge = tempEdge.getNext();
		}
		
		MyEdgeNode newEdge = new MyEdgeNode(indexOfElementTo, weight);
		//savienojuma mezgls būs jāieliek kā pirmais
		if(vertices[indexOfElementFrom].getFirstEdgeNode() == null)
		{
			vertices[indexOfElementFrom].setFirstEdgeNode(newEdge);
		}
		else // pie virsotnes ir jau pieasitīts vismaz viens savienojumu mezgls
		{
			MyEdgeNode currentFirstEdge = vertices[indexOfElementFrom].getFirstEdgeNode();
			newEdge.setNext(currentFirstEdge);
			currentFirstEdge.setPrevious(newEdge);
			vertices[indexOfElementFrom].setFirstEdgeNode(newEdge);		
			
		}
		
		
		
	}
	
	private int getIndexOfVertice(Ttype element) {
		//TODO pēc nepieciešamšības pārbaudam not null
		
		for(int i = 0 ; i < counter; i++) {
			if(vertices[i].getVerticeElement().equals(element))
			{
				return i;
			}
		}
		
		return -1;
		
		
	}
	//TODO
	public void print() throws Exception {
		if(isEmpty()) {
			throw new Exception("Graph is empty and it is not possible to print elements");
		}
		
		
		for(int i = 0; i < counter; i++) {
			System.out.print(vertices[i].getVerticeElement() + " -> ");
			MyEdgeNode tempEgde = vertices[i].getFirstEdgeNode();
			while(tempEgde != null)
			{
				float weight = tempEgde.getWeight();
				
				Ttype vertice = (Ttype)vertices[tempEgde.getIndexOfVerticeEdgeTo()].getVerticeElement();
				
				System.out.print(vertice + " (" + weight + " km); ");
				
				tempEgde = tempEgde.getNext();
			}
			System.out.println();
		}
		
		
	}
	//TODO
	public void removeEdge(Ttype elementFrom, Ttype elementTo, float weight) throws Exception{
		if(elementFrom == null || elementTo == null || weight <= 0) {
			throw new Exception("Wrong input params");
		}
		int indexOfElementFrom = getIndexOfVertice(elementFrom);
		int indexOfElementTo = getIndexOfVertice(elementTo);
		
		if(indexOfElementFrom == -1)
		{
			throw new Exception("Element from (" + elementFrom + ") doesn't exist");
		}
		
		if(indexOfElementTo == -1)
		{
			throw new Exception("Element to (" + elementTo + ") doesn't exist");
		}
		
	}
	//removeVertice
	

}
