package com.huowolf.factory;

import com.huowolf.button.Button;
import com.huowolf.button.SpringButton;
import com.huowolf.combobox.ComboBox;
import com.huowolf.combobox.SpringComboBox;
import com.huowolf.textfield.SpringTextField;
import com.huowolf.textfield.TextField;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 * Spring皮肤工厂：具体工厂
 */
public class SpringSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
