package com.zjw.scaffold.strategy;

import com.zjw.scaffold.attribute.AutoCodeAttribute;

/**
 * @program scaffold
 * @description: 不补0的自增长编号
 * @author: zhuangjiewei
 * @create: 2019/05/13 17:59
 */
public class IncreaseAutoCode implements AutoCodeStrategy {

    @Override
    public String getNextCode(AutoCodeAttribute autoCodeAttribute) {
        return String.valueOf(autoCodeAttribute.getNextValue());
    }
}
