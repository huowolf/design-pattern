package com.huowolf;

import com.huowolf.button.Button;
import com.huowolf.combobox.ComboBox;
import com.huowolf.factory.SkinFactory;
import com.huowolf.textfield.TextField;
import com.huowolf.util.XMLUtil;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 */
public class Client {

    public static void main(String[] args) {
        SkinFactory skinFactory = (SkinFactory) XMLUtil.getBean();
        Button button = skinFactory.createButton();
        TextField textField = skinFactory.createTextField();
        ComboBox comboBox = skinFactory.createComboBox();

        button.display();
        textField.display();
        comboBox.display();
    }
}
