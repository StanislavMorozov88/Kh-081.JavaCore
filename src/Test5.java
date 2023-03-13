public class Test5 {
  void method(){
      System.out.println("Class 1");
  }
  class Class2 extends Test5{
      @Override
      void method() {
          super.method();
          System.out.println("Class 2");
      }
  }
  class Class3 extends Class2{
      @Override
      void method() {
          super.method();
          System.out.println("Class 3");
      }
  }
}

