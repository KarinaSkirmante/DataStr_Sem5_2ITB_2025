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
	
	

}
