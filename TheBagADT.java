package thebagadt;
/**
 *
 * @author Can Gür
 * @param <AnyType>
 */ 
public class TheBagADT<AnyType>{
    
    private Node<AnyType> head;
    private Node<AnyType> tail;
    private int size;
        
    public void add(AnyType item){
        
        Node<AnyType> newNode = new Node<>();
        
        newNode.setData(item);   
        
        if (size == 0)           
          head = newNode;            
        else                         
          tail.setNext(newNode);     
        
        tail = newNode;              
        
        size++;        
    }
    public void clear(){
        Node<AnyType> temp = head;
        
        while(size!=0){
            head = head.getNext();
            temp.setNext(null);
            size--;
        }
    }
    public boolean contains(AnyType item){
        Node<AnyType> current = head;

        while(current != null){
            if(current.getData() == item){
                return true;
            }
            current = current.getNext();          
        }
        return false;        
    }
    public int distictSize(){
        Node<AnyType> begin = head;
        int distictSize = size;

        for(int i = 0; i < size; i++){
            Node<AnyType> current = begin.getNext();

            while(current != null){
                if(current.getData()==begin.getData()){
                    distictSize--;
                    break;
                }           
            current = current.getNext();
        }
            begin = begin.getNext();
        }
        return distictSize;
    }
    public boolean equals(TheBagADT obj){
        Node<AnyType> current = head;

        while(current.getNext() != null){
            if(this.elementSize(current.getData()) != obj.elementSize(current.getData())){
                return false;
            }
            current = current.getNext();
        }
        return true;
    }
    public int elementSize(AnyType item){
        Node<AnyType> current = head;
        int elementSize = 0;

        while(current != null){
            if(current.getData() == item){
                elementSize++;
            }
            current = current.getNext();          
        }
        return elementSize;
    }
    public boolean isEmpty(){
        return size == 0;        
    }   
    public boolean remove(AnyType item){
        if(!contains(item)){
            return false;
        }
        else{
            Node<AnyType> current = head;
            Node<AnyType> temp = head.getNext();
            
            while(temp.getData() != item){
                current = current.getNext();
                temp = temp.getNext();
            }
                current.setNext(temp.getNext());
                temp.setNext(null);                   
                size--;
            
            return true;
        }
    }
    public int size(){
        return size;        
    }
    @Override
    public String toString() 
    {
        String rStr = "[";
        
        Node<AnyType> temp = head;
            for (int i = 0; i < size; i++)
            {
                if(i==0)                                  
                    rStr = rStr + temp.getData();         
                else                                      
                    rStr = rStr + "," + temp.getData();   
                
                temp = temp.getNext();                    
            }
            rStr = rStr + "]";
            
            return rStr;
    }
}
