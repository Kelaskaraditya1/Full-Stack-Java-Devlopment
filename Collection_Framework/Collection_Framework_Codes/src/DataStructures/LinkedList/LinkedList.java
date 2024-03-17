package DataStructures.LinkedList;
import java.util.*;
class Node
{
    public int data;
    public Node naddress;
    public Node(int data)
    {
        this.data=data;
        this.naddress=null;
    }
    public Node()
    {}
}
public class LinkedList
{
    public Node start=null;
 public void insert_node(int data)
 {
     Node new_node = new Node(data);
     if(start==null)
         start=new_node;
     else
     {
         Node n =start;
         while(n.naddress!=null)
             n=n.naddress;
         n.naddress=new_node;
     }
 }
 public void insertStart(int data)
 {
     Node node = new Node(data);
     if(start==null)
         System.out.println("Linked List does not exixts");
     else
     {
         node.naddress=start;
         start=node;
     }
 }
 public void insertAtLocation(int data,int after)
 {
     if(start==null)
         System.out.println("LinkedList does not exists");
     else
     {
         Node node = new Node(data);
         Node n =start;
         while(n.data!=after)
             n=n.naddress;
         node.naddress=n.naddress;
         n.naddress=node;
     }
 }
 public void delete_start()
 {
     if(start==null)
         System.out.println("No Linkedlist");
     else
     {
         Node n = start.naddress;
         start=n;
     }
 }
 public void delete_last()
 {
     if(start==null)
         System.out.println("No LinkedLlist");
     else
     {
         Node n = start.naddress;
         while(n.naddress.naddress!=null)
             n=n.naddress;
         n.naddress=null;
     }
 }
 public void delete_at(int data)
 {
     if(start==null)
         System.out.println("No LinkedLlist");
     else
     {
         Node n = start.naddress;
         while(n.naddress.data!=data)
             n=n.naddress;
         n.naddress=n.naddress.naddress;
     }
 }


 public void display()
 {
     Node n =start;
     while(n!=null) {
         System.out.println(n.data);
         n=n.naddress;
     }
 }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insert_node(10);
        list.insert_node(20);
        list.insertAtLocation(25,20);
        list.insert_node(30);
        list.insert_node(40);
        list.insertStart(5);
//        list.delete_start();
//        list.delete_last();
        list.delete_at(20);
        list.display();
    }
}
