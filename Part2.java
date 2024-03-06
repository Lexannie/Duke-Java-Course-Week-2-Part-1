
/**
 * StringsFirtAssignment
 * Assignment for Java Week 2 Part 2
 * Find gene bounded by START_CODON and STOP_CODON,
 * If gene found is multiple of 3 print out gene in terminal
 * 
 * @author Annie Grubb 
 * @version 0.1 3/6/24
 */
import edu.duke.*;
import java.io.File;
import java.time.LocalTime;

public class Part2 {
    /**
     *  findSimpleGene returns String of gene found between START and STOP codons in dna
     *
     * @param  y   String containing dna sequence to search
     * @return     gene if found or "" if not found
     */
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        int indexOfStartCodon = 0;
        int indexOfStopCodon = 0;
        String geneFound;
        char firstChar;
        
        // print out blank line then method name on next line
        System.out.println(" ");
        System.out.println("findSimpleGene ****** ");
        firstChar = dna.charAt(0);
        System.out.println("   first char is " + firstChar);        
        if(Character.isLowerCase(firstChar)){
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
        indexOfStartCodon = dna.indexOf(startCodon);
        System.out.println("   *** findSimpleGene START_CODON at index: " + indexOfStartCodon);
        indexOfStopCodon = dna.indexOf(stopCodon);
        System.out.println("   *** findSimpleGene STOP_CODON at index: " + indexOfStopCodon);
        if ((indexOfStartCodon >= 0 ) & (indexOfStopCodon >= 0) & ((indexOfStopCodon - indexOfStartCodon)%3 == 0)){
            geneFound = dna.substring(indexOfStartCodon, indexOfStopCodon +3);
        }
        else{
            geneFound = "";
        }
                
        return (geneFound);
    }

    /**
     *  testFindSimpleGene 
     *  tests findSimpleGene method
     *  prints out dna sequence given as parameter to findSimpleGene
     *  prints out gene if found in given dna sequecnce
     *
     * @param     no parameters
     * @return    void
     */
    public void testFindSimpleGene() {
        String START_CODON ="ATG";
        String STOP_CODON = "TAA";
        String outputGene;       
        System.out.println("testFindSimpleGene ****** ");
            
        // DNA test case for no ATG
        String dnaTestCase1 = "ATATATATATCTAAGCG";
        System.out.println("dnaTestCase1 = " + dnaTestCase1);
        outputGene = findSimpleGene(dnaTestCase1, START_CODON, STOP_CODON);
        System.out.println("   *** gene found in dnaTestCase1 = " + outputGene);

        // DNA test case for no TAA
        String dnaTestCase2 = "ATGATATATATCTACAGCG";
        System.out.println("dnaTestCase2 = " + dnaTestCase2);
        outputGene = findSimpleGene(dnaTestCase2, START_CODON, STOP_CODON);
        System.out.println("   ** gene found in dnaTestCase2 = " + outputGene);
        
        // DNA test case for no ATG or TAA
        String dnaTestCase3 = "ATATATATATCTACAGCG";
        System.out.println("dnaTestCase3 = " + dnaTestCase3);
        outputGene = findSimpleGene(dnaTestCase3, START_CODON, STOP_CODON);
        System.out.println("   ** gene found in dnaTestCase3 = " + outputGene);
    
        // DNA test case 4 gene with multiple of 3
        String dnaTestCase4 = "ATATGATATATCGGTAAGCG";
        System.out.println("dnaTestCase4 = " + dnaTestCase4);
        outputGene = findSimpleGene(dnaTestCase4, START_CODON, STOP_CODON);
        System.out.println("   ** gene found in dnaTestCase4 = " + outputGene);
    
        // DNA test case 5 gene without multiple of 3
        String dnaTestCase5 = "AATGTTAAATATATATCTAAGCG";
        System.out.println("dnaTestCase5 = " + dnaTestCase5);
        outputGene = findSimpleGene(dnaTestCase5, START_CODON, STOP_CODON);
        System.out.println("   ** gene found in dnaTestCase5 = " + outputGene);
    
        // DNA test case 6 gene 
        String dnaTestCase6 = "ATGGGTTAAGTC";
        System.out.println("dnaTestCase6 = " + dnaTestCase6);
        outputGene = findSimpleGene(dnaTestCase6, START_CODON, STOP_CODON);
        System.out.println("   ** gene found in dnaTestCase6 = " + outputGene);
        
        // DNA test case 7 gene in lower case
        String dnaTestCase7 = "gatgctataat";
        System.out.println("dnaTestCase7 = " + dnaTestCase7);
        outputGene = findSimpleGene(dnaTestCase7, START_CODON, STOP_CODON);
        System.out.println("   ** gene found in dnaTestCase7 = " + outputGene);

    }

    public static void main (String[] args) {
        LocalTime time = LocalTime.now();
        Part2 part2Runner = new Part2();
       
        // print out blank line and header for each iteration of this test
        System.out.println("  ");
        System.out.println("main of class Part2 ****** " + time);
        
        // Run test cases for findSimpleGene
        part2Runner.testFindSimpleGene();
    }
}
