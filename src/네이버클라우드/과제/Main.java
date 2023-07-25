package 네이버클라우드.과제;

import 네이버클라우드.과제.dao.ItemRepository;
import 네이버클라우드.과제.service.StoreInterface;
import 네이버클라우드.과제.entity.*;
import 네이버클라우드.과제.service.Store;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        // 정상적으로 동작
        Item normalItem = new Item("나이키 신발", 30_000, 10, "가볍고 푹신함");
        // 재고가 없는 아이템
        Item noQuantityItem = new Item("가디건", 50_000, 0, "내츄럴하게 꾸민듯 안꾸민듯함");
        // 너무 비싼 아이템
        Item expensiveItem = new Item("구찌 지갑", 1_000_000, 5, "내구성과 디자인");

        List<Item> items = new ArrayList<>(List.of(
                normalItem,
                noQuantityItem,
                expensiveItem
        ));

        Guest guest = new Guest("Guest", 100_000, true, Feeling.SOSO, normalItem);
        DeliveryDriver deliveryDriver =new DeliveryDriver("신속정확_베스트드라이버_마리오", 0, 3_000, 3);
        StoreClerk storeClerk = new StoreClerk("친절하고_가족같은_도라에몽", 0);
        ItemRepository itemRepository = new ItemRepository(items);


        StoreInterface store = new Store(storeClerk, deliveryDriver, itemRepository);

        store.goToStore(guest);
        System.out.println();

        guest.setItem(noQuantityItem);
        store.goToStore(guest);

        System.out.println();
        guest.setItem(expensiveItem);
        store.goToStore(guest);
    }
}
