import java.io.*;
import java.math.*;
import java.util.*;
public class Vector{
    List<Double> vectorElements;
    public Vector(){
		vectorElements = new ArrayList<>();
    }
    public Vector(Vector a){
		this.vectorElements = a.vectorElements;
    }
    public static void main(String[] args) throws DifferentVectorsLengthException{

        Vector vec1 = new Vector();
        Vector vec2 = new Vector();
        
        UserInput userInput = new UserInput();
        vec1.vectorElements.addAll(userInput.scanData());
        vec2.vectorElements.addAll(userInput.scanData());
        
        while(true){
				
			try{
				Vector result = AddVector.add(vec1, vec2);
				System.out.println("Added vector" + result.vectorElements);
				SaveToFile insert = new SaveToFile(result.vectorElements.toString());
				break;
			}
			catch (DifferentVectorsLengthException e){
				System.out.println(e.differentVectorLengthError());
                System.out.println("Please reenter your vectors.");
                vec1.vectorElements.clear();
                vec2.vectorElements.clear();
                vec1.vectorElements.addAll(userInput.scanData());
				vec2.vectorElements.addAll(userInput.scanData());
			}
            catch (IOException e){
                System.out.println(e);
            }
		}

    }
}

