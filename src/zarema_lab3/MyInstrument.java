
package zarema_lab3;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MyInstrument {

    private String name;
    private String category;
    private boolean canplay;
    
    private ArrayList<MyInstrument> MyInstrument;

    public ArrayList<MyInstrument> getMyInstrument() {
        return MyInstrument;
    }

    public void setMyInstrument(ArrayList<MyInstrument> MyInstrument) {
        this.MyInstrument = MyInstrument;
    }
    
    private LinkedHashSet<MyInstrument> Instrument;
    
    public LinkedHashSet<MyInstrument> getInstrument() {
        return Instrument;
    }
    
    public void setInstrument(LinkedHashSet<MyInstrument> Instrument) {
        this.Instrument = Instrument;
    }
    
    public MyInstrument() {
        this.name = "Unknown";
        this.category = "Unknown";
        this.MyInstrument = new ArrayList<MyInstrument>();
        this.Instrument = new LinkedHashSet<MyInstrument>();
    }

    public MyInstrument (String name, String category) {
        this.name = name;
        this.category = category;
        this.MyInstrument = new ArrayList<MyInstrument>();
        this.Instrument = new LinkedHashSet<MyInstrument>();
    }

    public MyInstrument (String name, String category, boolean canplay) {
        this.name = name;
        this.category = category;
        this.MyInstrument = new ArrayList<MyInstrument>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getCanplay() {
        return  canplay;
    }

    public void setCanplay(boolean cannot) {
        boolean canplay;
        if (canplay = false ) {
            this.canplay = cannot;
        }
    }
@Override
    public String toString() {
         if (this.canplay = true ) {
            return this.name + ": category - " + this.category + "\n" + "And I can play";
        } else {
            return this.name + ": category - " + this.category + "\n" + "But I can't play";
        }
    }

    void remove(int i) {
       MyInstrument.remove(i);
    }
}