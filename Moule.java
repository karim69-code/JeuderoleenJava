public abstract class Moule implements IPouvoir {
    // dans cette classe je redefinis des attributs generiques pour tous les autres guerries
    // cette classe etant abstraite je ne pourrais par contre pas l instancier
                private String nom  ;
                private int age;
                private int taille;
                private int pointdevie;
                private int endurance;
                private int experience;

               public Moule (  String nom, int age, int taille, int pointdevie, int endurance, int experience)  {
                    this.nom = nom ;
                    this.age = age ;
                    this.taille = taille;
                    this.pointdevie = pointdevie;
                    this.endurance = endurance;
                    this.experience = experience;
                    }

                    public String getNom(){
                        return nom;
                    }
                    public void setNom(String nom){
                        this.nom = nom;
                    }


                    public int getAge(){
                        return age;
                    }
                    public void setAge(int age){
                        this.age = age;
                    }

                    public int getTaille(){
                        return taille;
                    }
                    public void setTaille(int taille){
                        this.taille = taille;
                    }




                    public int getpointdevie(){
                        return pointdevie;
                    }
                    public void setpointdevie(int pointdevie){
                        this.pointdevie = pointdevie;
                    }
                    

                    public int getEndurance(){
                        return endurance;
                    }
                    public void setEndurance(int endurance){
                        this.endurance = endurance;
                    }

                    public int getExperience(){
                        return experience;
                    }
                    public void setExperience(int experience){
                        this.experience = experience;
                    }




                    





}
