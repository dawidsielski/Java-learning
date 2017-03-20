public class DifferentVectorsLengthException extends Exception{
	int vectorOneSize, vectorTwoSize;
	public DifferentVectorsLengthException(String message){
		super(message);
  }
  public DifferentVectorsLengthException(int vec1, int vec2){
		this.vectorOneSize = vec1;
		this.vectorTwoSize = vec2;
	}
	public String differentVectorLengthError(){
		return ("Vector one length is " + this.vectorOneSize + " and vector two length is " + this.vectorTwoSize + ".");
	}
}
