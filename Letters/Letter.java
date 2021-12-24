package Letters;
public abstract class Letter {

    public Letter(String mauserCode, char name){
        this.mauserCode = mauserCode;
        this.name = name;
    }

    private String mauserCode;
    private char name;

    @Override
    public String toString(){
        return this.name + ":" + this.mauserCode;
    }

    // Getter
    public String getMauserCode() {
        return this.mauserCode;
    }

    public char getName() {
        return this.name;
    }

}
