import java.util.*;
class Linkedhset{
  public static void main(String args[]){
    TreeSet<Integer> ls=new TreeSet<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    for(Integer i:ls){
      System.out.println(i);
    }
  }
}