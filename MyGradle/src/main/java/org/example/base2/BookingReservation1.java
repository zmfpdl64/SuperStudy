package org.example.base2;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class BookingReservation1 {
    // MySQL 데이터베이스 연결 정보
    private static  String DB_URL;
    private static String DB_USER;
    private static String DB_PASSWORD;

    public static void main(String[] args) throws ClassNotFoundException {

        // TODO: 가고싶은 목직지로 가는 항공권 중 가장 빠른 것 하나를 찾는 쿼리
        String sqlQuery = "SELECT ticket_id" +
                " FROM airline_ticket " +
                " WHERE arrival_loc = ? " +
                " ORDER BY departure_at " +
                " LIMIT 1 ";

        // TODO: userId로 PassengerId 가져오는 쿼리
        String sqlQuery2 = "SELECT passenger_id " +
                " FROM passenger " +
                " WHERE user_id = ? ";

        // TODO: 예약하는 SQL 구문
        String sqlInsert = "INSERT INTO reservation (passenger_id, airline_ticket_id, reservation_status, reserve_at)" +
                " VALUES (?, ?, ?, ?) ";

        Scanner scanner = new Scanner(System.in);

        System.out.println("예약할 userId 입력해주세요~ ");
        Integer userId = Integer.valueOf(scanner.nextLine());
        System.out.println("가고 싶은 항공권 목적지를 입력해주세요~");
        String destination = scanner.nextLine();

        try(Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery);
            PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery2);
            PreparedStatement preparedStatement3 = connection.prepareStatement(sqlInsert);
        ) {

            preparedStatement1.setString(1, destination);
            ResultSet resultSet =  preparedStatement1.executeQuery();

            Integer ticketId = null;
            if (resultSet.next() ) ticketId = resultSet.getInt("ticket_id");

            System.out.println("가고싶은 목적지를 가는 티켓 ID를 찾았습니다~" + ticketId );

            if (ticketId == null) {
                System.out.println("목적지로 가는 항공권이 없습니다. 예약이 불가합니다.");
                return;
            }

            preparedStatement2.setInt(1, userId);
            ResultSet resultSet2 = preparedStatement2.executeQuery();

            Integer passengerIdRow = null;
            if (resultSet2.next() ) passengerIdRow = resultSet2.getInt("passenger_id");

            Integer passengerId = Optional.ofNullable(passengerIdRow).orElseThrow(() -> new RuntimeException("해당 ID가 없습니다."));

            preparedStatement3.setInt(1, passengerId);
            preparedStatement3.setInt(2, ticketId);
            preparedStatement3.setString(3, "대기");
            preparedStatement3.setDate(4, Date.valueOf(LocalDate.now()));

            preparedStatement3.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}