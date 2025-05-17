package com.javapractice.others;

import com.javapractice.base.BaseClass;

public class OtherPackageClass {
    public void accessBase() {
         BaseClass obj = new BaseClass();
         System.out.println("Inside OtherPackageClass:");
         System.out.println(obj.publicVar);     // ✅
//         System.out.println(obj.privateVar); // ❌ Not accessible
//         System.out.println(obj.defaultVar); // ❌ Not accessible
//         System.out.println(obj.protectedVar); // ❌ Not accessible
    }
}
