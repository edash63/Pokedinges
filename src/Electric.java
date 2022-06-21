
public class Electric extends Pokemon {
    public Electric() {
        strong.add(sWater);
        strong.add(sFlying);

        weak.add(sElectric);
        weak.add(sGrass);
        weak.add(sDragon);

        useless.add(sGround);
    }

    public void electricType() {
        System.out.println("Weak against: Electric, Grass, Dragon");
        System.out.println("Useless against: Ground");
        System.out.println("Strong against: Water, Flying");
    }
}
