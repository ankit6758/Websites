package LinkedList;

import java.util.Scanner;

public class SingleLinkedList {
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
        }
    }
    Node head = null;
        public void creation() {
            int data, n;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("enter data");
                data = sc.nextInt();
                Node new_node = new Node(data);
                if (head == null) {
                    head = new_node;
                } else {
                    new_node.next = head;
                    head = new_node;
                }
                System.out.println("Do yoou want to add more data, if yes press 1:");
                n= sc.nextInt();
            }while (n==1);

        }
        public void traverse(){
            Node temp =head;
            if(head==null){
                System.out.println("ll not exist");
            }else {
                while(temp != null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }

    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        ll.creation();
        ll.traverse();
    }

}
