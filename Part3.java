/**
 * StringsFirtAssignment
 * Assignment for Java Week 2 Part 3
 * check for 2 occurences of stringa in stringb return T/F
 * 
 * @author Annie Grubb 
 * @version 0.1 3/6/24
 */
import edu.duke.*;
import java.io.File;
import java.time.LocalTime;

public class Part3 {
    boolean twoOccurrences(String stringa, String stringb){
        int firstFoundAt;
        int secondFoundAt;       
        // check for first occurrence of stringa in stringb from beginning
        firstFoundAt = stringb.indexOf(stringa, 0);
        if (firstFoundAt >= 0){
            // check for second occurrence of stringa in stringb after first found index + 1
            secondFoundAt = stringb.indexOf(stringa, firstFoundAt + 1);
            if (secondFoundAt >= 0){
                return true;
            }
        }
        return false;
    }
    
    void testing(){
        boolean isFound;
        String string1;
        String string2;
        LocalTime time = LocalTime.now();
        
        System.out.println("testing of class Part3 ****** " + time);
        
        string1 = "needle";
        string2 = "haystack";
        isFound = twoOccurrences(string1, string2);
        System.out.println("   " + string1 +" found twice in " + string2 + " is: " +isFound);
        
        string1 = "b";
        string2 = "bbye";
        isFound = twoOccurrences(string1, string2);
        System.out.println("   " + string1 +" found twice in " + string2 + " is: " +isFound);
        
        string1 = "by";
        string2 = "A story by Abby Long";
        isFound = twoOccurrences(string1, string2);
        System.out.println("   " + string1 +" found twice in " + string2 + " is: " +isFound);
        
        string1 = "a";
        string2 = "banana";
        isFound = twoOccurrences(string1, string2);
        System.out.println("   " + string1 +" found twice in " + string2 + " is: " +isFound);

        string1 = "atg";
        string2 = "ctgtatgta";
        isFound = twoOccurrences(string1, string2);
        System.out.println("   " + string1 +" found twice in " + string2 + " is: " +isFound);
         
    }
    
    public static void main (String[] args) {
        LocalTime time = LocalTime.now();
        Part3 part3Runner = new Part3();
       
        // print out blank line and header for each iteration of this test
        System.out.println("  ");
        System.out.println("main of class Part3 ****** " + time);
        
        // Run test cases for findSimpleGene
        part3Runner.testing();
    }
}
