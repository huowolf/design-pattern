package com.huowolf.shallowClone;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 * 客户端测试类
 */
class Client
{
    public  static void main(String args[])
    {
        WeeklyLog log_previous = new WeeklyLog();  //创建原型对象

        Attachment attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);  //将附件添加到周报中
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");

        System.out.println("****周报****");
        System.out.println("周次：" +  log_previous.getDate());
        System.out.println("姓名：" +  log_previous.getName());
        System.out.println("内容：" +  log_previous.getContent());
        System.out.println("--------------------------------");

        WeeklyLog  log_new;
        log_new  = log_previous.clone(); //调用克隆方法创建克隆对象
        log_new.setDate("第13周");
        System.out.println("****周报****");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("内容：" + log_new.getContent());

        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getDate() == log_new.getDate());
        System.out.println(log_previous.getName() == log_new.getName());
        System.out.println(log_previous.getContent() == log_new.getContent());

        //比较附件
        System.out.println("附件是否相同？ " +  (log_previous.getAttachment() == log_new.getAttachment()));
    }
}