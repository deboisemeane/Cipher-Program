import java.util.*;
import java.util.HashMap;
/**
 * Write a description of class Caesar here.
 * benis
 * @author (your name)
 * @version (a version number or a date)
 */
public class Caesar
{
    // instance variables - replace the example below with your own
    
    public static String encode(String textIn, int step)
    {
        valuesMap m = new valuesMap();

        int textNumber = 0;
        int caesarStep = step;
        int outNumber = 0;
        int textChar = 0;
        
        
        String outLetter = "error";
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
            
            outNumber = textNumber + caesarStep;
            if (outNumber >58)
            {
                outNumber = outNumber -58;
            }
            if (outNumber < 0)
            {
                outNumber = outNumber +58;
            }
            
            outLetter = (String)m.numberToLetter.get(outNumber);

            output = output+ outLetter;;
            
        }
        return output;
    }
    
    public static String decode(String textIn, int step)
    {
        valuesMap m = new valuesMap();
        
        int textNumber = 0;
        int caesarStep = step;
        int outNumber = 0;
        int textChar = 0;
        
        
        String outLetter = "error";
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
            
            outNumber = textNumber - caesarStep;
            if (outNumber >58)
            {
                outNumber = outNumber -58;
            }
            if (outNumber < 0)
            {
                outNumber = outNumber +58;
            }
            
            outLetter = (String)m.numberToLetter.get(outNumber);

            output = output+ outLetter;
            
        }
        return output;
    }
}