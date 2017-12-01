package Stream;

import Stream.seriaz.App;

import java.io.*;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*
         byte[] byteToWrite = {1,2,3};
         String fileName = "text.txt";

        FileOutputStream outFile = null;

        outFile = new FileOutputStream(fileName);

        outFile.write(byteToWrite);

        outFile.close();



        FileInputStream inFile = new FileInputStream(fileName);

        byte[] readFil= new byte[inFile.available()];

        inFile.read(readFil);


        for (byte bb : readFil){
            System.out.println(bb);
        }


        System.out.print(inFile.read());
        System.out.print(inFile.read());
        System.out.print(inFile.read());

        inFile.close();
       */
        /*----------------------------------------------------------------------*/


/*
        FileReader fr = new FileReader("text.txt");

        BufferedReader br = new BufferedReader(fr);

        String s;


        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
*/
        /*----------------------------------------------------------------------*/

/*
        FileReader fr = new FileReader("text.txt");

        Scanner sc = new Scanner(fr);
        sc.useDelimiter(", ");//кодировка
        while (sc.hasNext()){
            if (sc.hasNextInt()){
                System.out.println(sc.nextInt() + ":int");
            }
            else
            {
                System.out.println(sc.next() + ":String");
            }
        }
*/

        App aa  = new App();
        aa.a = 1.0;
        aa.b = 5;

        FileOutputStream fos = new FileOutputStream("seriaz.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(aa);

        oos.close();



        FileInputStream fis = new FileInputStream("seriaz.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        App bb = (App) ois.readObject();
        System.out.println(bb.toString());


    }
}
