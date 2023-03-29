package PracticalTask._11.Task2;

import PracticalTask._11.Task2.Enums.Color;
import PracticalTask._11.Task2.Enums.Type;
import PracticalTask._11.Task2.Exceptions.ColorException;
import PracticalTask._11.Task2.Exceptions.TypeException;

public class Plant {
   private Type type;
   private Color color;
   private int size;

   public Plant(String type, String color, int size) throws ColorException, TypeException {
      Color c = colorStrToEnum(color);
      Type t = typeStrToEnum(type);
      this.size = size;
      this.type = t;
      this.color = c;
   }

   private Color colorStrToEnum(String color) throws ColorException {
      switch (color.toLowerCase()) {
         case "blue":
            return Color.BLUE;
         case "red":
            return Color.RED;
         case "white":
            return Color.WHITE;
         default:
            throw new ColorException("Input only color blue, red or white");
      }
   }

   private Type typeStrToEnum(String type) throws TypeException {
      switch (type.toLowerCase()) {
         case "blue":
            return Type.Blue;
         case "red":
            return Type.Red;
         case "white":
            return Type.White;
         default:
            throw new TypeException("Input only color blue, red or white");
      }
   }

   @Override
   public String toString() {
      return null;
   }
}