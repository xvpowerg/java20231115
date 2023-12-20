/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2SEModule/module-info.java to edit this template
 */

module tw.com.m3 {
    //requires transitive 只要requires tw.com.m3 就一併requires tw.com.m1 與 tw.com.m2
    requires transitive tw.com.m1;
    requires transitive tw.com.m2;
    exports tw.com.m3.test3;
}
