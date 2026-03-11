class Wonders {
    void locations(){
        System.out.println("Location is:");
    }
    void famousFor(){
        System.out.println("Famous for:");
    }
}

class greatWallOfChina extends Wonders {
    void location(){
        System.out.println("The great wall of China is in China");
    }
    void famousFor(){
        System.out.println("It is famous for it's protection and it's lenght\n");
    }
}

class Petra extends Wonders {
    void location(){
        System.out.println("Petra is an ancient Nabataean city located in the Ma'an Governorate of southwestern Jordan");
    }
    void famousFor(){
        System.out.println("its incredible rock-cut architecture carved directly into vibrant, rose-colored sandstone cliffs. Known as the rose city\n");
    }
}

class theColosseum extends Wonders {
    void location(){
        System.out.println("The Colosseum is a massive, ancient, oval-shaped amphitheater located in the center of Rome, Italy");
    }
    void famousFor(){
        System.out.println("Famous as a premier symbol of Imperial Rome\n");
    }
}

class chichénItzá extends Wonders {
    void location(){
        System.out.println("Chichén Itzá is a major ancient Mayan city located in the eastern Yucatán Peninsula of Mexico");
    }
    void famousFor(){
        System.out.println("Renowned for its iconic El Castillo pyramid (Temple of Kukulcán), advanced Mayan-Toltec architecture, the sacred Cenote, and precise astronomical observations\n");
    }
}

class machuPicchu extends Wonders {
    void location(){
        System.out.println("Machu Picchu is a 15th-century Inca citadel located on a high, steep mountain ridge (2,430 meters above sea level) in the Cusco Region of Peru, near the Urubamba Valley");
    }
    void famousFor(){
        System.out.println("It is world-famous for its breathtaking, panoramic Andean landscapes, remarkably preserved 'dry-stone' architecture\n");
    }
}

class christTheRedeemer extends Wonders {
    void location(){
        System.out.println("Christ the Redeemer is a massive 30-meter (98 ft) Art Deco statue of Jesus Christ located at the summit of Mount Corcovado in Rio de Janeiro, Brazil");
    }
    void famousFor(){
        System.out.println("It is famous as a global symbol of Christianity and a cultural icon of Brazil\n");
    }
}

class tajMahal extends Wonders {
    void location(){
        System.out.println("The Taj Mahal is located in Agra, India, on the southern bank of the Yamuna River in Uttar Pradesh");
    }
    void famousFor(){
        System.out.println("a masterpiece of Mughal architecture and an enduring symbol of eternal love\n");
    }
}

class Main {
    public static void main(String[] args) {
        Wonders W = new Wonders();
        Wonders G = new greatWallOfChina();
        Wonders P = new Petra();
        Wonders C = new theColosseum();
        Wonders Ci = new chichénItzá();
        Wonders M = new machuPicchu();
        Wonders Ct = new christTheRedeemer();
        Wonders T = new tajMahal();

        W.locations();
        W.famousFor();

        G.locations();
        G.famousFor();

        P.locations();
        P.famousFor();

        C.locations();
        C.famousFor();

        Ci.locations();
        Ci.famousFor();

        M.locations();
        M.famousFor();

        Ct.locations();
        Ct.famousFor();

        T.locations();
        T.famousFor();
    }
}