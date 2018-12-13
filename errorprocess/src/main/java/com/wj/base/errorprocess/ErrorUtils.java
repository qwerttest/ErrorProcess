package com.wj.base.errorprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 服务器错误处理类
 * Created by wangjian on 2016/12/21.
 */
public class ErrorUtils {

    private HashMap<String, IErrorProcess> mErrorProcessesDef = new HashMap<>();//统一Code处理器集合
    private HashMap<String, List<IErrorProcess>> mErrorProcessesSpe = new HashMap<>();//特殊Code处理器集合
    private IErrorProcess mDefaultProcess;//默认处理器

    private ErrorUtils(){
        mErrorProcessesDef.clear();//创建实例时要清空
        mErrorProcessesSpe.clear();
    }

    public static ErrorUtils getInstance() {
        return Holder.instance;
    }

    private final static class Holder {
        public static ErrorUtils instance = new ErrorUtils();
    }

    public void setDefaultProcess(IErrorProcess process){
        mDefaultProcess = process;
    }

    public synchronized void registerErrorProcessDef(IErrorProcess process, String... errorCodes){
        for (String errorCode : errorCodes){
            if(process == null){
                throw new RuntimeException("params process can not be null");
            }
            mErrorProcessesDef.put(errorCode, process);
        }
    }

    public synchronized void registerErrorProcessSpe(IErrorProcess process, String... errorCodes){
        for (String errorCode : errorCodes){
            if(process == null){
                throw new RuntimeException("params process can not be null");
            }
            List<IErrorProcess> handlers = mErrorProcessesSpe.get(errorCode);
            if(handlers == null){
                handlers = new ArrayList<>();
                mErrorProcessesSpe.put(errorCode, handlers);
            }
            handlers.add(process);
        }
    }

    public void unregisterErrorProcessSpe(IErrorProcess process){
        for (int i = 0; i < mErrorProcessesSpe.size(); i++){
            List<IErrorProcess> handlers = mErrorProcessesSpe.get(i);
            if(handlers != null && handlers.contains(process)){
                handlers.remove(process);
            }
        }
    }

    public synchronized void errorProcess(final String errorCode, final String errorMsg){
        List<IErrorProcess> handlers = mErrorProcessesSpe.get(errorCode);
        if(handlers == null){
            if(mErrorProcessesDef.containsKey(errorCode)){
                mErrorProcessesDef.get(errorCode).error(errorCode, errorMsg);
            } else {
                if(mDefaultProcess != null){
                    mDefaultProcess.error(errorCode, errorMsg);
                }
            }
        } else{
            List<IErrorProcess> copy = new ArrayList<>();
            copy.addAll(handlers);
            for (IErrorProcess process : copy){
                try {
                    process.error(errorCode, errorMsg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //error入口
    public static void error(final String errorCode, final String errorMsg){
        ErrorUtils.getInstance().errorProcess(errorCode, errorMsg);
    }
}
