package com.leyou.service.impl;

import com.leyou.pojo.Item;
import com.leyou.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ItemServiceImpl implements ItemService {
    private Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
    @Override
    public Item saveItem(Item item) {
        int id = new Random().nextInt(100);
        item.setId(id);
        logger.info("查看item",item.toString());
        return item;
    }
}
