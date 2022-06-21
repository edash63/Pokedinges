public class Ice extends Pokemon {
    public Ice() {
        strong.add(sGrass);
        strong.add(sGround);
        strong.add(sFlying);
        strong.add(sDragon);

        weak.add(sFire);
        weak.add(sWater);
        weak.add(sIce);
        weak.add(sSteel);
    }

    public void iceType() {
        System.out.println("Weak against: Fire, Water, Ice, Steel");
        System.out.println("Useless against: none");
        System.out.println("Strong against: Grass, Ground, Flying, Dragon");
    }
}
