
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User_Len
 */
public class SymbolTable {
    private Map<String,String> Table;
    //Creates a new symbol table with the predefined values.
    public SymbolTable() {
        this.Table = new HashMap<String,String>();
        Table.put("SP","0");
        Table.put("LCL","1");
        Table.put("ARG","2");
        Table.put("THIS","3");
        Table.put("THAT","4");
        Table.put("R0","0");
        Table.put("R1","1");
        Table.put("R2","2");
        Table.put("R3","3");
        Table.put("R4","4");
        Table.put("R5","5");
        Table.put("R6","6");
        Table.put("R7","7");
        Table.put("R8","8");
        Table.put("R9","9");
        Table.put("R10","10");
        Table.put("R11","11");
        Table.put("R12","12");
        Table.put("R13","13");
        Table.put("R14","14");
        Table.put("R15","15");
        Table.put("SCREEN","16384");
        Table.put("KBD","24576");
    }
    //Adds the pair (symbol, address) to the table
    public void addEntry(String symbol, String address){
    Table.put(symbol, address);
    }
    //Does the symbol table contains the given symbol?
    public Boolean contains(String symbol){
        return Table.containsKey(symbol);
    }
    //Returns the address associated with the symbol
    public String getAddress(String symbol){
        return Table.get(symbol);
    }
}