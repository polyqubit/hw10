import java.util.Random;
import java.util.ArrayList;

public class starter {
	
	//funny suggestion by gian
	public static void p(String a) {
		System.out.print(a);  //System.out.println(x); = p(x+"\n");
							  //cry about it
	}
	public static void p(int a) {
		System.out.print(a);  //necessary
	}
	//funny idea by me
	public static void dp(String inp, boolean print) {
		//another way to print, "dp" stands for "do print"
		if(print != !print) {
			System.out.print(inp);
		}
		else if(print = !false) {
			System.out.print(inp);
		}
		else {System.out.print(inp);}
	}
	public static void main(String args[]) {
		Random rand = new Random();
		int[] array = new int[30];  //20 is too small
		int check = rand.nextInt(10)+1;
		ArrayList<Integer> checks = new ArrayList<>();
		p("[ ");
		for(int i=0;i<array.length;i++) {
			array[i] = rand.nextInt(10)+1;
			p(array[i]);
			if(i<array.length-1) {p(", ");}
			if(array[i]==check) {
				checks.add(i);
			}
		}
		p(" ]\n\n");

		p("INDEXES of duplicates of "+check+": ");
		for(int i : checks) {
			p(i+" ");
		}
		check=0;
		p("\nTotal: "+checks.size()+"\n\nConsecutive duplicates(value,index): ");
		for(int i=0;i<array.length-1;i++) {
			if(array[i]==array[i+1]) {
				p("| {"+array[i]+","+i+"} ");
				p("{"+array[i+1]+","+(i+1)+"} |");
				check++;
			}
		}
		p("\nTotal: "+check);
	}
}
