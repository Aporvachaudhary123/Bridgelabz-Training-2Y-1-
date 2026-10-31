package LinkedList;

public class BasicLinkedList {

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }
    public static void Display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        Display(a);
        System.out.println();

        node temp = a;


        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
    }
}