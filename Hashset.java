import java.util.*;
class  Hashset{
  public static void main(String args[]){
    HashSet<Integer> ls=new HashSet<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    ls.add(21);
    for(Integer i:ls){
      System.out.println(i);
    }
  }
}