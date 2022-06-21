
public class Fire extends Pokemon {
    public Fire() {
        strong.add(sGrass);
        strong.add(sIce);
        strong.add(sBug);
        strong.add(sSteel);

        weak.add(sFire);
        weak.add(sWater);
        weak.add(sRock);
        weak.add(sDragon);
    }

    public void fireType() {
        System.out.println("Weak against: Fire, Water, Rock, Dragon");
        System.out.println("Useless against: none");
        System.out.println("Strong against: Grass, Ice, Bug, Steel");
    }
}