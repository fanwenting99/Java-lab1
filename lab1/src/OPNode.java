public class OPNode {

    char op;// 运算符号
    int level;// 优先级
    //设置优先级
    public OPNode(String op) {
        this.op = op.charAt(0);
        if (op.equals("+") || op.equals("-")) {
            this.level = 1;
        }else if (op.equals("*") || op.equals("/")) {
            this.level = 2;
        }else if (op.equals("(")) {
            this.level = -3;
        }else {
            this.level = -1;
        }
    }
}