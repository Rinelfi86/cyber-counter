/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.rinelfi.classes;

/**
 *
 * @author rinelfi
 */
public class NumberFormater {
    private long number;
    
    public NumberFormater(long number){
        this.number = number;
    }
    
    public NumberFormater(int number){
        this.number = Long.valueOf(number);
    }
    
    public String formatString(){
        String number = String.valueOf(this.number);
        String output = new String();
        int last = number.length() - 1;
        for(int i = last, j = 0; i > -1; i--, j++){
            if(j % 3 == 0 && j != 0){
                output = " " + output;
            }
            output = number.charAt(i) + output;
        }
        return output + ".00";
    }
}
