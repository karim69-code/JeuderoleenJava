public  class Golem extends Moule {
   private  int terroriseadversaire;

   public Golem (String nom,int age,int taille,int pointdevie,int endurance,int experience, int terroriseadversaire){
    super(nom,age,taille,pointdevie,endurance,experience );
    this.terroriseadversaire = terroriseadversaire;
    }

    public int getTerroriseadversaire () {
    return terroriseadversaire;
    }

    public void setTerroriseadversaire (int terroriseadversaire) {
        this.terroriseadversaire = terroriseadversaire;
    }
    public int tirerdesfleches(Moule moule) {
        return 0; 
             
      

     }
     public void flecheeternelle() {

     }
     public void flechedeletoiledunord(){

        }

     public void coupdetete() {

     }
    public  void coupdestoc(Moule moule) {

    }
    public  void coupdehache() {

    }

    public void sortdudragon() {

    }
    public  void sortdutigre() {

    }
    public  void sortilegedesanciens(Moule moule) {

    }

    public void coupdepoingoriginel(Moule golem) {  //attaque sepcial du golem
      
      
        golem.setpointdevie(golem.getpointdevie()-20);
       System.out.println(" il vous reste  " + golem.getpointdevie() + " a votre personnage");

    }
    public void ecrasementdupied() {

    }
    public void protectiondeviecosmique(int degats) {

    }





}