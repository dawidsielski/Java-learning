import java.io.*;
import java.math.*;
import java.util.*;
public class CustomVector{
    List<Double> vectorElements;
    public CustomVector(){
		vectorElements = new ArrayList<>();
    }
    public CustomVector(CustomVector a){
		this.vectorElements = a.vectorElements;
    }
    public static void main(String[] args) throws DifferentVectorsLengthException{

        CustomVector vec1 = new CustomVector();
        CustomVector vec2 = new CustomVector();
        
        UserInput userInput = new UserInput();
        vec1.vectorElements.addAll(userInput.scanData());
        vec2.vectorElements.addAll(userInput.scanData());
        
        while(true){
				
			try{
				CustomVector result = AddVector.add(vec1, vec2);
				System.out.println("Added vector" + result.vectorElements);
				SaveToFile insert = new SaveToFile(result.vectorElements.toString());
				break;
			}
			catch (DifferentVectorsLengthException e){
				System.out.println(e);
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

