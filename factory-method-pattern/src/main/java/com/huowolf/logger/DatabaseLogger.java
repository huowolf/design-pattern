package com.huowolf.logger;

/**
 * @author huowolf
 * @date 2019/7/11
 * @description
 * 数据库日志记录器：具体产品
 */
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
