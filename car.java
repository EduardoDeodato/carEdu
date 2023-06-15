/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author senai
 */
      public class car {
            String color;
            //new fields!
            boolean isRunning;
            int velocity;
            
            //neww paramentre tht correspond to the new fields 
            public car (String carColor, boolean carRunning, int milesPerHour)
          {
            color = carColor;
            
            //assign new parameters to the new fields
            isRunning = carRunning;
            velocity = milesPerHour;
          }
            public static void main(String[] args){
                // new values passed into the method call 
                car ferrari = new car("red", true, 27);
                car renault = new car("blue", false, 70);
                
                System.out.println(renault.isRunning);
                //false
                System.out.println(ferrari.velocity);
                //27
                
        }
    }