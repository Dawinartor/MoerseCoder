package MoerseCode;
public class Letter {

    public Letter(String mauserCode, String name){
        this.mauserCode = mauserCode;
        this.name = name;
    }

    private String mauserCode;
    private String name;

    @Override
    public String toString(){
        return this.name + ":" + this.mauserCode;
    }

    // Getter
    public String getMauserCode() {
        return this.mauserCode;
    }

    public String getName() {
        return this.name;
    }

}
