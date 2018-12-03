package xo;

public enum XOCell {
    E("e"),
    X("x"),
    O("o");
    String str;
    XOCell(String str){
        this.str = str;
    }
}
