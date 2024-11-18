# 피로도
## 문제 요약
- 일정 피로도를 사용해서 던전을 탐험할 수 있습니다. 이때, 각 던전마다 탐험을 시작하기 위해 필요한 "최소 필요 피로도"와 던전 탐험을 마쳤을 때 소모되는 "소모 피로도"가 있습니다.
-  "최소 필요 피로도"는 해당 던전을 탐험하기 위해 가지고 있어야 하는 최소한의 피로도를 나타내며, "소모 피로도"는 던전을 탐험한 후 소모되는 피로도를 나타냅니다.
- 한 유저가 탐험할수 있는 던전 수를 리턴하여라

## 문제풀이
 이번 문제는 백트레킹으로 풀어 나갈 생각이다. 그 이유는 단순 반복으로는 모든 경우의 수를 구현하기도 힘들고 A -> B -> C 일수도 있지만 C -> A -> B인 경우도 탐색 해야 되고 던전수도 많기 때문이다.
그래서 방문수를 최대할 수 있도록 모든 경우의 수를 구하는데 다한 조건을 더해서 방문여부로 남은 피로도를 체크만 하면 구현 하기는 쉽다.

## Code
```JAVA

import java.util.Arrays;

class Solution {

    int count;
    int size;
    int[][] dungeons;

    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        // 초기화
        this.count = 0;
        this.size = dungeons.length;
        this.dungeons = dungeons;

        // 각 던전 시작점을 잡고 탐색
        for (int i = 0; i < this.size; i++) {
            this.visited = new boolean[size];
            Arrays.fill(this.visited, false);
            if(k >= dungeons[i][0]){
                visited[i] = true;
                search(k - dungeons[i][1], dungeons[i], 1);
                visited[i] = false;
            }
        }

        return this.count;
    }

    /*
     * 탐색
     */
    public void search(int hp, int[] now, int number){
        //System.out.println(hp + ", " + Arrays.toString(now) + ", " + number);
        // 최대 개수 저장
        this.count = Math.max(this.count, number);
        for (int i = 0; i < this.size; i++) {
            // 방문여부 남은 피로도 확인
            if(!visited[i] && hp >= dungeons[i][0]){
                visited[i] = true;
                search(hp - dungeons[i][1], dungeons[i], number + 1);
                visited[i] = false;
            }
        }
    }

}

```