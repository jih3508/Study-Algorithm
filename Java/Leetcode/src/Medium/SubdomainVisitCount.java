package Medium;

import java.util.*;

public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {

        // 각 서브도메인과 방문 횟수를 저장하기 위한 맵
        Map<String, Long> domainCountMap = new HashMap<>();

        for (String cpdomain : cpdomains) {
            // 입력 문자열을 공백으로 분리하여 방문 횟수와 도메인을 추출
            String[] parts = cpdomain.split(" ");
            long count = Long.parseLong(parts[0]); // 방문 횟수 추출
            String domain = parts[1]; // 도메인 추출

            // 도메인을 점(.) 기준으로 분리하여 서브도메인 배열 생성
            String[] subdomains = domain.split("\\.");

            // 서브도메인을 생성하면서 방문 횟수를 맵에 업데이트
            StringBuilder subdomainBuilder = new StringBuilder();
            for (int i = subdomains.length - 1; i >= 0; i--) {
                if (subdomainBuilder.length() > 0) {
                    subdomainBuilder.insert(0, "."); // 앞에 점(.) 추가
                }
                subdomainBuilder.insert(0, subdomains[i]); // 현재 서브도메인 추가
                String subdomain = subdomainBuilder.toString();
                // 맵에 서브도메인을 추가하거나 기존 값에 방문 횟수를 더함
                domainCountMap.put(subdomain, domainCountMap.getOrDefault(subdomain, 0L) + count);
            }
        }

        // 결과 리스트 생성 ("방문 횟수 도메인" 형식으로 변환)
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Long> entry : domainCountMap.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey()); // 포맷: "방문 횟수 도메인"
        }

        return result;
    }

    public static void main(String[] args) {
        SubdomainVisitCount obj = new SubdomainVisitCount();
        String[] cpdomains = new String[] {"9001 discuss.leetcode.com"};
        System.out.println(obj.subdomainVisits(cpdomains));

        cpdomains = new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(obj.subdomainVisits(cpdomains));
    }
}
