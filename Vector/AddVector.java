import java.util.*;
public class AddVector {
	public static void main (String[] args){
	}
	public AddVector(){
	}
    public Vector add(Vector a, Vector b) throws DifferentVectorsLengthException{
		if (a.vectorElements.size() != b.vectorElements.size())
			throw new DifferentVectorsLengthException(a,b);
		Vector added = new Vector();
		for ( int i = 0; i < a.vectorElements.size(); i++){
			added.vectorElements.add(a.vectorElements.get(i) + b.vectorElements.get(i));
		}
    return added;
	}
}
