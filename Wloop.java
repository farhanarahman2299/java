
package wloop;


public class Wloop {

    public static void main(String[] args) {
        int counter = 2;
             run: 
for (int leftNum = 2; leftNum < 6; leftNum++) {
    for (int rightNum = 2; rightNum < 8; rightNum++) {
        if (rightNum == 3) {
            counter++;
            continue run;
        }
  }
}
    }
}
    
    
