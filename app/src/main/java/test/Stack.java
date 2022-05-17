package test;

public class Stack {
    Node top;

    public Stack() {
        this.top = null;
    }

    void push(Node neW){
        if (top==null){
            top=neW;
        }
        else {
            neW.next=top;
            top=neW;
        }
    }

    Node pop(){
        if (top==null){
            return null;
        }
        else {
            Node tep=top;
           top=top.next;
           return tep;
        }
    }

}
