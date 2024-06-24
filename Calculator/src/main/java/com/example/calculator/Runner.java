package com.example.calculator;

import javafx.application.Application;

import javafx.stage.Stage;


public class Runner extends Application {

   @Override
    public void start(Stage stage) {
        Calculator.setLook(stage).show();
   }
    public static void main(String[] args) {
       launch();
   }
}