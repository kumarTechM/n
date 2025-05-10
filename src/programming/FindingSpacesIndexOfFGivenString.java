// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
 
   
 
    public static void main(String[] args) 
    {
      String s="abhishek modi shinde ";
      char ch[]=s.toCharArray();
      int spaceindex=-1;
      for(int i=0;i<ch.length;i++)
      {
          if(ch[i]==' ')
          {
             System.out.println(i);
          }
      }

  }
}
