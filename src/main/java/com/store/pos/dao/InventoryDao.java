
package com.store.pos.dao;

import com.store.pos.model.Inventory;

import java.util.List;

public interface InventoryDao {

    List<Inventory> getAllInventory();
}
