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

	public int getPlace(int x){
		int y;
		for(  y = 0 ; y<size; y++){
			if(arr[x][y] == 1){ return y ; }	
		}
		return 0;
		// did not find,  so for now this is good.
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String p1 = "[Q]";
		String p0 = "[ ]";
		for ( int i = 0; i< size; i++) {
			sb = sb.append("\n");
			for (int j =0; j< size; j++){
				if(arr[j][i]==1) {sb = sb.append(p1);}
				// it print not intiutivly, so i changed the x , y
				else{
					sb = sb.append(p0);	
				}
			}
		}
		return sb.toString();
	}

	public void print(){
		System.out.println(this.toString());
	}



	public Boolean getArr(int x, int y){
		if(arr[x][y] == 1) { return true;}
		return false;
	}

	public int[][] getArr() {
		return arr;
	}
	public void setArr(int[][] arr) {
		this.arr = arr;
	}

	public void setArr(int x, int y, int v) {
		this.arr[x][y] = v;
		/* try {

		 	//Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
	}

}	
