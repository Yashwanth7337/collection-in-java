import java.util.*;  
public class linkedhashset{  
public static void main(String args[]){  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");
set.add("yashu");
set.add("mashu");

 
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  