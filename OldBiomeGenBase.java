import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OldBiomeGenBase {
  protected OldBiomeGenBase() {
    this.topBlock = (byte)yy.u.bM;
    this.fillerBlock = (byte)yy.v.bM;
    this.field_6502_q = 5169201;
    this.spawnableMonsterList = new ArrayList();
    this.spawnableCreatureList = new ArrayList();
    this.spawnableWaterCreatureList = new ArrayList();
    this.enableRain = true;
    this.spawnableMonsterList.add(new yx(vq.class, 10, 4, 4));
    this.spawnableMonsterList.add(new yx(gr.class, 10, 4, 4));
    this.spawnableMonsterList.add(new yx(it.class, 10, 4, 4));
    this.spawnableMonsterList.add(new yx(abh.class, 10, 4, 4));
    this.spawnableMonsterList.add(new yx(aed.class, 10, 4, 4));
    this.spawnableCreatureList.add(new yx(hm.class, 12, 4, 4));
    this.spawnableCreatureList.add(new yx(fd.class, 10, 4, 4));
    this.spawnableCreatureList.add(new yx(qh.class, 10, 4, 4));
    this.spawnableCreatureList.add(new yx(adr.class, 8, 4, 4));
    this.spawnableWaterCreatureList.add(new yx(yv.class, 10, 4, 4));
  }
  
  private OldBiomeGenBase setDisableRain() {
    this.enableRain = false;
    return this;
  }
  
  public static void generateBiomeLookup() {
    for (int i = 0; i < 64; i++) {
      for (int j = 0; j < 64; j++)
        biomeLookupTable[i + j * 64] = getBiome(i / 63.0F, j / 63.0F); 
    } 
    desert.topBlock = desert.fillerBlock = (byte)yy.E.bM;
    iceDesert.topBlock = iceDesert.fillerBlock = (byte)yy.E.bM;
  }
  
  public ig getRandomWorldGenForTrees(Random random) {
    if (random.nextInt(10) == 0)
      return (ig)new yd(false); 
    return (ig)new gq(false);
  }
  
  protected OldBiomeGenBase setEnableSnow() {
    this.enableSnow = true;
    return this;
  }
  
  protected OldBiomeGenBase setBiomeName(String s) {
    this.biomeName = s;
    return this;
  }
  
  protected OldBiomeGenBase func_4124_a(int i) {
    this.field_6502_q = i;
    return this;
  }
  
  protected OldBiomeGenBase setColor(int i) {
    this.color = i;
    return this;
  }
  
  public static OldBiomeGenBase getBiomeFromLookup(double d, double d1) {
    int i = (int)(d * 63.0D);
    int j = (int)(d1 * 63.0D);
    return biomeLookupTable[i + j * 64];
  }
  
  public static OldBiomeGenBase getBiome(float f, float f1) {
    f1 *= f;
    if (f < 0.1F)
      return tundra; 
    if (f1 < 0.2F) {
      if (f < 0.5F)
        return tundra; 
      if (f < 0.95F)
        return savanna; 
      return desert;
    } 
    if (f1 > 0.5F && f < 0.7F)
      return swampland; 
    if (f < 0.5F)
      return taiga; 
    if (f < 0.97F) {
      if (f1 < 0.35F)
        return shrubland; 
      return forest;
    } 
    if (f1 < 0.45F)
      return plains; 
    if (f1 < 0.9F)
      return seasonalForest; 
    return rainforest;
  }
  
  public int getSkyColorByTemp(float f) {
    f /= 3.0F;
    if (f < -1.0F)
      f = -1.0F; 
    if (f > 1.0F)
      f = 1.0F; 
    return Color.getHSBColor(0.6222222F - f * 0.05F, 0.5F + f * 0.1F, 1.0F).getRGB();
  }
  
  public List getSpawnableList(jf enumcreaturetype) {
    if (enumcreaturetype == jf.a)
      return this.spawnableMonsterList; 
    if (enumcreaturetype == jf.b)
      return this.spawnableCreatureList; 
    if (enumcreaturetype == jf.c)
      return this.spawnableWaterCreatureList; 
    return null;
  }
  
  public boolean getEnableSnow() {
    return this.enableSnow;
  }
  
  public boolean canSpawnLightningBolt() {
    if (this.enableSnow)
      return false; 
    return this.enableRain;
  }
  
  public static final OldBiomeGenBase rainforest = (new OldBiomeGenRainforest()).setColor(588342).setBiomeName("Rainforest").func_4124_a(2094168);
  
  public static final OldBiomeGenBase swampland = (new OldBiomeGenSwamp()).setColor(522674).setBiomeName("Swampland").func_4124_a(9154376);
  
  public static final OldBiomeGenBase seasonalForest = (new OldBiomeGenBase()).setColor(10215459).setBiomeName("Seasonal Forest");
  
  public static final OldBiomeGenBase forest = (new OldBiomeGenForest()).setColor(353825).setBiomeName("Forest").func_4124_a(5159473);
  
  public static final OldBiomeGenBase savanna = (new OldBiomeGenDesert()).setColor(14278691).setBiomeName("Savanna");
  
  public static final OldBiomeGenBase shrubland = (new OldBiomeGenBase()).setColor(10595616).setBiomeName("Shrubland");
  
  public static final OldBiomeGenBase taiga = (new OldBiomeGenTaiga()).setColor(3060051).setBiomeName("Taiga").setEnableSnow().func_4124_a(8107825);
  
  public static final OldBiomeGenBase desert = (new OldBiomeGenDesert()).setColor(16421912).setBiomeName("Desert").setDisableRain();
  
  public static final OldBiomeGenBase plains = (new OldBiomeGenDesert()).setColor(16767248).setBiomeName("Plains");
  
  public static final OldBiomeGenBase iceDesert = (new OldBiomeGenDesert()).setColor(16772499).setBiomeName("Ice Desert").setEnableSnow().setDisableRain().func_4124_a(12899129);
  
  public static final OldBiomeGenBase tundra = (new OldBiomeGenBase()).setColor(5762041).setBiomeName("Tundra").setEnableSnow().func_4124_a(12899129);
  
  public static final OldBiomeGenBase hell = (new OldBiomeGenHell()).setColor(16711680).setBiomeName("Hell").setDisableRain();
  
  public static final OldBiomeGenBase sky = (new OldBiomeGenSky()).setColor(8421631).setBiomeName("Sky").setDisableRain();
  
  public static final OldBiomeGenBase notABiome = (new OldBiomeGenNotBiome()).setColor(16777215).setBiomeName("Not actually a biome!");
  
  public String biomeName;
  
  public int color;
  
  public byte topBlock;
  
  public byte fillerBlock;
  
  public int field_6502_q;
  
  protected List spawnableMonsterList;
  
  protected List spawnableCreatureList;
  
  protected List spawnableWaterCreatureList;
  
  private boolean enableSnow;
  
  private boolean enableRain;
  
  private static OldBiomeGenBase[] biomeLookupTable = new OldBiomeGenBase[4096];
  
  static {
    generateBiomeLookup();
  }
}
