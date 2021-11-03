package prinPatrDisEstructural.K01.AdapterShapes;

public class Application
{
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Hole fits round peg: " + hole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
//        System.out.println("Hole fits small square peg: " + hole.fits(smallSquarePeg));

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println("Hole fits small square peg: " + hole.fits(smallSquarePegAdapter));
        System.out.println("Hole doesn't fit large square peg: " + hole.fits(largeSquarePegAdapter));
        
        HexagonalPeg smallHexagonalPeg = new HexagonalPeg(3);
        HexagonalPegAdapter smallHexagonalPegAdapter = new HexagonalPegAdapter(smallHexagonalPeg);
        System.out.println("Hole fits small hexagonal peg: " + hole.fits(smallHexagonalPegAdapter));
        
        HexagonalPeg largeHexagonalPeg = new HexagonalPeg(10);
        HexagonalPegAdapter largeHexagonalPegAdapter = new HexagonalPegAdapter(largeHexagonalPeg);
        System.out.println("Hole fits large hexagonal peg: " + hole.fits(largeHexagonalPegAdapter));
        
    }
}
