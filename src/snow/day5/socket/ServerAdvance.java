package snow.day5.socket;

import snow.day1.upcast.C;
import snow.day4.팀장님지시사항.Customer;
import snow.day5.serializable.Person;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {
    public static void main(String[] args) {

        List<Person> customers = new ArrayList<>();


        try(ServerSocket serverSocket = new ServerSocket(1234)){// 서버 소캣 생성
            System.out.println("서버가 시작되었습니다.");
            while(true){
                try//클라이언트 접속 대기
                {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("클라이언트가 접속하였습니다.");

                    // TODO: 클라이언트부터 데이터를 받기 위한 InputStream 생성
                    InputStream clientInputStream = clientSocket.getInputStream();
                    ObjectInputStream bufferedReader = new ObjectInputStream(clientInputStream);

                    // TODO: 클라이언트로 데이터를 보내기 위한 OutputStream 생성
                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

                    // inputLine;
                    String inputLine;
                    //TODO: 클라이언트로부터 데이터를 읽고 화면에 출력
                    Person person= (Person) bufferedReader.readObject();
                    customers.add(person);
                    System.out.println("Thread " + Thread.currentThread().getName() + ": " + person + "가 대기명단에 추가되었습니다." );
                    System.out.println("클라이언트로 부터 온 요청은 " + person);
                    printWriter.println("현재 고객대기명단은: " + customers);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
