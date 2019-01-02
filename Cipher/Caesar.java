import java.util.*;
import java.util.HashMap;
/**
 * Write a description of class Caesar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Caesar
{
    // instance variables - replace the example below with your own
    
    public static void encode(String textIn, int step)
    {
        HashMap numberToLetter = new HashMap();
        numberToLetter.put(1,"a");
        numberToLetter.put(2,"b");
        numberToLetter.put(3,"c");
        numberToLetter.put(4,"d");
        numberToLetter.put(5,"e");
        numberToLetter.put(6,"f");
        numberToLetter.put(7,"g");
        numberToLetter.put(8,"h");
        numberToLetter.put(9,"i");
        numberToLetter.put(10,"j");
        numberToLetter.put(11,"k");
        numberToLetter.put(12,"l");
        numberToLetter.put(13,"m");
        numberToLetter.put(14,"n");
        numberToLetter.put(15,"o");
        numberToLetter.put(16,"p");
        numberToLetter.put(17,"q");
        numberToLetter.put(18,"r");
        numberToLetter.put(19,"s");
        numberToLetter.put(20,"t");
        numberToLetter.put(21,"u");
        numberToLetter.put(22,"v");
        numberToLetter.put(23,"w");
        numberToLetter.put(24,"x");
        numberToLetter.put(25,"y");
        numberToLetter.put(26,"z");
        numberToLetter.put(27," ");
        numberToLetter.put(28,".");
        numberToLetter.put(29,"A");
        numberToLetter.put(30,"B");
        numberToLetter.put(31,"C");
        numberToLetter.put(32,"D");
        numberToLetter.put(33,"E");
        numberToLetter.put(34,"F");
        numberToLetter.put(35,"G");
        numberToLetter.put(36,"H");
        numberToLetter.put(37,"I");
        numberToLetter.put(38,"J");
        numberToLetter.put(39,"K");
        numberToLetter.put(40,"L");
        numberToLetter.put(41,"M");
        numberToLetter.put(42,"N");
        numberToLetter.put(43,"O");
        numberToLetter.put(44,"P");
        numberToLetter.put(45,"Q");
        numberToLetter.put(46,"R");
        numberToLetter.put(47,"S");
        numberToLetter.put(48,"T");
        numberToLetter.put(49,"U");
        numberToLetter.put(50,"V");
        numberToLetter.put(51,"W");
        numberToLetter.put(52,"X");
        numberToLetter.put(53,"Y");
        numberToLetter.put(54,"Z");
        numberToLetter.put(55,"!");
        numberToLetter.put(56,"?");
        numberToLetter.put(57,"'");
        numberToLetter.put(58,",");
        
        HashMap letterToNumber = new HashMap();
        letterToNumber.put("a",1);
        letterToNumber.put("b",2);
        letterToNumber.put("c",3);
        letterToNumber.put("d",4);
        letterToNumber.put("e",5);
        letterToNumber.put("f",6);
        letterToNumber.put("g",7);
        letterToNumber.put("h",8);
        letterToNumber.put("i",9);
        letterToNumber.put("j",10);
        letterToNumber.put("k",11);
        letterToNumber.put("l",12);
        letterToNumber.put("m",13);
        letterToNumber.put("n",14);
        letterToNumber.put("o",15);
        letterToNumber.put("p",16);
        letterToNumber.put("q",17);
        letterToNumber.put("r",18);
        letterToNumber.put("s",19);
        letterToNumber.put("t",20);
        letterToNumber.put("u",21);
        letterToNumber.put("v",22);
        letterToNumber.put("w",23);
        letterToNumber.put("x",24);
        letterToNumber.put("y",25);
        letterToNumber.put("z",26);
        letterToNumber.put(" ",27);
        letterToNumber.put(".",28);
        letterToNumber.put("A",29);
        letterToNumber.put("B",30);
        letterToNumber.put("C",31);
        letterToNumber.put("D",32);
        letterToNumber.put("E",33);
        letterToNumber.put("F",34);
        letterToNumber.put("G",35);
        letterToNumber.put("H",36);
        letterToNumber.put("I",37);
        letterToNumber.put("J",38);
        letterToNumber.put("K",39);
        letterToNumber.put("L",40);
        letterToNumber.put("M",41);
        letterToNumber.put("N",42);
        letterToNumber.put("O",43);
        letterToNumber.put("P",44);
        letterToNumber.put("Q",45);
        letterToNumber.put("R",46);
        letterToNumber.put("S",47);
        letterToNumber.put("T",48);
        letterToNumber.put("U",49);
        letterToNumber.put("V",50);
        letterToNumber.put("W",51);
        letterToNumber.put("X",52);
        letterToNumber.put("Y",53);
        letterToNumber.put("Z",54);
        letterToNumber.put("!",55);
        letterToNumber.put("?",56);
        letterToNumber.put("'",57);
        letterToNumber.put(",",58);
        
        
        
        
        
        
        int textNumber = 0;
        int caesarStep = step;
        int outNumber = 0;
        int textChar = 0;
        
        
        String outLetter = "error";
        String keyLetter = "error";
        String textLetter = "error";
        
        
        
        for (textChar = 0; textChar < textIn.length(); textChar++)
        {
            textLetter = Character.toString(textIn.charAt(textChar));
            
            
            if (letterToNumber.containsKey(textLetter))
            {
                textNumber = (Integer)letterToNumber.get(textLetter);
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
            
            outLetter = (String)numberToLetter.get(outNumber);
            
            System.out.print(outLetter);
            
        }
    }
    
    public static void decode(String textIn, int step)
    {
        HashMap numberToLetter = new HashMap();
        numberToLetter.put(1,"a");
        numberToLetter.put(2,"b");
        numberToLetter.put(3,"c");
        numberToLetter.put(4,"d");
        numberToLetter.put(5,"e");
        numberToLetter.put(6,"f");
        numberToLetter.put(7,"g");
        numberToLetter.put(8,"h");
        numberToLetter.put(9,"i");
        numberToLetter.put(10,"j");
        numberToLetter.put(11,"k");
        numberToLetter.put(12,"l");
        numberToLetter.put(13,"m");
        numberToLetter.put(14,"n");
        numberToLetter.put(15,"o");
        numberToLetter.put(16,"p");
        numberToLetter.put(17,"q");
        numberToLetter.put(18,"r");
        numberToLetter.put(19,"s");
        numberToLetter.put(20,"t");
        numberToLetter.put(21,"u");
        numberToLetter.put(22,"v");
        numberToLetter.put(23,"w");
        numberToLetter.put(24,"x");
        numberToLetter.put(25,"y");
        numberToLetter.put(26,"z");
        numberToLetter.put(27," ");
        numberToLetter.put(28,".");
        numberToLetter.put(29,"A");
        numberToLetter.put(30,"B");
        numberToLetter.put(31,"C");
        numberToLetter.put(32,"D");
        numberToLetter.put(33,"E");
        numberToLetter.put(34,"F");
        numberToLetter.put(35,"G");
        numberToLetter.put(36,"H");
        numberToLetter.put(37,"I");
        numberToLetter.put(38,"J");
        numberToLetter.put(39,"K");
        numberToLetter.put(40,"L");
        numberToLetter.put(41,"M");
        numberToLetter.put(42,"N");
        numberToLetter.put(43,"O");
        numberToLetter.put(44,"P");
        numberToLetter.put(45,"Q");
        numberToLetter.put(46,"R");
        numberToLetter.put(47,"S");
        numberToLetter.put(48,"T");
        numberToLetter.put(49,"U");
        numberToLetter.put(50,"V");
        numberToLetter.put(51,"W");
        numberToLetter.put(52,"X");
        numberToLetter.put(53,"Y");
        numberToLetter.put(54,"Z");
        numberToLetter.put(55,"!");
        numberToLetter.put(56,"?");
        numberToLetter.put(57,"'");
        numberToLetter.put(58,",");
        
        HashMap letterToNumber = new HashMap();
        letterToNumber.put("a",1);
        letterToNumber.put("b",2);
        letterToNumber.put("c",3);
        letterToNumber.put("d",4);
        letterToNumber.put("e",5);
        letterToNumber.put("f",6);
        letterToNumber.put("g",7);
        letterToNumber.put("h",8);
        letterToNumber.put("i",9);
        letterToNumber.put("j",10);
        letterToNumber.put("k",11);
        letterToNumber.put("l",12);
        letterToNumber.put("m",13);
        letterToNumber.put("n",14);
        letterToNumber.put("o",15);
        letterToNumber.put("p",16);
        letterToNumber.put("q",17);
        letterToNumber.put("r",18);
        letterToNumber.put("s",19);
        letterToNumber.put("t",20);
        letterToNumber.put("u",21);
        letterToNumber.put("v",22);
        letterToNumber.put("w",23);
        letterToNumber.put("x",24);
        letterToNumber.put("y",25);
        letterToNumber.put("z",26);
        letterToNumber.put(" ",27);
        letterToNumber.put(".",28);
        letterToNumber.put("A",29);
        letterToNumber.put("B",30);
        letterToNumber.put("C",31);
        letterToNumber.put("D",32);
        letterToNumber.put("E",33);
        letterToNumber.put("F",34);
        letterToNumber.put("G",35);
        letterToNumber.put("H",36);
        letterToNumber.put("I",37);
        letterToNumber.put("J",38);
        letterToNumber.put("K",39);
        letterToNumber.put("L",40);
        letterToNumber.put("M",41);
        letterToNumber.put("N",42);
        letterToNumber.put("O",43);
        letterToNumber.put("P",44);
        letterToNumber.put("Q",45);
        letterToNumber.put("R",46);
        letterToNumber.put("S",47);
        letterToNumber.put("T",48);
        letterToNumber.put("U",49);
        letterToNumber.put("V",50);
        letterToNumber.put("W",51);
        letterToNumber.put("X",52);
        letterToNumber.put("Y",53);
        letterToNumber.put("Z",54);
        letterToNumber.put("!",55);
        letterToNumber.put("?",56);
        letterToNumber.put("'",57);
        letterToNumber.put(",",58);
        
        
        
        
        
        
        int textNumber = 0;
        int caesarStep = step;
        int outNumber = 0;
        int textChar = 0;
        
        
        String outLetter = "error";
        String keyLetter = "error";
        String textLetter = "error";
        
        
        
        for (textChar = 0; textChar < textIn.length(); textChar++)
        {
            textLetter = Character.toString(textIn.charAt(textChar));
            
            if (letterToNumber.containsKey(textLetter))
            {
                textNumber = (Integer)letterToNumber.get(textLetter);
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
            
            outLetter = (String)numberToLetter.get(outNumber);
            
            System.out.print(outLetter);
            
        }
    }
}