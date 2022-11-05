package arbol2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

public class arbol {
    public static class Node{
        int val;
        List<Node> children = new LinkedList<>();

        Node(int data){
            val = data;
        }

        Node(int data,List<Node> child){
            val = data;
            children = child;
        }
    }

    private static void imprimearbol(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0;i<len;i++) {
                Node node = queue.poll();
                assert node != null;
                System.out.print(node.val + " ");
                for (Node item : node.children) {
                    queue.offer(item);
                }
            }
            System.out.println();
        }
    }
public static void eliminararbol(Node root){
root.children.clear();

    root = null;
    System.out.println("Arbol eliminado :)");
    
    
}
    public static void main(String[] args) {
        Node root = new Node(1);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(55));
        root.children.get(0).children.add(new Node(32));
        root.children.get(0).children.add(new Node(7));
        root.children.get(1).children.add(new Node(8));
        root.children.get(2).children.add(new Node(92));
        root.children.get(2).children.add(new Node(54));
        root.children.get(2).children.add(new Node(11));
       root.children.get(2).children.get(0).children.add(new Node(15));
        imprimearbol(root);
        eliminararbol(root);
        imprimearbol(root);
        
    }
}