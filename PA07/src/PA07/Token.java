package PA07;

public class Token implements Comparable<Token> {
    private int value;

    public Token(int value) {
        this.value = value;
    }

    public Token() {
        //Blank Token
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isBlank() {
        if(value == 0)
            return true;
        return false;
    }

    @Override
    public int compareTo(Token o) {
        if(this.value == o.value)
            return 0;
        if(this.value > o.value)
            return 1;
        return -1;
    }
}