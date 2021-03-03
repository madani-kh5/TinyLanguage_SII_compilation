import java.util.ArrayList;

public class SymbolTable {

    static public class Element {
        String name;
        boolean declare; // false:undeclared , true :declared
        char type; // i:intCompil , f:floatCompil  , s:StringCompil
        int size; //size;

        public Element(String name, boolean declare, char type, int size) {
            this.name = name;
            this.declare = declare;
            this.type = type;
            this.size = size;
        }



        @Override
        public String showVar()
        {
            String dclr = (declare == true) ? "true" : "false";
            return "| variable: " + name + " | type: " + (  (type=='i' ? "intCompil" : (type=='f' ? "floatCompil" : "StringCompil" ) )) + " | status: " + dclr +"|";
        }
    }


    public ArrayList<Element> Table = new ArrayList<Element>();


    public Element getElement(String name)
    {
        for (int i = 0; i < Table.size(); i++) {
            if(Table.get(i).name.compareTo(name) ==0)   // compareTo() retourne 0 si les deux String sont egaux
                return Table.get(i);
        }
        return null;
    }

    public boolean ExistElement(String name)
    {
        return getElement(name) != null;
    }

    public void addElement(Element e)
    {
        Table.add(e);
    }

    public void deleteElement(Element e)
    {
        Table.remove(e);
    }

    public int getSize()
    {
        return Table.size();
    }

    public Element getElement(int i)
    {
        return Table.get(i);
    }
}