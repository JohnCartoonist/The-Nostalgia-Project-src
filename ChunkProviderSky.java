import java.util.List;
import java.util.Random;

public class ChunkProviderSky implements ej {
  private Random field_28087_j;
  
  private BetaNoiseGeneratorOctaves field_28086_k;
  
  private BetaNoiseGeneratorOctaves field_28085_l;
  
  private BetaNoiseGeneratorOctaves field_28084_m;
  
  private BetaNoiseGeneratorOctaves field_28083_n;
  
  private BetaNoiseGeneratorOctaves field_28082_o;
  
  public BetaNoiseGeneratorOctaves field_28096_a;
  
  public BetaNoiseGeneratorOctaves field_28095_b;
  
  public BetaNoiseGeneratorOctaves field_28094_c;
  
  private ry field_28081_p;
  
  private double[] field_28080_q;
  
  private double[] field_28079_r;
  
  private double[] field_28078_s;
  
  private double[] field_28077_t;
  
  private OldMapGenBase field_28076_u;
  
  private bz strongholdGen;
  
  private OldBiomeGenBase[] field_28075_v;
  
  double[] field_28093_d;
  
  double[] field_28092_e;
  
  double[] field_28091_f;
  
  double[] field_28090_g;
  
  double[] field_28089_h;
  
  int[][] field_28088_i;
  
  private double[] field_28074_w;
  
  public List a(jf enumcreaturetype, int i, int j, int k) {
    return null;
  }
  
  public am a(ry world, String s, int i, int j, int k) {
    return null;
  }
  
  public ChunkProviderSky(ry world, long l) {
    this.field_28079_r = new double[256];
    this.field_28078_s = new double[256];
    this.field_28077_t = new double[256];
    this.field_28076_u = new OldMapGenCaves();
    this.strongholdGen = (bz)new MapGenSkyStronghold();
    this.field_28088_i = new int[32][32];
    this.field_28081_p = world;
    this.field_28087_j = new Random(l);
    this.field_28086_k = new BetaNoiseGeneratorOctaves(this.field_28087_j, 16);
    this.field_28085_l = new BetaNoiseGeneratorOctaves(this.field_28087_j, 16);
    this.field_28084_m = new BetaNoiseGeneratorOctaves(this.field_28087_j, 8);
    this.field_28083_n = new BetaNoiseGeneratorOctaves(this.field_28087_j, 4);
    this.field_28082_o = new BetaNoiseGeneratorOctaves(this.field_28087_j, 4);
    this.field_28096_a = new BetaNoiseGeneratorOctaves(this.field_28087_j, 10);
    this.field_28095_b = new BetaNoiseGeneratorOctaves(this.field_28087_j, 16);
    this.field_28094_c = new BetaNoiseGeneratorOctaves(this.field_28087_j, 8);
  }
  
  public void func_28071_a(int i, int j, byte[] abyte0, OldBiomeGenBase[] abiomegenbase, double[] ad) {
    byte byte0 = 2;
    int k = byte0 + 1;
    byte byte1 = 33;
    int l = byte0 + 1;
    this.field_28080_q = func_28073_a(this.field_28080_q, i * byte0, 0, j * byte0, k, byte1, l);
    for (int i1 = 0; i1 < byte0; i1++) {
      for (int j1 = 0; j1 < byte0; j1++) {
        for (int k1 = 0; k1 < 32; k1++) {
          double d = 0.25D;
          double d1 = this.field_28080_q[((i1 + 0) * l + j1 + 0) * byte1 + k1 + 0];
          double d2 = this.field_28080_q[((i1 + 0) * l + j1 + 1) * byte1 + k1 + 0];
          double d3 = this.field_28080_q[((i1 + 1) * l + j1 + 0) * byte1 + k1 + 0];
          double d4 = this.field_28080_q[((i1 + 1) * l + j1 + 1) * byte1 + k1 + 0];
          double d5 = (this.field_28080_q[((i1 + 0) * l + j1 + 0) * byte1 + k1 + 1] - d1) * d;
          double d6 = (this.field_28080_q[((i1 + 0) * l + j1 + 1) * byte1 + k1 + 1] - d2) * d;
          double d7 = (this.field_28080_q[((i1 + 1) * l + j1 + 0) * byte1 + k1 + 1] - d3) * d;
          double d8 = (this.field_28080_q[((i1 + 1) * l + j1 + 1) * byte1 + k1 + 1] - d4) * d;
          for (int l1 = 0; l1 < 4; l1++) {
            double d9 = 0.125D;
            double d10 = d1;
            double d11 = d2;
            double d12 = (d3 - d1) * d9;
            double d13 = (d4 - d2) * d9;
            for (int i2 = 0; i2 < 8; i2++) {
              int j2 = i2 + i1 * 8 << 11 | 0 + j1 * 8 << 7 | k1 * 4 + l1;
              char c = '';
              double d14 = 0.125D;
              double d15 = d10;
              double d16 = (d11 - d10) * d14;
              for (int k2 = 0; k2 < 8; k2++) {
                int l2 = 0;
                if (d15 > 0.0D)
                  l2 = yy.t.bM; 
                abyte0[j2] = (byte)l2;
                j2 += c;
                d15 += d16;
              } 
              d10 += d12;
              d11 += d13;
            } 
            d1 += d5;
            d2 += d6;
            d3 += d7;
            d4 += d8;
          } 
        } 
      } 
    } 
  }
  
  public void func_28072_a(int i, int j, byte[] abyte0, OldBiomeGenBase[] abiomegenbase) {
    double d = 0.03125D;
    this.field_28079_r = this.field_28083_n.generateNoiseOctaves(this.field_28079_r, (i * 16), (j * 16), 0.0D, 16, 16, 1, d, d, 1.0D);
    this.field_28078_s = this.field_28083_n.generateNoiseOctaves(this.field_28078_s, (i * 16), 109.0134D, (j * 16), 16, 1, 16, d, 1.0D, d);
    this.field_28077_t = this.field_28082_o.generateNoiseOctaves(this.field_28077_t, (i * 16), (j * 16), 0.0D, 16, 16, 1, d * 2.0D, d * 2.0D, d * 2.0D);
    for (int k = 0; k < 16; k++) {
      for (int l = 0; l < 16; l++) {
        OldBiomeGenBase biomegenbase = abiomegenbase[k + l * 16];
        int i1 = (int)(this.field_28077_t[k + l * 16] / 3.0D + 3.0D + this.field_28087_j.nextDouble() * 0.25D);
        int j1 = -1;
        byte byte0 = biomegenbase.topBlock;
        byte byte1 = biomegenbase.fillerBlock;
        for (int k1 = 127; k1 >= 0; k1--) {
          int l1 = (l * 16 + k) * 128 + k1;
          byte byte2 = abyte0[l1];
          if (byte2 == 0) {
            j1 = -1;
          } else if (byte2 == yy.t.bM) {
            if (j1 == -1) {
              if (i1 <= 0) {
                byte0 = 0;
                byte1 = (byte)yy.t.bM;
              } 
              j1 = i1;
              if (k1 >= 0) {
                abyte0[l1] = byte0;
              } else {
                abyte0[l1] = byte1;
              } 
            } else if (j1 > 0) {
              j1--;
              abyte0[l1] = byte1;
              if (j1 == 0 && byte1 == yy.E.bM) {
                j1 = this.field_28087_j.nextInt(4);
                byte1 = (byte)yy.Q.bM;
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  public zx a(int i, int j) {
    return b(i, j);
  }
  
  public zx prepareChunk(int i, int j) {
    return b(i, j);
  }
  
  public zx b(int i, int j) {
    this.field_28087_j.setSeed(i * 341873128712L + j * 132897987541L);
    byte[] abyte0 = new byte[32768];
    zx chunk = new zx(this.field_28081_p, abyte0, i, j);
    this.field_28075_v = this.field_28081_p.a().oldLoadBlockGeneratorData(this.field_28075_v, i * 16, j * 16, 16, 16);
    double[] ad = (this.field_28081_p.a()).temperature;
    func_28071_a(i, j, abyte0, this.field_28075_v, ad);
    func_28072_a(i, j, abyte0, this.field_28075_v);
    this.field_28076_u.generate(this, this.field_28081_p, i, j, abyte0);
    this.strongholdGen.a(this, this.field_28081_p, i, j, abyte0);
    chunk.c();
    return chunk;
  }
  
  private double[] func_28073_a(double[] ad, int i, int j, int k, int l, int i1, int j1) {
    if (ad == null)
      ad = new double[l * i1 * j1]; 
    double d = 684.412D;
    double d1 = 684.412D;
    double[] ad1 = (this.field_28081_p.a()).temperature;
    double[] ad2 = (this.field_28081_p.a()).humidity;
    this.field_28090_g = this.field_28096_a.func_4109_a(this.field_28090_g, i, k, l, j1, 1.121D, 1.121D, 0.5D);
    this.field_28089_h = this.field_28095_b.func_4109_a(this.field_28089_h, i, k, l, j1, 200.0D, 200.0D, 0.5D);
    d *= 2.0D;
    this.field_28093_d = this.field_28084_m.generateNoiseOctaves(this.field_28093_d, i, j, k, l, i1, j1, d / 80.0D, d1 / 160.0D, d / 80.0D);
    this.field_28092_e = this.field_28086_k.generateNoiseOctaves(this.field_28092_e, i, j, k, l, i1, j1, d, d1, d);
    this.field_28091_f = this.field_28085_l.generateNoiseOctaves(this.field_28091_f, i, j, k, l, i1, j1, d, d1, d);
    int k1 = 0;
    int l1 = 0;
    int i2 = 16 / l;
    for (int j2 = 0; j2 < l; j2++) {
      int k2 = j2 * i2 + i2 / 2;
      for (int l2 = 0; l2 < j1; l2++) {
        int i3 = l2 * i2 + i2 / 2;
        double d2 = ad1[k2 * 16 + i3];
        double d3 = ad2[k2 * 16 + i3] * d2;
        double d4 = 1.0D - d3;
        d4 *= d4;
        d4 *= d4;
        d4 = 1.0D - d4;
        double d5 = (this.field_28090_g[l1] + 256.0D) / 512.0D;
        d5 *= d4;
        if (d5 > 1.0D)
          d5 = 1.0D; 
        double d6 = this.field_28089_h[l1] / 8000.0D;
        if (d6 < 0.0D)
          d6 = -d6 * 0.3D; 
        d6 = d6 * 3.0D - 2.0D;
        if (d6 > 1.0D)
          d6 = 1.0D; 
        d6 /= 8.0D;
        d6 = 0.0D;
        if (d5 < 0.0D)
          d5 = 0.0D; 
        d5 += 0.5D;
        d6 = d6 * i1 / 16.0D;
        l1++;
        double d7 = i1 / 2.0D;
        for (int j3 = 0; j3 < i1; j3++) {
          double d8 = 0.0D;
          double d9 = (j3 - d7) * 8.0D / d5;
          if (d9 < 0.0D)
            d9 *= -1.0D; 
          double d10 = this.field_28092_e[k1] / 512.0D;
          double d11 = this.field_28091_f[k1] / 512.0D;
          double d12 = (this.field_28093_d[k1] / 10.0D + 1.0D) / 2.0D;
          if (d12 < 0.0D) {
            d8 = d10;
          } else if (d12 > 1.0D) {
            d8 = d11;
          } else {
            d8 = d10 + (d11 - d10) * d12;
          } 
          d8 -= 8.0D;
          int k3 = 32;
          if (j3 > i1 - k3) {
            double d13 = ((j3 - i1 - k3) / (k3 - 1.0F));
            d8 = d8 * (1.0D - d13) + -30.0D * d13;
          } 
          k3 = 8;
          if (j3 < k3) {
            double d14 = ((k3 - j3) / (k3 - 1.0F));
            d8 = d8 * (1.0D - d14) + -30.0D * d14;
          } 
          ad[k1] = d8;
          k1++;
        } 
      } 
    } 
    return ad;
  }
  
  public boolean c(int i, int j) {
    return true;
  }
  
  public void a(ej ichunkprovider, int i, int j) {
    cj.a = true;
    int k = i * 16;
    int l = j * 16;
    OldBiomeGenBase biomegenbase = this.field_28081_p.a().oldGetBiomeGenAt(k + 16, l + 16);
    this.field_28087_j.setSeed(this.field_28081_p.t());
    long l1 = this.field_28087_j.nextLong() / 2L * 2L + 1L;
    long l2 = this.field_28087_j.nextLong() / 2L * 2L + 1L;
    this.field_28087_j.setSeed(i * l1 + j * l2 ^ this.field_28081_p.t());
    double d = 0.25D;
    if (this.field_28087_j.nextInt(4) == 0) {
      int i1 = k + this.field_28087_j.nextInt(16) + 8;
      int l4 = this.field_28087_j.nextInt(128);
      int i8 = l + this.field_28087_j.nextInt(16) + 8;
      (new qv(yy.B.bM)).a(this.field_28081_p, this.field_28087_j, i1, l4, i8);
    } 
    if (this.field_28087_j.nextInt(8) == 0) {
      int j1 = k + this.field_28087_j.nextInt(16) + 8;
      int i5 = this.field_28087_j.nextInt(this.field_28087_j.nextInt(120) + 8);
      int j8 = l + this.field_28087_j.nextInt(16) + 8;
      if (i5 < 64 || this.field_28087_j.nextInt(10) == 0)
        (new qv(yy.D.bM)).a(this.field_28081_p, this.field_28087_j, j1, i5, j8); 
    } 
    for (int k1 = 0; k1 < 8; k1++) {
      int j5 = k + this.field_28087_j.nextInt(16) + 8;
      int k8 = this.field_28087_j.nextInt(128);
      int i13 = l + this.field_28087_j.nextInt(16) + 8;
      (new acj()).a(this.field_28081_p, this.field_28087_j, j5, k8, i13);
    } 
    for (int i2 = 0; i2 < 10; i2++) {
      int k5 = k + this.field_28087_j.nextInt(16);
      int l8 = this.field_28087_j.nextInt(128);
      int j13 = l + this.field_28087_j.nextInt(16);
      (new adp(32)).a(this.field_28081_p, this.field_28087_j, k5, l8, j13);
    } 
    for (int j2 = 0; j2 < 20; j2++) {
      int l5 = k + this.field_28087_j.nextInt(16);
      int i9 = this.field_28087_j.nextInt(128);
      int k13 = l + this.field_28087_j.nextInt(16);
      (new ky(yy.v.bM, 32)).a(this.field_28081_p, this.field_28087_j, l5, i9, k13);
    } 
    for (int k2 = 0; k2 < 10; k2++) {
      int i6 = k + this.field_28087_j.nextInt(16);
      int j9 = this.field_28087_j.nextInt(128);
      int l13 = l + this.field_28087_j.nextInt(16);
      (new ky(yy.F.bM, 32)).a(this.field_28081_p, this.field_28087_j, i6, j9, l13);
    } 
    for (int i3 = 0; i3 < 20; i3++) {
      int j6 = k + this.field_28087_j.nextInt(16);
      int k9 = this.field_28087_j.nextInt(128);
      int i14 = l + this.field_28087_j.nextInt(16);
      (new ky(yy.I.bM, 16)).a(this.field_28081_p, this.field_28087_j, j6, k9, i14);
    } 
    for (int j3 = 0; j3 < 20; j3++) {
      int k6 = k + this.field_28087_j.nextInt(16);
      int l9 = this.field_28087_j.nextInt(64);
      int j14 = l + this.field_28087_j.nextInt(16);
      (new ky(yy.H.bM, 8)).a(this.field_28081_p, this.field_28087_j, k6, l9, j14);
    } 
    for (int k3 = 0; k3 < 2; k3++) {
      int l6 = k + this.field_28087_j.nextInt(16);
      int i10 = this.field_28087_j.nextInt(32);
      int k14 = l + this.field_28087_j.nextInt(16);
      (new ky(yy.G.bM, 8)).a(this.field_28081_p, this.field_28087_j, l6, i10, k14);
    } 
    for (int l3 = 0; l3 < 8; l3++) {
      int i7 = k + this.field_28087_j.nextInt(16);
      int j10 = this.field_28087_j.nextInt(16);
      int l14 = l + this.field_28087_j.nextInt(16);
      (new ky(yy.aN.bM, 7)).a(this.field_28081_p, this.field_28087_j, i7, j10, l14);
    } 
    for (int i4 = 0; i4 < 1; i4++) {
      int j7 = k + this.field_28087_j.nextInt(16);
      int k10 = this.field_28087_j.nextInt(16);
      int i15 = l + this.field_28087_j.nextInt(16);
      (new ky(yy.aw.bM, 7)).a(this.field_28081_p, this.field_28087_j, j7, k10, i15);
    } 
    for (int j4 = 0; j4 < 1; j4++) {
      int k7 = k + this.field_28087_j.nextInt(16);
      int l10 = this.field_28087_j.nextInt(16) + this.field_28087_j.nextInt(16);
      int j15 = l + this.field_28087_j.nextInt(16);
      (new ky(yy.N.bM, 6)).a(this.field_28081_p, this.field_28087_j, k7, l10, j15);
    } 
    d = 0.5D;
    int k4 = (int)((this.field_28094_c.func_806_a(k * d, l * d) / 8.0D + this.field_28087_j.nextDouble() * 4.0D + 4.0D) / 3.0D);
    int l7 = 0;
    if (this.field_28087_j.nextInt(10) == 0)
      l7++; 
    if (biomegenbase == OldBiomeGenBase.forest)
      l7 += k4 + 5; 
    if (biomegenbase == OldBiomeGenBase.rainforest)
      l7 += k4 + 5; 
    if (biomegenbase == OldBiomeGenBase.seasonalForest)
      l7 += k4 + 2; 
    if (biomegenbase == OldBiomeGenBase.taiga)
      l7 += k4 + 5; 
    if (biomegenbase == OldBiomeGenBase.desert)
      l7 -= 20; 
    if (biomegenbase == OldBiomeGenBase.tundra)
      l7 -= 20; 
    if (biomegenbase == OldBiomeGenBase.plains)
      l7 -= 20; 
    for (int i11 = 0; i11 < l7; i11++) {
      int k15 = k + this.field_28087_j.nextInt(16) + 8;
      int j18 = l + this.field_28087_j.nextInt(16) + 8;
      ig worldgenerator = biomegenbase.getRandomWorldGenForTrees(this.field_28087_j);
      worldgenerator.a(1.0D, 1.0D, 1.0D);
      worldgenerator.a(this.field_28081_p, this.field_28087_j, k15, this.field_28081_p.d(k15, j18), j18);
    } 
    for (int j11 = 0; j11 < 2; j11++) {
      int l15 = k + this.field_28087_j.nextInt(16) + 8;
      int k18 = this.field_28087_j.nextInt(128);
      int i21 = l + this.field_28087_j.nextInt(16) + 8;
      (new bu(yy.ad.bM)).a(this.field_28081_p, this.field_28087_j, l15, k18, i21);
    } 
    if (this.field_28087_j.nextInt(2) == 0) {
      int k11 = k + this.field_28087_j.nextInt(16) + 8;
      int i16 = this.field_28087_j.nextInt(128);
      int l18 = l + this.field_28087_j.nextInt(16) + 8;
      (new bu(yy.ae.bM)).a(this.field_28081_p, this.field_28087_j, k11, i16, l18);
    } 
    if (this.field_28087_j.nextInt(4) == 0) {
      int l11 = k + this.field_28087_j.nextInt(16) + 8;
      int j16 = this.field_28087_j.nextInt(128);
      int i19 = l + this.field_28087_j.nextInt(16) + 8;
      (new bu(yy.af.bM)).a(this.field_28081_p, this.field_28087_j, l11, j16, i19);
    } 
    if (this.field_28087_j.nextInt(8) == 0) {
      int i12 = k + this.field_28087_j.nextInt(16) + 8;
      int k16 = this.field_28087_j.nextInt(128);
      int j19 = l + this.field_28087_j.nextInt(16) + 8;
      (new bu(yy.ag.bM)).a(this.field_28081_p, this.field_28087_j, i12, k16, j19);
    } 
    for (int j12 = 0; j12 < 10; j12++) {
      int l16 = k + this.field_28087_j.nextInt(16) + 8;
      int k19 = this.field_28087_j.nextInt(128);
      int j21 = l + this.field_28087_j.nextInt(16) + 8;
      (new tw()).a(this.field_28081_p, this.field_28087_j, l16, k19, j21);
    } 
    if (this.field_28087_j.nextInt(32) == 0) {
      int k12 = k + this.field_28087_j.nextInt(16) + 8;
      int i17 = this.field_28087_j.nextInt(128);
      int l19 = l + this.field_28087_j.nextInt(16) + 8;
      (new sz()).a(this.field_28081_p, this.field_28087_j, k12, i17, l19);
    } 
    int l12 = 0;
    if (biomegenbase == OldBiomeGenBase.desert)
      l12 += 10; 
    for (int j17 = 0; j17 < l12; j17++) {
      int i20 = k + this.field_28087_j.nextInt(16) + 8;
      int k21 = this.field_28087_j.nextInt(128);
      int k22 = l + this.field_28087_j.nextInt(16) + 8;
      (new ade()).a(this.field_28081_p, this.field_28087_j, i20, k21, k22);
    } 
    for (int k17 = 0; k17 < 50; k17++) {
      int j20 = k + this.field_28087_j.nextInt(16) + 8;
      int l21 = this.field_28087_j.nextInt(this.field_28087_j.nextInt(120) + 8);
      int l22 = l + this.field_28087_j.nextInt(16) + 8;
      (new ib(yy.A.bM)).a(this.field_28081_p, this.field_28087_j, j20, l21, l22);
    } 
    for (int l17 = 0; l17 < 20; l17++) {
      int k20 = k + this.field_28087_j.nextInt(16) + 8;
      int i22 = this.field_28087_j.nextInt(this.field_28087_j.nextInt(this.field_28087_j.nextInt(112) + 8) + 8);
      int i23 = l + this.field_28087_j.nextInt(16) + 8;
      (new ib(yy.C.bM)).a(this.field_28081_p, this.field_28087_j, k20, i22, i23);
    } 
    this.field_28074_w = this.field_28081_p.a().getTemperatures_old(this.field_28074_w, k + 8, l + 8, 16, 16);
    for (int i18 = k + 8; i18 < k + 8 + 16; i18++) {
      for (int l20 = l + 8; l20 < l + 8 + 16; l20++) {
        int j22 = i18 - k + 8;
        int j23 = l20 - l + 8;
        int k23 = this.field_28081_p.e(i18, l20);
        double d1 = this.field_28074_w[j22 * 16 + j23] - (k23 - 64) / 64.0D * 0.3D;
        if ((d1 < 0.5D || this.field_28081_p.snowCovered) && k23 > 0 && k23 < 128 && this.field_28081_p.h(i18, k23, l20) && this.field_28081_p.e(i18, k23 - 1, l20).d() && this.field_28081_p.e(i18, k23 - 1, l20) != p.t)
          this.field_28081_p.g(i18, k23, l20, yy.aS.bM); 
      } 
    } 
    cj.a = false;
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
}
