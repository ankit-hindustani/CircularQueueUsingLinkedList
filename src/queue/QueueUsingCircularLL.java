package queue;
import node.*;

//@author Ankit Singh
//topic= enqueue, dequeue, peek, size
//based on FIFO(first in first out)

public class QueueUsingCircularLL {
    Node front;
    Node rear;
    int size;

    public QueueUsingCircularLL(){
        front=null;
        rear=null;
        size=0;
    }

    //insert the value at the begining
    public void enqueue(int element){
        Node node=new Node(element);
        if(front==null){
            front=rear=node;
            node.setNext(front);
        }
        else{
            rear.setNext(node);
            node.setNext(front);
            rear=node;

        }
        size++;
    }


//remove the element from end
    public int dequeue(){
        int response=0;
        if(front != null) {
            if (size == 1) {
                front = rear = null;
            } else {
                response = front.getData();
                rear.setNext(front.getNext());
                front = front.getNext();

            }
        }
        size--;
        return response;
    }


//peek means view the data of front

    public int peek(){
        int response=0;
        if(front != null) {
            response= front.getData();
        }
        return response;
    }


    public void traverse() {
        Node temp = front;
        if (front == null) {
            System.out.println("queue is empty");
        } else {
            while (temp.getNext() != front) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println(temp.getData());
        }
    }

    public int getSize(){
        return  size;
    }


}
