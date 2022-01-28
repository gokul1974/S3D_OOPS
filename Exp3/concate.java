class concate
{ 
  public static void main(String args[])
   {
   concate Obj=new concate();
   Obj.consum(8,5);
   Obj.consum("Gokul"+" "+"Krishna");
   }
  void consum(int a,int b)
  {
   System.out.println("Concated Number:" +a+b);
  }
  void consum(String c)
   {
    System.out.println("Concated String=" +c);
   }
}
