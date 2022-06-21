public class Rock extends Pokemon {
    public Rock() {
        strong.add(sFire);
        strong.add(sIce);
        strong.add(sFlying);
        strong.add(sBug);

        weak.add(sFighting);
        weak.add(sGround);
        weak.add(sSteel);
    }

    public void rockType()  {
        System.out.println("Weak against: Fighting, Ground, Steel");
        System.out.println("Useless against: none");
        System.out.println("Strong against: Fire, Ice, Flying, Bug");
    }
}
