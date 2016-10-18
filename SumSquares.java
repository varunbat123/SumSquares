//Varun Batra 110256128
public class SumSquares {
	public static int square(int i, int n){
		if(i==n){
			return i*i;
		}
		else
				return (i*i)+ square(i+1,n);
	}

	public static void main(String[] args) {
		System.out.println(square(2,4));
	}

}
