public class Dark extends Pokemon {
    public void Dark() {
        strong.add(sPsychic);
        strong.add(sGhost);

        weak.add(sFighting);
        weak.add(sDark);
        weak.add(sSteel);
    }
    public void darkType() {
        System.out.println("Weak against: Fighting, Dark, Steel");
        System.out.println("Useless against: none");
        System.out.println("Strong against: Psychic, Ghost");
    }
}
