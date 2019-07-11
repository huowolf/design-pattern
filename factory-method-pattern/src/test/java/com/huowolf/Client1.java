package com.huowolf;

import com.huowolf.factory.FileLoggerFactory;
import com.huowolf.logger.Logger;
import com.huowolf.factory.LoggerFactory;

/**
 * @author huowolf
 * @date 2019/7/11
 * @description
 * 客户端测试
 */
public class Client1 {

    public static void main(String[] args) {
        LoggerFactory loggerFactory;
        Logger logger;
        loggerFactory = new FileLoggerFactory();
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
