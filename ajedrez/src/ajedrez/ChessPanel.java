/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Ramón
 */
public class ChessPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChessPanel
     */
    private Chess chess;
    Image image;

    public ChessPanel() {
        initComponents();
    }

    public void setChess(Chess chess) {
        this.chess = chess;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (chess != null) {
            for (int r = 0; r < chess.getRowSize(); r++) {
                for (int c = 0; c < chess.getColSize(); c++) {
                    char contents = chess.getChessTable()[r][c];
                    switch (contents) {
                        case Chess.EMPTY:
                            
                            break;
                        case Chess.PAWN:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Pawn-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int pawnWidth = image.getWidth(null);
                            int pawnHeight = image.getHeight(null);
                            g.drawImage(image, c * 20, r * 20, pawnWidth, pawnHeight, null);
                            break;
                        case Chess.BISHOP:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Bishop-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                             int bishopWidth = image.getWidth(null);
                             int bishopHeight = image.getHeight(null);
                            g.drawImage(image, c * 20, r * 20, bishopWidth, bishopHeight, null);
                            break;
                        case Chess.KNIGHT:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Knight-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                             int knightWidth = image.getWidth(null);
                             int knightHeight = image.getHeight(null);
                            g.drawImage(image, c * 20, r * 20, knightWidth, knightHeight, null);
                            break;
                        case Chess.KING:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-King-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                             int kingWidth = image.getWidth(null);
                             int kingHeight = image.getHeight(null);
                            g.drawImage(image, c * 20, r * 20, kingWidth, kingHeight, null);
                            break;
                        case Chess.QUEEN:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Queen-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                             int queenWidth = image.getWidth(null);
                             int queenHeight = image.getHeight(null);
                            g.drawImage(image, c * 20, r * 20, queenWidth, queenHeight, null);
                            break;
                        case Chess.ROOK:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Rook-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                             int rookWidth = image.getWidth(null);
                             int rookHeight = image.getHeight(null);
                            g.drawImage(image, c * 20, r * 20, rookWidth, rookHeight, null);
                            break;
                        case Chess.WALL:
                            break;
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
