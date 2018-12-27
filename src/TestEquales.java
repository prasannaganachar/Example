
public class TestEquales {
	
	private int num;
	private String data;
	/*private long num2;
	private float fltNum;
	private double dblNum;
	*/
	
	TestEquales() {}
	
	TestEquales(int number, String inpData) {
		this.num = number;
		this.data = inpData;
	}
	
	
	/*public boolean equals(Object obj) {
		//return true;
		
		return true;
	}*/
	/*
	 * Do not change the type of the argument of the equals method. 
	 * It takes a java.lang.Object as an argument, do not use your own class instead. 
	 * If you do that, you will not be overriding theequals method, but you will be overloading it instead; 
	 * which would cause problems. It is a very common mistake, and since it does not result in a compile time error, 
	 * it becomes quite difficult to figure out why the code is not working properly.
	 */
	/*public boolean equals1(Object obj) {
		
		
		if (this == obj)
			return true;
		
		
		 * if((obj == null) || (obj.getClass() != this.getClass())) return false; // prefer
		 * This conditional check should be preferred instead of the conditional check given by -
		 * if(!(obj instanceof Test)) return false; // avoid
		 
		
		if ((obj == null) || (obj.getClass() != this.getClass()))
			return false;
		
		TestEquales testEquales = (TestEquales) obj;
		
		return this.num == testEquales.num && (this.data == testEquales.data || (data != null && data.equals(testEquales.data)));
	}*/
	
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + num;
		hash = 31 * hash + (data == null ? 0 : data.hashCode());
				
		return hash;
		
		//return (int) Math.round(10);
		//return 1;
	}

	/*
	 * 2.	Involve significant variables of your object in the calculation of the hash code, all the variables that are part of equals comparison should be considered for this. Compute an individual hash code int var_code for each variable var as follows -
		a.	If the variable(var) is byte, char, short or int, then var_code = (int)var;
		b.	If the variable(var) is long, then var_code = (int)(var ^ (var >>> 32));
		c.	If the variable(var) is float, then var_code = Float.floatToIntBits(var);
		d.	If the variable(var) is double, then -
		long bits = Double.doubleToLongBits(var);
		var_code = (int)(bits ^ (bits >>> 32));
		e.	If the variable(var) is boolean, then var_code = var ? 1 : 0;
		f.	If the variable(var) is an object reference, then check if it is null, if yes then var_code = 0; otherwise invoke the hashCode method recursively on this object reference to get the hash code. This can be simplified and given as -
		var_code = (null == var ? 0 : var.hashCode());
		3.	Combine this individual variable hash code var_code in the original hash code hash as follows - 
		hash = 31 * hash + var_code;

	 */
	
	/*public int hashCode() {
		int hash = 7;
		long dobleCode = Double.doubleToLongBits(dblNum);
		hash = 31 * hash + num;
		hash = 31 * hash + (Float.floatToIntBits(fltNum));
		hash = (int) (31 * hash + (dobleCode ^ (dobleCode >>> 32)));
		return hash;
	}*/

}
