import java.util.*;

/*
  Java program to calculate the area of rectangle.
  Area of Rectangle = Hight * Width;
  For this example, consider 10 as height and 5 as width.
*/
class AreaOfRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter the value of Hight:");
        int height = sc.nextInt();
        System.out.print("Enter the value of Width:");
        int width = sc.nextInt();
        int area = height * width;
        System.out.println("Area Of Rectangle= " + area);
    }
}
