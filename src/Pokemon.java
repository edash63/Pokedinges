import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    protected HashSet<String> strong;
    protected HashSet<String> weak;
    protected HashSet<String> useless;

    public static final String sNormal = "Normal";
    public static final String sFire = "Fire";
    public static final String sWater = "Water";
    public static final String sGrass = "Grass";
    public static final String sElectric = "Electric";
    public static final String sIce = "Ice";
    public static final String sFighting = "Fighting";
    public static final String sPoison = "Poison";
    public static final String sGround = "Ground";
    public static final String sFlying = "Flying";
    public static final String sPsychic = "Psychic";
    public static final String sBug = "Bug";
    public static final String sRock = "Rock";
    public static final String sGhost = "Ghost";
    public static final String sDragon = "Dragon";
    public static final String sDark = "Dark";
    public static final String sSteel = "Steel";
    public static final String sFairy = "Fairy";
    public static final Set<String> PokemonTypes =
            new HashSet<String>(Arrays.asList
                    (sNormal, sFire, sWater, sGrass, sElectric, sIce, sFighting, sPoison, sGround, sFlying,
                    sPsychic, sBug, sRock, sGhost, sDragon, sDark, sSteel, sFairy ));

    public Pokemon() {
        strong = new HashSet<String>();
        weak = new HashSet<String>();
        useless = new HashSet<String>();
    }
    public static Pokemon Factory(String ptype) {
        Pokemon p = null;
        String cap_ptype = ptype.substring(0, 1).toUpperCase() + ptype.substring(1).toLowerCase();

        if (PokemonTypes.contains(cap_ptype)) {
            try {
                Class pc = Class.forName(cap_ptype);
                p = (Pokemon) pc.getDeclaredConstructor().newInstance();
            }
            catch (Exception e) {
                System.out.println("Weird behaviour");
            }
        }

        return p;
    }

    public static Pokemon ClassicFactory(String ptype) {
        Pokemon p;
        switch (ptype) {
            case sNormal:
                p = new Normal();
                break;
            case sFire:
                p =  new Fire();
                break;
            case sWater:
                p =  new Water();
                break;
            case sGrass:
                p =  new Grass();
                break;
            case sElectric:
                p =  new Electric();
                break;
            case sIce:
                p =  new Ice();
                break;
            case sFighting:
                p =  new Fighting();
                break;
            case sPoison:
                p =  new Poison();
                break;
            case sGround:
                p =  new Ground();
                break;
            case sFlying:
                p =  new Flying();
                break;
            case sPsychic:
                p =  new Psychic();
                break;
            case sBug:
                p =  new Bug();
                break;
            case sRock:
                p =  new Rock();
                break;
            case sGhost:
                p =  new Ghost();
                break;
            case sDragon:
                p =  new Dragon();
                break;
            case sDark:
                p =  new Dark();
                break;
            case sSteel:
                p =  new Steel();
                break;
            case sFairy:
 //               p =  new Fairy();
                p = null; // not implemented yet
                break;
            default:
                p = null;
                break;
        }
        return p;
    }

    public void PrintSWU() {
        System.out.print("Strong against: ");
        System.out.println(strong);
        System.out.print("Weak against: ");
        System.out.println(weak);
        System.out.print("Useless against: ");
        System.out.println(useless);
    }

    public HashSet<String> Strong() { return strong; }
    public HashSet<String> Weak() { return weak; }
    public HashSet<String> Useless() { return useless; }
}
