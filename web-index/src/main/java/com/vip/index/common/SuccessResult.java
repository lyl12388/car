package com.vip.index.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessResult<T> implements Result<T>{
    private StatusTypeEnum status;
    private T data;

    public static SuccessResult success(){
        return new SuccessResult(StatusTypeEnum.SUCCESS,null);
    }

    public static <T> SuccessResult success(T data){
        return new SuccessResult(StatusTypeEnum.SUCCESS,data);
    }
}
