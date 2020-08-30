package thebagadt;
/**
 *
 * @author Can Gür
 */
public class TestTheBagADT {
    
    public static void main(String[] args){
        //Creating first Bag
        TheBagADT bag = new TheBagADT();
        //Creating second Bag
        TheBagADT bag2 = new TheBagADT();
        
        //Adding items to bag
        bag.add(23);
        bag.add("To");
        bag.add(81);
        bag.add("Be");  
        bag.add("Or");
        bag.add("Not");
        bag.add("To");
        bag.add("Be");
        
        //Adding items to second bag
        bag2.add("Be");
        bag2.add("To");  
        bag2.add("Be");
        bag2.add(81);
        bag2.add("To");
        bag2.add("Not");
        bag2.add("Or");  
        bag2.add(23);        

        //Checking first bag and second bag are equals
        System.out.println("#Checking first bag and second bag are equals#\n");
        System.out.println("Is First Bag and Second Bag Are Equals: "+bag2.equals(bag));
        System.out.println("---------------------------");
        
        //toString bags
        System.out.println("#toString bags#\n");
        System.out.println("First Bag: "+bag.toString());
        System.out.println("Second Bag: "+bag2.toString());
        System.out.println("---------------------------");
        
        //Sizes of bags
        System.out.println("#Sizes of bags#\n");
        System.out.println("First Bag Size: "+bag.size());
        System.out.println("Second Bag Size: "+bag2.size());
        System.out.println("---------------------------");
        
        //Distict sizes of bags
        System.out.println("#Distict sizes of bags#\n");
        System.out.println("First Bag Distict Size: "+bag.distictSize());
        System.out.println("Second Bag Distict Size: "+bag2.distictSize());
        System.out.println("---------------------------");
        
        //Contains
        System.out.println("#Contains#\n");
        System.out.println("Is First Bag Contains 'To': "+bag.contains("To"));
        System.out.println("Is First Bag Contains 'Do': "+bag.contains("Do"));
        System.out.println("---------------------------");
        
        //Element sizes
        System.out.println("#Element sizes#\n");
        System.out.println("How many 'Be' in the first bag: "+bag.elementSize("Be"));
        System.out.println("How many 'Not' in the second bag: "+bag2.elementSize("Not"));        
        System.out.println("---------------------------");
        
        //Remove elements
        System.out.println("#Remove elements#\n");
        System.out.println("Removing 'Not' From the Second bag: "+bag2.remove("Not"));
        System.out.println("New bag: "+bag2.toString());
        System.out.println("New bag size: "+bag2.size());
        System.out.println("---------------------------");
        
        //Remove all bag elements
        System.out.println("#Remove all items in second bag#\n");
        bag2.clear();
        System.out.println("New bag: "+bag2.toString());
        System.out.println("New bag size: "+bag2.size());
        System.out.println("First Bag Size: "+bag.size());
        System.out.println("---------------------------");
        
        //Is bags are empty
        System.out.println("#Is bags are empty#\n");
        System.out.println("Is first bag empty: "+bag.isEmpty());
        System.out.println("Is second bag empty: "+bag2.isEmpty());
        System.out.println("---------------------------");
        
        //Creating third bag
        TheBagADT bag3 = new TheBagADT();
        bag3.add("Be");
        bag3.add(6);
        bag3.add("Computer");
        
        //toString and size third bag
        System.out.println("#Third bag toSting and size#\n");
        System.out.println("Third bag: "+bag3.toString());
        System.out.println("Third Bag Size: "+bag3.size());
        
        //Checking first bag and third bag are equals
        System.out.println("Is First Bag and Third Bag Are Equals: "+ bag3.equals(bag));   
        System.out.println("---------------------------");
    }
    
}
