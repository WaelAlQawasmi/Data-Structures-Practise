package test;

public class linkss<T>{
    Node head ;  // to decelerate  variable can have object from Node in other word  can save object on it
int size;
    public linkss() {
        this.head = null; // the first time of head null
    }

    void  insert(T vale){
size++;
        Node newNode= new Node(vale); // create New object and stor the value in constractor
        newNode.next=this.head; // two of this varible jave a data type can save object of Node Class
        this.head=newNode;// the head will point to new node and in prives line the newNode eill point to the next

        }




    void  insertAfter(T vale ,T after){

        Node neW=new Node<>(vale);
        Node pointer=head;
        while (pointer!=null){
            if(pointer.value==after){
              neW.value=pointer.next;
              pointer.next=neW;

              break;

            }
        }
        size++;


    }



    void  append(T vale ){

        Node neW=new Node(vale);
        Node pointer=head;
        if(head==null){
            head=neW;
            neW.next=null;
        }
        while (pointer!=null){
            if(pointer.next==null){
                neW.next=null;
                pointer.next=neW;
                break;

            }
        }
        size++;


    }

    boolean  include(T vale){

       Node pointer=head;
       while (pointer!=null){
           if(pointer.next==vale){
               return true;
           }
           pointer=pointer.next;
       }
       return false;

    }


    void k(int k){
        int Oindex=size-k;
        int sizeo=1;
     Node pointer= head;


        while (Oindex!=size){
            sizeo++;
pointer=pointer.next;

        }
        if(sizeo==Oindex){
            System.out.println();
        }
    }

    public  void printAll(){
        try {
            Node pointer = this.head;

            while (pointer!=null){

                System.out.print(pointer.value+"=>");
                if(pointer.next==null){
                    System.out.print("null");
                }
                pointer=pointer.next;

            }

        }
        catch ( Exception e){
            System.out.println("ERROE LINKED LIST INSTALLTAION ");
        }




    }


    @Override
    public String toString() {
        Node pointrt=head;
        String str="";
        while (pointrt!=null){
          str= str+"->"+ pointrt.value;
          System.out.println(pointrt.value);
        pointrt=  pointrt.next;
        }
        return "LinkedList{" +
                "head=" +str +
                '}';
    }
}
