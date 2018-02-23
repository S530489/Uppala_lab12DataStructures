package linkedlists;

import java.util.NoSuchElementException;


/**
 * @author Sai Kumar Uppala
 */
public class Uppala_ALinkedList<E>
{
   private Node<E> listStart;
   private int listLength;
   
    /**
	 * Constructor
	 * Creates an empty linked list with the head of the list
     * pointing to null.
	 * Initializes the length of the list to 0.
	 */
public Uppala_ALinkedList()
   {
       listStart=null;
       listLength=0;
       
   }
   
    /**
	 * Returns true if the list is empty; false otherwise.
	 * @return true if the list is empty; false otherwise.
	 */
   public boolean isEmpty()
   {
       if(listLength==0)
           return true;
       return false;
   }
    /**
	 * Adds an object to the beginning of the list.
	 * @param myObject The object to be added to the beginning
	 * of the list.
	 */
   public void addFirst(E myObject)
   {
       Node<E> l=new Node<E>(myObject);
      
       l.nextNode=listStart;
       listStart=l;
       listLength++;
       
    
   }
    /**
	 * Removes the first object from the list.
	 * @return the node that was removed from the list.
	 * @throws NoSuchElementException if the list is empty
	 */
   public Node<E> removeFirst() 
   {
	if(isEmpty())
            throw new NoSuchElementException()  ;
        
            Node<E> temp=listStart;
            listStart=listStart.nextNode;
            listLength--;
            return temp;
      
   }
    /**
	 * Returns the number of nodes in the list.
	 * @return the number of nodes in the list.
	 */
    
   public int size()
   {
      return listLength;
   }
    /**
	 * Returns a string representation of the linked list.
	 * The string representation consists of each node in the
	 * list, printed using the toString method of the Node
	 * class, with each node printed on a new line.
	 * @return a string representation of the linked list.
	 */
   @Override
   public String toString()
   {
      String s="";
      Node<E> temp=listStart;
      for(int i=listLength;i>0;i--){
          s+=temp.toString()+"\n";
          temp=temp.nextNode;
          
      }
       
       return s;
   }
}
