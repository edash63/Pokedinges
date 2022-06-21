
public class Water extends Pokemon {
    public Water() {
        strong.add(sFire);
        strong.add(sGround);
        strong.add(sRock);

        weak.add(sWater);
        weak.add(sGrass);
        weak.add(sDragon);
    }

    public void waterType() {
        System.out.println("Weak against: Water, Grass, Dragon");
        System.out.println("Useless against: none");
        System.out.println("Strong against: Fire, Groud, Rock");
    }
}
