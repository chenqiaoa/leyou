package com.leyou.pojo;

import lombok.Data;

@Data//在实体类上添加@Data注解，可以省去代码中大量的 get()、 set()、 toString() 等方法，提高代码的简洁
public class Item {
    private Integer id;
    private String name;
    private Long price;
}
