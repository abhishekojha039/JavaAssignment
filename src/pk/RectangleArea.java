package pk;
import java.util.*;
class Rectangle {
    static int height,width;
    void display(){
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
    }
}

class RectangleArea extends Rectangle{
    void read_input(){
        Scanner sc = new Scanner(System.in);
        Rectangle.height=sc.nextInt();
        Rectangle.width=sc.nextInt();
    }
    @Override
    void display(){
        System.out.println("Area of rectangle is: "+(Rectangle.height*Rectangle.width));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        RectangleArea r2 = new RectangleArea();
        r2.read_input();
        r1.display();
        r2.display();
    }
}
