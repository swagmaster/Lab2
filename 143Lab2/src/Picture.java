public class Picture {
	
	private Object[] myShapes = new Object[100];
	private int numElements = 0;

	public static void main(String[] args) {
		Picture a = new Picture();
		a.add(95); a.add(100); a.add(58);
		System.out.println(a.toString());

	}
	
	public void add(Object n) {

		myShapes[numElements++] = n;
	}
	
	public String toString() {
		String retVal = "";
		for(int i=0;i<numElements;i++) {
			retVal += myShapes[i] + ",";
		}
		
		return retVal.substring(0,retVal.length()-1);
	}
}