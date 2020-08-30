package thebagadt;

public class Node<AnyType> 
{
    private AnyType data;
    private Node<AnyType> next;
    
    public AnyType getData() 
    {
        return data; 
    }
    
    public Node<AnyType> getNext() 
    { 
        return next;
    }
  
    public void setData(AnyType newData) 
    { 
        data = newData; 
    }
    
    public void setNext(Node<AnyType> newNext) 
    {
        next = newNext; 
    }   
}