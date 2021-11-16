public class starter {
	//comb sort method
	//comb sort acts like bubble sort except instead of a fixed comparing distance of 1, comb sort starts by comparing
	//elements with a gap of (array size / shrink factor). This serves to eliminate small values at the end of the array
	//that bubble sort would take at worst (array.length) extra cycles to sort. The gap shrinks each cycle so that values
	//near each other are sorted completely.
	public static void sortMethod(int[] array) {
		double shrinkFactor = 1.3;                    //initialize shrink factor
		int gap =(int)(array.length/shrinkFactor);    //initialize gap
		int temp;                                     //temporary storage int for switching elements
		boolean sorted = false;                       //sorted check
		while(!sorted) {                              //while array is not sorted
			for(int i=0;i<array.length-gap;i++){      //starts from element 0, ends at length-gap so that array[i+gap] is not out of bounds
				if(array[i]>array[i+gap]) {           //if element i is more than element i+gap
					temp = array[i];                  //temp storage variable
					array[i] = array[i+gap];          //switch high element to proper position
					array[i+gap] = temp;              //switch low element to proper position
				}
				else {sorted = true;}                 //sorted is set to true when no switches have been made
			}
			if(sorted&&(gap!=1)) {sorted=false; gap=(int)(gap/shrinkFactor);} //if sorted but possibly not entirely sorted, boolean sorted is set to false and the cycle repeats
			else {gap=(int)(gap/shrinkFactor);}       //else, shrink the gap anyway
		}
	}
	/*****    if you recognize this code it's because it's recycled from previous hw
	******/
	public static void main(String args[]) {
		
	}
}
