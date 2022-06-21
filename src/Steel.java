public class Steel extends Pokemon {
    public Steel() {
        strong.add(sGrass);
        strong.add(sRock);

        weak.add(sFire);
        weak.add(sWater);
        weak.add(sElectric);
    }

    public void steelType()  {
        System.out.println("Weak against: Fire, Water, Electric");
        System.out.println("Useless against: none");
        System.out.println("Strong against: Grass, Rock");
    }
}
