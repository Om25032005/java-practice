class Node{
    int data;
    node next;
    Node(int data){
        this.next=null;
        this.data=data;
    }
}
class lll{
    Node head;
    void insertAtEnd(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=nn;

    }
}