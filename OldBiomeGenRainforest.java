import java.util.Random;

public class OldBiomeGenRainforest extends OldBiomeGenBase {
  public ig getRandomWorldGenForTrees(Random random) {
    if (random.nextInt(3) == 0)
      return (ig)new yd(false); 
    return (ig)new gq(false);
  }
}
