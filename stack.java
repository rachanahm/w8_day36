import java.util.*;
class stack {
  public static void main(String args[]){
    Stack<Integer> ls=new Stack<Integer>();
    ls.push(12);
    ls.push(45);
    ls.push(34);
    ls.push(21);
    for(Integer i:ls){
      System.out.println(i);
    }
  }
}