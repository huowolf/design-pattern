package com.huowolf.button;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 * Spring按钮类：具体产品
 */
public class SpringButton implements Button{

    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
