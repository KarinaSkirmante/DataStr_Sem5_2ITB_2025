package service;

import datastr.MyGraph;

public class MainService {

	public static void main(String[] args) {
		MyGraph<String> myMap = new MyGraph<String>(2);
		
		try {
			System.out.println("-------------------CREATE GRAPH--------------------");
			myMap.addVertice("Atlanta");
			myMap.addVertice("Austin");
			myMap.addVertice("Chicago");
			myMap.addVertice("Dallas");
			myMap.addVertice("Denver");
			myMap.addVertice("Houston");
			myMap.addVertice("Washington");
			
			myMap.addEdge("Atlanta", "Houston", 800);
			myMap.addEdge("Atlanta", "Washington", 600);

			
			myMap.addEdge("Austin", "Dallas", 200);
			myMap.addEdge("Austin", "Houston", 160);
			
			
			myMap.addEdge("Chicago", "Denver", 1000);
			
			myMap.addEdge("Dallas", "Austin", 200);
			myMap.addEdge("Dallas", "Chicago", 900);
			myMap.addEdge("Dallas", "Denver", 780);

			
			myMap.addEdge("Denver", "Atlanta", 1400);
			myMap.addEdge("Denver", "Chicago", 1000);
			
			myMap.addEdge("Houston", "Atlanta", 800);
			
			myMap.addEdge("Washington", "Atlanta", 600);
			myMap.addEdge("Washington", "Dallas", 1300);
			
			myMap.print();
			
			System.out.println("---------------SEARCH PATH------------------------");
			System.out.println("PATH: " + myMap.searchPathDepthFirstAlgorithm("Austin", "Washington"));
			System.out.println("PATH: " + myMap.searchPathDepthFirstAlgorithm("Dallas", "Houston"));
			//System.out.println("PATH: " + myMap.searchPathDepthFirstAlgorithm("Houston", "Austin"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
