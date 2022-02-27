import java.util.*;
class Student
{
 int rno,age;
 String name,phno;
 float cgpa;
 void read(Student s)
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter roll no : ");
  this.rno=o.nextInt();
  System.out.println("Enter Name : ");
  this.name=o.next();
  System.out.println("Enter Phone no : ");
  this.phno=o.next();
  System.out.println("Enter age : ");
  this.age=o.nextInt();
  System.out.println("Enter CGPA : ");
  this.cgpa=o.nextFloat();
  o.close();
 }
 Student()
 {
  read(this);
 }
}
// Main Class
class Assign1
{
 public static void main(String args[])
 {
  float r=0;
  int l=0,n=0,a=0,o=50;
  Student s[]=new Student[10];
  for(int i=0;i<10;i++)
  {
   s[i]=new Student();
  }
  System.out.println("Data are:- ");
  for(int i=0;i<10;i++)
  {
   if(s[i].cgpa>r)
   {
    r=s[i].cgpa;
    l=i;
   }
   if((s[i].name.compareTo("Anu"))==0)
    n=i;
   if(s[i].age<o)
   {
    o=s[i].age;
    a=i;
   }
  }
  System.out.println("Name of the student with highest CGPA : "+s[l].name);
  System.out.println("Phone no. of Anu : "+s[n].phno);
  System.out.println("Roll no. of youngest student : "+s[a].rno);
 }
}