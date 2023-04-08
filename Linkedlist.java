import java.util.*;
class Linkedlist{
  public static void main(String args[]){
    LinkedList<Integer> ls=new LinkedList<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    for(Integer i:ls){
      System.out.println(i);
    }
  }
}