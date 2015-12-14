package queens;

import java.awt.Dimension;
import java.util.Arrays;

public class Queens {
	static int ArrSize = 8;
	public static void main(String[] args) {
		Arr queenArr = new Arr(8);
		queenArr =  FindQueenPositions(queenArr, 0 );
		System.out.println(queenArr.toString());

	}
	private static Arr FindQueenPositions(Arr queenArr, int QueenNum ){
		if (QueenNum == 8) {return queenArr; }
		 
			for (int j= 0; j < ArrSize; j++){
				if (itsAGoodPlace(QueenNum,j, queenArr)){ 
					queenArr.setArr(QueenNum,j, 1);  
					return  FindQueenPositions(queenArr, QueenNum + 1  );
				} if (j== ArrSize){  FindQueenPositions(queenArr, QueenNum - 1  );
			}
		}  return new Arr(ArrSize)  ;
	}


	private static Boolean itsAGoodPlace(int x, int y, Arr queenArr){
		if (checkDiagonals(x,y, queenArr)  && checkRows(x,y, queenArr)){
			return true;	} else {
				return false;
			}
	}
	private static Boolean checkDiagonals(int x, int y , Arr queenArr){

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

