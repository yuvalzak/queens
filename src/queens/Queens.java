package queens;

import java.awt.Dimension;
import java.util.Arrays;

public class Queens {
	static int ArrSize = 8;
	public static void main(String[] args) {
		Arr queenArr = new Arr(8);
		queenArr =  FindQueenPositions(queenArr, 0);
		System.out.println(queenArr.toString());

	}
	private static Arr FindQueenPositions(Arr queenArr, int QueenNum){
		if (QueenNum == 7) {return queenArr; }
		for(int i = 0; i< ArrSize; i++){
			for (int j= 0; j < ArrSize; i++){
				if (itsAGoodPlace(i,j)){ 
					queenArr.setArr(i,j, 1);  
					return  FindQueenPositions(queenArr, QueenNum+1 );
				}
			}
		}  return new Arr(ArrSize)  ;
	}


	private static Boolean itsAGoodPlace(int x, int y){
		if (checkDiagonals(x,y)  && checkRows(x,y)){
			return true;	} else {
				return false;
			}
	}
	private static Boolean checkDiagonals(int x, int y){

		return true;
	}

	private static Boolean checkRows(int x, int y){

		return true;
	}
}

