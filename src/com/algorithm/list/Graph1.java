package com.algorithm.list;

import java.util.*;

public class Graph1 {

	
	class Edge {
		int v,w;
		Edge(int v, int u) {
			this.v = v;
			this.w = u;
		}
		
		@Override
		public String toString() {
			return "[ Vertices :"+ v +" Weight :" + w + "]";
		}
	}
	
	List<Edge> g[];
	
	public Graph1(int n) {
		g = new LinkedList[n];
		
		for(int i =0;i<g.length;i++) {
			g[i] = new LinkedList<Graph1.Edge>();
		}
	}
	
	void addEdge(int u, int v, int w) {
		g[u].add(new Edge(v, w));
	}
	
	public boolean isConnected(int v1, int v2)
	{
		for (Edge e: g[v1]) {
			if (e.v == v2) {
				return true;
			}
		}
		
		return true;
	}
	@Override
	public String toString() {
		String result = "";
		for(int i=0;i<g.length;i++) {
			result += i +" ->" + g[i] +"\n";
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		Graph1 graph1 = new Graph1(5);
		graph1.addEdge(0, 1, 4);
		graph1.addEdge(0, 4, 5);
		graph1.addEdge(1, 0, 4);
		graph1.addEdge(1, 2, 8);
		graph1.addEdge(1, 3, 10);
		graph1.addEdge(1, 4, 6);
		
		System.out.println(graph1);
		
		System.out.println(" 0 and 1 is connected :" + graph1.isConnected(1, 0));
		//graph1.addEdge(0, 2, 3);
	}

}
