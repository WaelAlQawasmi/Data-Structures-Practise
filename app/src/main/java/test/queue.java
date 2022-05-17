package test;

public class queue {
    Node front;
    Node back;
    public void enq(Node newN){
        back.next=newN;
        back=newN;
    }
}
