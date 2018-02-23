/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

/**
 *
 * @author Sai Kumar Uppala
 * @param <E>
 */
public class CircularQueue<E> {
    private E[] circularQueueAr;
    private int maxSize;   //Maximum Size of Circular Queue
   
    private int rear;//elements will be added/queued at rear.
    private int front;   //elements will be removed/dequeued from front      
    private int number; //number of elements currently in Priority Queue
    
     /**
      * Constructor
     * @param maxSize
      */
    public CircularQueue(int maxSize){
        this.maxSize = maxSize;
        circularQueueAr =(E[]) new Object[this.maxSize];
        number=0; //Initially number of elements in Circular Queue are 0.
        front=0;  
        rear=0;    
    }
 
 
 
    /**
     * Adds element in Circular Queue(at rear)
     * @param item
     * @throws circularqueue.QueueFullException
     */
    public void insert(E item) throws QueueFullException {
        if(isFull()){
         throw new QueueFullException("Circular Queue is full");
        }else{
         circularQueueAr[rear] = item;
         rear = (rear + 1) % circularQueueAr.length;    
         number++; // increase number of elements in Circular queue
        }
    }
 
 
    /**
     * Removes element from Circular Queue(from front)
     * @return 
     * @throws circularqueue.QueueEmptyException 
     */
    public E remove() throws QueueEmptyException {
        E deQueuedElement;
        if(isEmpty()){
         throw new QueueEmptyException("Circular Queue is empty");
        }else{
           deQueuedElement = circularQueueAr[front];
         circularQueueAr[front] = null;
         front = (front + 1) % circularQueueAr.length;
            number--; // Reduce number of elements from Circular queue
        }
       return deQueuedElement;
    }
    
    /**
     *
     * @return
     * @throws QueueEmptyException
     */
    public E retrieve() throws QueueEmptyException {
        E deQueuedElement;
        if(isEmpty()){
         throw new QueueEmptyException("Circular Queue is empty");
        }
       return circularQueueAr[front];
    }
 
    /**
     * Return true if Circular Queue is full.
     * @return 
     */
    public boolean isFull() {     
        return (number==circularQueueAr.length);    
    }
 
 
    /**
     * Return true if Circular Queue is empty.
     * @return 
     */
    public boolean isEmpty() {
        return (number==0);
    }
    
    /**
     *
     * @return size of the circular queue
     */
    public int length()
    {
        return number;
    }

    /**
     * prints all the elements
     */
    public void print() {

         
         if(front==rear)
         {
             return;
         }
         E[] temp=circularQueueAr;
         System.out.println(temp[front]);
         E deQueuedElement;
         deQueuedElement = temp[front];
         temp[front] = null;
         front = (front + 1) % circularQueueAr.length;
         print();
         }
        
    }
    
    

