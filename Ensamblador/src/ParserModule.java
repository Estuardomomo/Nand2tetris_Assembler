


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User_Len
 */
public class ParserModule {
    //Opens the input file/stream and gets ready to parse it.
    public ParserModule(){
    }
    //Are there more commands in the input?
    private Boolean hasMoreCommands(){
    return false;
    }
    //Reads the next command from the input and makes it the current command.
    public void advance(){
    }
    //Returns the type of the current command.
    public String commandType(String instruction){
    if(instruction.startsWith("(") || instruction.equals("")){
        return "L";
    }
    if(instruction.contains("@")){
        return "A";
    }
        return "C";
    }
    //Returns the symbol or decimal of the current command @Xxx or (Xxx).
    public String symbol(){
    return "Xxx";
    }
    //Returns the dest mnemonic in the current C-command
    public String dest(){
    return "Xxx";
    }
    //Returns the comp mnemonic in the current C-command
    public String comp(){
    return "Xxx";
    }
    //Returns the jump mnemonic in the current C-command
    public String jump(){
    return "Xxx";
    }
    public String Converter(int number){
        int residue;
        String  binary = "";
        while(number > 0){
            residue = number%2;
            binary = residue + binary;
            number = number/2;
        }
        while(binary.length() < 16){
            binary = "0" + binary;
        }
        return binary;
    }
}

