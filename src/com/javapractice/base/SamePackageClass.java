package com.javapractice.base;

public class SamePackageClass {
    public void accessFromBase(){
        BaseClass baseClass = new BaseClass();
        System.out.println(baseClass.publicVar);
//        System.out.println(baseClass.privateVar); // ❌ Not accessible
        System.out.println(baseClass.defaultVar); // ✅
        System.out.println(baseClass.protectedVar); // ✅
    }
}
