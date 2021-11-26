public  class Mage extends Moule {
    private int puissance;
    
    
     public Mage (String nom,int age,int taille,int pointdevie,int endurance,int experience, int puissance){
         super(nom,age,taille,pointdevie,endurance,experience );
         this.puissance = puissance;
         }
     
         public int getPuissance () {
         return puissance;
         }
     
         public void setPuissance (int puissance) {
             this.puissance= puissance;
         }

         public int tirerdesfleches(Moule mage) { 
            return 0;     
           
            

         }
         public void flecheeternelle() {

         }
         public void flechedeletoiledunord() {

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
        public  void sortilegedesanciens(Moule mage) {
            mage.setpointdevie(mage.getpointdevie()-10);
           System.out.println(" il vous reste desormais plus que  " + mage.getpointdevie() + " a votre personnage");

        }

        public void coupdepoingoriginel(Moule moule) {

        }
        public void ecrasementdupied() {

        }
        public void protectiondeviecosmique(int degats) {
            
            this.setpointdevie(this.getpointdevie()+degats); //mon mage peut se soigne ts seul
            System.out.println(" votre mage vient de gagner 5 point de vie et totalise desormais " + this.getpointdevie() + " points de vie au totale ");
        }

        public void medicalmagehelp(Mage  mage) {
            // methode qui permet au mage de se soigner par lui meme
            mage.setpointdevie(mage.getpointdevie()+5); //mon mage peut se soigner
            System.out.println(" votre mage vient de gagner 5 point de vie et totalise desormais " + mage.getpointdevie() + " points de vie au totale ");
        }
     
 }