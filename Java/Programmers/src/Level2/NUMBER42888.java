package Level2;

import java.util.*;

public class NUMBER42888 {

    public String[] solution(String[] record) {

        Map<String, String> user = new HashMap<>();


        List<String[]> messages = new ArrayList<>();
        for(String str : record){
            StringTokenizer st = new StringTokenizer(str);
            String status = st.nextToken();
            String uuid = st.nextToken();

            switch (status){
                case "Enter": {
                    String name = st.nextToken();
                    messages.add(new String[] {uuid, "님이 들어왔습니다."});
                    user.put(uuid, name);
                    break;
                }
                case "Leave":{
                    messages.add(new String[]{uuid, "님이 나갔습니다."});
                    break;
                }
                case "Change":{
                    String name = st.nextToken();
                    user.put(uuid, name);
                    break;
                }
            }
        }

        int size = messages.size();
        String[] answer = new String[size];

        for (int i = 0; i < size; i++) {
            String[] data = messages.get(i);
            answer[i] = user.get(data[0]) + data[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        NUMBER42888 solution = new NUMBER42888();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution.solution(record)));
    }
}
