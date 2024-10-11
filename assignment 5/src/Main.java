import java.util.*;

class Shape {

    int radius;
    int length;
    int width;
    int base;
    int sides;



    float Apothem(int length,int sides){
        double radians = Math.toRadians(180/sides);
        return (float)(length/(2*Math.tan(radians)));

    }
    // Shape(int radius  ){
    //     this.radius = radius;
    // }
    Shape(int length , int sides){
        this.length=length;
        this.sides=sides;
    }

    float area(){
        if(sides==0){
            return (float) ((3.14)*this.length*this.length);
        }
        if(sides==2){
            return this.length*this.length;
        }
        else{
            return (sides*length*Apothem(length, sides))/2;
        }
    }
    // float area(int radius){
    //     return (float) ((3.14)*radius*radius);
    // }

    // float parameter(int height,int width){
    //     return 2*height+2*height;
    // }    public static void main(String[] args) {
}

public class Main {
    public static void main(String[] args) {
        Shape polygon=new Shape(5, 5);
        System.out.println("area of polygon: "+polygon.area());
    }
}