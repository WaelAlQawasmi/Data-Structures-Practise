package test;

import java.util.*;

public class Graph {

    private final Map<Vertex, List<Vertex>> Vertex;

    public Graph() {
        this.Vertex = new HashMap<>();
    }

    public Vertex addNode(String value) {
        Vertex node = new Vertex(value);
        Vertex.putIfAbsent(node, new ArrayList<>());
        return node;
    }


    public void addEdge(Vertex node1, Vertex node2) {

        Vertex.get(node1).add(node2);
        Vertex.get(node2).add(node1);

    }


    public ArrayList<Vertex> BFSNew(Vertex root){
        ArrayList<Vertex> visited=new ArrayList<>();
        Queue<Vertex>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
         Vertex temp=queue.poll();


            visited.add(temp);

            for (Vertex V:getNabers(temp)) {
                if(!visited.contains(temp)){
                queue.add(V);
                }

            }

        }
        return visited;

    }















        public List<test.Vertex> getNabers(Vertex v1){
       return this.Vertex.get(v1);
    }

    public void BFS(Vertex root){
        ArrayList<Vertex>visited=new ArrayList<>();
        Queue<Vertex> queue=new LinkedList();
        queue.add(root);
       // visited.add(root);
        while (!queue.isEmpty()){
           Vertex temp= queue.poll();
           visited.add(temp);
            for (Vertex X:getNabers(temp)) {
                if(!visited.contains(X)){
                    queue.add(X);
                }

            }

        }

    }

    public void dsf(Vertex V,ArrayList<Vertex> visited){
        if(V!=null){
            if(!visited.contains(V)){
                visited.add(V);
                for (Vertex X:getNabers(V)
                     ) {
                    dsf(X,visited);

                }
            }


        }

    }
}
