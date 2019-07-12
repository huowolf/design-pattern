package com.huowolf.shallowClone;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 * 工作周报WeeklyLog：具体原型类
 */
class WeeklyLog implements Cloneable {
    private String name;
    private String date;
    private String content;

    //为了简化设计和实现，假设一份工作周报中只有一个附件对象
    private Attachment attachment;

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return (this.name);
    }

    public String getDate() {
        return (this.date);
    }

    public String getContent() {
        return (this.content);
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    //克隆方法clone()，此处使用Java语言提供的克隆机制
    //使用clone()方法实现浅克隆
    public WeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }
}