import java.io.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;
public class Vector{
    double x, y;
    public Vector(){
        this.x = 0;
        this.y = 0;
    }
    public Vector(Vector a){
        this.x = a.x;
        this.y = a.y;
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
    public Vector add(Vector a){
        this.x += a.x;
        this.y += a.y;
        return this;
    }
    public static void saveToFile(String filename, Vector vec) throws IOException{
        File outputFile = new File(filename);
        outputFile.createNewFile();

        FileWriter writer = new FileWriter(outputFile);
        writer.write(Double.toString(vec.length()));
        writer.flush();
        writer.close();
    }
    public void setData(){
        String userVectorInput = new String();
        String digitPattern = "(\\d*\\.?\\d*)\\s(\\d*\\.?\\d*)";

        Scanner in = new Scanner(System.in);
        userVectorInput = in.nextLine();
        Pattern findDoubles = Pattern.compile(digitPattern);
        Matcher match = findDoubles.matcher(userVectorInput);
        if (match.find()){
            this.x = Double.parseDouble(match.group(1));
            this.y = Double.parseDouble(match.group(2));
        }
        else{
            System.out.print("Wrond data.");
        }
    }
    public static void main(String[] args) throws DifferentVectorsLengthException{

        Vector vec1 = new Vector();
        Vector vec2 = new Vector();
        vec1.setData();
        vec2.setData();

        try{
            if (vec1.length() == vec2.length()){
                Vector added = new Vector(vec1);
                added.print();
                added.add(vec1);
                added.print();
                saveToFile("vector.txt", added);
            }
            else{
                throw new DifferentVectorsLengthException();
            }
        }
        catch (DifferentVectorsLengthException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
