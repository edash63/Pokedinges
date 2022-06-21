public class Fighting extends Pokemon {
    public Fighting() {
        strong.add(sNormal);
        strong.add(sIce);
        strong.add(sRock);
        strong.add(sDark);
        strong.add(sSteel);

        weak.add(sPoison);
        weak.add(sFlying);
        weak.add(sPsychic);
        weak.add(sBug);

        useless.add(sGhost);
    }

    public void fightingType() {
        System.out.println("Weak against: Poison, Flying, Psychic, Bug");
        System.out.println("Useless against: Ghost");
        System.out.println("Strong against: Normal, Ice, Rock, Dark, Steel");
    }
}
