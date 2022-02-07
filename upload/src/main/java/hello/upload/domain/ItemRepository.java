package hello.upload.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/02/06
 */
@Repository
public class ItemRepository {

    private final Map<Long, Item> store = new HashMap<>();

    private long sequence = 0L;

    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }

}
