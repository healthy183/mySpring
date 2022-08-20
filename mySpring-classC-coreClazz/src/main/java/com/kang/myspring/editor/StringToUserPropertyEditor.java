package com.kang.myspring.editor;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

/**
 * User:
 * Description: 自定义转换器PropertyEditor
 * Date: 2022-08-15
 * Time: 23:08
 */
public class StringToUserPropertyEditor
                extends PropertyEditorSupport
                        implements PropertyEditor {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        User user = new User();
        user.setName(text);
        this.setValue(user);
    }
}
