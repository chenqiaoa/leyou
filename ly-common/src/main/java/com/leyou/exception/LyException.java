package com.leyou.exception;

import com.leyou.enums.ExceptionEnum;
import lombok.Getter;

@Getter
public class LyException extends RuntimeException{
    private final int status;
    public LyException(ExceptionEnum em) {
        super(em.getMessage());
        this.status = em.getStatus();
    }
    public LyException(ExceptionEnum em, Throwable cause) {
        super(em.getMessage(), cause);
        this.status = em.getStatus();
    }
}
