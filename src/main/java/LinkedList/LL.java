package LinkedList;

public class LL{
    Node head;
    Node tail;
    int size;
    public LL() {
        System.out.println("list is initialized....");
    }
    public void insertAtFirst(int val) {
        if(head==null || tail == null) {
            Node node = new Node (val);
            head = node;
            tail = node;
            size++;
            return;
        }
        Node node  = new Node(val);
        node.next = head;
        head = node;
        size++;
    }
    public void insertAtLast(int val) {
        if(tail==null){
            System.out.println("List is empty inserting node first....");
            insertAtFirst(val);
            return;
        }
        tail.next = new Node(val);
        tail = tail.next;
        size++;
    }
    public void deleteFromFirst(){
        if(head==null) {
            System.out.println("add an element first....");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;

    }
    public void deleteFromLast(){
        if(tail==null) {
            System.out.println("add an element first....");
            return;
        }
        Node temp = head;
        while(temp != tail) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    public int getFromFirst(){
      if(head==null) {
          return -1;
      }
      return head.val;
    }
    public int getFromLast(){
        return tail.val;
    }
    public int getSize() {
        return size;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }
    }
}
