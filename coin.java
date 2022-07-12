import java.util.Random;

public class coin{
    public static void main(String[] args) {
	int[] a = {0,1};
	int j = 0, m = 0;
	Random r = new Random();
	System.out.println("Tossing a coin...");
	for(int i = 1; i < 4; i++) {
	    int b = a[r.nextInt(2)];
	    System.out.print("Round "+ i+":");
	    if(b == 0) {
		System.out.println(" Heads");
		j++;
	    }
	    else {
		System.out.println(" Tails");
		m++;
	    }
	}
	
	System.out.println("Heads: "+j+", Tails: "+m);
    }
}
