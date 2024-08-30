//Author: Ronald Yalung
//Date: 06/27/2024
// "We're in the endgame now." - Stephen Strange, M.D., Ph.D.
// https://pics.me.me/were-in-the-endgame-now-when-the-power-point-goes-38463881.png

import java.io.File;
import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static final int ARR_LENGTH = 25;

    public static void main(String[] args) throws NoSuchAlgorithmException {
	// setup the hash map here
       
    	HashMap<String, String> hashedNamesHM = new HashMap<String, String>();
        Hashes hashes = new Hashes();

        String filename = "names.txt";
        String[] namesArr;
        namesArr = readNames(filename);

        System.out.println("The list of names has been read!");
        
        //print out every element in the array
        for(int i = 0; i < namesArr.length; i++)
        {
            System.out.println(namesArr[i]);
            hashes.makeHash(namesArr[i]);
            hashedNamesHM.put(namesArr[i], hashes.getHashedStr());
        }
        System.out.println();
        System.out.println(hashedNamesHM.toString());
        System.out.println();
        // find your main man
        if (hashedNamesHM.containsKey("Michael Scott")) 
        {
            System.out.println("Michael Scott = " + hashedNamesHM.get("Michael Scott"));
        } else 
        {
            System.out.println("The HashMap does not contain Michael Scott.");
        }

        // find your leading lady
        if (hashedNamesHM.containsKey("Wednesday Addams")) 
        {
            System.out.println("Wednesday Addams = " + hashedNamesHM.get("Wednesday Addams"));
        } else 
        {
            System.out.println("The HashMap does not contain Wednesday Addams.");
        }
    }
    

    // read the names from names.txt and put them into an array
    public static String[] readNames(String filename)
    {
        String[] names = new String[ARR_LENGTH];
        String currentLine = "";
        int index = 0;
        try
        {
                //make a new scanner object that will read from the file
                Scanner in = new Scanner(new File(filename));

                //loop as long as the scanner still has contents (use the hasNext method)
                while(in.hasNext() && index < ARR_LENGTH)
                {
                        currentLine = in.nextLine();
                        names[index] = currentLine;
                        index++;
                }
        }
        catch (FileNotFoundException e)
        {
                // print the exception message
                e.printStackTrace();
        }

        //return the array of names
        return names;
    }
}
