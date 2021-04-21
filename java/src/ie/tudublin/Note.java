package ie.tudublin;



public class Note {
    private char note;
    private int duration;

    

// to string method
    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }

    public Note()
    {

    }


    //constructors
    public Note(char note, int duration)
    {
        this.note = note;
        this.duration = duration;
    }




// getters and setters
    public char getNote() {
        return note;
    }
    public void setNote(char note) {
        this.note = note;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}
