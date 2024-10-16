public class Mot_dict{
    private String mot;
    private String definition;
    public String getDefinition() {
        return definition;
    }
    public String getMot() {
        return mot;
    }
    public void setDefinition(String d) {
        definition = d;
    }
    public void setMot(String m) {
        mot = m;
    }
    public boolean synonyme(Mot_dict m1){
        if (this.definition.equals(m1.definition)){
            return true;
        }
        else{
            return false;
        }
    }

}
