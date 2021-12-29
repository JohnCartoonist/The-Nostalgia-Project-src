import java.util.Random;

public class kv extends wg {
  protected kv(int i, int j) {
    super(i, j);
    float f = 0.4F;
    a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
  }
  
  public int a(int i, int j) {
    if (j == 1)
      return this.bL; 
    if (j == 2)
      return this.bL + 16 + 1; 
    if (j == 0)
      return this.bL + 16; 
    return this.bL;
  }
  
  public int f() {
    double d = 0.5D;
    double d1 = 1.0D;
    return ha.a(d, d1);
  }
  
  public int c(int i) {
    if (i == 0)
      return 16777215; 
    return db.c();
  }
  
  public int a(kq iblockaccess, int i, int j, int k) {
    int l = iblockaccess.d(i, j, k);
    if (l == 0)
      return 16777215; 
    iblockaccess.a().oldFunc_4069_a(i, k, 1, 1);
    double d = (iblockaccess.a()).temperature[0];
    double d1 = (iblockaccess.a()).humidity[0];
    return ha.a(d, d1);
  }
  
  public int a(int i, Random random, int j) {
    if (random.nextInt(8) == 0)
      return acy.R.bM; 
    return -1;
  }
  
  public int a(int i, Random random) {
    return 1 + random.nextInt(i * 2 + 1);
  }
  
  public void a(ry world, vi entityplayer, int i, int j, int k, int l) {
    if (!world.I && entityplayer.aH() != null && (entityplayer.aH()).c == acy.bd.bM) {
      entityplayer.a(ny.C[this.bM], 1);
      a(world, i, j, k, new dk((yy)yy.X, 1, l));
    } else {
      super.a(world, entityplayer, i, j, k, l);
    } 
  }
}
