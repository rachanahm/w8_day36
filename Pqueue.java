import java.util.*;
class  Pqueue{
  public static void main(String args[]){
    PriorityQueue<Integer> ls=new PriorityQueue<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    for(Integer i:ls){
      System.out.println(i);
    }
  }
}