public  class Chevalier extends Moule {
   private int force;
   
   
    public Chevalier (String nom,int age,int taille,int pointdevie,int endurance,int experience, int force){
        super(nom,age,taille,pointdevie,endurance,experience );
        this.force = force;
        }
        
        public int getForce () {
        return force;
        }
    
        public void setForce (int force) {
            this.force = force;
        }
        
        
        public int tirerdesfleches(Moule chevalier) { 
                 
            return 0;
         }
         public void flecheeternelle() {

         }
         public void flechedeletoiledunord() {

            }

         public void coupdetete() {

         }
        public  void coupdestoc( Moule chevalier) {
// attaque special du chevalier sur un autre combattant a l epee
            chevalier.setpointdevie(chevalier.getpointdevie()-18);
            System.out.println(" il vous reste  " + chevalier.getpointdevie() + " a votre personnage");


        }
        public  void coupdehache() {

        }

        public void sortdudragon() {

        }
        public  void sortdutigre() {

        }
        public  void sortilegedesanciens(Moule moule) {

        }

        public void coupdepoingoriginel(Moule moule) {

        }
        public void ecrasementdupied() {

        }

        //je vais faire en sorte ici que quand j invoque cette methode pour que le chevalier ne subissent aucun degats
        public void protectiondeviecosmique(int degats) {
            
            
             
            //ici je fais en sorte de stocker que qd je passe en parametre un
            //nombre je recupere celui ci dans la variable degats
            this.setpointdevie(this.getpointdevie()+ degats);
            System.out.println(this.getpointdevie());
            
           
               
              }
        

    
    
}
