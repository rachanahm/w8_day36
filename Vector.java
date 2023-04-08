import java.util.*;
class Vector {
  public static void main(String args[]){
    Vector<Integer> ls=new Vector<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    for(Integer i:ls){
      System.out.println(i);
    }
  }
}