public class DifferentVectorsLengthException extends Exception{

    public DifferentVectorsLengthException(){
        System.out.println("Vectors not equal.");
    }

    public DifferentVectorsLengthException(String message){
        System.out.println(message);
    }
}