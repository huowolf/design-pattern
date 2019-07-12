package com.huowolf.manager;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 * 抽象公文接口，也可定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
 */
interface OfficialDocument extends  Cloneable
{
    OfficialDocument clone();
    void display();
}