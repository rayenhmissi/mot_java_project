public class Dictionnaire {
    private int nbm;
    private Mot_dict[] dict;
    private String nom;
    public Dictionnaire(int n){
        this.dict=new Mot_dict[n];
        this.nom="java";
    }
    public void sort_dict(int n){
        boolean check=true;
        while (check){
            check=false;
            do{
                for (int i=0;i<n-1;i++){
                    if (dict[i].equals(dict[i+1])){
                        Mot_dict d=dict[i];
                        dict[i]=dict[i+1];
                        dict[i+1]=d;
                    }
                    check=true;
                }
            }
            while (check=false);
        }
    }
    public int getNbm() {
        return nbm;
    }
    public String getNom() {
        return nom;
    }
    public void ajouter_mot(Mot_dict m2,int j){
        dict[j]=m2;
        sort_dict(5);
        j++;
    }
    public void decaler(Mot_dict dict[],int n){
        for (int l=0;l < n;l++){
            dict[l]=dict[l+1];
        }
    }
    public void supprimer_mot(String m3,int k,int n){
        for (k=0;k<n;k++){
            String m4=dict[k].getMot();
            if (m4.equals(m3)){
                dict[n-1]=dict[k];
                n-=1;
                decaler(dict,n);
            }
        }
    }
    public String recherche_dicho(Mot_dict m5,int n){
        sort_dict(n);
        int mi=n/2;
        String m6=dict[mi].getDefinition();
        String m7=m5.getDefinition();
        if (m6.compareTo(m7)==-1){
            mi=mi+1;
            for (int i=mi;i < n;i++){
                if (m6.compareTo(m7)==0){
                    return m6;
                }
            }
        }
        if (m6.compareTo(m7)==0){
            return m6;
        }
        else{
            mi=mi-1;
            for (int i=mi;i > 0;i--){
                if (m6.compareTo(m7)==0){
                    return m6;
                }
            }
        }
        return m6;
        }
        public void lister_dict(Mot_dict dict[],int n){
            for(int f=0;f<n;f++){
                System.out.println(dict[f]);
            }
        }
        public static int calculer_synonyme(Mot_dict m8,int n,Mot_dict m9){
            int so=0;
            for (int i=0;i<n;i++){
                if (recherche_dicho(m8,n)==m9.getDefinition()){
                    so++;
                }
            }
        }
        public static void main(String[] args) {
            Dictionnaire d1=new Dictionnaire(5);
            Mot_dict m=new Mot_dict();
            d1.ajouter_mot(m, 0);
            d1.supprimer_mot("java", 0, 0);
            d1.recherche_dicho(m, 0);
            d1.lister_dict(null, 0);
        }
}
