package com.vsb.ConnectFour;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    private static final int COLUMS =7;
    private static final int ROWS= 6;
    private static final int CIRCLE_DIAMETER=80;

    private static final String discsColor1 ="#24303E";
    private static final String discsColor2= "#4CAA88";
    private static String PLAYER_ONE="Player One";
    private static String PLAYER_TWO= "Player Two";

    private boolean isPlayerOneTurn=true;
    @FXML
    public GridPane rootGridPane;

    @FXML
    public Pane insertedDiscsPane;

    @FXML
    public Label playerNameLabel;

    public void createplayGround(){

        Shape rectangleWidthHoles= createGameStructuralGrid();
        rootGridPane.add(rectangleWidthHoles,0,1);
    }

    private Shape createGameStructuralGrid(){
        Shape rectangleWidthHoles=new Rectangle((COLUMS+1) *CIRCLE_DIAMETER, (ROWS+1) * CIRCLE_DIAMETER);

        for(int row=0;row<ROWS;row++){
            for(int col=0;col<COLUMS;col++){
                Circle circle=new Circle();
                circle.setRadius(CIRCLE_DIAMETER/2);
                circle.setCenterX(CIRCLE_DIAMETER/2);
                circle.setCenterY(CIRCLE_DIAMETER/2);

                circle.setTranslateX(col * (CIRCLE_DIAMETER+5)+CIRCLE_DIAMETER/4);
                circle.setTranslateY(row * (CIRCLE_DIAMETER+5)+CIRCLE_DIAMETER/4);
                rectangleWidthHoles=Shape.subtract(rectangleWidthHoles,circle);
            }
        }

        rectangleWidthHoles.setFill(Color.WHITE);
        return rectangleWidthHoles;
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
