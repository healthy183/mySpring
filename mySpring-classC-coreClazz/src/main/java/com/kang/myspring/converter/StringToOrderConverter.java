package com.kang.myspring.converter;

import com.kang.myspring.editor.User;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;

import java.util.Collections;
import java.util.Set;

/**
 * User:
 * Description: 转换器，比PropertyEditor更加强大
 * Date: 2022-08-16
 * Time: 22:56
 */
public class StringToOrderConverter  implements ConditionalGenericConverter {
    @Override
    public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
        return sourceType.getType().equals(String.class) && targetType.getType().equals(Order.class);
    }

    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new ConvertiblePair(String.class, Order.class));
    }

    @Override
    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        Order order = new Order();
        order.setName((String)source);
        return order;
    }
}
