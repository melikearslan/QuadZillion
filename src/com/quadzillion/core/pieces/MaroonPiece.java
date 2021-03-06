package com.quadzillion.core.pieces;

import com.quadzillion.core.models.Constants;
import com.quadzillion.core.move.MoveChecker;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class MaroonPiece extends Piece {
    public MaroonPiece(MoveChecker moveChecker) {
        super(moveChecker);

        INIT_X = Constants.MAINBOARD_X_LAYOUT - 4 * Constants.TILE_SIZE;
        INIT_Y = Constants.MAINBOARD_Y_LAYOUT + 5 * Constants.TILE_SIZE;

        x = INIT_X;
        y = INIT_Y;

        setLayoutX(INIT_X);
        setLayoutY(INIT_Y);


        pos = new ArrayList<Point2D>();

        pos.add(new Point2D(0, 0));
        pos.add(new Point2D(1, 0));
        pos.add(new Point2D(1, 1));
        pos.add(new Point2D(2, 1));


        color = Color.MAROON;

        id = 5;

        this.moveChecker = moveChecker;

        createCircles(pos);
        setListeners();
    }
}

