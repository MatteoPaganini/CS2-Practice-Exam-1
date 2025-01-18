import java.sql.Array;

public class StarshipExplorer {

    public static void main(String[] args) {
        StarshipExplorer starshipExplorer = new StarshipExplorer(); //new object

        starshipExplorer.displayAliens();

        if (starshipExplorer.checkEnergy() == true){
            System.out.println("There are at least two equal Alien energy levels");
        }
        else {
            System.out.println("There are no two equal Alien energy levels");
        }
    }

    public Alien[] aliens;

    public StarshipExplorer(){
        System.out.println("Hello World! Good luck on your exams!" + "\n");

        aliens = new Alien[50];
        for (int i = 0; i < 50; i++){
            aliens[i] = new Alien((int)(Math.random()*75), (int)(Math.random()*100));
        }

        System.out.println(decipher(alienLanguage));
    }

    public void displayAliens(){ //parameter most likely not needed
        for(Alien alien : aliens){
            alien.printInfo();
        }
    }

    public boolean checkEnergy(){
        for (int i = 0; i < aliens.length; i++){
            for (int m = i + 1; m < aliens.length; m++){
                if (aliens[i].getEnergyLevel() == aliens[m].getEnergyLevel()){
                    return true;
                }
            }
        }
        return false;
    }


    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";


    public String decipher (String languageSample){
        String decodedString = "";

        while(languageSample.contains("*")){
            int star = languageSample.indexOf("*");
            String letter = languageSample.substring(star +1, star +2);
            System.out.println(letter);

            decodedString += letter;
            languageSample = languageSample.substring(star+2);
        }

        return decodedString;

    }

}

