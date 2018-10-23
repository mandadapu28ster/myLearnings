package com.rao.java.dataStructures.LinkedLists;

import java.util.HashSet;

/**
 *Create single linked list
 *perform below operations
 *              append,
 *              push(add node at end),
 *              insert,
 *              delete,
 *              Finding size of list
 *              Reversing List
 *              finding middle node
 *              is list looped ?
 *
 */

class LinkedListOperations {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void PrintList(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+ "  ");
            n=n.next;
        }
    }

    //add new node after few nodes
    public void InsertIn(int after,int data){
        if(head==null)
        {
            System.out.println("List is empty so appending at start");
            head=new Node(data);
            return;
        }

        Node traverse=head;
        while((traverse.data!=after)&&(traverse.next!=null))
            traverse = traverse.next;

        if((traverse.next==null)&&(traverse.data!=after))           //Failed while writing code condition???
        {
            System.out.println("Node data not found");
            return;
        }
        Node NewNode=new Node(data);
        NewNode.next=traverse.next;
        traverse.next=NewNode;
        return;

    }

    //add node at the end
    public void Push(int  data){
        Node NewNode=new Node(data);
        if(head==null)
            head=NewNode;

        NewNode.next=null;

        Node last=head;
        while(last.next!=null)
            last=last.next;

        last.next=NewNode;
        return;
    }

    //Add new node at the beginning
    public void Append(int data){

        Node NewNode=new Node(data);
        NewNode.next=head;
        head=NewNode;
        return;

    }

    //delete a data node
    public void Delete(int dataToDelete){
        if(head==null)
            System.out.println("List empty");
        Node find=head;
        Node prev = null;
        while ((find.data!=dataToDelete)&&(find.next!=null))
        {
            prev=find;
            find = find.next;
        }
        if((find.next==null)&&(find.data!=dataToDelete))
        {
            System.out.println("Node data not found");
            return;
        }

        //Failed while writing code ???
        if(find!=head)
            prev.next=find.next;
        else
            head=find.next;
        return;
    }

    public int size() {
        int Size=0;

        if(head!=null)
        {
            Node count=head;
            while(count.next!=null){
                count=count.next;
                Size++;
            }
        }
        return Size;
    }

    public void ReversingList(){
            Node current=head;
            Node previous=null;
            Node next=null;
            while(current!=null){
                next=current.next;
                current.next=previous;
                previous=current;
                current=next;
            }
            head=previous;
    }

    public void MiddleOfNode(){
        Node fastNode=head;
        Node slowNode=head;
        if(head!=null)
            while(fastNode!=null && slowNode!=null)         //careful to avoid null pointer exception
        {
            slowNode=slowNode.next;
            fastNode=fastNode.next.next;
        }
        System.out.println("Middle node in list   : "+slowNode.data);
            return;
    }

    public boolean isLoopHash(){
        HashSet<Node> s = new HashSet<Node>();
        Node node=head;
        while(node!=null)
        {
            if (s.contains(node))
            {
                //System.out.println("Loop found at : "+node.data);     //if we want to print loop node
                return true;
            }
            s.add(node);
            node = node.next;
        }
        return false;
    }

    public boolean isLoopDoublePointer() {
        Node slow=head;
        Node fast=head;
        if(head!=null)
            while(slow!=null && fast!=null && fast.next!=null)          //last condition works for boundary condition if no loop ?
            {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast)
                return true;
            }
        return false;
    }

    public static void main(String args[])  {
        LinkedListOperations llist=new LinkedListOperations();
        llist.head=new Node(1);
        Node second=new Node(3);
        Node third=new Node(4);

        llist.head.next=second;
        second.next=third;

        llist.PrintList();

        System.out.println("\nAfter operations");
        llist.Append(0);
        llist.Push(5);
        llist.InsertIn(1,2);

        //Boundary check
        llist.InsertIn(6,7);
        llist.InsertIn(5,6);
        llist.Delete(0);
        llist.PrintList();
        System.out.println("\nLinked list size  : "+llist.size());
        llist.ReversingList();
        System.out.println("Reversed list  :");
        llist.PrintList();
        llist.MiddleOfNode();
        llist.head.next.next.next=llist.head;               //creating loop in list
        if(llist.isLoopHash())
            System.out.println("Loop in list found with hash set");
        if(llist.isLoopDoublePointer())
            System.out.println("Loop in list found with double pointer");
    }
}
