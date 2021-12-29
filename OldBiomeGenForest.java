import java.util.Random;

public class OldBiomeGenForest extends OldBiomeGenBase {
  public OldBiomeGenForest() {
    this.spawnableCreatureList.add(new yx(aik.class, 2, 4, 4));
  }
  
  public ig getRandomWorldGenForTrees(Random random) {
    if (random.nextInt(5) == 0)
      return (ig)new jp(false); 
    if (random.nextInt(3) == 0)
      return (ig)new yd(false); 
    return (ig)new gq(false);
  }
}
