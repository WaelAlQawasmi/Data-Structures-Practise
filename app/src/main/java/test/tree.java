package test;

import java.util.LinkedList;
import java.util.Queue;

public class tree {
    treeNode root;

    public treeNode getRoot() {
        return root;
    }

    public void setRoot(treeNode root) {
        this.root = root;
    }

    public tree() {

    }

    public static void preOrder(treeNode Node){
        if(Node!=null){
            System.out.println(Node.getValue());
            if(Node.getLEFT()!=null){
            preOrder(Node.getLEFT());}
            if(Node.getRIGHT()!=null){
            preOrder(Node.getRIGHT());}
        }
    }


    public void inOrder(treeNode Node){
        if(Node!=null){

            if(Node.getLEFT()!=null){
                inOrder(Node.getLEFT());

            }
            System.out.println(Node.value);

            if(Node.getRIGHT()!=null){
                inOrder(Node.getRIGHT());}
        }
    }

    public void postOrder(treeNode Node){
        if(Node!=null){

            if(Node.getLEFT()!=null){
                postOrder(Node.getLEFT());

            }


            if(Node.getRIGHT()!=null){
                postOrder(Node.getRIGHT());}
            System.out.println(Node.value);
        }
    }


    int max;


    public int Maximam(){

         max=   root.getValue();
        maximmam(root);
        return max;


    }

    public void maximmam(treeNode Node){
        if(Node!=null){
       if(Node.getValue()>max){
           max=(int)Node.getValue();
       }

       maximmam(Node.getRIGHT());
        maximmam(Node.getLEFT());
    }}
int[]maximam= {Integer.MIN_VALUE,Integer.MIN_VALUE};
    public int theSecandMax(){
        theSecandMaxRecar(this.root);
        return maximam[1];
    }

    public void theSecandMaxRecar(treeNode Node){
        if(Node!=null){
           if(Node.getValue()>maximam[0]){
               maximam[1]=maximam[0];
               maximam[0]=Node.getValue();

           }
           else if(Node.getValue()>maximam[1]){
               maximam[1]=Node.getValue();
           }
            theSecandMaxRecar(Node.getLEFT());
            theSecandMaxRecar(Node.getRIGHT());
        }

    }


    public void bfs(treeNode node){
        queue queue=new queue<>();

        queue.enqeue(new Node<>(node));
       while (!queue.isEmpty()){
           treeNode temp= (treeNode) queue.deqeue();
          System.out.println( temp.getValue());
          if(temp.getRIGHT()!=null){
              queue.enqeue(new Node(temp.getRIGHT()));
          }

           if(temp.getLEFT()!=null){
               queue.enqeue(new Node(temp.getLEFT()));
           }
       }
    }

    public static void bfs2(treeNode root){
        Queue <treeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            treeNode temp=queue.poll();
            System.out.println(temp.getValue());
            if(temp.getLEFT()!=null){
                queue.add(temp.getLEFT());
            }
            if(temp.getRIGHT()!=null){
                queue.add(temp.getRIGHT());
            }
        }
    }

    public static treeNode Merg(treeNode tree1, treeNode tree2){
        if(tree1==null){
            return tree2;
        }

        if(tree2==null){
            return tree1;
        }
      tree1.setValue(tree1.value+tree2.value);
  tree1.setLEFT(Merg(tree1.getLEFT(),tree2.getLEFT()));
     tree1.setRIGHT( Merg(tree1.getRIGHT(),tree2.getRIGHT()));
        return tree1;
    }


    public void preorder(treeNode t){

    }


    }

