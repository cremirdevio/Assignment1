/**
 * Ayodeji Randle
 * Student ID: 3584419
 * Comp 501
 * Date: November 28, 2022
 * Program Nmae: StringPermutation.java
 * Description: A Java program that outputs all of the possible strings formed using each of the characters ‘c’, ‘a’, ‘t’, ‘d’, ‘o’, and ‘g’ exactly once.
 */

/**
 * DOCUMENTATION
 */

/**
 * Purpose and Description
 * 
 * PURPOSE:
 * A Java program that outputs all of the possible strings formed using each of the characters ‘c’, ‘a’, ‘t’, ‘d’, ‘o’, and ‘g’ exactly once.
 * 
 * DESCRIPTION:
 * 
 * This works by looping through each character and the other characters in a nested loop to combine each letter
 * to form words just one.
 * 
 * COMPILING AND RUNNING INSTRUCTION
 * 
 * Assuming SDK 1.3 (or later) and the CLASSPATH are set up properly.
 * Change to the directory containing the source code.
 * cd into the `src` directory
 * Compile:     `javac -cp . assignment_1/StringPermutation.java` 
 * Run:         `java assignment_1/StringPermutation` 
 * Document:    `javadoc assignment_1/StringPermutation.java` 
 * 
 * <H3>Test Plan</H3>
 * 
 * <p>
 * 1. Run the program.
 * EXPECTED:
 * Console should display:
 * <pre>
 *    *******************************************
 *    *********** Parsing Commands ************** 
 * </pre>
 * 
 * Then each Event will start according to the formatted commands <b>greenhouse_plan.txt<b> file.
 * 
 * ACTUAL:
 * Console display as expected
 * </p>
 * 
 * <p>
 * 2. Good Data.
 * 
 * EXPECTED:
 * Console should display:
 * <pre>
 *    *******************************************
 *    *********** Parsing Commands ************** 
 * </pre>
 * 
 * Then each Event will start according to the formatted commands <b>greenhouse_plan.txt<b> file.
 * 
 * ACTUAL:
 * Console display as expected
 * </p>
 * 
 * 
 * <p>
 * 3. Bad Data.
 * 
 * EXPECTED:
 * Modify the greenhouse_plan.txt to an inconsistent pattern.
 * 
 * Greenhouse terminates with option to restart.
 * 
 * ACTUAL:
 * Greenhouse terminates stating the cause of the error.
 * </p>
 * 
 */
package assignment_1;

/** primary (public) class for StringPermutation */
class StringPermutation {

	static char[] chars = {'c', 'a', 't', 'd', 'o', 'g'};
    static boolean[] used = new boolean[chars.length];
    static StringBuilder sb = new StringBuilder();
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
	    permute(0);
	    
	}
	
	/**
	 * This function performs a permutation on the chars array.
	 *
	 * @param int pos
	 */
	public static void permute(int pos) {
        if (pos == chars.length) {
            System.out.println(sb);
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (!used[i]) {
                used[i] = true;
                sb.append(chars[i]);
                permute(pos + 1);
                used[i] = false;
                sb.setLength(sb.length() - 1);
            }
        }
    }

}
