

// ici je vais definir des methodes generique qui seront passer dans les differentes classe grace a 
//l intermediaire class abstraite Moule qui  implementes Ipouvoir
public interface IPouvoir{
    int tirerdesfleches(Moule moule);
    void flecheeternelle();
    void flechedeletoiledunord();

    void coupdetete();
    void coupdestoc(Moule moule);
    void coupdehache();

    void sortdudragon();
    void sortdutigre();
    void sortilegedesanciens(Moule moule);

    void coupdepoingoriginel(Moule moule);
    void ecrasementdupied();

    void protectiondeviecosmique(int degats);




}