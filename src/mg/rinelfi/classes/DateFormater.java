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
public class DateFormater {
    private long timestamp;
    
    public DateFormater(long timestamp){
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    public int getHour(){
        return (((int)((int)this.timestamp/60)/60)%60);
    }
    
    public int getMinute(){
        return ((int)this.timestamp/60)%60;
    }
    
    public int getSecond(){
        return (int)this.timestamp%60;
    }
}
