package Stream;

import java.io.*;

public class App1 {
    public static void main(String[] args) throws IOException {

         byte[] byteToWrite = {1,2,3};
         String fileName = "text.txt";

        FileOutputStream outFile = null;

        outFile = new FileOutputStream(fileName);

        outFile.write(byteToWrite);

        outFile.close();

        /*----------------------------------------------------------------------*/


        FileInputStream inFile = new FileInputStream(fileName);

        byte[] readFil= new byte[inFile.available()];

        inFile.read(readFil);


        for (byte bb : readFil){
            System.out.println(bb);
        }


        /*System.out.print(inFile.read());
        System.out.print(inFile.read());
        System.out.print(inFile.read());*/

        inFile.close();

        /*----------------------------------------------------------------------*/




    }
}
