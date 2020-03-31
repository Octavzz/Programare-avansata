package PA07;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Token> tokens = new ArrayList<>();

    public void add(Token token) {
        tokens.add(token);
    }

    public void remove(Token token) {
        tokens.remove(token);
    }
}
