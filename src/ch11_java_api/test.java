package ch11_java_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class test {
	 public static void main(String[] args) throws Exception {
	        // URL 설정
	        URL url = new URL("https://api.upbit.com/v1/market/all");
	        
	        // URL 연결 (HttpURLConnection 객체 생성)
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	        // 요청 방식 설정 (GET or POST)
	        conn.setRequestMethod("GET");

	        // 연결 타임아웃 설정
	        conn.setConnectTimeout(5000); // 5초

	        // 읽기 타임아웃 설정
	        conn.setReadTimeout(5000); // 5초

	        // 요청 방식이 GET이므로, 디폴트 값인 true 설정
	        conn.setDoOutput(true);

	        // 응답 코드를 가져옵니다.
	        int responseCode = conn.getResponseCode();
	        if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
	            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            String inputLine;
	            StringBuffer response = new StringBuffer();

	            // 응답 내용을 가져옵니다.
	            while ((inputLine = in.readLine()) != null) {
	                response.append(inputLine);
	            }
	            in.close();
	            
	            // 결과를 출력합니다.
	            System.out.println(response.toString());
	        } else {
	            System.out.println("GET request not worked");
	        }

	        conn.disconnect();
	    }
}
