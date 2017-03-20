import java.util.*;
public class AddVector {
    public static Vector add(Vector a, Vector b) throws DifferentVectorsLengthException{
		if (a.vectorElements.size() != b.vectorElements.size())
			throw new DifferentVectorsLengthException(a.vectorElements.size(), b.vectorElements.size());
		Vector added = new Vector();
		for ( int i = 0; i < a.vectorElements.size(); i++){
			added.vectorElements.add(a.vectorElements.get(i) + b.vectorElements.get(i));
		}
    return added;
	}
}
