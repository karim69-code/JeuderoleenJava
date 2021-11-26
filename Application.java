public class Application {
    public static void main(String[] args){ 
Golem golem = new Golem("golemanus",1200,400,5000,30,8,150);
Archer archer = new Archer("archeus",32,170,100,100,5,55);
Chevalier chevalier = new Chevalier("chevalius",45,200,100,70,8,80);
Mage mage = new Mage("magnus",80,160,110,55,9,200);


System.out.println(golem.getpointdevie()); //1ere verification pour savoir si sa recupere bien les noms 
System.out.println(archer.getNom());
System.out.println(mage.getNom());
System.out.println(chevalier.getNom());


golem.coupdepoingoriginel(mage);//golem attaque mage et lui inflige des degats
golem.coupdepoingoriginel(chevalier);//goleme attaque le chevalier
golem.coupdepoingoriginel(mage);//golem attaque le mage de nouveau donc -20 point en plus / au dernier coup de poing
golem.coupdepoingoriginel(archer);
chevalier.coupdestoc(archer);
chevalier.coupdestoc(mage);
mage.sortilegedesanciens(archer);
mage.sortilegedesanciens(chevalier);
archer.tirerdesfleches(chevalier);//ici mon archer double bien les degats
archer.tirerdesfleches(chevalier);
archer.tirerdesfleches(chevalier);


/*archer.tirerdesfleches(chevalier);*/
int degats = archer.tirerdesfleches(chevalier);//ici je verifie bien la double attaque de la fleche de mon archer
 //mon archer tire des fleches sur le chevalier et lui infliges doubles degats de 10
// ces degats de 10 se retrouve dans degats 
degats += archer.tirerdesfleches(chevalier);
//et je leur mets un plus 10
 chevalier.protectiondeviecosmique(degats);//ici grace a sa protection le chevalier recupere sa force intial
 //System.out.println( " votre personne recupere la totalite de ces points de vie : " +  chevalier.getpointdevie());

//System.out.println(mage.getpointdevie());
//golem.coupdepoingoriginel();
//System.out.println(golem.getpointdevie());
//archer.pertepointsdevie();
//System.out.println(archer.getpointdevie());

/*mage.medicalmagehelp(mage);//ici je verifie bien que le mage peut se soigner en recuperant de la vie
mage.protectiondeviecosmique(10);*/

//chevalier.protectiondeviecosmique(60);// ici lorquse qu il se soigne il me retourne 10
chevalier.protectiondeviecosmique(degats);
chevalier.masterlife(80);
archer.tirerdesfleches(chevalier);
chevalier.masterlife(80);
golem.coupdepoingoriginel(chevalier);
mage.sortilegedesanciens(chevalier);

chevalier.masterlife(100);
mage.sortilegedesanciens(chevalier);
mage.sortilegedesanciens(chevalier);
mage.sortilegedesanciens(chevalier);
chevalier.protectiondeviecosmique(degats);
chevalier.masterlife(100);


    }
    
}
