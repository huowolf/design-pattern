package com.huowolf.factory;

import com.huowolf.button.Button;
import com.huowolf.combobox.ComboBox;
import com.huowolf.textfield.TextField;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 * 界面皮肤工厂接口：抽象工厂
 */
public interface SkinFactory {

    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
