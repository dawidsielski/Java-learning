import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class RandomCharacters{

    public static void main(String[] args){
        char[] randChar = new char[1000];
        randChar = randomizeCharacters();
        //showTable(randChar, 1000);
        try{
            saveToFileIO(randChar);
            readFromFileIO();
        }catch (IOException e){
            System.out.println("Exception thrown  :" + e);
        }
        
    }

    public static char[] randomizeCharacters(){
        Random r = new Random();
        char[] randomChar = new char[1000];

        for (int i = 0; i < 1000; i++){
            randomChar[i] = (char)(r.nextInt(26) + 'a');
        }
        return randomChar;
    }

    public static void showTable(char[] table, int elements){
        for (int i = 0; i < elements; i++){
            System.out.print(table[i]);
        }
    }

    public static void saveToFileIO(char[] table) throws IOException{
        File outputFile = new File("output.txt");
        outputFile.createNewFile();

        FileWriter writer = new FileWriter(outputFile);
        for (int i = 0; i < 1000; i++){
            writer.write(table[i]);
        }
        writer.flush();
        writer.close();
    }

    public static void readFromFileIO(){
        try{
            FileReader inputFile = new FileReader("./output.txt"); 
            char [] a = new char[1000];
            inputFile.read(a);
            // for(char c : a)
            //     System.out.print(c);   
            inputFile.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void saveToFileNIO(){

    }
    public static void readFromFileNIO(){
        try{
            FileInputStream fin = new FileInputStream( "./output.txt" );
            FileChannel fc = fin.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate( 1024 );
            fc.read( buffer );
            fc.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }catch (IOException e){
            System.out.println(e);
        }
    }


}