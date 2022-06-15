package test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class InvalidInputException extends Exception {

	private static final long serialVersionUID = 1L;
	public InvalidInputException(String msg) {
		super(msg);
	}
    
}

class Employee {
   
   private int id = 0;
   private String name = null;
   private boolean male = true;
    
    Employee(int id, String name,  boolean male) {
       super();
       this.id = id;
       this.name = name;
       this.male = male;
   }
     
   @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ",  male=" + male + "]";
    }   
    
    @Override
    public int hashCode() {
        // Complete all relevent code
        return id;
    }
       
   
}

public class test1 {
    
    /*
    * Validate the input and create Employee object
    * If any of the given input is not valid throw InvalidInputException();
    */
    public Employee createEmployee(String record) throws InvalidInputException{
        
        //Complete the code   
    	String[] datas = record.split(",");
    	if(datas.length == 3) {
    		int  id= Integer.valueOf(datas[0]);
			String name = datas[1];
			boolean male = Boolean.valueOf(datas[2]);
			return new Employee(id,name,male);
			
		}else {
			throw new InvalidInputException("Inputs Exception");
		}
                
    }
    
    public static void main(String[] str) {
        
        //Input is expected as comma separated values for Employee object like id(int), name (String),isMale(boolean)"
        // 1,John,true
        Scanner scan = new Scanner(System.in);
        
        HashSet<Employee> employeeSet = new HashSet<>();
        
        /*Process each line and create Employee object using the "createEmployee" method add in employeeSet*/
        while (true) {
            try {
                String record = scan.nextLine();
                if(record.isEmpty()){
                break;    
                }
                employeeSet.add(new test1().createEmployee(record));         
            }catch(Exception e) {
                System.out.println(e.getClass().getName());
                System.exit(0);
            }
        }
        
        //Don't delete or modify this print statement
        System.out.println("Employees info : "+ employeeSet);
   
    }

}