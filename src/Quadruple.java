import org.stringtemplate.v4.ST;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Quadruple {
    String[] Quad;
    private String op;
    private String op1;
    private String op2;
    private String result;


    public Quadruple(String[] Quad) {
        this.Quad = Quad;
    }

    public Quadruple(String op, String op1, String op2, String result) {
        String[] Quad = new String[4];
        Quad[0] = op;
        Quad[1] = op1;
        Quad[2] = op2;
        Quad[3] = result;
    }

    public String get(int index) {
        return Quad[index];
    }

    public void set(int index, String s) {
        Quad[index] = s;
    }

    public ArrayList<String> toAssembler(int idetiq) {
        String op = Quad[0];
        String op1 = Quad[1];
        String op2 = Quad[2];
        String temp = Quad[3];

        switch (op) {
            case "+":
            case "-":
            case "*":
            case "/":
                return AssemblerInstruction.op(idetiq, op, op1, op2, temp);
            case "=":
                return AssemblerInstruction.aff(idetiq, temp, op1);
            case "BR":
            case "BGE":
            case "BLE":
                return AssemblerInstruction.jump(idetiq, op, op1, op2, temp);
            case "Final":
                ArrayList<String> assembly = new ArrayList<>();
                assembly.add("etiq" + idetiq + ": ");
                return assembly;

        }

        return new ArrayList<>();
    }

    public String toString() {
        return "(" + Quad[0] + "," + Quad[1] + "," + Quad[2] + "," + Quad[3] + ")";
    }

    public static class AssemblerInstruction {
        public static String AX = "AX";
        public static String BX = "BX";
        public static String JLE = "JLE";
        public static String JGE = "JGE";
        public static String JMP = "JMP";


        public static ArrayList<String> op(int idetiq, String op, String op1, String op2, String result) {
            ArrayList<String> assembly = new ArrayList<>();

            if (SemanticQuad.etiq.contains(idetiq)) {
                assembly.add("etiq" + idetiq + ": ");
            }

            assembly.add(mov(AX, op1));


            switch (op) {
                case "+":
                    assembly.add(add(AX, op2));
                    break;
                case "-":
                    assembly.add(sub(AX, op2));
                    break;
                case "/":
                    assembly.add(div(AX, op2));
                    break;
                case "*":
                    assembly.add(mult(AX, op2));
                    break;
            }
            assembly.add(mov(result, AX));
            return assembly;
        }

        public static ArrayList<String> aff(int idetiq, String target, String source) {
            ArrayList<String> assembly = new ArrayList<>();
            if(SemanticQuad.etiq.contains(idetiq)) {
                assembly.add("etiq" + idetiq + ": ");
            }

            assembly.add(mov(AX, source));


            assembly.add(mov(target, AX));
            return assembly;
        }

        public static ArrayList<String> jump(int idetiq, String op, String op1, String op2, String result) {
            ArrayList<String> assembly = new ArrayList<>();
            switch (op) {
                case "BR":
                    if (SemanticQuad.etiq.contains(idetiq)) {
                        assembly.add("etiq" + idetiq + ": ");
                    }
                    assembly.add(jmp(JMP, op1));

                    break;

                case "BLE":
                    if (SemanticQuad.etiq.contains(idetiq)) {
                        assembly.add("etiq" + idetiq + ": ");
                    }
                    assembly.add(mov(AX, op1));
                    assembly.add(mov(BX, op2));
                    assembly.add(cmp(op1, op2));
                    assembly.add(jmp(JLE, result));

                    break;

                case "BGE":
                    if (SemanticQuad.etiq.contains(idetiq)) {
                        assembly.add("etiq" + idetiq + ": ");
                    }

                    assembly.add(mov(AX, op1));
                    assembly.add(mov(BX, op2));
                    assembly.add(cmp(op1, op2));
                    assembly.add(jmp(JGE, result));
                    break;
            }
            return assembly;
        }

        private static String mov(String op1, String op2) {
            return "MOV " + op1 + ", " + op2;
        }

        private static String add(String op1, String op2) {
            return "ADD " + op1 + ", " + op2;
        }

        private static String sub(String op1, String op2) {
            return "SUB " + op1 + ", " + op2;
        }

        private static String div(String op1, String op2) {
            return "DIV " + op1 + ", " + op2;
        }

        private static String mult(String op1, String op2) {
            return "MUL " + op1 + ", " + op2;
        }

        private static String cmp(String op1, String op2) {
            return "CMP " + op1 + ", " + op2;
        }

        private static String jmp(String op, String op1) {
            return op + " etiq" + op1;
        }

    }
}