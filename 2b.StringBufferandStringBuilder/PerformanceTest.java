/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
package StringBuilderandStringBuffe;

public class PerformanceTest {

	    public static void main(String[] args) {
	        int iterations = 10000;
	        String text = "AIET";

	        // StringBuffer performance
	        long start = System.nanoTime();
	        StringBuffer sbuffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            sbuffer.append(text);
	        }
	        long end = System.nanoTime();
	        long timeBuffer = end - start;
	        System.out.println("StringBuffer time: " + timeBuffer + " ns");

	        // StringBuilder performance
	        start = System.nanoTime();
	        StringBuilder sbuilder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            sbuilder.append(text);
	        }
	        end = System.nanoTime();
	        long timeBuilder = end - start;
	        System.out.println("StringBuilder time: " + timeBuilder + " ns");

	        // Justification
	        if (timeBuffer > timeBuilder) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster (only likely in multi-threaded use).");
	        }
	    }
	}

