class Person  
{  
    String name,address;   
    int age;  
    public Person(int age, String name, String address)  
    {  
        this.age = age;  
        this.name = name;  
        this.address = address;  
    }  
}  
class Employee extends Person   
{  
    float salary;  
    public Employee(int age, String name, String address, float salary)  
    {  
        super(age,name,address);  
        this.salary = salary;  
    }  
}  
public class Test   
{  
    public static void main (String args[])  
    {  
        Employee e = new Employee(22, "yash", "Bangalore", 90000);  
        Employee e1 = new Employee(22, "yash", "Bangalore", 90000);  

        System.out.println("Name: "+e.name+" Salary: "+e.salary+" Age: "+e.age+" Address: "+e.address); 
         System.out.println("Name: "+e1.name+" Salary: "+e1.salary+" Age: "+e1.age+" Address: "+e1.address);  
    }  
}  
