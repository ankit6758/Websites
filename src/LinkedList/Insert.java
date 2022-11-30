package LinkedList;

import java.util.Scanner;

public class Insert {
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
        int data, n, m ,p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("enter 1 then inset at beginning , 2 for end and 3 for specific location");
                m=sc.nextInt();
                switch (m){
                    case 1:
                        new_node.next=head;
                        head=new_node;
                        break;
                    case 2:
                        Node temp=head;
                        while (temp.next!=null){
                            temp=temp.next;
                        }
                        temp.next=head;
                        break;
                    case 3:
                        System.out.println("enter the position to be inserted :");
                        p= sc.nextInt();
                        Node temp1=head;
                        for (int i = 0; i <(p-1) ; i++) {
                            temp1=temp1.next;
                        }
                        new_node.next=temp1.next;
                        temp1.next=new_node;
                        break;

                }
            }
            System.out.println("Do yoou want to add more data, if yes press 1:");
            n= sc.nextInt();
        }while (n==1);

    }
    public void traverse(){
        Node temp =head;
        if(head==null){
            System.out.println("ll not exis");
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
