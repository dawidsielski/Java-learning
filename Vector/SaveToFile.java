import java.io.*;
public class SaveToFile{
	public SaveToFile(String vec) throws IOException{
        File outputFile = new File("vector.txt");
        outputFile.createNewFile();

        FileWriter writer = new FileWriter(outputFile);
        writer.write(vec);
        writer.flush();
        writer.close();
    }
}
