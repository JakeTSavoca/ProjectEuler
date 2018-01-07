//If we list all the natural numbers below 10 that are multiples of 3 or 5,
//we get 3, 5, 6 and 9. The sum of these multiples is 23.

//Find the sum of all the multiples of 3 or 5 below 1000.
    

public class Project1{
    public static void main(String[] Args){
	System.out.println( getMultiples(100) );
    }

    //find all multiples of 3 and 5 below a certain number
    public static int getMultiples(int number){
	int sum = 0; 
	//create loop
	for (int i=0; i < 1000; i++){
	    if ((i%3 == 0) || (i%5 == 0)){
		sum = i + sum;
	    }
	}
	return sum; 
    }
    
}
