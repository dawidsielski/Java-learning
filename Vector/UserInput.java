import java.util.*;
public class UserInput{
	List<Double> listElements;
	public UserInput(){
		listElements = new ArrayList<>();
	}
	public List<Double> scanData(){
		this.listElements.clear();
        String userVectorInput = new String();
        Scanner in = new Scanner(System.in);
        Scanner findDoubles;
        double element = 0;
        boolean ifEndOfLine = false;
        while(!ifEndOfLine){
            userVectorInput = in.nextLine();
            findDoubles = new Scanner(userVectorInput);
            try {
                while(true){
                    element = findDoubles.nextDouble();
                    this.listElements.add(element);
                }
            }
            catch (InputMismatchException e){
                if (this.listElements.size() == 0){
                    System.out.println("Invalid input.");
                    continue;
                }
                else{
                    System.out.println("Non-numerical input detected. Anything after it will be ignored.");
                    break;
                }
            }
            catch (NoSuchElementException e){
                ifEndOfLine = true;
            }
        }
        return this.listElements;
    }
	
}
