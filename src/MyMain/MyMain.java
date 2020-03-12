package MyMain;
import queue.*;

public class MyMain {
    public static void main(String[] args) {
        QueueUsingCircularLL obj=new QueueUsingCircularLL();

        obj.enqueue(1);
//        obj.enqueue(3);
//        obj.enqueue(5);
//        obj.enqueue(24);
//        obj.enqueue(8);

        obj.traverse();
        System.out.println("dequeued element= "+obj.dequeue());
        obj.traverse();
        System.out.println("size= "+obj.getSize());
        System.out.println("peek= " +obj.peek());
    }
}
