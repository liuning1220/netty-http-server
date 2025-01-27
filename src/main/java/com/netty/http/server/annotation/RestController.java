package com.netty.http.server.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Component
@Documented
public @interface RestController {
}

