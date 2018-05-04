package com.prototype;

import com.prototype.util.GsonUtil;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

//@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex){
		return GsonUtil.build(8000,"服务端异常",null);
    }

	@ExceptionHandler(value={
	        MethodArgumentNotValidException.class
	})
    public String MethodArgumentNotValidHandler(HttpServletRequest request, MethodArgumentNotValidException exception){
        List<String> invalidArguments = new ArrayList<>();
        for (FieldError error : exception.getBindingResult().getFieldErrors()) {
        	invalidArguments.add(error.getDefaultMessage());
        }
        return GsonUtil.build(9000,"参数异常",invalidArguments);
    }

    @ExceptionHandler(value=MissingServletRequestParameterException.class)
    public String MissingServletRequestParameterException(MissingServletRequestParameterException exception){
        return GsonUtil.build(9000,"参数异常", exception.getParameterName() + ": " + exception.getMessage());
    }

    @ExceptionHandler(value=MissingPathVariableException.class)
    public String MissingServletRequestParameterException(MissingPathVariableException exception){
        return GsonUtil.build(9000,"参数异常", exception.getVariableName() + ": " + exception.getMessage());
    }


}
