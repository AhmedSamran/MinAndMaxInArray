
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A [] = {48,655,92,7,89,759,-5,6,7,3,94,87,6254,4 };
		findMinMaxStartingFromTheEnd(A, A[0], A[0],A.length -1);
		findMinMaxStartingFromTheBegining(A, A[0], A[0], 0);
	}
	
	public static void  findMinMaxStartingFromTheEnd(int [] A, int currentMin, int currentMax, int i) {
		if(i == 0) {
			System.out.println("findMinMaxStartingFromTheEnd");
			System.out.println("max is "+currentMax);
			System.out.println("min is "+currentMin);
			return;
		}
		if(A[i] > currentMax) {
			currentMax = A[i];
		}
		
		if(A[i] < currentMin) {
			currentMin = A[i];
		}
		findMinMaxStartingFromTheEnd(A, currentMin, currentMax, --i);
	}
	
	public static void  findMinMaxStartingFromTheBegining(int [] A, int currentMin, int currentMax, int i) {
		if(i == A.length - 1) {
			System.out.println("findMinMaxStartingFromTheBegining");
			System.out.println("max is "+currentMax);
			System.out.println("min is "+currentMin);
			return;
		}
		if(A[i] > currentMax) {
			currentMax = A[i];
		}
		
		if(A[i] < currentMin) {
			currentMin = A[i];
		}
		findMinMaxStartingFromTheBegining(A, currentMin, currentMax, ++i);
	}

}
