import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String startMessage;
        startMessage = "Welcome!";
        System.out.println(startMessage);

        Scanner userInput = new Scanner(System.in);

        String enemyType;

        System.out.println("Enter enemy Pokemon type: ");

        enemyType = userInput.nextLine();

        Pokemon p = Pokemon.Factory(enemyType);
        if (p == null)
            System.out.println("Invalid Pokemon specified");
        else
            p.PrintSWU();

        /*
        switch (enemyType) {

            case "Normal":
                Normal normalPokemon = new Normal();
                normalPokemon.normalType();
                break;

            case "Fire":
                Fire firePokemon = new Fire();
                firePokemon.fireType();
                break;

            case "Water":
                Water waterPokemon = new Water();
                waterPokemon.waterType();
                break;

            case "Electric":
                Electric electricPokemon = new Electric();
                electricPokemon.electricType();
                break;

            case "Grass":
                Grass grassPokemon = new Grass();
                grassPokemon.grassType();
                break;

            case "Ice":
                Ice icePokemon = new Ice();
                icePokemon.iceType();
                break;

            case "Fighting":
                Fighting fightingPokemon = new Fighting();
                fightingPokemon.fightingType();
                break;

            case "Poison":
                Poison poisonPokemon = new Poison();
                poisonPokemon.poisonType();
                break;

            case "Ground":
                Ground groundPokemon = new Ground();
                groundPokemon.groundType();
                break;

            case "Flying":
                Flying flyingPokemon = new Flying();
                flyingPokemon.flyingType();
                break;

            case "Psychic":
                Psychic psychicPokemon = new Psychic();
                psychicPokemon.psychicType();
                break;

            case "Bug":
                Bug bugPokemon = new Bug();
                bugPokemon.bugType();
                break;

            case "Rock":
                Rock rockPokemon = new Rock();
                rockPokemon.rockType();
                break;

            case "Ghost":
                Ghost ghostPokemon = new Ghost();
                ghostPokemon.ghostType();
                break;

            case "Dragon":
                Dragon dragonPokemon = new Dragon();
                dragonPokemon.dragonType();
                break;

            case "Dark":
                Dark darkPokemon = new Dark();
                darkPokemon.darkType();
                break;

            case "Steel":
                Steel steelPokemon = new Steel();
                steelPokemon.steelType();
                break;
        }

         */
    }

}