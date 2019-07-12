package com.huowolf.factory;

import com.huowolf.button.Button;
import com.huowolf.button.SummerButton;
import com.huowolf.combobox.ComboBox;
import com.huowolf.combobox.SummerComboBox;
import com.huowolf.textfield.SummerTextField;
import com.huowolf.textfield.TextField;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 * Summer皮肤工厂：具体工厂
 */
public class SummerSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
