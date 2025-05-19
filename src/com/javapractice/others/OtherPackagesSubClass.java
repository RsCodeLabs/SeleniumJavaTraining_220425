package com.javapractice.others;

import com.javapractice.base.BaseClass;

public class OtherPackagesSubClass extends BaseClass {
    public void accessBase() {
        System.out.println("Inside OtherPackagesSubClass:");
        System.out.println(publicVar);
//         System.out.println(privateVar);      // ❌ Not accessible
//        System.out.println(defaultVar);      // ❌ Not accessible
         System.out.println(protectedVar);
    }
}
