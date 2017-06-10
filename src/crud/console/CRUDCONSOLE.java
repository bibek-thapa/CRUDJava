package crud.console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUDCONSOLE {

    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       EmployeeInterface empintrf = new EmployeeImpl();

      do{
          System.out.println("----------------------------------------------");
        System.out.println("1. Add the item");
         System.out.println("2. Remove the item");
          System.out.println("3. List the items");
           System.out.println("4. Remove All item");
       System.out.println("----------------------------------------------");

        System.out.println("Choose the items");
        int option = scanner.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("Add the item");
                 empintrf.add();
                 break;
            case 2:
                System.out.println("Remove the item");
                empintrf.remove();
                break;
            case 3:
                System.out.println("List all the item");
                empintrf.getAll();
                
                break;
            case 4:
                System.out.println("Remove All item");
                empintrf.removeAll();
                break;
            default:  System.out.println("Invalid option");  
                break;
        
        }
          System.out.println("");

          System.out.println("Enter Y to continue");
      }while(scanner.next().equalsIgnoreCase("Y"));  
       
    }
    
}
