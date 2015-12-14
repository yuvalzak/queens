package queens;

class Arr   {
	int[][] arr = null;
	int size ;

	public Arr(int[][] arr) {
		this.arr = arr;
	}
	public Arr(int arrSize){
		arr = new int[arrSize][arrSize];
		size = arrSize;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for ( int i = 0; i< size; i++) {
			sb = sb.append("\n");
			for (int j =0; j< size; j++){
				sb = sb.append("[" + arr[i][j]+ "]");	
			}
		}
		return sb.toString();
	}

	public int[][] getArr() {
		return arr;
	}
	public void setArr(int[][] arr) {
		this.arr = arr;
	}

	public void setArr(int x, int y, int v) {
		this.arr[x][y] = v;
	}

}	
