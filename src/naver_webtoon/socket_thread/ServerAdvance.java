package naver_webtoon.socket_thread;

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
                    Socket clientSocket = serverSocket.accept();
                    Thread thread = new Thread(new RequestHandler(clientSocket, customers));
                    thread.start();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
