/**
 * StringsFirtAssignment
 * Assignment for Java Week 2
 * 
 * @author Annie Grubb 
 * @version 0.1 3/5/24
 */
import edu.duke.*;
import java.io.File;
import java.time.LocalTime;

public class Part1 {
    /**
     *  findSimpleGene returns String of gene found between START and STOP codons in dna
     *
     * @param  y   String containing dna sequence to search
     * @return     gene if found or "" if not found
     */
    public String findSimpleGene(String dna) {
        int indexOfStartCodon = 0;
        int indexOfStopCodon = 0;
        String START_CODON ="ATG";
        String STOP_CODON = "TAA";
        String geneFound = "Just a TEST!";
        
        System.out.println("findSimpleGene ****** ");
        indexOfStartCodon = dna.indexOf(START_CODON);
        System.out.println("   *** findSimpleGene START_CODON at index: " + indexOfStartCodon);
        indexOfStopCodon = dna.indexOf(STOP_CODON);
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
        String outputGene;       
        System.out.println("testFindSimpleGene ****** ");
            
        // DNA test case for no ATG
        String dnaTestCase1 = "ATATATATATCTAAGCG";
        System.out.println("dnaTestCase1 = " + dnaTestCase1);
        outputGene = findSimpleGene(dnaTestCase1);
        System.out.println("   ** gene found in dnaTestCase1 = " + outputGene);

        // DNA test case for no TAA
        String dnaTestCase2 = "ATGATATATATCTACAGCG";
        System.out.println("dnaTestCase2 = " + dnaTestCase2);
        outputGene = findSimpleGene(dnaTestCase2);
        System.out.println("   ** gene found in dnaTestCase2 = " + outputGene);
        
        // DNA test case for no ATG or TAA
        String dnaTestCase3 = "ATATATATATCTACAGCG";
        System.out.println("dnaTestCase3 = " + dnaTestCase3);
        outputGene = findSimpleGene(dnaTestCase3);
        System.out.println("   ** gene found in dnaTestCase3 = " + outputGene);
    
        // DNA test case 4 gene with multiple of 3
        String dnaTestCase4 = "ATATGATATATCGGTAAGCG";
        System.out.println("dnaTestCase4 = " + dnaTestCase4);
        outputGene = findSimpleGene(dnaTestCase4);
        System.out.println("   ** gene found in dnaTestCase4 = " + outputGene);
    
        // DNA test case 5 gene without multiple of 3
        String dnaTestCase5 = "AATGTTAAATATATATCTAAGCG";
        System.out.println("dnaTestCase5 = " + dnaTestCase5);
        outputGene = findSimpleGene(dnaTestCase5);
        System.out.println("   ** gene found in dnaTestCase5 = " + outputGene);

    }

    public static void main (String[] args) {
        LocalTime time = LocalTime.now();
        Part1 part1Runner = new Part1();
       
        // print out blank line and header for each iteration of this test
        System.out.println("  ");
        System.out.println("main ****** " + time);
        
        // Run test cases for findSimpleGene
        part1Runner.testFindSimpleGene();
    }
}
