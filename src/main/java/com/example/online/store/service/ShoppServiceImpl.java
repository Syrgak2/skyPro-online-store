package com.example.online.store.service;

import com.example.online.store.model.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppServiceImpl implements ShoppService{
    private ShoppingCart shoppingCart;

    public ShoppServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addProducts(List<Integer> products) {
        shoppingCart.addProductsToList(products);
    }

    @Override
    public List<Integer> getShopList() {
        return shoppingCart.getShoppList();
    }
}
