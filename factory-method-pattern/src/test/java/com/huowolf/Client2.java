package com.huowolf;


import com.huowolf.factory.LoggerFactory;
import com.huowolf.logger.Logger;
import com.huowolf.util.XMLUtil;


/**
 * @author huowolf
 * @date 2019/7/11
 * @description
 * 客户端测试
 * 引入配置文件
 */
public class Client2 {

    public static void main(String[] args) {
        LoggerFactory loggerFactory;
        Logger logger;
        loggerFactory = (LoggerFactory) XMLUtil.getBean();
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
