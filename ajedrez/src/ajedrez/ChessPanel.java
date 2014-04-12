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
    public final int TAM_CASILLA = 10;
    public final int BETWEEN_PIECES_SIZE = 50;
    public ChessPanel() {
        initComponents();
    }

    public void setChess(Chess chess) {
        this.chess = chess;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        chess = new Chess(8,8);
        if (chess != null) {
            for (int r = 0; r < chess.getRowSize(); r++) {
                for (int c = 0; c < chess.getColSize(); c++) {
                    char contents = chess.getChessTable()[r][c];
                    switch (contents) {
                        //WHITE PIECES ON IT
                        case Chess.EMPTY:
                            break;
                        case Chess.WHITE_PAWN:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Pawn-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int whitePawnWidth = image.getWidth(null);
                            int whitePawnHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, whitePawnWidth, whitePawnHeight, null);
                            break;
                        case Chess.WHITE_BISHOP:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Bishop-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int whiteBishopWidth = image.getWidth(null);
                            int whiteBishopHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, whiteBishopWidth, whiteBishopHeight, null);
                            break;
                        case Chess.WHITE_KNIGHT:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Knight-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int whiteKnightWidth = image.getWidth(null);
                            int whiteKnightHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, whiteKnightWidth, whiteKnightHeight, null);
                            break;
                        case Chess.WHITE_KING:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-King-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int whiteKingWidth = image.getWidth(null);
                            int whiteKingHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, whiteKingWidth, whiteKingHeight, null);
                            break;
                        case Chess.WHITE_QUEEN:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Queen-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int whiteQueenWidth = image.getWidth(null);
                            int whiteQueenHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, whiteQueenWidth, whiteQueenHeight, null);
                            break;
                        case Chess.WHITE_ROOK:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Rook-White.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int whiteRookWidth = image.getWidth(null);
                            int whiteRookHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, whiteRookWidth, whiteRookHeight, null);
                            break;
                        case Chess.WALL:
                            break;
                            
                            //BLACK PIECES ON I
                        case Chess.BLACK_PAWN:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Pawn-Black.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int blackPawnWidth = image.getWidth(null);
                            int blackPawnHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, blackPawnWidth, blackPawnHeight, null);
                            break;
                        case Chess.BLACK_BISHOP:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Bishop-Black.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int blackBishopWidth = image.getWidth(null);
                            int blackBishopHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, blackBishopWidth, blackBishopHeight, null);
                            break;
                        case Chess.BLACK_KNIGHT:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Knight-Black.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int blackKnightWidth = image.getWidth(null);
                            int blackKnightHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, blackKnightWidth, blackKnightHeight, null);
                            break;
                        case Chess.BLACK_KING:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-King-Black.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int blackKingWidth = image.getWidth(null);
                            int blackKingHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, blackKingWidth, blackKingHeight, null);
                            break;
                        case Chess.BLACK_QUEEN:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Queen-Black.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int blackQueenWidth = image.getWidth(null);
                            int blackQueenHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, blackQueenWidth, blackQueenHeight, null);
                            break;
                        case Chess.BLACK_ROOK:
                            try {
                                image = ImageIO.read(this.getClass().getResource("/resources/Chess-Rook-Black.png"));
                            } catch (IOException ex) {
                                Logger.getLogger(ChessPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            int blackRookWidth = image.getWidth(null);
                            int blackRookHeight = image.getHeight(null);
                            g.drawImage(image, c * BETWEEN_PIECES_SIZE, r * BETWEEN_PIECES_SIZE, blackRookWidth, blackRookHeight, null);
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

        jSlider1 = new javax.swing.JSlider();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

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

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
       //hacer un if para que puedas mover las fichas con un contador de clicks.
        
       //Si el click es = 0 (primer click), coge las primeras coordenadas, si es igual a 1 (segundo click)
        //coge la segunda.
        
        //Alfinal del if igualar el contador a 0 para que no siga contando.
        
//        evt.getX()
//        chess.setMovement(startRowMov, startColMov, finalRowMov, finalColMov);
    }//GEN-LAST:event_formMouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
