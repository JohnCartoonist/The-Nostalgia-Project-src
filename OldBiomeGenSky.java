public class OldBiomeGenSky extends OldBiomeGenBase {
  public OldBiomeGenSky() {
    this.spawnableMonsterList.clear();
    this.spawnableCreatureList.clear();
    this.spawnableWaterCreatureList.clear();
    this.spawnableCreatureList.add(new yx(qh.class, 10, 4, 4));
  }
  
  public int getSkyColorByTemp(float f) {
    return 12632319;
  }
}
