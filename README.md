# the-bag-adt

## CSE 2105 – Data Structures

### 2019–2020 Fall Semester Project  

Write an implementation for abstract data type “Bag” as a Java class, which is likea Set, but it  may  contain  several  instances  of  the  same  member.  For  example,  {'to',  'be',  'or',  'not',  'to', 'be'} is a bag of words, which is equal to {'be', 'be', 'not', 'or', 'to', 'to'} (since order of members is  insignificant),  but  is unequal to  {'be',  'not',  'or',  'to'}  (since the  number  of  instances  is significant).  Adding  a  member  increases the  number of instances  in  the  bag  by  one  and removing  a  member  decreases the  number  of  instances  in  the  bag  by  one. The  member  is deleted from the bag when it has no instances.

Think that “how would you represent a bag without actually storing multiple instances of the same member?” Your implementations should be efficientas possible.

Don’t forget that you cannot use any pre-written Java API Class! You should write your own code for data structures. You  are  allowed to  use  lab  source  codes  that  we  examined  so  far, however it is preferableto write your own codes for yourdata structure.

our  implementation  must  be generic,  i.e.  your  bag  can  accept  any  type  of instances.  (Use Java Generics!)

Your ADT should provide at least these operations (you can add other “public” or “private” methods you want):

- **add(AnyTypeitem):** Inserts item in the bag.
- **clear():** Removes all of the elements from this bag.
- **contains(AnyTypeitem):** Returns true if this bag contains the specified element and false otherwise.- 
- **distictSize():** Returns the distinct number of elements in this bag. (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} distinctsize is 4)
- **equals(Object obj):** Indicates whether some bag object is "equal to" this one. (Returns “true” or “false”)
- **elementSize(AnyTypeitem):** Returns the number of this item in this bag. (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} elementsize(‘be’) is 2)
- **isEmpty():** Returns true if this collection contains no elements.
- **remove(AnyTypeitem):** Removes a single instance of item from this bag and returns true if it is present; otherwise returns false.
- **size():** Returns the total number of elements in this  bag.(For example, for the bag{'to', 'be', 'or', 'not', 'to', 'be'} size is 6)
- **toString():** Returns a string that displays the elements in the bag. (The style to be used is up to your preference.)

Please also write a Test program (a separate Java class) proves that your container(bag) works properly.