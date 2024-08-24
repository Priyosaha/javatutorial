package main;
import LinkedList.LL;
public class Main {

    public static void main(String[] args) {
        LL list  = new LL();
        /*
        inserting even nodes at front of list and odd nodes at back;
        */
        for(int i=1;i<10;i++){
            if(i%2==0){
                list.insertAtFirst(i);
            }else{
                list.insertAtLast(i);
            }
        }
        list.printList();
        System.out.println(list.getSize());
    }
}
