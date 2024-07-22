package com.store.pos;
import com.store.pos.dao.InventoryDao;
import com.store.pos.model.Inventory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DaoTests {

    @Autowired
    private InventoryDao inventoryDao;

    @Test
    void getAllInventory() {
        List<Inventory> inventory = inventoryDao.getAllInventory();

        assertEquals(6, inventory.size());
    }
}
