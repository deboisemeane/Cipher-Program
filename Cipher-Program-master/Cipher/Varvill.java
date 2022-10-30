import java.util.*;
import java.util.HashMap;
/**
 * Write a description of class Encode here.
 * hello
 * @author (James Cook)
 * @version (a version number or a date)
 */
public class Varvill
{

    

    
    
    public static String encode(String textIn, String key)
    {
        valuesMap m = new valuesMap();

        // Code creates a hashmap of the alphabet and assigns a number to each charachter.
        int textNumber = 0;
        int keyNumber = 0;
        int outNumber = 0;
        int textChar = 0;
        int keyChar = 0;
        
        String outLetter = "error";
        String keyLetter = "error";
        String textLetter = "error";
        String output = "";
        
        
        
        for (textChar = 0; textChar < textIn.length(); textChar++)
        {
            //iterates through each charachter in the string
            textLetter = Character.toString(textIn.charAt(textChar));
            //converts valid characters into their respective numbers
            if (m.letterToNumber.containsKey(textLetter))
            {
                textNumber = (Integer)m.letterToNumber.get(textLetter);
            }
            else
            {
                //if the number is unrecognised, stipts an error message
                System.out.println("Unrecognised symbol. Accepted symbols include letters a-z(lowercase) and space and full stop");
            }
            //loops the key number
            if (keyChar >= key.length())
            {
                keyChar = 0;
            }
            //combines the keynumber and stringnumber 
            keyLetter = Character.toString(key.charAt(keyChar));
            
            keyNumber = (Integer)m.letterToNumber.get(keyLetter);
            
            outNumber = keyNumber + textNumber;
            
            if (outNumber >58)
            {
                outNumber = outNumber -58;
            }
            //converts final number to a letter to be printed
            outLetter = (String)m.numberToLetter.get(outNumber);
            
            output = output+ outLetter;
            //increases the key number to step through the key
            keyChar++;
            
        }
        return output;
        
    }
    
    public static String decode(String textIn, String key)
    {
        valuesMap m = new valuesMap();

        int textNumber = 0;
        int keyNumber = 0;
        int outNumber = 0;
        int textChar = 0;
        int keyChar = 0;
        
        String outLetter = "error";
        String keyLetter = "error";
        String textLetter = "error";
        String output = "";
        
        
        
        for (textChar = 0; textChar < textIn.length(); textChar++)
        {
            
            textLetter = Character.toString(textIn.charAt(textChar));
            
            if (m.letterToNumber.containsKey(textLetter))
            {
                textNumber = (Integer)m.letterToNumber.get(textLetter);
            }
            else
            {
                System.out.println("Unrecognised symbol. Accepted symbols include letters a-z(lowercase) and space and full stop");
            }
            if (keyChar >= key.length())
            {
                keyChar = 0;
            }
            keyLetter = Character.toString(key.charAt(keyChar));
            
            keyNumber = (Integer)m.letterToNumber.get(keyLetter);
            
            outNumber = textNumber - keyNumber;
            
            if (outNumber < 1)
            {
                outNumber = outNumber + 58;
            }
            
            outLetter = (String)m.numberToLetter.get(outNumber);

            output = output+ outLetter;
            keyChar++;
            
        }
        return output;
        
    }
}
