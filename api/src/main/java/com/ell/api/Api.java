package com.ell.api;

import com.ell.packagea.PackageA;
import com.ell.packageb.PackageB;

public class Api {
    public static void main(String[] args) {
        PackageA packageA = new PackageA();
        packageA.methodA();

        PackageB packageB = new PackageB();
        packageB.methodB();
    }
}