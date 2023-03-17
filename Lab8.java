import java.io.*;
import java.util.*;
interface frame 
  {
    public void medium(); 
    public void type();
  }
  
  class Print implements frame
  {
    
    public void medium() {
     
      System.out.println("Oil medium");
    }
    public void type() {
     
      System.out.println("Landscape");
    }
  }
  
  class Lab8 {
    public static void main(String[] args) 
    {
      Print myPrint = new Print();  
      myPrint.medium();
      myPrint.type();
    }
  }