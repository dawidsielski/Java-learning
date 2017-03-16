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
    public static void saveToFile(String filename, Vector vec) throws IOException{
        File outputFile = new File(filename);
        outputFile.createNewFile();

        FileWriter writer = new FileWriter(outputFile);
        writer.write(Double.toString(vec.vectorElements.size()));
        writer.flush();
        writer.close();
    }
    public void setData(){
		this.vectorElements.clear();
        String userVectorInput = new String();
        Scanner in = new Scanner(System.in);
        Scanner findDoubles;
        double element = 0;
        while(true){
            userVectorInput = in.nextLine();
            findDoubles = new Scanner(userVectorInput);
            try {
                while(true){
                    element = findDoubles.nextDouble();
                    this.vectorElements.add(element);
                }
            }
            catch (InputMismatchException e){
                if (this.vectorElements.size() == 0){
                    System.out.println("Invalid input.");
                    continue;
                }
                else{
                    System.out.println("Non-numerical input detected. Anything after it will be ignored.");
                    break;
                }
            }
            catch (NoSuchElementException e){
                break;
            }
        }
        System.out.println("Input: " + this.vectorElements);
    }
    public static void main(String[] args) throws DifferentVectorsLengthException{

        Vector vec1 = new Vector();
        Vector vec2 = new Vector();
        
        vec1.setData();
        vec2.setData();
        while(true){
				
			try{
				AddVector addVector = new AddVector();
				Vector result = addVector.add(vec1, vec2);
				System.out.println("Added vector" + result.vectorElements);
				saveToFile("vector.txt", result);
				break;
			}
			catch (DifferentVectorsLengthException e){
				// System.out.println("Vectors have different lengths");
				System.out.println("fFirst vector is " + vec1.vectorElements.size() + " in size and second is " + vec2.vectorElements.size() + ".");
                // System.out.println(e);
				vec1.setData();
				vec2.setData();
			}
			catch (IOException e){
				System.out.println(e);
			}
		}

    }
}

