import java.util.*;
class Employee{
  private int empid;
  private String empname;
  private double empsalary;
 Employee(int empid,String empname,double empsalary){
  setEmpid(empid);
  setEmpname(empname);
  setEmpsalary(empsalary);
}
void setEmpid(int empid){
  this.empid=empid;
}
void setEmpname(String empname){
  this.empname=empname;
}
void setEmpsalary(double empsalary){
  this.empsalary=empsalary;
}
int getEmpid(){
  return empid;
}
String getEmpname(){
  return empname;
}
double getEmpsalary(){
  return empsalary;
}
}
public class Employeedetails{
  public static void main(String args[]){
    ArrayList<Employee> employees=new ArrayList<Employee>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      employees.add(new Employee(sc.nextInt(),sc.next(),sc.nextDouble()));
    }
    for(Employee emp:employees){
      System.out.println(emp.getEmpid()+""+emp.getEmpname()+""+emp.getEmpsalary());
    }
  }
}