package com.leyou.exception;

import lombok.Getter;
import org.joda.time.DateTime;


@Getter
public class ExceptionResult {
    private final int status;
    private final String message;
    private final String timestamp;


    public ExceptionResult(LyException e) {
        this.status = e.getStatus();
        this.message = e.getMessage();
        this.timestamp = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");

    }
}
