package com.example.online.store.service;

import java.util.List;

public interface ShoppService {

    void addProducts(List<Integer> products);

    List<Integer> getShopList();
}
