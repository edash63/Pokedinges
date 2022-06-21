
public class Normal extends Pokemon {
    public void Normal() {
        weak.add(sRock);
        weak.add(sSteel);

        useless.add(sGhost);
    }

    public void normalType() {
        System.out.println("Weak against: Rock, Steel");
        System.out.println("Useless against: Ghost");
        System.out.println("Strong against: none");
    }
}
