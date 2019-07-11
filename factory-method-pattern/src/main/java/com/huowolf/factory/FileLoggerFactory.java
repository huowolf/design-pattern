package com.huowolf.factory;

import com.huowolf.logger.Logger;
import com.huowolf.logger.FileLogger;

/**
 * @author huowolf
 * @date 2019/7/11
 * @description
 * 文件日志记录器工厂类：具体工厂
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {

        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        return logger;
    }
}


