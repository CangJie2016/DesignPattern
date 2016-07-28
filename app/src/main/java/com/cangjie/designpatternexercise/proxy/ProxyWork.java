package com.cangjie.designpatternexercise.proxy;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/28 17:55
 * email：cangjie2016@gmail.com
 */
public class ProxyWork extends Work{
    private RealWork work;
    public ProxyWork() {
        work = new RealWork();
    }

    @Override
    public void work() {
        try{
            work.work();
            log();
        }catch (Exception e){
            DebugLog.w("方法Method()调用失败");
        }
    }
    private void log(){
        DebugLog.w("日志记录器记录+1");
    }
}
