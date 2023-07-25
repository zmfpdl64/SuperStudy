package naver_webtoon.socket_thread;

import naver_webtoon.method_reference.Customer;
import snow.day5.serializable.Person;

import java.util.List;

public class ListUtils {
    public synchronized static void addList(List<Person> customers, Person customer){
        customers.add(customer);
    }
}
