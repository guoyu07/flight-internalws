package com.ctrip.ibu.flight.internalws.business.model;

/**
 * Created by kyxie on 2017/6/15.
 */
public class ApiInvokeException extends Exception {

    private String message;
    private String methodName;
    private Throwable throwable;

    public ApiInvokeException(){
        super();
    }
    public ApiInvokeException(String message){
        super(message);
        this.message = message;
    }

    public ApiInvokeException(String methodName,String message){
        super(message);
        this.methodName = methodName;
        this.message = message;
    }

    public ApiInvokeException(String methodName,Throwable throwable){
        super(throwable.getMessage());
        this.methodName = methodName;
        this.message = throwable.getMessage();
        this.throwable = throwable;
    }

    public ApiInvokeException(String methodName,String message,Throwable throwable){
        super(message);
        this.methodName = methodName;
        this.message = message;
        this.throwable = throwable;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getMethodName() {
        return methodName;
    }

    public Throwable getThrowable() {
        return throwable;
    }
}
