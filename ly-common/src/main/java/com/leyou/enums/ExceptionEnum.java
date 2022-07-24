package com.leyou.enums;

import lombok.Getter;

@Getter
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400, "价格不能为空！");
    ;

    private final int status;
    private final String message;

    ExceptionEnum(int status,String message){
        this.status=status;
        this.message=message;
    }
}
