import java.util.Arrays;
import java.util.Random;

public class Miner{

	static Random RNG = new Random();

	static char[][] referenceTable;
	static int size;
	static int minesNumber;

	public static void main(String[] args){
		prepare('s');
		initTable();
		printArray(referenceTable);
	}

	public static void prepare(char sizeChar){
		switch(sizeChar){
			case 's':
			case 'S':
				size = 5;
				minesNumber = 7;
				break;
			case 'm':
			case 'M':
				size = 10;
				minesNumber = 20;
				break;
			default:
				size = 14;
				minesNumber = 30;
		}
	}

	public static int minesAround(int x, int y){
		int totalMines = 0;
		for(int i=x-1; i<=x+1; i++) {
			for(int j=y-1; j<=y+1; j++) {
				if(i>=size || j>=size || i<0 || j<0 || (x==i && y==j)){
					System.out.printf("x=%d,y=%d and i=%d,j=%d\n",x,y,i,j);
					continue;
				} else {
					if (referenceTable[i][j] == 'X'){
						totalMines++;
					}
				}
			}
		}
		return totalMines;
	}

	public static void initTable(){
		referenceTable = new char[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size;j++){
				referenceTable[i][j] = 'N';
			}
		}

		for(int i=0; i<minesNumber; i++){
			int x = RNG.nextInt(size);
			int y = RNG.nextInt(size);
			if(referenceTable[x][y] == 'X'){
				i--;
				continue;
			} 
			referenceTable[x][y] = 'X';
		}

		for(int i = 0; i<size; i++){
			for(int j = 0;j<size; j++){
				if (referenceTable[i][j]!='X'){
					referenceTable[i][j] = Character.forDigit(minesAround(i,j),10);
				}
			}
		}

	}
	public static void printArray(char[][] array){
		for(char[] line: array){
			for(char c: line){
				System.out.print(c + "\t");
			} System.out.println();
		}
	}
}