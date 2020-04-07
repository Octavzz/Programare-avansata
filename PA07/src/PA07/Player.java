package PA07;

import java.util.ArrayList;
import java.util.List;

public class Player implements Runnable {

    public String name;
    public Board board;
    private List<Token> selectedTokens = new ArrayList<>();
    public int tokenCount = 0;
    public int ratio = 0;
    public static int isPlayersTurn = 0;


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void selectToken(Token token) {
        selectedTokens.add(token);
        board.remove(token);
        tokenCount++;
    }

    public void getRatio() {
        if(tokenCount >= 2)
            ratio = selectedTokens.get(selectedTokens.size() -1).getValue() - selectedTokens.get(selectedTokens.size() -2).getValue() ;
    }


    public boolean isValidToken(Token token) {
        if(tokenCount < 2)
            return true;
        if(token.getValue() - selectedTokens.get(selectedTokens.size() -1).getValue() == ratio)
            return true;
        return false;
    }


    public void run() {

    }
}
