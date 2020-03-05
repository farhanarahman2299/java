package lab3.pkg3;



public class Lab33 {

    public static void main(String[] args) {
        int sum =0;
        int arr[];
        arr = new int[4];
        arr[0] = 95;
        arr[1] = 127;
        arr[2] = 2;
        arr[3] = 1885;
        for (int i = 0; i < 4; i++) {
            System.out.println("Index["+i+"]= "+arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("Array sum: "+sum);
        
    }
}
