import java.util.*;


class student
{
int rollno;
String name;
int age;
student(int rollno,String name,int age)
{
this.rollno=rollno;
this.name=name;
this.age=age;
}

}

class arraylist{

public static void main(String agrs[])
{
student s1= new student(1,"ravi",21);
student s2= new student(2,"abhi",21);
student s3= new student(3,"ravi",21);

ArrayList<student> al=new ArrayList<student>();
al.add(s1);
al.add(s2);
al.add(s3);

Iterator itr=al.iterator(); //get to knw the iterator command fir this
while(itr.hasNext())
{	
student st=(student)itr.next();

System.out.println(st.rollno+" "+st.name+" "+st.age);

}

}
}