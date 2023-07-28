package org.example.base2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <TODO>
 *     유저의 userID와 목적지를 하나를 받습니다.
 *      목적지로 가는 '왕복' 또는 '편도' 항공권 중 가장 출발이 빠른 항공권으로 예약을 진행 합니다.
 *      만약 가는 목적지로 가는 항공권'이 없다고 하고 예약을 진행하지 않습니다.
 *      만약 userId에 해당하는 Passenger ID가 없다면 RuntimeException를 뱉어야 합니다.
 */

public class BookingReservation {
    // MySQL 데이터베이스 연결 정보
    private static  String DB_URL;
    private static  String DB_USER;
    private static  String DB_PASSWORD;

    public static void main(String[] args) throws ClassNotFoundException {

        // TODO: 가고싶은 목직지로 가는 항공권 중 가장 빠른 것 하나를 찾는 쿼리
        String sqlQuery = "SELECT like_travel_place" +
                "FROM users " +
                "WHERE user_id = ?";

        // TODO: userId로 PassengerId 가져오는 쿼리
        String sqlQuery2 = "SELECT passenger_id FROM passenger WHERE user_id = ?";

        // TODO: 예약하는 SQL 구문
        String sqlInsert = "INSERT INTO reservation(passenger_id, airline_ticket_id, reservation_status, reserve_at) "+
                " VALUE (?, null, '대기', NOW() )";

        String DB_URL = "jdbc:mysql://localhost:3306";
        String DB_USER = "root";
        String DB_PW = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("예약할 userId 입력해주세요~ ");
        Integer userId = Integer.valueOf(scanner.nextLine());
        System.out.println("가고 싶은 항공권 목적지를 입력해주세요~");
        String destination = scanner.nextLine();

        // TODO: Connection 연결 및 Statement 정의
        try(Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
            PreparedStatement pr1 = connection.prepareStatement(sqlQuery);
            PreparedStatement pr2 = connection.prepareStatement(sqlQuery2);
            PreparedStatement pr3 = connection.prepareStatement(sqlInsert);
        ) {

            // TODO: 가고싶은 목직지로 가는 항공권 중 가장 빠른 airline의 ticketId 가져오기
//            pr1.setInt(1, userId);
//            ResultSet resultSet = pr1.executeQuery();

//            int likeTravelPlace = 0;
//            while(resultSet.next()){
//                likeTravelPlace = resultSet.getInt("user_id");
//            }



            // TODO: userId에 해당하는 passengerId 가져오기
            pr2.setInt(1, userId);
            ResultSet resultSet = pr2.executeQuery();
            int passengerId = 0;
            while(resultSet.next()){
                passengerId = resultSet.getInt("passenger_id");
            }

            // TODO: passengerId, ticketId로 예약하기 ( 처음 상태는 대기 )
            pr3.setInt(1, passengerId);
            ResultSet resultSet1 = pr3.executeQuery();

            System.out.println("예약 완료");


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}