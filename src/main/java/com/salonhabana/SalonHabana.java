/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.salonhabana;

import com.salonhabana.layouts.LoginPage;
import javax.swing.JFrame;

/**
 *
 * @author sersu
 */
public class SalonHabana {

    private static void launch() {
        mainPage = new LoginPage();
        mainPage.setSize(500, 500);
        mainPage.setVisible(true);
    }
    
    public static void main(String[] args) {
        launch();
    }
    
    private static JFrame mainPage;
}
