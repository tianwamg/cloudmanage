package com.cn.rpcFramework;

import java.io.Serializable;

public class RpcResponse implements Serializable {
    private static final long serialVersionUID =1l;

    private Throwable error;
    private Object result;

    public Throwable getError() {
        return error;
    }

    public void setError(Throwable error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
