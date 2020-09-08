import java.util.*;
public class Employee
{
public String name;
public int age;
public long phone_number;
public String address;
public int salary;
public String designation;

public void printSalary()
{
if(designation.equals("Manager")==true)
{
salary = salary + (int)((15*salary)/100);
System.out.println("Your hiked salary is " + salary);
}
else if(designation.equals("Normal Employee")==true)
{
salary = salary + (int)((10*salary)/100);
System.out.println("Your hiked salary is " + salary);
}
else
{
System.out.println("Invalid designation");
}
}

public void function()
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter name: ");
name = scan.nextLine();
System.out.print("Enter your age: ");
age = scan.nextInt();
System.out.print("Enter your phone number: ");
phone_number = scan.nextLong();
System.out.print("Enter your address: ");
address = " ";
address = scan.nextLine();
address += scan.nextLine();
System.out.print("Enter your salary: ");
salary = scan.nextInt();
System.out.print("Enter your designation(Manager or Normal Employee): ");
designation = " ";
designation = scan.nextLine();
designation += scan.nextLine();
printSalary();
System.out.println("Name : " + name);
System.out.println("Age : " + age);
System.out.println("Phone Number : " + phone_number);
System.out.println("Address : " + address);
System.out.println("Salary : " + salary);
System.out.println("Designation : "+designation);
}

public static void main(String[] args)
{
Employee employee = new Employee();
employee.function();
}
}