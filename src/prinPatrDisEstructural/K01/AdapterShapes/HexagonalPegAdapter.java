package prinPatrDisEstructural.K01.AdapterShapes;

public class HexagonalPegAdapter extends RoundPeg
{
    private HexagonalPeg peg;

    public HexagonalPegAdapter(HexagonalPeg peg)
    {
        this.peg = peg;
    }

    public double getRadius() {
    	//El tamaño de un lado de un hexagono es igual al radio de un circulo
        return peg.getWidth();
    }
}
