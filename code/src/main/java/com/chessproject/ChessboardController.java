package com.chessproject;

import com.chessproject.gameplay.GamePlayManager;
import com.chessproject.gameplay.board.Board;
import com.chessproject.gameplay.figures.Figure;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class ChessboardController {

    @FXML
    private GridPane gridPane;

    private boolean figureSelected;

    private Board board;
    private Figure selected;
    private boolean[][] moveAbles;

    private int originalX;
    private int originalY;

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
    private Pane A7;
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
    public void initialize() {
        board = new Board();

        for (Node child : gridPane.getChildren()) {
            child.setOnMousePressed(mouseEvent -> {
                if (!figureSelected && GamePlayManager.playerInControl == GamePlayManager.localPlayer.getPlayerNumber()) {

                    try {
                        originalX = GridPane.getColumnIndex(child);
                    } catch (NullPointerException e) {
                        originalX = 0;
                    }

                    try {
                        originalY = GridPane.getRowIndex(child);
                    } catch (NullPointerException e) {
                        originalY = 0;
                    }

                    System.out.println(originalX + " " + originalY);
                    if (board.selectFigure(originalX, originalY, GamePlayManager.localPlayer.getPlayerNumber()) != null) {
                        selected = board.selectFigure(originalX, originalY, GamePlayManager.localPlayer.getPlayerNumber());

                        moveAbles = selected.determinMoveables(board.board);

                        figureSelected = true;
                    }
                } else if (figureSelected && GamePlayManager.playerInControl == GamePlayManager.localPlayer.getPlayerNumber()) {
                    System.out.println("b");
                    int newX;
                    try {
                        newX = GridPane.getColumnIndex(child);
                    } catch (NullPointerException e) {
                        newX = 0;
                    }

                    int newY;
                    try {
                        newY = GridPane.getRowIndex(child);
                    } catch (NullPointerException e) {
                        newY = 0;
                    }

                    System.out.println(newX+" "+newY);

                    if (moveAbles[newX][newY] = true) {
                        System.out.println("moveable");
                        selected.move(newX, newY, board.board);

                        board.board[newX][newY].setFigure(selected);
                        board.board[originalX][originalY].setFigure(null);

                        board.board[newX][newY].setHasFigure(true);
                        board.board[originalX][originalY].setHasFigure(false);

                        String chessPeace = null;

                        switch (originalX) {
                            case 0:
                                switch (originalY) {
                                    case 0 -> {
                                        chessPeace = AH.getText();
                                        AH.setText("");
                                    }
                                    case 1 -> {
                                        chessPeace = BH.getText();
                                        BH.setText("");
                                    }
                                    case 2 -> {
                                        chessPeace = CH.getText();
                                        CH.setText("");
                                    }
                                    case 3 -> {
                                        chessPeace = DH.getText();
                                        DH.setText("");
                                    }
                                    case 4 -> {
                                        chessPeace = EH.getText();
                                        EH.setText("");
                                    }
                                    case 5 -> {
                                        chessPeace = FH.getText();
                                        FH.setText("");
                                    }
                                    case 6 -> {
                                        chessPeace = GH.getText();
                                        GH.setText("");
                                    }
                                    case 7 -> {
                                        chessPeace = HH.getText();
                                        HH.setText("");
                                    }
                                }
                                break;
                            case 1:
                                switch (originalY) {
                                    case 0 -> {
                                        chessPeace = AG.getText();
                                        AG.setText("");
                                    }
                                    case 1 -> {
                                        chessPeace = BG.getText();
                                        BG.setText("");
                                    }
                                    case 2 -> {
                                        chessPeace = CG.getText();
                                        CG.setText("");
                                    }
                                    case 3 -> {
                                        chessPeace = DG.getText();
                                        DG.setText("");
                                    }
                                    case 4 -> {
                                        chessPeace = EG.getText();
                                        EG.setText("");
                                    }
                                    case 5 -> {
                                        chessPeace = FG.getText();
                                        FG.setText("");
                                    }
                                    case 6 -> {
                                        chessPeace = GG.getText();
                                        GG.setText("");
                                    }
                                    case 7 -> {
                                        chessPeace = HG.getText();
                                        HG.setText("");
                                    }
                                }
                                break;
                            case 2:
                                switch (originalY) {
                                    case 0 -> {
                                        chessPeace = AF.getText();
                                        AF.setText("");
                                    }
                                    case 1 -> {
                                        chessPeace = BF.getText();
                                        BF.setText("");
                                    }
                                    case 2 -> {
                                        chessPeace = CF.getText();
                                        CF.setText("");
                                    }
                                    case 3 -> {
                                        chessPeace = DF.getText();
                                        DF.setText("");
                                    }
                                    case 4 -> {
                                        chessPeace = EF.getText();
                                        EF.setText("");
                                    }
                                    case 5 -> {
                                        chessPeace = FF.getText();
                                        FF.setText("");
                                    }
                                    case 6 -> {
                                        chessPeace = GF.getText();
                                        GF.setText("");
                                    }
                                    case 7 -> {
                                        chessPeace = HF.getText();
                                        HF.setText("");
                                    }
                                }
                                break;
                            case 3:
                                switch (originalY) {
                                    case 0 -> {
                                        chessPeace = AE.getText();
                                        AE.setText("");
                                    }
                                    case 1 -> {
                                        chessPeace = BE.getText();
                                        BE.setText("");
                                    }
                                    case 2 -> {
                                        chessPeace = CE.getText();
                                        CE.setText("");
                                    }
                                    case 3 -> {
                                        chessPeace = DE.getText();
                                        DE.setText("");
                                    }
                                    case 4 -> {
                                        chessPeace = EE.getText();
                                        EE.setText("");
                                    }
                                    case 5 -> {
                                        chessPeace = FE.getText();
                                        FE.setText("");
                                    }
                                    case 6 -> {
                                        chessPeace = GE.getText();
                                        GE.setText("");
                                    }
                                    case 7 -> {
                                        chessPeace = HE.getText();
                                        HE.setText("");
                                    }
                                }
                                break;
                            case 4:
                                switch (originalY) {
                                    case 0 -> {
                                        chessPeace = AD.getText();
                                        AD.setText("");
                                    }
                                    case 1 -> {
                                        chessPeace = BD.getText();
                                        BD.setText("");
                                    }
                                    case 2 -> {
                                        chessPeace = CD.getText();
                                        CD.setText("");
                                    }
                                    case 3 -> {
                                        chessPeace = DD.getText();
                                        DD.setText("");
                                    }
                                    case 4 -> {
                                        chessPeace = ED.getText();
                                        ED.setText("");
                                    }
                                    case 5 -> {
                                        chessPeace = FD.getText();
                                        FD.setText("");
                                    }
                                    case 6 -> {
                                        chessPeace = GD.getText();
                                        GD.setText("");
                                    }
                                    case 7 -> {
                                        chessPeace = HD.getText();
                                        HD.setText("");
                                    }
                                }
                                break;
                            case 5:
                                switch (originalY) {
                                    case 0 -> {
                                        chessPeace = AC.getText();
                                        AC.setText("");
                                    }
                                    case 1 -> {
                                        chessPeace = BC.getText();
                                        BC.setText("");
                                    }
                                    case 2 -> {
                                        chessPeace = CC.getText();
                                        CC.setText("");
                                    }
                                    case 3 -> {
                                        chessPeace = DC.getText();
                                        DC.setText("");
                                    }
                                    case 4 -> {
                                        chessPeace = EC.getText();
                                        EC.setText("");
                                    }
                                    case 5 -> {
                                        chessPeace = FC.getText();
                                        FC.setText("");
                                    }
                                    case 6 -> {
                                        chessPeace = GC.getText();
                                        GC.setText("");
                                    }
                                    case 7 -> {
                                        chessPeace = HC.getText();
                                        HC.setText("");
                                    }
                                }
                                break;
                            case 6:
                                switch (originalY) {
                                    case 0 -> {
                                        chessPeace = AB.getText();
                                        AB.setText("");
                                    }
                                    case 1 -> {
                                        chessPeace = BB.getText();
                                        BB.setText("");
                                    }
                                    case 2 -> {
                                        chessPeace = CB.getText();
                                        CB.setText("");
                                    }
                                    case 3 -> {
                                        chessPeace = DB.getText();
                                        DB.setText("");
                                    }
                                    case 4 -> {
                                        chessPeace = EB.getText();
                                        EB.setText("");
                                    }
                                    case 5 -> {
                                        chessPeace = FB.getText();
                                        FB.setText("");
                                    }
                                    case 6 -> {
                                        chessPeace = GB.getText();
                                        GB.setText("");
                                    }
                                    case 7 -> {
                                        chessPeace = HB.getText();
                                        HB.setText("");
                                    }
                                }
                                break;
                            case 7:
                                switch (originalY) {
                                    case 0 -> {
                                        chessPeace = AA.getText();
                                        AA.setText("");
                                    }
                                    case 1 -> {
                                        chessPeace = BA.getText();
                                        BA.setText("");
                                    }
                                    case 2 -> {
                                        chessPeace = CA.getText();
                                        CA.setText("");
                                    }
                                    case 3 -> {
                                        chessPeace = DA.getText();
                                        DA.setText("");
                                    }
                                    case 4 -> {
                                        chessPeace = EA.getText();
                                        EA.setText("");
                                    }
                                    case 5 -> {
                                        chessPeace = FA.getText();
                                        FA.setText("");
                                    }
                                    case 6 -> {
                                        chessPeace = GA.getText();
                                        GA.setText("");
                                    }
                                    case 7 -> {
                                        chessPeace = HA.getText();
                                        HA.setText("");
                                    }
                                }
                        }
                        switch (newX) {
                            case 0:
                                switch (newY) {
                                    case 0 -> {
                                        AH.setText(chessPeace);
                                    }
                                    case 1 -> {
                                        BH.setText(chessPeace);
                                    }
                                    case 2 -> {
                                        CH.setText(chessPeace);
                                    }
                                    case 3 -> {
                                        DH.setText(chessPeace);
                                    }
                                    case 4 -> {
                                        EH.setText(chessPeace);
                                    }
                                    case 5 -> {
                                        FH.setText(chessPeace);
                                    }
                                    case 6 -> {
                                        GH.setText(chessPeace);
                                    }
                                    case 7 -> {
                                        HH.setText(chessPeace);
                                    }
                                }
                                break;
                            case 1:
                                switch (newY) {
                                    case 0 -> {
                                        AG.setText(chessPeace);
                                    }
                                    case 1 -> {
                                        BG.setText(chessPeace);
                                    }
                                    case 2 -> {
                                        CG.setText(chessPeace);
                                    }
                                    case 3 -> {
                                        DG.setText(chessPeace);
                                    }
                                    case 4 -> {
                                        EG.setText(chessPeace);
                                    }
                                    case 5 -> {
                                        FG.setText(chessPeace);
                                    }
                                    case 6 -> {
                                        GG.setText(chessPeace);
                                    }
                                    case 7 -> {
                                        HG.setText(chessPeace);
                                    }
                                }
                                break;
                            case 2:
                                switch (newY) {
                                    case 0 -> {
                                        AF.setText(chessPeace);
                                    }
                                    case 1 -> {
                                        BF.setText(chessPeace);
                                    }
                                    case 2 -> {
                                        CF.setText(chessPeace);
                                    }
                                    case 3 -> {
                                        DF.setText(chessPeace);
                                    }
                                    case 4 -> {
                                        EF.setText(chessPeace);
                                    }
                                    case 5 -> {
                                        FF.setText(chessPeace);
                                    }
                                    case 6 -> {
                                        GF.setText(chessPeace);
                                    }
                                    case 7 -> {
                                        HF.setText(chessPeace);
                                    }
                                }
                                break;
                            case 3:
                                switch (newY) {
                                    case 0 -> {
                                        AE.setText(chessPeace);
                                    }
                                    case 1 -> {
                                        BE.setText(chessPeace);
                                    }
                                    case 2 -> {
                                        CE.setText(chessPeace);
                                    }
                                    case 3 -> {
                                        DE.setText(chessPeace);
                                    }
                                    case 4 -> {
                                        EE.setText(chessPeace);
                                    }
                                    case 5 -> {
                                        FE.setText(chessPeace);
                                    }
                                    case 6 -> {
                                        GE.setText(chessPeace);
                                    }
                                    case 7 -> {
                                        HE.setText(chessPeace);
                                    }
                                }
                                break;
                            case 4:
                                switch (newY) {
                                    case 0 -> {
                                        AD.setText(chessPeace);
                                    }
                                    case 1 -> {
                                        BD.setText(chessPeace);
                                    }
                                    case 2 -> {
                                        CD.setText(chessPeace);
                                    }
                                    case 3 -> {
                                        DD.setText(chessPeace);
                                    }
                                    case 4 -> {
                                        ED.setText(chessPeace);
                                    }
                                    case 5 -> {
                                        FD.setText(chessPeace);
                                    }
                                    case 6 -> {
                                        GD.setText(chessPeace);
                                    }
                                    case 7 -> {
                                        HD.setText(chessPeace);
                                    }
                                }
                                break;
                            case 5:
                                switch (newY) {
                                    case 0 -> {
                                        AC.setText(chessPeace);
                                    }
                                    case 1 -> {
                                        BC.setText(chessPeace);
                                    }
                                    case 2 -> {
                                        CC.setText(chessPeace);
                                    }
                                    case 3 -> {
                                        DC.setText(chessPeace);
                                    }
                                    case 4 -> {
                                        EC.setText(chessPeace);
                                    }
                                    case 5 -> {
                                        FC.setText(chessPeace);
                                    }
                                    case 6 -> {
                                        GC.setText(chessPeace);
                                    }
                                    case 7 -> {
                                        HC.setText(chessPeace);
                                    }
                                }
                                break;
                            case 6:
                                switch (newY) {
                                    case 0 -> {
                                        AB.setText(chessPeace);
                                    }
                                    case 1 -> {
                                        BB.setText(chessPeace);
                                    }
                                    case 2 -> {
                                        CB.setText(chessPeace);
                                    }
                                    case 3 -> {
                                        DB.setText(chessPeace);
                                    }
                                    case 4 -> {
                                        EB.setText(chessPeace);
                                    }
                                    case 5 -> {
                                        FB.setText(chessPeace);
                                    }
                                    case 6 -> {
                                        GB.setText(chessPeace);
                                    }
                                    case 7 -> {
                                        chessPeace = HB.getText();
                                        HB.setText(chessPeace);
                                    }
                                }
                                break;
                            case 7:
                                switch (newY) {
                                    case 0 -> {
                                        AA.setText(chessPeace);
                                    }
                                    case 1 -> {
                                        BA.setText(chessPeace);
                                    }
                                    case 2 -> {
                                        CA.setText(chessPeace);
                                    }
                                    case 3 -> {
                                        DA.setText(chessPeace);
                                    }
                                    case 4 -> {
                                        EA.setText(chessPeace);
                                    }
                                    case 5 -> {
                                        FA.setText(chessPeace);
                                    }
                                    case 6 -> {
                                        GA.setText(chessPeace);
                                    }
                                    case 7 -> {
                                        HA.setText(chessPeace);
                                    }
                                }
                        }

                        figureSelected = false;
                        GamePlayManager.changePlayer();
                    }
                }
            });
        }
    }

    public static void UpdatedClient(int[] oldpos, int[] newPos) {

    }
}
