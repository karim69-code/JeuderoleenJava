public  class Archer extends Moule {
    private int dexterite;
    
    
     public Archer (String nom,int age,int taille,int pointdevie,int endurance,int experience, int dexterite){
         super(nom,age,taille,pointdevie,endurance,experience );
         this.dexterite = dexterite;
         }
     
         public int getDexterite () {
         return dexterite;
         }
     
         public void setDexterite (int dexterite){
             this.dexterite = dexterite;
         }


         public int tirerdesfleches(Moule archer) { 
            
            
           
            
            System.out.println("attention cette archer  viens de  doubler les degats avec son arc il vous reste  " + archer.getpointdevie() + " a votre personnage");
            archer.setpointdevie(archer.getpointdevie()-15);
            archer.setpointdevie(archer.getpointdevie()-15);
            
            return 20; 
           
            
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
   
       public void coupdepoingoriginel(Moule moule) {
         // this.getpointdevie();
   
       }
       public void ecrasementdupied() {
   
       }
       public void protectiondeviecosmique(int degats) {
        
            //ici je fais en sorte de stocker que qd je passe en parametre un
            //nombre je recupere celui ci dans la variable degats
            this.setpointdevie(this.getpointdevie()+ degats/2);
            System.out.println(this.getpointdevie());


   
       }
       public void pertepointsdevie(int pointdevie) {
         // this.setpointdevie(this.getpointdevie()-60);
  
    }

   
   


 
     
 }






