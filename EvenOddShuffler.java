import java.util.Random;
public class EvenOddShuffler {
	
	/**
	 * @author Süleyman ATILGAN
	 */

	/*
    public static void main(String[] args) {
        int[] solutionArray = {1, 2, 3, 4, 5, 6, 7, 8};
        shuffle(solutionArray);
        for (int i = 0; i < solutionArray.length; i++) {
            System.out.print(solutionArray[i] + " ");
        }
        System.out.println();
    }*/
    
	/**
	 * 
	 * @param array Parameter as an integer array to shuffle its odd and even indexes
	 * @return method returns shuffled integer array
	 */
    static int[] shuffle(int[] array) {	
    	Random rand = new Random();
    	
        for (int i = array.length - 1; i > 0; i=i-2) {

        	int index = rand.nextInt(i + 1);
        	if(index%2==0)
        		index++;
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        
        for (int i = array.length - 2; i > 0; i=i-2) {
        	
        	int index = rand.nextInt(i + 1);
        	if(index%2==1)
        		index++;
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }
}