import java.util.*;
class treeset
{
public static void main(String agrs[])
{
TreeSet<String> hs=new TreeSet<String>();
hs.add("ravi");
hs.add("abhi");
hs.add("abhi");
Iterator itr=hs.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}