import java.util.Scanner; 
public class inheritence{ 
public static class Employee{ 
 String name; 
 int age; 
 int phonenumber; 
 String address; 
 int salary; 
public int printsalary(){ 
return this.salary; 
} 
} 
static class officer extends Employee{ 
String specialization; 
} 
static class manager extends Employee{ 
String department; 
} 
public static void main(String[]args){ 
Scanner input=new Scanner(System.in); 
officer off=new officer(); 
manager man=new manager(); 
System.out.println("enter officer name"); 
off.name=input.next();
System.out.println("enter address"); 
off.address=input.next(); 
System.out.println("enter phone"); 
off.phonenumber=input.nextInt(); 
System.out.println("enter age"); 
off.age=input.nextInt(); 
System.out.println("enter specialization"); 
off.specialization=input.next(); 
System.out.println("enter salary"); 
off.salary=input.nextInt(); 

System.out.println("******"); 
System.out.println("officer details"); 
System.out.println("officer name"+off.name); 
System.out.println("age:"+off.age); 
System.out.println("address:"+off.address); 
System.out.println("phonenumber:"+off.phonenumber); 
System.out.println("specialization:"+off.specialization); 
int salary=off.printsalary(); 
System.out.println("salary:"+salary); 

System.out.println("*******"); 
System.out.println("enter manager details"); 
System.out.println("\n"); 
System.out.println("enter manager name");
man.name=input.next(); 
System.out.println("enter address"); 
man.address=input.next(); 
System.out.println("enter phonenumber"); 
man.phonenumber=input.nextInt(); 
System.out.println("enter age"); 
man.age=input.nextInt(); 
System.out.println("enter department"); 
man.department=input.next(); 
System.out.println("enter salary"); 
man.salary=input.nextInt(); 

System.out.println("*******"); 
System.out.println("manager detail"); 
System.out.println("officer name:"+ man.name); 
System.out.println("age:"+ man.age); 
System.out.println("address:"+ man.address); 
System.out.println("specialization:"+ man.department); 
System.out.println("phone"+ man.phonenumber); 
int salaryman=man.printsalary(); 
System.out.println("salary:"+ salaryman); 
input.close(); 
} 
}