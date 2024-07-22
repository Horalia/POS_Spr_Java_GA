package com.store.pos.service;
import com.store.pos.dao.InventoryDao;
import com.store.pos.model.Inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService{
    private final InventoryDao inventoryDao;

    @Autowired
    public InventoryServiceImpl(InventoryDao inventoryDao) {
        this.inventoryDao = inventoryDao;
    }

    @Override
    public java.util.List<Inventory> getAllInventory() {
        return inventoryDao.getAllInventory();
    }
}
