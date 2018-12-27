import java.util.Scanner;


public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter N*N Matrix Size");
		
		Scanner sc = new Scanner(System.in);
		
		Long number = sc.nextLong();

		System.out.println("Number :" + number);
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				System.out.print(i +""+j + " ");
			}
			System.out.println("");
		}

	}

}
