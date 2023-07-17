package 네이버클라우드.과제.dao;

import 네이버클라우드.과제.entity.Item;

import java.util.List;
import java.util.Optional;

public class ItemRepository {
    private final List<Item> items;

    
    // 아이템 세팅
    public ItemRepository(List<Item> itemRepository){
        this.items = itemRepository;
    }

    public Optional<Item> findItem(String itemName) {
        return Optional.ofNullable(items.stream()
                .filter(i -> i.getItemName().equals(itemName))
                .findFirst()
                .orElse(null));
    }

}
