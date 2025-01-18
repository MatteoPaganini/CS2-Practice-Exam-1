import java.sql.Array;

public class StarshipExplorer {

    public static void main(String[] args) {
        StarshipExplorer starshipExplorer = new StarshipExplorer();
    }

    public StarshipExplorer(){
        System.out.println("Hello World! Good luck on your exams!");

        System.out.println(decipher(alienLanguage));

        Alien[] aliens = new Alien[50];
        for (int i = 0; i < 50; i++){
            aliens[i] = new Alien();
        }
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

