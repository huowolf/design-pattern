package com.huowolf.factory;

import com.huowolf.logger.Logger;
import com.huowolf.logger.DatabaseLogger;

/**
 * @author huowolf
 * @date 2019/7/11
 * @description
 * 数据库日志记录器工厂类：具体工厂
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {

        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
