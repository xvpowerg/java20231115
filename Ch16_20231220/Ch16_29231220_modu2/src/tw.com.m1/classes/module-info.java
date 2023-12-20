/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2SEModule/module-info.java to edit this template
 */

module tw.com.m1 {
    //tw.com.m1.fruit 只能給tw.com.m2 模組用
    exports tw.com.m1.fruit to tw.com.m2;
   //tw.com.m1.person 只能給tw.com.m3 模組用
    exports tw.com.m1.person to tw.com.m3;
}
