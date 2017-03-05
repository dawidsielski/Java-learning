public class Substring{

  public static void main(String[] args){
    String word = "";
    int from = 0, to = 0;
    try
    {
      word = args[0];
      from = Integer.parseInt(args[1]);
      to = Integer.parseInt(args[2]);
    }catch (Exception e)
    {
      if (e instanceof StringIndexOutOfBoundsException){
        System.out.println("Your string is not long enought.");
      }
      else if (e instanceof ArrayIndexOutOfBoundsException){
        System.out.println("Not enought arguments.");
      }
      else{
        System.out.println("Encountered exception " + e);
      }
    }
    System.out.print(word.substring(from, to));
  }
}
