import java.util.*;  
public class hashset{  
public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("yash");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay"); 
set.add("madhu");
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  

