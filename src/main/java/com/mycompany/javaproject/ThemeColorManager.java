/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;

import javax.swing.JFrame;


public class ThemeColorManager {
    private IThemeColor iThemeColor;
    public ThemeColorManager(IThemeColor iThemeColor){
        this.iThemeColor = iThemeColor;
    }
    
    public void setBackgroundColor(JFrame jFrame){
        iThemeColor.setBackgroundColor(jFrame);
    }
    public void setFont(JFrame jFrame){
        iThemeColor.setFont(jFrame);
    }
}
