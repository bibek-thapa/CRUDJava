
package crud.console;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class EmployeeImpl implements EmployeeInterface{
        
    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
     Employee t = new Employee();

    @Override
    public Employee add() {
       
        System.out.println("Enter the firstName");
        String firstName = scanner.next();
        t.setFirstName(firstName);
        System.out.println("Enter the lastName");
        String lastName = scanner.next();
        t.setLastName(lastName);
        System.out.println("Enter the phoneNumber");
        Long phoneNumber = scanner.nextLong();
        t.setPhoneNumber(phoneNumber);
        System.out.println(t.toString());
        employeeList.add(t);
        System.out.println(employeeList);
        
        return t;   
    }

    @Override
    public void remove() {

        ListIterator<Employee> listitr = employeeList.listIterator();
       
       
        
        while(listitr.hasNext())
        {
            t = listitr.next();
            int index = listitr.nextIndex();
            if(t.getFirstName().equalsIgnoreCase(scanner.next()))
            {
                
                employeeList.remove(0);
                
            
            }
            
        
        }
        
            

    }

    @Override
    public List<Employee> getAll() {
        ListIterator<Employee> listitr = employeeList.listIterator();

        if(employeeList.isEmpty())
        {
             System.out.println("------------------Sorry there are no any records-------------------");
             System.out.println("");
        
        }
        else{
        
        while(listitr.hasNext())
        {   
            
             System.out.println("---------------------Start of Loop");

            System.out.println("Employee "+ (listitr.nextIndex()+1));
            Employee emp = listitr.next();
            System.out.println("FirstName : "+emp.getFirstName());
                        System.out.println("LastName : "+emp.getLastName());
            System.out.println("Phone : "+emp.getPhoneNumber());
            System.out.println(emp.getClass());

            System.out.println("---------------------End of Loop");

        }
        }
//       for(Employee e : employeeList)
//       {
//           System.out.println(employeeList.);
//           System.out.println("---------------------Start of Loop");
//            System.out.println("FirstName: "+e.getFirstName());
//          System.out.println("LastName: "+e.getLastName());
//           System.out.println("Phone Number: "+e.getPhoneNumber());
//           
//            System.out.println("---------------------End of Loop");
//       
//       }
        return employeeList;

    }

    @Override
    public void removeAll() {
        if(!employeeList.isEmpty()){
        employeeList.clear();
        System.out.println("");
        System.out.println("------------------Succesfully deleted all------------");
        }
        else
        {
            System.out.println("---------------No elements to remove----------");
        
        }
    }
    
}
