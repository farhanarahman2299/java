
package string;


public class Inharitans {

  
    public static void main(String[] args) {
        B c =new B(3,4);
        System.out.println( c.something());
//       Nesting n=new Nesting(5,10);
//       n.display();
//        String s ="Hello word";
//        String t = s.toUpperCase();
//        System.out.println(t);
//         String u= s.toLowerCase();
//          System.out.println(u);
//           System.out.println(s.length());
//            System.out.println(s+t+u);
  }
}
    class A {
         int a;
        A(int x){ //construstor
          a=x;  
        }//method
      public  int nothing(){//method
            return a*a;
        }
    }
     class B extends A{//subclass A ae b
        int b;
        B(int x, int y){
            super(x);
            b=y;
        }
        public int something(){
            return a*b;
        }
    }
            
            
            
