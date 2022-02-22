import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    String fullname;
    long salary;
    String city;

    Employee(String fullname,long salary,String city){
         this.fullname=fullname;
         this.salary=salary;
         this.city=city;
    }

    public long getSalary(){
        return salary;
    }
    public String getFullname(){
        return fullname;
    }

    public String getCity(){
        return city;
    }

}


 class Q4{
     public static void main(String[] args) {
         Employee emp=new Employee("Ayeza Ahmad Khan", 700, "Delhi");
         Employee emp1=new Employee("Hiba Qadri Bukhari", 30000, "mumbai");
         Employee emp2=new Employee("Danish Ahmad Taimoor", 800, "Delhi");
         Employee emp3=new Employee("Ayeza Noor Taimoor", 7000, "Bangalore");
         Employee emp4=new Employee("Ayeza Shah Khatoon", 79000, "kolkata");
         Employee emp5=new Employee("Sheheryar Alam Munawar", 90000, "Chennai");

         List<Employee> e=new ArrayList<Employee>();
         e.add(emp);
         e.add(emp1);
         e.add(emp2);
         e.add(emp3);
         e.add(emp4);
         e.add(emp5);

         System.out.println(e.stream()
                 .filter(salary -> salary.getSalary()<5000)
                 .filter(city->city.getCity().equals("Delhi"))
                 .map(name->name.getFullname().split(" ")[0]).collect(Collectors.toList()));


     }
}
