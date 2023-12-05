package com.example.online.store.controller;

import com.example.online.store.service.ShoppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppController {
    private ShoppService shoppService;

    public ShoppController(ShoppService shoppService) {
        this.shoppService = shoppService;
    }

    @GetMapping("add")
    public String addProduct(@RequestParam List<Integer> items) {
        shoppService.addProducts(items);
        return "Продукты добавлены";
    }

    @GetMapping("/get")
    public List<Integer> getAddedProduct() {
        return shoppService.getShopList();
    }
}
