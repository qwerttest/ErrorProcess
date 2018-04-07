package com.wj.base.errorprocess;

/**
 * 错误处理接口
 * Created by wangjian on 2017/11/13.
 */

public interface IErrorProcess {
    void error(final int errorCode, final String errorMsg);
}
