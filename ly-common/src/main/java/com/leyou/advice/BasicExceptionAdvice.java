package com.leyou.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice//默认情况下，会拦截所有加了`@Controller`的类
@Slf4j
public class BasicExceptionAdvice {
    @ExceptionHandler(RuntimeException.class)//作用在方法上，声明要处理的异常类型
    public ResponseEntity<String> handleException(RuntimeException e) {
        // 我们暂定返回状态码为400， 然后从异常中获取友好提示信息
        return ResponseEntity.status(400).body(e.getMessage());
    }
}
