package naver_webtoon.socket_thread;

import naver_webtoon.method_reference.Customer;
import snow.day5.serializable.Person;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable{
    private Socket clientSocket;
    private List<Person> customers;

    public RequestHandler(Socket clientSocket, List<Person> customers) {
        this.clientSocket = clientSocket;
        this.customers = customers;
    }

    @Override
    public void run() {
        try{
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

            // 동기화 키워드를 이용한 데이터 누락 해결
            ListUtils.addList(customers, person);
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + person + "가 대기명단에 추가되었습니다." );
            System.out.println("클라이언트로 부터 온 요청은 " + person);
            printWriter.println("현재 고객대기명단은: " + customers);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
