import java.util.ArrayList;
import java.util.List;

public class Employee {
    String fullname;
    long salary;
    String city;

    Employee(String fullname,long salary,String city){
         this.fullname=fullname;
         this.salary=salary;
         this.city=city;
    }


}


 class Q4{
     public static void main(String[] args) {
        Employee emp=new Employee("Ayeza Khan", 70000, "Delhi");
         Employee emp1=new Employee("Hiba Bukhari", 30000, "mumbai");
         Employee emp2=new Employee("Danish Taimoor", 710000, "Delhi");
         Employee emp3=new Employee("Ayeza Taimoor", 7000, "Bangalore");
         Employee emp4=new Employee("Ayeza Khatoon", 79000, "kolkata");
         Employee emp5=new Employee("Sheheryar Munawar", 90000, "Chennai");

         List<Employee> e=new ArrayList<>();
         e.add(emp);
         e.add(emp1);
         e.add(emp2);
         e.add(emp3);
         e.add(emp4);
         e.add(emp5);
         
     }
}
