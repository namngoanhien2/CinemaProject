package com.dts.cinema.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class BaseResponse {

    protected int errNumber;
    protected String messager;
    protected String debugMessage;

    public BaseResponse() {
        this.errNumber = 1;
        this.messager = "Success";
        this.debugMessage = "no";
    }
}
