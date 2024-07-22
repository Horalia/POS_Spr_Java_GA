package com.store.pos.dao;


import com.store.pos.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InventoryDaoImpl implements InventoryDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public InventoryDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Inventory> getAllInventory() {
        String sql = "select * from POS.INVENTORY";

        return jdbcTemplate.query(sql, (result, index) -> {
            Inventory inventory = new Inventory(result.getDouble("sku"),result.getDouble("available"),result.getDouble("cost"),result.getString("name"));
            return inventory;
        });
    }

    @Override
    public void save(Inventory inventory) {
        String sql = "insert into pos.inventory (available, cost, name) values (?, ? ,?)";
        jdbcTemplate.update(sql, inventory.getAvailable(), inventory.getCost(), inventory.getName());
    }
}
