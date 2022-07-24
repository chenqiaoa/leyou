package com.leyou.service.impl;

import com.leyou.pojo.Item;
import com.leyou.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public Item saveItem(Item item) {
        int id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
