import java.util.List;

public class xj implements ej {
  public ChunkProviderGenerateAlpha alphaGen;
  
  public ChunkProviderGenerateBeta betaGen;
  
  public xj(ry world, long l, boolean flag) {
    this.alphaGen = new ChunkProviderGenerateAlpha(world, l, flag);
    this.betaGen = new ChunkProviderGenerateBeta(world, l, Boolean.valueOf(flag));
  }
  
  public zx a(int i, int j) {
    return b(i, j);
  }
  
  public zx b(int i, int j) {
    if (((Boolean)mod_noBiomesX.UseOldBiomes.get()).booleanValue())
      return this.betaGen.b(i, j); 
    return this.alphaGen.b(i, j);
  }
  
  public boolean c(int i, int j) {
    return true;
  }
  
  public void a(ej ichunkprovider, int i, int j) {
    if (((Boolean)mod_noBiomesX.UseOldBiomes.get()).booleanValue()) {
      this.betaGen.a(ichunkprovider, i, j);
    } else {
      this.alphaGen.a(ichunkprovider, i, j);
    } 
  }
  
  public boolean a(boolean flag, rz iprogressupdate) {
    return true;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return true;
  }
  
  public String c() {
    return "RandomLevelSource";
  }
  
  public List a(jf enumcreaturetype, int i, int j, int k) {
    return null;
  }
  
  public am a(ry world, String s, int i, int j, int k) {
    if (((Boolean)mod_noBiomesX.UseOldBiomes.get()).booleanValue())
      return this.betaGen.a(world, s, i, j, k); 
    return this.alphaGen.a(world, s, i, j, k);
  }
}
