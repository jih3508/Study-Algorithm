package Medium;

public class AdditiveNumber {

  int lenth;
  String num;

  public boolean isAdditiveNumber(String num) {

    lenth = num.length();
    this.num = num;

    // 길이가 3이상 되어야 수열을 만들수 있다.
    if (lenth < 2 || num.charAt(0) == '0'){
      return false;
    }

    for (int i = 1; i < lenth - 2; i++) {
      for (int j = i+1; j < lenth - 1; j++) {
        if(backtracking(0, i, j)){
          return true;
        }
      }
    }

    return false;
  }

  public boolean backtracking(int start, int index1, int index2){

    String num1 = num.substring(start, index1);
    String num2 = num.substring(index1, index2);

    if(num1.equals(String.valueOf(Integer.parseInt(num1))) && num2.equals(String.valueOf(Integer.parseInt(num2)))){
      return false;
    }


    return false;
  }




}
