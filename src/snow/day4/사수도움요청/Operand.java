package snow.day4.사수도움요청;

public enum Operand {
    ADD('+'),
    SUB('-'),
    DIV('/'),
    MUL('*');
    final private char operand;

    Operand(char operand) {
        this.operand = operand;
    }
    public static Operand getOperand(char operand){
        for(Operand op : values()){
            if(op.operand == operand){
                return op;
            }
        }
        return null;
    }

}
