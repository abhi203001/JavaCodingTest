import java.util.Scanner;

/** TIME COMPLEXITY OF THE BELOW CODE IS O(N*(N)^(1/2))*/

public class AdditivePrime {
    /** function that calculates the sum of the number */
	public static int sumOfDigits(int num) {   // O(N)
		int sum =0;
		int temp=0;
		while(num!=0) {
			temp = num%10;
			num/=10;
			sum+=temp;
		}
		return sum;
	}
	
	/** function that check whether that number is prime or not*/
	public static boolean  isPrime(int num) {   // O(sqrt(N))
		boolean flag=false;
		for(int i=2;i*i<=num;i++) {
			if(num%i ==0) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {    // O(N)
			arr[i]=sc.nextInt();
			if(!isPrime(arr[i])) {
				int sum=sumOfDigits(arr[i]);
				if(!isPrime(sum)) {
					System.out.println(arr[i]);
				}
			}
		}
		
		
	}

}
