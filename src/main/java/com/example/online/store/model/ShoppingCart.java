package com.example.online.store.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class ShoppingCart {
    private List<Integer> shoppList;

    public ShoppingCart(List<Integer> shoppList) {
        this.shoppList = shoppList;
    }

    public List<Integer> getShoppList() {
        return shoppList;
    }

    public void setShoppList(List<Integer> shoppList) {
        this.shoppList = shoppList;
    }

    public void addProductsToList(List<Integer> products) {
        shoppList.addAll(products);
    }
}
