package com.chessproject;

import com.chessproject.gameplay.GamePlayManager;
import com.chessproject.gameplay.board.Board;
import com.chessproject.gameplay.figures.Figure;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ChessboardController {

    @FXML
    private GridPane gridPane;

    private boolean figureSelected;

    private Board board;
    private Figure selected;
    private boolean[][]moveAbles;

    private int OriginalX;
    private int OriginalY;
    @FXML
    private Label HH;
    @FXML
    private Label DD;
    @FXML
    private Label DE;
    @FXML
    private Label DF;
    @FXML
    private Label DG;
    @FXML
    private Label DH;
    @FXML
    private Label EA;
    @FXML
    private Label EB;
    @FXML
    private Label EC;
    @FXML
    private Label ED;
    @FXML
    private Label EE;
    @FXML
    private Label AA;
    @FXML
    private Label EF;
    @FXML
    private Label AB;
    @FXML
    private Label EG;
    @FXML
    private Label AC;
    @FXML
    private Label EH;
    @FXML
    private Label AD;
    @FXML
    private Label AE;
    @FXML
    private Label AF;
    @FXML
    private Label AG;
    @FXML
    private Label AH;
    @FXML
    private Label FA;
    @FXML
    private Label FB;
    @FXML
    private Label FC;
    @FXML
    private Label FD;
    @FXML
    private Label FE;
    @FXML
    private Label BA;
    @FXML
    private Label FF;
    @FXML
    private Label BB;
    @FXML
    private Label FG;
    @FXML
    private Label BC;
    @FXML
    private Label FH;
    @FXML
    private Label BD;
    @FXML
    private Label BE;
    @FXML
    private Label BF;
    @FXML
    private Label BG;
    @FXML
    private Label BH;
    @FXML
    private Label GA;
    @FXML
    private Label GB;
    @FXML
    private Label GC;
    @FXML
    private Label GD;
    @FXML
    private Label GE;
    @FXML
    private Label CA;
    @FXML
    private Label GF;
    @FXML
    private Label CB;
    @FXML
    private Label GG;
    @FXML
    private Label CC;
    @FXML
    private Label GH;
    @FXML
    private Label CD;
    @FXML
    private Label CE;
    @FXML
    private Label CF;
    @FXML
    private Label CG;
    @FXML
    private Label CH;
    @FXML
    private Label HA;
    @FXML
    private Label HB;
    @FXML
    private Label HC;
    @FXML
    private Label HD;
    @FXML
    private Label HE;
    @FXML
    private Label DA;
    @FXML
    private Label HF;
    @FXML
    private Label DB;
    @FXML
    private Label HG;
    @FXML
    private Label DC;

    @Deprecated
    public void initialize(){
    board=new Board();

        for(Node child : gridPane.getChildren()){
            child.setOnMousePressed(mouseEvent -> {
                if(!figureSelected && GamePlayManager.playerInControl == GamePlayManager.localPlayer.getPlayerNumber()){

                    try {
                        OriginalX= GridPane.getColumnIndex(child);
                    }catch(NullPointerException e){
                        OriginalX=0;
                    }

                    try {
                        OriginalY= GridPane.getRowIndex(child);
                    }catch(NullPointerException e){
                        OriginalY=0;
                    }

                    System.out.println(OriginalX+" "+OriginalY);
                    if(board.selectFigure(OriginalX,OriginalY,GamePlayManager.localPlayer.getPlayerNumber())!=null){
                        selected=board.selectFigure(OriginalX,OriginalY,GamePlayManager.localPlayer.getPlayerNumber());

                        moveAbles=selected.determinMoveables(board.board);

                        figureSelected=true;
                    }
                }else if(figureSelected && GamePlayManager.playerInControl == GamePlayManager.localPlayer.getPlayerNumber()) {
                    System.out.println("b");
                    figureSelected=false;

                    GamePlayManager.changePlayer();
                }
            });
        }
    }
}
