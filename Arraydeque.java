import java.util.*;
class  Arraydeque{
  public static void main(String args[]){
    ArrayDeque<Integer> ls=new ArrayDeque<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    for(Integer i:ls){
      System.out.println(i);
    }
  }
}