package com.leyou.controller;

import com.leyou.enums.ExceptionEnum;
import com.leyou.exception.LyException;
import com.leyou.pojo.Item;
import com.leyou.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
    @PostMapping("item")
    public ResponseEntity<Item> saveItem(Item item){
        if(item.getPrice()== null){
            throw new LyException(ExceptionEnum.PRICE_CANNOT_BE_NULL);
        }
        Item result = itemService.saveItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
