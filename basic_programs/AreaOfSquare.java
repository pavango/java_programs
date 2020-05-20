import java.util.*;
import java.lang.Math;

class AreaOfSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double area, side ;
        System.out.print("Enter The Value Of Side:");
        side = sc.nextDouble();
        area = Math.pow(side, 2);
        System.out.println("The Area Of Square Is:" +area);
    }
}
