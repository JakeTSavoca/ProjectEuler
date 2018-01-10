
//By considering the terms in the Fibonacci sequence
//whose values do not exceed four million,
//find the sum of the even-valued terms.

public class Project2{

    public static void main(String[] Args){
	System.out.println( getFib() );
    }

    public static long getFib(){
	long sum = 0;
	long[] fibArray = new long[10002];
	fibArray[0] = 1;
	fibArray[1] = 2;

	// we have x and y
	// x becomes y
	//y becomes x+z
	// save y as a temp variable 

	for (int x = 2; x < 10001; x++){
	    fibArray[x] = fibArray[x-2] + fibArray[x-1];
	}

	/*
	for (int p = 0; p < 11; p++){
	System.out.println(fibArray[p]);
	}
	*/

     
	    for (int k = 0; k < 50; k++){
		if (fibArray[k] % 2 == 0 && fibArray[k]<4000000){
		sum = sum + fibArray[k];
		//System.out.println( fibArray[10]); 
		}
	    }
	return sum; 
    }

}

	  


