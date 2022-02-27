package com.company;

import com.company.reflection.SomeInterface;
import com.company.reflection.SomeOtherInterface;

public class SomeBean {
    @AutoInjectable
    private SomeInterface someField;
    @AutoInjectable
    private SomeOtherInterface otherField;

    public SomeBean() {
    }

    public void go(){
        someField.doSome();
        otherField.doSome();
    }
}
