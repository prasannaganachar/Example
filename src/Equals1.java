
public class Equals1 {
	
	String s="Test";
	  //int i = 10;
	  
	  public Equals1() {}
	  
	  public Equals1(String st) {
		  this.s = st;
		  //this.i = b;
	 }
	  public boolean equals(Equals1 othobj) {
		 return this.s.equals(othobj.s);
	  }

	  public final int hashcode() {
		  return s.hashCode();
	  }
}
