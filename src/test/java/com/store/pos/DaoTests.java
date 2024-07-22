package com.store.pos;

import com.store.pos.dao.InventoryDao;
import com.store.pos.model.Inventory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DaoTests {

    @Autowired
    private InventoryDao inventoryDao;

    @Test
    void getAllInventory() {

        //1. Setup mock data
        List<Inventory> mockData = new ArrayList<>();
        mockData.add(new Inventory(0, 10, 23.45, "Cinnamoroll Night Light"));
        mockData.add(new Inventory(0, 4, 23.45, "Hello Kitty Ramune Drink"));
        mockData.add(new Inventory(0, 2, 23.45, "Hello Kitty Plushie"));

        mockData.forEach(inventory -> inventoryDao.save(inventory));

        //2. Perform action being tested, in this case test we get correct results from fetching all inventory
        List<Inventory> inventory = inventoryDao.getAllInventory();

        assertEquals(3, inventory.size());
    }
}
