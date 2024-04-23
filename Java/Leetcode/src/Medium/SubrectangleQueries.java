package Medium;

public class SubrectangleQueries {

  int[][] rectangle;

  /*
   * 2차원 배열 값 초기화
   */
  public SubrectangleQueries(int[][] rectangle) {
    this.rectangle = rectangle;
  }

  /*
   * 범위안에 값 갱신
   */
  public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {

    for (int i = row1; i <= row2; i++) {
      for (int j = col1; j <= col2; j++) {
        this.rectangle[i][j] = newValue;
      }
    }

  }

  /*
   * 위치에 있는 값 출력
   */
  public int getValue(int row, int col) {
    return this.rectangle[row][col];
  }

  public static void main(String[] args) {
    System.out.println("#case1");
    SubrectangleQueries srq = new SubrectangleQueries(new int[][] {{1,2,1},{4,3,4},{3,2,1},{1,1,1}});
    System.out.println(srq.getValue(0, 2));
    srq.updateSubrectangle(0,0,3,2,5);
    System.out.println(srq.getValue(0, 2));
    System.out.println(srq.getValue(3, 1));
    srq.updateSubrectangle(3,0,3,2,10);
    System.out.println(srq.getValue(3, 1));
    System.out.println(srq.getValue(0, 2));


    System.out.println("#case2");
    srq = new SubrectangleQueries(new int[][] {{1,1,1},{2,2,2},{3,3,3}});
    System.out.println(srq.getValue(0, 0));
    srq.updateSubrectangle(0,0,2,2,100);
    System.out.println(srq.getValue(0, 0));
    System.out.println(srq.getValue(0, 2));
    srq.updateSubrectangle(1,1,2,2,20);
    System.out.println(srq.getValue(2, 2));
  }
}
