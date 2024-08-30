
public class selectSortDemo {

	public static void main(String[] args) {
		

	}
	
	public static void selectSort(double[] data) {
		for(int pos = 0; pos < data.length; ++pos) {
			int smallestIx = pos;
			for(int i = pos + 1; i < data.length; ++i) {
				if(data[i] < data[smallestIx]) {
					smallestIx = i;
				}
			}
			swap(data, pos, smallestIx);
		}
	}
	
	public static void swap(double[] list, int ixA, int ixB) {
		double temp = list[ixA];
		list[ixA] = list[ixB];
		list[ixB] = temp;
	}

}
