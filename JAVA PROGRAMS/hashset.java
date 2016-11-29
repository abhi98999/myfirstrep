import java.util.*;
class hashset
{
public static void main(String agrs[])
{
HashSet<String> hs=new HashSet<String>();
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