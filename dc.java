import java.util.ArrayList;
import java.util.List;

public class dc extends hl {
  private sr[] e = new sr[] { sr.d, sr.f, sr.e, sr.h, sr.g, sr.n, sr.o };
  
  private boolean f;
  
  private acm[] g = new acm[3];
  
  protected boolean a(int i, int j) {
    if (!this.f) {
      this.b.setSeed(this.c.t());
      double d = this.b.nextDouble() * Math.PI * 2.0D;
      for (int l = 0; l < this.g.length; l++) {
        double d1 = (1.25D + this.b.nextDouble()) * 32.0D;
        int j1 = (int)Math.round(Math.cos(d) * d1);
        int k1 = (int)Math.round(Math.sin(d) * d1);
        ArrayList<sr> arraylist = new ArrayList();
        sr[] abiomegenbase = this.e;
        int l1 = abiomegenbase.length;
        for (int i2 = 0; i2 < l1; i2++) {
          sr biomegenbase = abiomegenbase[i2];
          arraylist.add(biomegenbase);
        } 
        am chunkposition = this.c.a().func_35556_a_ignoreBiome((j1 << 4) + 8, (k1 << 4) + 8, 112, arraylist, this.b);
        if (chunkposition != null) {
          j1 = chunkposition.a >> 4;
          k1 = chunkposition.c >> 4;
        } else {
          System.out.println("Placed stronghold in INVALID biome at (" + j1 + ", " + k1 + ")");
        } 
        this.g[l] = new acm(j1, k1);
        d += 6.283185307179586D / this.g.length;
      } 
      this.f = true;
    } 
    acm[] achunkcoordintpair = this.g;
    int k = achunkcoordintpair.length;
    for (int i1 = 0; i1 < k; i1++) {
      acm chunkcoordintpair = achunkcoordintpair[i1];
      if (i == chunkcoordintpair.a && j == chunkcoordintpair.b)
        return true; 
    } 
    return false;
  }
  
  protected List a() {
    ArrayList<am> arraylist = new ArrayList();
    acm[] achunkcoordintpair = this.g;
    int i = achunkcoordintpair.length;
    for (int j = 0; j < i; j++) {
      acm chunkcoordintpair = achunkcoordintpair[j];
      if (chunkcoordintpair != null)
        arraylist.add(chunkcoordintpair.a(64)); 
    } 
    return arraylist;
  }
  
  protected oa b(int i, int j) {
    kg structurestrongholdstart = new kg(this.c, this.b, i, j);
    while (true) {
      if (structurestrongholdstart.b().isEmpty() || ((aeh)structurestrongholdstart.b().get(0)).b == null) {
        structurestrongholdstart = new kg(this.c, this.b, i, j);
        continue;
      } 
      return (oa)structurestrongholdstart;
    } 
  }
}
