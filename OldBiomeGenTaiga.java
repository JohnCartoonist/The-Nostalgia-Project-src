import java.util.Random;

public class OldBiomeGenTaiga extends OldBiomeGenBase {
  public OldBiomeGenTaiga() {
    this.spawnableCreatureList.add(new yx(aik.class, 2, 4, 4));
  }
  
  public ig getRandomWorldGenForTrees(Random random) {
    if (random.nextInt(3) == 0)
      return (ig)new us(); 
    return (ig)new ty(false);
  }
}
