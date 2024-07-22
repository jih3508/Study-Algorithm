package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class NUMBER17686 {

    /*
     * 파일 객체
     */
    public class File{
        String HEAD;
        int NUMBER;

        String name;

        File(String file){
            this.name = file;
            int length = file.length();
            //  파일 문자열 위치 지정 변수
            int i = 0;
            int j = 0;
            while(i < length){
                // HEAD부분 저장
                if(HEAD == null &&(file.charAt(i) != ' ' && Character.isDigit(file.charAt(i)))){
                    j = i;
                    HEAD = file.substring(0, i).toLowerCase();
                }
                // NUMBER 저장
                if(HEAD != null && (!Character.isDigit(file.charAt(i)) || i - j > 5)){
                    break;
                }
                i++;
            }
            NUMBER = Integer.parseInt(file.substring(j, i));

        }

        @Override
        public String toString() {
            return "File{" +
                    "HEAD='" + HEAD + '\'' +
                    ", NUMBER=" + NUMBER +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public String[] solution(String[] files) {

        int length = files.length;
        File[] Files = new File[length];
        for (int i = 0; i < length; i++) {
            Files[i] = new File(files[i]);
        }

        String[] answer = new String[length];

        Arrays.sort(Files, new Comparator<File>() {
            /*
             * HEAD > NUMBER 순으로 정렬
             */
            @Override
            public int compare(File file1, File file2) {

                if(file1.HEAD.equals(file2.HEAD)){
                    return file1.NUMBER - file2.NUMBER;
                }
                return file1.HEAD.compareTo(file2.HEAD);
            }
        });

        for (int i = 0; i < length; i++) {
            System.out.println(Files[i].toString());
            answer[i] = Files[i].name;
        }

        return answer;
    }


    public static void main(String[] args) {
        NUMBER17686 solution = new NUMBER17686();
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        System.out.println(Arrays.toString(solution.solution(files)));
        files = new String[] {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        System.out.println(Arrays.toString(solution.solution(files)));

    }
}
