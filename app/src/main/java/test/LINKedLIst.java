package test;

import java.util.LinkedList;

public class LINKedLIst {
    public LINKedLIst() {

    }
    LinkNode head ;  // to decelerate  variable can have object from Node in other word  can save object on it
    int size;


    void  insert(int vale){
        size++;
        LinkNode newNode= new LinkNode(vale); // create New object and stor the value in constractor
        newNode.next=this.head; // two of this varible jave a data type can save object of Node Class
        this.head=newNode;// the head will point to new node and in prives line the newNode eill point to the next

    }


    public static boolean  Soted(LINKedLIst LL){
        LinkNode pointer=LL.head;
        while (pointer!=null){
            if(pointer.next!=null){
                if(pointer.value >= pointer.next.value){
                    pointer=pointer.next;
                    continue;
                }
                else {
                    break;
                }
            }

            else {
                return true;
            }
        }

        pointer=LL.head;
        while (pointer!=null){
            if(pointer.next!=null){
                if(pointer.value <= pointer.next.value){
                    pointer=pointer.next;
                    continue;
                }
                else {
                    return false;
                }
            }

            else {
                return true;
            }
        }
        return false;
    }




}
