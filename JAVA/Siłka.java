
  public class Siłka{
      public static int kcal=2600;
      public static int b=100;
      public static int w=350;
      public static int t=85;
      

      
      public static void rozkład(int x){
          System.out.println(x*0.25+", "+x*0.1+", "+x*0.35+", "+x*0.1+", "+x*0.2);
        }
        
        public static void main(String[] args){
            System.out.println("sniadani, 2sniadanie, obad, kolacja, 2kolacaja");
            rozkład(kcal);
            rozkład(b);
            rozkład(w);
            rozkład(t);
        }
    }
      