public class PORTrikotFactory extends AbstractTrikotFactory{
    @Override
    public Trikot erstelleTrikot(String name, int nummer) {
        Spielertrikot trikot = new Spielertrikot();

        trikot.setColor1("rot");
        trikot.setColor2("gruen");

        trikot.setBack(
                """ 
             RuckseitePOR
             """+ name +nummer);

        trikot.setFront("""
                VorderseitePOR
                """+ name +nummer);

        return trikot;
    }
}
