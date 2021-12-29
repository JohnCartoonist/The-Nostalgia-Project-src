import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class vh {
  private jx c;
  
  private jx d;
  
  private jx e;
  
  private jx f;
  
  private agl g;
  
  private List h;
  
  public sr[] a;
  
  public float[] b;
  
  public double[] temperature;
  
  public double[] humidity;
  
  public double[] field_4196_c;
  
  public OldBiomeGenBase[] oldField_4195_d;
  
  private NoiseGeneratorOctaves2 field_4194_e;
  
  private NoiseGeneratorOctaves2 field_4193_f;
  
  private NoiseGeneratorOctaves2 field_4192_g;
  
  protected vh() {
    this.g = new agl(this);
    this.h = new ArrayList();
    this.h.add(sr.f);
    this.h.add(sr.h);
    this.h.add(sr.g);
  }
  
  public vh(ry world) {
    this();
    jx[] agenlayer = jx.a(world.t());
    this.c = agenlayer[0];
    this.d = agenlayer[1];
    this.e = agenlayer[2];
    this.f = agenlayer[3];
    this.field_4194_e = new NoiseGeneratorOctaves2(new Random(world.t() * 9871L), 4);
    this.field_4193_f = new NoiseGeneratorOctaves2(new Random(world.t() * 39811L), 4);
    this.field_4192_g = new NoiseGeneratorOctaves2(new Random(world.t() * 543321L), 2);
  }
  
  public List a() {
    return this.h;
  }
  
  public OldBiomeGenBase oldGetBiomeGenAtChunkCoord(acm chunkcoordintpair) {
    return oldGetBiomeGenAt(chunkcoordintpair.a << 4, chunkcoordintpair.b << 4);
  }
  
  public OldBiomeGenBase oldGetBiomeGenAt(int i, int j) {
    if (((Boolean)mod_noBiomesX.UseOldBiomes.get()).booleanValue() != true)
      return OldBiomeGenBase.notABiome; 
    return oldFunc_4069_a(i, j, 1, 1)[0];
  }
  
  public OldBiomeGenBase[] oldFunc_4069_a(int i, int j, int k, int l) {
    this.oldField_4195_d = oldLoadBlockGeneratorData(this.oldField_4195_d, i, j, k, l);
    return this.oldField_4195_d;
  }
  
  public OldBiomeGenBase[] oldLoadBlockGeneratorData(OldBiomeGenBase[] abiomegenbase, int i, int j, int k, int l) {
    if (abiomegenbase == null || abiomegenbase.length < k * l)
      abiomegenbase = new OldBiomeGenBase[k * l]; 
    this.temperature = this.field_4194_e.func_4112_a(this.temperature, i, j, k, k, 0.02500000037252903D, 0.02500000037252903D, 0.25D);
    this.humidity = this.field_4193_f.func_4112_a(this.humidity, i, j, k, k, 0.05000000074505806D, 0.05000000074505806D, 0.3333333333333333D);
    this.field_4196_c = this.field_4192_g.func_4112_a(this.field_4196_c, i, j, k, k, 0.25D, 0.25D, 0.5882352941176471D);
    int i1 = 0;
    for (int j1 = 0; j1 < k; j1++) {
      for (int k1 = 0; k1 < l; k1++) {
        double d = this.field_4196_c[i1] * 1.1D + 0.5D;
        double d1 = 0.01D;
        double d2 = 1.0D - d1;
        double d3 = (this.temperature[i1] * 0.15D + 0.7D) * d2 + d * d1;
        d1 = 0.002D;
        d2 = 1.0D - d1;
        double d4 = (this.humidity[i1] * 0.15D + 0.5D) * d2 + d * d1;
        d3 = 1.0D - (1.0D - d3) * (1.0D - d3);
        if (d3 < 0.0D)
          d3 = 0.0D; 
        if (d4 < 0.0D)
          d4 = 0.0D; 
        if (d3 > 1.0D)
          d3 = 1.0D; 
        if (d4 > 1.0D)
          d4 = 1.0D; 
        this.temperature[i1] = d3;
        this.humidity[i1] = d4;
        abiomegenbase[i1++] = OldBiomeGenBase.getBiomeFromLookup(d3, d4);
      } 
    } 
    return abiomegenbase;
  }
  
  public double[] getTemperatures_old(double[] ad, int i, int j, int k, int l) {
    if (ad == null || ad.length < k * l)
      ad = new double[k * l]; 
    ad = this.field_4194_e.func_4112_a(ad, i, j, k, l, 0.02500000037252903D, 0.02500000037252903D, 0.25D);
    this.field_4196_c = this.field_4192_g.func_4112_a(this.field_4196_c, i, j, k, l, 0.25D, 0.25D, 0.5882352941176471D);
    int i1 = 0;
    for (int j1 = 0; j1 < k; j1++) {
      for (int k1 = 0; k1 < l; k1++) {
        double d = this.field_4196_c[i1] * 1.1D + 0.5D;
        double d1 = 0.01D;
        double d2 = 1.0D - d1;
        double d3 = (ad[i1] * 0.15D + 0.7D) * d2 + d * d1;
        d3 = 1.0D - (1.0D - d3) * (1.0D - d3);
        if (d3 < 0.0D)
          d3 = 0.0D; 
        if (d3 > 1.0D)
          d3 = 1.0D; 
        ad[i1] = d3;
        i1++;
      } 
    } 
    return ad;
  }
  
  public sr a(acm chunkcoordintpair) {
    return a(chunkcoordintpair.a << 4, chunkcoordintpair.b << 4);
  }
  
  public sr a(int i, int j) {
    return this.g.b(i, j);
  }
  
  public float b(int i, int j) {
    return this.g.d(i, j);
  }
  
  public float[] b(float[] af, int i, int j, int k, int l) {
    bm.a();
    if (af == null || af.length < k * l)
      af = new float[k * l]; 
    int[] ai = this.f.a(i, j, k, l);
    for (int i1 = 0; i1 < k * l; i1++) {
      float f = ai[i1] / 65536.0F;
      if (f > 1.0F)
        f = 1.0F; 
      af[i1] = f;
    } 
    return af;
  }
  
  public float a(int i, int j, int k) {
    return a(this.g.c(i, k), j);
  }
  
  public float a(float f, int i) {
    return f;
  }
  
  public float[] b(int i, int j, int k, int l) {
    this.b = a(this.b, i, j, k, l);
    return this.b;
  }
  
  public float[] a(float[] af, int i, int j, int k, int l) {
    bm.a();
    if (af == null || af.length < k * l)
      af = new float[k * l]; 
    int[] ai = this.e.a(i, j, k, l);
    for (int i1 = 0; i1 < k * l; i1++) {
      float f = ai[i1] / 65536.0F;
      if (f > 1.0F)
        f = 1.0F; 
      af[i1] = f;
    } 
    return af;
  }
  
  public sr[] b(sr[] abiomegenbase, int i, int j, int k, int l) {
    bm.a();
    if (abiomegenbase == null || abiomegenbase.length < k * l)
      abiomegenbase = new sr[k * l]; 
    int[] ai = this.c.a(i, j, k, l);
    for (int i1 = 0; i1 < k * l; i1++)
      abiomegenbase[i1] = sr.a[ai[i1]]; 
    return abiomegenbase;
  }
  
  public sr[] a(int i, int j, int k, int l) {
    if (k == 16 && l == 16 && (i & 0xF) == 0 && (j & 0xF) == 0)
      return this.g.e(i, j); 
    this.a = a(this.a, i, j, k, l);
    return this.a;
  }
  
  public sr[] a(sr[] abiomegenbase, int i, int j, int k, int l) {
    return a(abiomegenbase, i, j, k, l, true);
  }
  
  public sr[] a(sr[] abiomegenbase, int i, int j, int k, int l, boolean flag) {
    bm.a();
    if (abiomegenbase == null || abiomegenbase.length < k * l)
      abiomegenbase = new sr[k * l]; 
    if (flag && k == 16 && l == 16 && (i & 0xF) == 0 && (j & 0xF) == 0) {
      sr[] abiomegenbase1 = this.g.e(i, j);
      System.arraycopy(abiomegenbase1, 0, abiomegenbase, 0, k * l);
      return abiomegenbase;
    } 
    int[] ai = this.d.a(i, j, k, l);
    for (int i1 = 0; i1 < k * l; i1++)
      abiomegenbase[i1] = sr.a[ai[i1]]; 
    return abiomegenbase;
  }
  
  public boolean a(int i, int j, int k, List list) {
    int l = i - k >> 2;
    int i1 = j - k >> 2;
    int j1 = i + k >> 2;
    int k1 = j + k >> 2;
    int l1 = j1 - l + 1;
    int i2 = k1 - i1 + 1;
    int[] ai = this.c.a(l, i1, l1, i2);
    for (int j2 = 0; j2 < l1 * i2; j2++) {
      sr biomegenbase = sr.a[ai[j2]];
      if (!list.contains(biomegenbase))
        return false; 
    } 
    return true;
  }
  
  public am a(int i, int j, int k, List list, Random random) {
    int l = i - k >> 2;
    int i1 = j - k >> 2;
    int j1 = i + k >> 2;
    int k1 = j + k >> 2;
    int l1 = j1 - l + 1;
    int i2 = k1 - i1 + 1;
    int[] ai = this.c.a(l, i1, l1, i2);
    am chunkposition = null;
    int j2 = 0;
    for (int k2 = 0; k2 < ai.length; k2++) {
      int l2 = l + k2 % l1 << 2;
      int i3 = i1 + k2 / l1 << 2;
      sr biomegenbase = sr.a[ai[k2]];
      if (list.contains(biomegenbase) && (chunkposition == null || random.nextInt(j2 + 1) == 0)) {
        chunkposition = new am(l2, 0, i3);
        j2++;
      } 
    } 
    return chunkposition;
  }
  
  public am func_35556_a_ignoreBiome(int i, int j, int k, List list, Random random) {
    int l = i - k >> 2;
    int i1 = j - k >> 2;
    int j1 = i + k >> 2;
    int k1 = j + k >> 2;
    int l1 = j1 - l + 1;
    int i2 = k1 - i1 + 1;
    int[] ai = this.c.a(l, i1, l1, i2);
    am chunkposition = null;
    int j2 = 0;
    for (int k2 = 0; k2 < ai.length; k2++) {
      int l2 = l + k2 % l1 << 2;
      int i3 = i1 + k2 / l1 << 2;
      sr biomegenbase = sr.a[ai[k2]];
      if (chunkposition == null || random.nextInt(j2 + 1) == 0) {
        chunkposition = new am(l2, 0, i3);
        j2++;
      } 
    } 
    return chunkposition;
  }
  
  public void b() {
    this.g.a();
  }
}
