
import java.util.*;

public class linkedlist {
    
 
 static public void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay"); 
al.add(0,"yash");
al.remove(0);
//Collection.sort(al);
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
LinkedList<Integer> a2=new LinkedList<Integer>();  
a2.add(10);  
a2.add(1);  
a2.add(15);  
a2.add(3);  
Iterator<Integer> itr1=a2.iterator();  
while(itr1.hasNext()){  
System.out.println(itr1.next());  
}  

}  
}  
    

