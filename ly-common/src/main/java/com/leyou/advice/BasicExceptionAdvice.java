package com.leyou.advice;

import com.leyou.exception.ExceptionResult;
import com.leyou.exception.LyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice//默认情况下，会拦截所有加了`@Controller`的类
@Slf4j
public class BasicExceptionAdvice {
    @ExceptionHandler(LyException.class)//作用在方法上，声明要处理的异常类型
    public ResponseEntity<ExceptionResult> handleException(LyException e) {
        // 我们暂定返回状态码为400， 然后从异常中获取友好提示信息
        return ResponseEntity.status(e.getStatus()).body(new ExceptionResult(e));
    }
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException e) {
        return ResponseEntity.status(500).body(e.getMessage());
    }
}
