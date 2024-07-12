package Medium;

import java.util.Arrays;

public class ValidSudoku {


    int[][] sudokuBoard;

    public boolean isValidSudoku(char[][] board) {

        sudokuBoard = new int[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                sudokuBoard[i][j] = board[i][j] == '.'? 0 : board[i][j] - '0';
            }
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(sudokuBoard[i][j] != 0 && !isSudoku(i, j, sudokuBoard[i][j])){
                    return false;
                }
            }
        }

        return true;
    }


    /*
     * 가로 세로 숫자가 있는지 판별하는 메소드
     */
    public boolean isCross(int x, int y, int num){

        for(int i = 0; i < 9; i++){
            if((i != x && sudokuBoard[i][y] == num)|| (i != y && sudokuBoard[x][i] == num)){
                return false;
            }
        }

        return true;
    }

    /*
     * 가로 세로 숫자가 있는지 판별하는 메소드
     */
    public boolean isBox(int x, int y, int num){

        int boxX = x - (x % 3);
        int boxY = y - (y % 3);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(((boxX + i) != x && (boxY + j != y) )  && sudokuBoard[i+boxX][j+boxY] == num){
                    return false;
                }
            }
        }

        return true;
    }

    /*
     * 스도쿠 판별 가능한지 확인하는 메소드
     */
    public boolean isSudoku(int x, int y, int num){
        return isCross(x, y, num) && isBox(x, y, num);
    }


    public static void main(String[] args) {

        ValidSudoku obj = new ValidSudoku();
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(obj.isValidSudoku(board));
        board = new char[][] {{'8','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(obj.isValidSudoku(board));
        board = new char[][] {{'.','8','7','6','5','4','3','2','1'}
                ,{'2','.','.','.','.','.','.','.','.'}
                ,{'3','.','.','.','.','.','.','.','.'}
                ,{'4','.','.','.','.','.','.','.','.'}
                ,{'5','.','.','.','.','.','.','.','.'}
                ,{'6','.','.','.','.','.','.','.','.'}
                ,{'7','.','.','.','.','.','.','.','.'}
                ,{'8','.','.','.','.','.','.','.','.'}
                ,{'9','.','.','.','.','.','.','.','.'}};
        System.out.println(obj.isValidSudoku(board));

    }
}
