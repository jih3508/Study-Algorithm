package Medium;

import java.util.*;

public class RestoreIPAddresses {

  List<String> IP;
  String s;
  int len;

  public List<String> restoreIpAddresses(String s) {
    this.IP = new ArrayList<String>();
    this.s = s;
    this.len = s.length();

    Backtracking(0, 0, new String[4]);
    return this.IP;
  }

  public void Backtracking(int to, int i, String[] address){

    if((to == this.len && i < 4) || (to < this.len && i == 4)){
      return;
    }

    if(to == this.len && i == 4){
      StringBuilder sb = new StringBuilder();
      for(int k = 0; k < 3; k++){
        sb.append(address[k]).append(".");
      }
      sb.append(address[3]);
      this.IP.add(sb.toString());
      return;
    }

    for(int k = 0; k < 3; k++){
      int from = to + k + 1;

      if(from <= this.len){
        String bit32 = this.s.substring(to, from);
        int intBit32 = Integer.parseInt(bit32);
        if(bit32.length() == String.valueOf(intBit32).length() && intBit32 < 256){
          address[i] = bit32;
          Backtracking(from, i + 1, address);
          address[i] = "";
        }
      }else{
        break;
      }
    }

  }

  public static void main(String[] args) {
    RestoreIPAddresses ria = new RestoreIPAddresses();
    System.out.println(ria.restoreIpAddresses("25525511135"));
    System.out.println(ria.restoreIpAddresses("0000"));
    System.out.println(ria.restoreIpAddresses("101023"));
  }

}
