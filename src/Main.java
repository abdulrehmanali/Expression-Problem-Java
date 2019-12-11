import java.util.Scanner;
import java.util.ArrayList; 
public class Main {
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		Scanner scannerObj = new Scanner(System.in);
	    System.out.println("Enter number:");
	    int n = Integer.parseInt(scannerObj.nextLine());
	    scannerObj.close();
	    ArrayList<Integer> r = runExprasion(n);
	    System.out.println("Un Sorted: "+r);
	    r = bubbleSort(r);
	    System.out.println("Sorted: "+r);
	    
	}
	public ArrayList<Integer> runExprasion(int n) {
		ArrayList<Integer>  results = new ArrayList<Integer>();
		int number_of_2 = 1;
				while (number_of_2 < n) {
					int number_of_powers_of_2and3 = number_of_2;
				    while (number_of_powers_of_2and3 < n) {
				    	results.add(number_of_powers_of_2and3);
				    	number_of_powers_of_2and3 *= 3;
				    }
				    number_of_2 *= 2;
				}
		return results;
	}
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayToSort) {
		boolean swap = true;
		int arrayKey = -1;
		  while (swap) {
		    swap = false;
		    arrayKey += 1;
		    for (int i = 1; i < arrayToSort.size() - arrayKey; i++) {
		      int fValue = arrayToSort.get(i - 1);
		      if (fValue > arrayToSort.get(i)) {
		    	  arrayToSort.set(i - 1, arrayToSort.get(i));
		    	  arrayToSort.set(i, fValue);
		        swap = true;
		      }
		    }
		  }
		return arrayToSort;
  }
}
