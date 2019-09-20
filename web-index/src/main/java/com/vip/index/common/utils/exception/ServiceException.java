package com.vip.index.common.utils.exception;

import com.vip.index.common.utils.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 自定义全局异常处理类
 *
 * @author zhangwei
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class ServiceException extends RuntimeException {

    private ResponseStatus status;

    public ServiceException(ResponseStatus responseStatus) {
        this.status = responseStatus;
    }

    public ServiceException(Throwable cause, ResponseStatus responseStatus) {
        super(cause);
        this.status = responseStatus;
    }
}