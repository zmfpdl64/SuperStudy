package naver_webtoon.socket_thread;

import snow.day5.serializable.Person;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        // TODO: 소캣 생성

        try(Socket socket = new Socket("localhost", 1234)){ // 서버 연결 요청
            // TODO: 서버로 데이터를 보내기 위한 OutputStream 생성
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream printWriter = new ObjectOutputStream(outputStream);

            // 서버로 데이터를 받기 위한 InputStream 생성
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


            //서버에 메시지 전송
            Person person = new Person("이순신", 20, "남자");
            printWriter.writeObject(person);
            String response = bufferedReader.readLine();
            System.out.println("서버로 부터 받은 응답: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
