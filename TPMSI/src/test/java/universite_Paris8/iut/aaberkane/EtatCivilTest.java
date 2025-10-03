package universite_Paris8.iut.aaberkane;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import universite_Paris8.iut.aaberkane.utils.exception.DeJaMortException;
import universite_Paris8.iut.aaberkane.utils.exception.PasMortException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EtatCivilTest {

    EtatCivil e1;

    @BeforeEach
    public final void creationDePersonne(){
        ArrayList<Personne> personnes= new ArrayList<>();
        Personne p1 =new Personne("Wael",1980);
        Personne p2 =new Personne("Jesko",1940);
        Personne p3 =new Personne("Ilyas",1980);
        Personne p4= new Personne("Anas",2000);
        Personne p5 =new Personne("Alpay",1960);

        personnes.add(p1);
        personnes.add(p2);
        personnes.add(p3);
        personnes.add(p4);
        personnes.add(p5);

        e1= new EtatCivil(personnes);
    }


    @Test
    public final void nombreDeVivantTest() throws DeJaMortException, PasMortException {

        e1.getPersonne("Chadi").meurt(1962);
        e1.getPersonne("Adam").meurt(2013);

        assertEquals(2,e1.nombreDevivant());
    }

    @Test
    public final void nombreDeMortApres1960() throws DeJaMortException {


        e1.getPersonne("Chadi").meurt(1962);
        e1.getPersonne("Adam").meurt(2013);

        assertEquals(1,e1.nombreDeMortApres1960());
    }




}
