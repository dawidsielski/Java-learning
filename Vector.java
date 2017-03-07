import java.io.*;
import java.math.*;
public class Vector{
    double x, y;
    public Vector(){
        this.x = 0;
        this.y = 0;
    }
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double length(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public void print(){
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
    public Vector add(Vector a, Vector b){
        return new Vector(a.x + b.x, a.y + b.y);
    }
    public Vector add(Vector a){
        this.x += a.x;
        this.y += a.y;
        return this;
    }

    public static void main(String[] args){
        Vector vec = new Vector(3,4);
        Vector vec1 = new Vector(3,4);
        vec.print();
        vec1.print();
        vec.add(vec1);
        vec.print();

    }
}