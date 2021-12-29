public class MapGenSkyStronghold extends dc {
  protected boolean a(int i, int j) {
    boolean chance = (this.b.nextInt(200) == 0 && this.b.nextInt(120) < Math.max(Math.abs(i), Math.abs(j)));
    if (chance)
      System.out.printf("generating stronghold at chunk %d, %d!\n", new Object[] { Integer.valueOf(i * 16), Integer.valueOf(j * 16) }); 
    return chance;
  }
}
