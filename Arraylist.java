import java.util.*;  
class Arraylist{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay"); 
list.remove(0) ;
list.add(0,"yash");

ArrayList<Integer> list1=new ArrayList<Integer>();//Creating arraylist  
list1.add(20);//Adding object in arraylist  
list1.add(1);  
list1.add(3);  
list1.add(0); 
Collections.sort(list1); 
System.out.println(list1);
Collections.sort(list); 
System.out.println(list);


//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next()); 



}
Iterator itr1=list1.iterator();  
while(itr1.hasNext()){  
System.out.println(itr1.next());

}

}  
}  