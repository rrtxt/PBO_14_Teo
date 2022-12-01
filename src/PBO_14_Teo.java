import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PBO_14_Teo {
    public static void main(String[] args) throws Exception {
        try{
            File file=new File("src/inFile.txt"); 
            String randName = GenerateRandom();
            File output= new File("src/" + randName + ".txt");   //creates a new file instance 
            FileReader fr=new FileReader(file);   //reads the file  
            FileWriter wr = new FileWriter(output);
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            BufferedWriter bw = new BufferedWriter(wr);   //constructs a string buffer with no characters  
            String line;  
            ArrayList<String> list;

            while((line=br.readLine())!=null)  
            {  
                String[] lineArr = line.split(" ");
                list = new ArrayList<>(Arrays.asList(lineArr));
                String str = "";
                for (String word : list) {
                    str += StringHandler.ContainNumRom(word + " ");
                }
                bw.write(str + "\n");
            }  
            GenerateRandom();
            fr.close(); 
            bw.close();   //closes the stream and release the resources  
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    static String GenerateRandom(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) 
              (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
    
        return generatedString;
    }

    
}
