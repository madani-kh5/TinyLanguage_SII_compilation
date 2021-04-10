import java.util.ArrayList;

public class SymbolTable {

    static public class Element {
        String name;
        boolean declare; // false:undeclared , true :declared
        char type; // i:intCompil , f:floatCompil  , s:StringCompil
        String value; //value;

        public Element(String name, boolean declare, char type, String value) {
            this.name = name;
            this.declare = declare;
            this.type = type;
            this.value = value;
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


    public Element getElement(int i)
    {
        return Table.get(i);
    }

    public void SetValue (String name,String value )
    {
        getElement(name).value = value ;
    }

    public String GetValue (String name) {
      return   getElement(name).value;
    }




    public void display() {
        System.out.println("Table des symboles : ");
        System.out.println("\n********************************************************");
        System.out.println("   VAR         |       TYPE    |        DEC     |     VALEUR    \n");

        for (Element l: Table) {
            String t=null;
            if (l.type == 'i') { t = "intCompil"; }
            else if (l.type == 'f' ) { t = "floatCompil"; }
            else if (l.type == 's' ) { t= "StringCompil";}

            System.out.printf("   %s              %s            %b          %s  \n",l.name,t,l.declare,l.value);
        }
        System.out.println("\n********************************************************");
    }
}