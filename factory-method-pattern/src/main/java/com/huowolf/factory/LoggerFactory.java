package com.huowolf.factory;

import com.huowolf.logger.Logger;

/**
 * @author huowolf
 * @date 2019/7/11
 * @description
 * 日志记录器工厂接口：抽象工厂
 */
public interface LoggerFactory {
    Logger createLogger();
}
