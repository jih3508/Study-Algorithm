package Medium;

import java.util.HashMap;
import java.util.Map;

public class EncodeandDecodeTinyURL {

    String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Map<String, String> urlMap = new HashMap<>(); // 인코딩 url 저장용 자료구조


    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encodingUrl = "http://tinyurl.com/";
        // 6자리로 랜덤 문자열을 만들어서 urlMap에 저장한다.
        for (int i = 0; i < 6; i++) {
            encodingUrl += map.charAt( (int)(Math.random() * map.length()));
        }
        urlMap.put(encodingUrl, longUrl);
        return encodingUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        // 저장한 urlMap에 가져온다.
        return urlMap.get(shortUrl);
    }

}
