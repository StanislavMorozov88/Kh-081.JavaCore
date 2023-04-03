package com.softserve.edu12;

import com.softserve.edu12.MyException;
//
public class ExampleException {
   static void doSomthing(int n) throws MyException {
      if (n > 0) {
        int a = 100 / n;
      } else { // Create and call exception
        throw new MyException("input value is below zero!");
      }
   }
   public static void main(String[ ] args) {
      try {
         doSomthing(-1);    	// try / catch block is required
      } catch (MyException e) {
         System.err.print(e.getMessage());
      }
  }
}
