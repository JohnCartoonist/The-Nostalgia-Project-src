public class wr extends acy {
  public wr(int i, nu enumtoolmaterial) {
    super(i);
    this.bN = 1;
    i(enumtoolmaterial.a());
  }
  
  public boolean a(dk itemstack, vi entityplayer, ry world, int i, int j, int k, int l) {
    if (!entityplayer.e(i, j, k))
      return false; 
    int i1 = world.a(i, j, k);
    int j1 = world.a(i, j + 1, k);
    if ((l != 0 && j1 == 0 && i1 == yy.u.bM) || i1 == yy.v.bM) {
      yy block = yy.aA;
      world.a((i + 0.5F), (j + 0.5F), (k + 0.5F), block.bX.d(), (block.bX.b() + 1.0F) / 2.0F, block.bX.c() * 0.8F);
      if (world.I)
        return true; 
      world.g(i, j, k, block.bM);
      itemstack.a(1, entityplayer);
      if (world.w.nextInt(8) == 0 && i1 == yy.u.bM) {
        int j2 = 1;
        for (int k1 = 0; k1 < j2; k1++) {
          float f = 0.7F;
          float f1 = world.w.nextFloat() * f + (1.0F - f) * 0.5F;
          float f2 = 1.2F;
          float f3 = world.w.nextFloat() * f + (1.0F - f) * 0.5F;
          ih entityitem = new ih(world, (i + f1), (j + f2), (k + f3), new dk(acy.R));
          entityitem.c = 10;
          world.a((ia)entityitem);
        } 
      } 
      return true;
    } 
    return false;
  }
  
  public boolean a() {
    return true;
  }
}
