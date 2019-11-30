package logic;

public class Formatter {

    private String input;
    private int lineSize;
    private boolean indent, wrap, isSingleSpaced, isSingleColumn;
    private enum Justified {
        Left, Right, Center, Equal;
    }
    private Justified justType;

    public Formatter(String i) {
        input = i;
        lineSize = 80;
        wrap = false;
        isSingleSpaced = true;
        isSingleColumn = true;
        justType = Justified.Left;
    }

    public Formatter() {
        input = "No Input Exists";
        lineSize = 80;
        wrap = false;
        isSingleSpaced = true;
        isSingleColumn = true;
        justType = Justified.Left;
    }


    public String getOutput() {

        return input;
    }

}
