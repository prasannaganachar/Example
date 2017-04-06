
public class TestQuiz {

	@SuppressWarnings("finally")
	static int getData() {
		try {
			//return 1;
			throw new RuntimeException( );
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			// if remove the comment = output is 2;
			return 2;
			//System.out.println("fialyy");
		}
		//return 0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter");
		System.out.println("data :" + getData());
		
		int[] sku = {5, 6, 7, 4, 8, 2, 3,1};
		
		/*for(int i=0; i<sku.length; i++) {
			System.out.println("enter :"+sku[i]);
		} */
	}

}
