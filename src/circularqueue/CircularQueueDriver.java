/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

/**
 *
 * @author Sai Kumar Uppala
 */
public class CircularQueueDriver {

    /**
     * @param args the command line arguments
     * @throws circularqueue.QueueFullException
     * @throws circularqueue.QueueEmptyException
     */
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        // TODO code application logic here
        CircularQueue<Integer> circularQueue = new CircularQueue<Integer>(50); //Initial size of CircularQueueArray
      
        circularQueue.insert(20);
        circularQueue.insert(23);
        circularQueue.insert(22);
        circularQueue.insert(1);
        circularQueue.insert(3);
        circularQueue.insert(4);
        circularQueue.insert(6);
        circularQueue.insert(8);
        circularQueue.insert(5);
        circularQueue.insert(15);
        circularQueue.insert(14);
        circularQueue.insert(9);
        circularQueue.insert(12);
        circularQueue.insert(87);
        circularQueue.insert(13);
        circularQueue.insert(34);
        circularQueue.insert(83);
        circularQueue.insert(17);
        circularQueue.insert(18);
        circularQueue.insert(19);
        System.out.println("*******************************************");
        System.out.println("Circular Queue");
        System.out.println("*******************************************");
        System.out.println("Length of the circular queue is:\n" +
"The length of the queue is "+circularQueue.length());
        System.out.println("Queue Elements:\n");
        circularQueue.print(); 
        circularQueue.remove();
        System.out.println("\nRemoving element from circular queue");
        System.out.println("Length of queue after removal");
        System.out.println("The length of the queue is "+circularQueue.length());
        System.out.println("Element removed");
       
    }
    
}
