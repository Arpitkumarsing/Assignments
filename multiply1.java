/*class MathOperation
{
   int sum=0;
  void f(int x,int y)
  {
    int z = x*y;
    System.out.println(z);
  }
  void f(float a,float b)
  {
     float z = a*b;
     System.out.println(z);
  }
  void f(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
        sum =sum+ arr[i];
       
    }
     System.out.println(sum);
  }
}

class multiply1
{
  public static void main(String[]args)
  {
    int x = 5;
    int y =10;
    float a =10.0f;
    float b=20.0f;
     int arr[]={5,6,7,8};
     MathOperation sc = new MathOperation();
        sc.f(x,y);
        sc.f(a,b);
        sc.f(arr);
  }
} */

import java.util.Scanner;
class Student
{
  int rollno;
   String name;
   void setData(String name , int rollno)
   {
     this.name = name;
     this.rollno = rollno;
   }

   void showData()
   {
     System.out.println("rollno:"+ rollno);
     System.out.println("name:"+name);
   }
 }

class multiply1
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Student st[] = new Student[2];
    Student st1 = null;
    String name = null;
    int rollno = 0;
    for(int i=0;i<st.length;i++)
    {
         name = sc.next();
        rollno = sc.nextInt();
	

        st1 =new Student();
         
        st1.setData(name,rollno);
        st[i]=st1;
        System.out.println(st1.name+ " " + st1.rollno+" "+st.length);
//System.out.println("inside " + i);
    }
    for(int i=0;i<st.length;i++)
    {
      st[i].showData();
    }
 }
}
   