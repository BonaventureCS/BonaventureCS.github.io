/**
 * A collection of methods that can be expanded as students learn more
 * 
 * @author David Levine
 * @version 9 March 2014
 *
 */
public class Fun {

    /**
     * Compute the sum of the factors of a given number.
     * 
     * @param n the value whose factors are being summed
     * @return the sum of the factors of <code>n</code>
     */
    public static int sumOfFactors(int n) {
        int total = 0;
        for (int factor=1; factor<=n; factor++) {
            if (n%factor == 0) {
                total += factor;
            }
        }
        return total;
    }
    
    /**
     * Determine whether or not an average is sufficient to pass a course.  
     * We assume that 60% is necessary to pass the course.
     * 
     * @param average the semester average
     * @return <code>true</code> iff the student passes the course
     */
    public static boolean passFail(double average) {
        return (average >= 59.5);  // Since 59.5 and up "round" to a passing score
    }
    
    /**
     * Perform a simple encryption on the given word
     * 
     * @param word the word to encrypt
     * @return the encrypted version of the word
     * 
     */
    public static String encrypt(String word) {
        String code = "";
        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            char xc = ' ';
            if (Character.isLetter(c)) {
                if (c=='z') {
                    xc = 'a';
                }
                else if (c=='Z') {
                    xc = 'A';
                }
                else {
                    xc = (char) (c+1);
                }
            }
            else {
                xc = c;
            }
            code += xc;
        }
        return code;
    }
}
