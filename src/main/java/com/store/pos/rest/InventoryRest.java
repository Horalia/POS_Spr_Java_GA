package com.store.pos.rest;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.pos.model.Inventory;
import com.store.pos.service.InventoryService;
import java.util.ArrayList;
import java.util.List;


@RestController
public class InventoryRest {

    private final InventoryService inventoryService;

    public InventoryRest(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/rest/inventory/all")
    public List<Inventory> getAllInventory(HttpServletResponse response) {
        try {
            return inventoryService.getAllInventory();
        } catch (Exception e) {
            System.err.println("Failed to retrieve inventory: " + e.getCause());
            response.setStatus(HttpServletResponse.SC_BAD_GATEWAY);
            return new ArrayList<>();
        }
    }
}
