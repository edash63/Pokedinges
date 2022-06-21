
public class Grass extends Pokemon {
    public Grass() {
        strong.add(sWater);
        strong.add(sGround);
        strong.add(sRock);

        weak.add(sFire);
        weak.add(sGrass);
        weak.add(sPoison);
        weak.add(sFlying);
        weak.add(sBug);
        weak.add(sDragon);
        weak.add(sSteel);
    }

    public void grassType() {
        System.out.println("Weak against: Fire, Grass, Poison, Flying, Bug, Dragon, Steel");
        System.out.println("Useless against: none");
        System.out.println("Strong against: Water, Ground, Rock");
    }
}
