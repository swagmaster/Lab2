


public class IntList {
	
	private int[] data = new int[100];
	private int numElements = 0;

	public static void main(String[] args) {
		IntList a = new IntList();
	    a.add(95); a.add(100); a.add(58);
	    System.out.println(a.toString() );
	    System.out.println(a.sum() );
	    System.out.println(a.indexOf(100)); 
	    System.out.println(a.indexOf(20));
	    //System.out.println(a.save() );

	}
	
	public void add(int n) {
	
		data[numElements++] = n;
	}
	
	public int sum(){
		int sumOflistOfObjectsay = 0;
		for(int i=0;i<numElements;i++){
			sumOflistOfObjectsay += data[i];
		}
		return sumOflistOfObjectsay;
	}

	public int indexOf(int target){
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] == target){
				return i;
			}
		}
		return -1; 
	}
	
	public String toString() {
		String retVal = "";
		for(int i=0;i<numElements;i++) {
			retVal += data[i] + ",";
		}
		  
		return retVal.substring(0,retVal.length()-1);
	}
}