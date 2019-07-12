package com.huowolf.deepClone;

import java.io.Serializable;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description 附件类
 */
class Attachment implements Serializable {
    private String name; //附件名

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
