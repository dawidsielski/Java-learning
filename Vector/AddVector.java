import java.util.*;
public class AddVector {
    public static CustomVector add(CustomVector a, CustomVector b) throws DifferentVectorsLengthException{
		if (a.vectorElements.size() != b.vectorElements.size())
			throw new DifferentVectorsLengthException(a.vectorElements.size(), b.vectorElements.size());
		CustomVector added = new CustomVector();
		for ( int i = 0; i < a.vectorElements.size(); i++){
			added.vectorElements.add(a.vectorElements.get(i) + b.vectorElements.get(i));
		}
    return added;
	}
}