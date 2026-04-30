package uce.edu.pa2.api.bodega;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

@InterceptorBinding // Con esta anotacion indicamos que vamos hacer un interceptor
@Target({ElementType.METHOD, ElementType.TYPE}) // Indicamos que esta anotacion se puede usar en metodos y le agregamos para clase.
@Retention(RetentionPolicy.RUNTIME) // Indicamos que esta anotacion se mantendra en tiempo de ejecucion
public @interface Log{
    
}
