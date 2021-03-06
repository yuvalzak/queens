package queens;


public class Queens {
	static int ArrSize = 8;
	public static void main(String[] args) {
		Arr queenArr = new Arr(ArrSize);
		queenArr =  FindQueenPositions(queenArr, 0 , 7);
		System.out.println(queenArr.toString());

	}
	private static Arr FindQueenPositions(Arr queenArr, int QueenNum, int startAt ){
		if (QueenNum == ArrSize) {return queenArr; }
		 int j;
			for (  j= startAt; j < ArrSize; j++){
				if (itsAGoodPlace(QueenNum,j, queenArr)){ 
					queenArr.setArr(QueenNum,j, 1); 
				//	queenArr.print();
					return  FindQueenPositions(queenArr, QueenNum + 1, 0  );
				}} if (j== ArrSize){  
		// we have to go back, clean the array, and start one down
					QueenNum -=1;
					int position = queenArr.getPlace(QueenNum);
					 queenArr.setArr( QueenNum, position,0);
					FindQueenPositions(queenArr, QueenNum ,position+1  );
			 
		}  return queenArr ;// return new Arr(ArrSize)  ;
	}


	private static Boolean itsAGoodPlace(int x, int y, Arr queenArr){
		if (  checkRows(x,y, queenArr) 
			 	&&	checkDiagonals(x,y, queenArr)   
				)	{
			return true;	} else {
				return false;
			}
	}
	private static Boolean checkDiagonals(int x, int y , Arr queenArr){
		// something not good in diagonals !!
		////////////////////////////////////////
	 	 for (int xx = 0; xx < x; xx++){
	 		   
	    	if( ( y- ( x -xx  )>-1) &&   queenArr.getArr(xx,  y- ( x -xx  ) )  ) {
	    	 	  return false;
	     	  }   if( y+ ( x -xx  )< ArrSize   &&   queenArr.getArr(xx, y+ ( x -xx  ) )     ) {
	    		  return false;
	    	  } 
	       } 
	return true;
	}

	private static Boolean checkRows(int x, int y , Arr queenArr){
       for (int xx = 0; xx < ArrSize; xx++){
    	  if(queenArr.getArr(xx, y)   && xx != x ) {
    		  return false;
    	  } 
       }return true;
		
	}
}

