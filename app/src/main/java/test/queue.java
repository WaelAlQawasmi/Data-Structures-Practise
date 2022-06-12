package test;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class queue<T> {
Node<T> front;
Node<T> back;
int size=0;

    public queue() {
    }

    public void enqeue(Node<T> o) {
            if (front==null){
                front=o;
                back =o;
                size++;
            }
            else {
                back.next=o;
                size++;
            }

        }


    public Object deqeue() {
        if (front!=null){
            Node tem= front;
        front=front.next;
            size--;
        return tem.value;
        }
        else {
         return null;
        }

    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }




}
