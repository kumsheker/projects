package com.example.calculator;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class Calculator {
    public static Button buttonSetup(Operation.Symbol buttonSymbol){
        Button button = new Button();
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button.setText(buttonSymbol.toString());
        button.setStyle("-fx-font-size: 2em;");
        if(buttonSymbol == Operation.Symbol.addition || buttonSymbol == Operation.Symbol.subtraction ||
        buttonSymbol == Operation.Symbol.division || buttonSymbol == Operation.Symbol.multiplication){
            button.setOnAction(actionEvent -> Operation.doSymbolAction(buttonSymbol));
            return button;
        } else if (buttonSymbol == Operation.Symbol.equals){
            button.setOnAction(actionEvent -> Operation.doMainOperation());
            return button;
        } else if (buttonSymbol == Operation.Symbol.delete){
            button.setOnAction(actionEvent -> Operation.doDelete());
            return button;
        } else if (buttonSymbol == Operation.Symbol.plusMinus) {
            button.setOnAction(actionEvent -> Operation.doNumberAction());
        }
        return button;
    }
    public static Button buttonSetup(int symbol){
        Button button = new Button();
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button.setText(Integer.toString(symbol));
        button.setStyle("-fx-font-size: 2em;");
        button.setOnAction(actionEvent -> Operation.doNumberAction(symbol));
            return button;
    }
    public static Label label1 = new Label();
    public static Label label2 = new Label();
    public static Label label3 = new Label();

    public static Stage setLook(Stage stage) {
        GridPane root = new GridPane();
        root.setGridLinesVisible(true);
        for(int i = 0; i < 5; i++){
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth(20);
            root.getColumnConstraints().add(column);
        }
        for(int i = 0; i < 4; i++){
            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(25);
            root.getRowConstraints().add(rowConstraints);
        }

        label1.setBackground(Background.fill(Color.WHITESMOKE));
        label1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        label1.setTextAlignment(TextAlignment.CENTER);

        label2.setBackground(Background.fill(Color.WHITESMOKE));
        label2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        label2.setTextAlignment(TextAlignment.CENTER);

        label3.setBackground(Background.fill(Color.WHITESMOKE));
        label3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        label3.setTextAlignment(TextAlignment.CENTER);

        root.add(label1, 0, 0);
        root.add(label2, 1, 0);
        root.add(label3, 2, 0);
        root.add(buttonSetup(Operation.Symbol.plusMinus), 3, 0);
        root.add(buttonSetup(Operation.Symbol.delete), 4, 0);
        root.add(buttonSetup(0), 0, 1);
        root.add(buttonSetup(1), 1, 1);
        root.add(buttonSetup(2), 2, 1);
        root.add(buttonSetup(3), 3, 1);
        root.add(buttonSetup(Operation.Symbol.equals), 4, 1);
        root.add(buttonSetup(4), 0, 2);
        root.add(buttonSetup(5), 1, 2);
        root.add(buttonSetup(6), 2, 2);
        root.add(buttonSetup(Operation.Symbol.addition), 3, 2);
        root.add(buttonSetup(Operation.Symbol.subtraction), 4, 2);
        root.add(buttonSetup(7), 0, 3);
        root.add(buttonSetup(8), 1, 3);
        root.add(buttonSetup(9), 2, 3);
        root.add(buttonSetup(Operation.Symbol.multiplication), 3, 3);
        root.add(buttonSetup(Operation.Symbol.division), 4, 3);
        Scene scene = new Scene(root, 300, 400);
        stage.setResizable(false);
        stage.setScene(scene);
        return stage;
    }
}
