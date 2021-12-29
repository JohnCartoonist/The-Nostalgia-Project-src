import java.util.List;
import java.util.Random;

public class ChunkProviderGenerateBeta implements ej {
  private Random rand;
  
  private BetaNoiseGeneratorOctaves field_912_k;
  
  private BetaNoiseGeneratorOctaves field_911_l;
  
  private BetaNoiseGeneratorOctaves field_910_m;
  
  private BetaNoiseGeneratorOctaves field_909_n;
  
  private BetaNoiseGeneratorOctaves field_908_o;
  
  public BetaNoiseGeneratorOctaves field_922_a;
  
  public BetaNoiseGeneratorOctaves field_921_b;
  
  public BetaNoiseGeneratorOctaves mobSpawnerNoise;
  
  private ry worldObj;
  
  private double[] field_4180_q;
  
  private double[] sandNoise;
  
  private double[] gravelNoise;
  
  private double[] stoneNoise;
  
  private OldMapGenBase caveGenerator;
  
  private OldBiomeGenBase[] biomesForGeneration;
  
  double[] field_4185_d;
  
  double[] field_4184_e;
  
  double[] field_4183_f;
  
  double[] field_4182_g;
  
  double[] field_4181_h;
  
  int[][] unusedIntArray32x32;
  
  private double[] generatedTemperatures;
  
  public List a(jf enumcreaturetype, int i, int j, int k) {
    return null;
  }
  
  public am a(ry world, String s, int i, int j, int k) {
    return null;
  }
  
  public ChunkProviderGenerateBeta(ry world, long l, Boolean generateStructures) {
    this.sandNoise = new double[256];
    this.gravelNoise = new double[256];
    this.stoneNoise = new double[256];
    this.caveGenerator = new OldMapGenCaves();
    this.unusedIntArray32x32 = new int[32][32];
    this.worldObj = world;
    this.rand = new Random(l);
    this.field_912_k = new BetaNoiseGeneratorOctaves(this.rand, 16);
    this.field_911_l = new BetaNoiseGeneratorOctaves(this.rand, 16);
    this.field_910_m = new BetaNoiseGeneratorOctaves(this.rand, 8);
    this.field_909_n = new BetaNoiseGeneratorOctaves(this.rand, 4);
    this.field_908_o = new BetaNoiseGeneratorOctaves(this.rand, 4);
    this.field_922_a = new BetaNoiseGeneratorOctaves(this.rand, 10);
    this.field_921_b = new BetaNoiseGeneratorOctaves(this.rand, 16);
    this.mobSpawnerNoise = new BetaNoiseGeneratorOctaves(this.rand, 8);
  }
  
  public void generateTerrain(int i, int j, byte[] abyte0, OldBiomeGenBase[] abiomegenbase, double[] ad) {
    byte byte0 = 4;
    byte byte1 = 64;
    int k = byte0 + 1;
    byte byte2 = 17;
    int l = byte0 + 1;
    this.field_4180_q = initializeNoiseField(this.field_4180_q, i * byte0, 0, j * byte0, k, byte2, l);
    for (int i1 = 0; i1 < byte0; i1++) {
      for (int j1 = 0; j1 < byte0; j1++) {
        for (int k1 = 0; k1 < 16; k1++) {
          double d = 0.125D;
          double d1 = this.field_4180_q[((i1 + 0) * l + j1 + 0) * byte2 + k1 + 0];
          double d2 = this.field_4180_q[((i1 + 0) * l + j1 + 1) * byte2 + k1 + 0];
          double d3 = this.field_4180_q[((i1 + 1) * l + j1 + 0) * byte2 + k1 + 0];
          double d4 = this.field_4180_q[((i1 + 1) * l + j1 + 1) * byte2 + k1 + 0];
          double d5 = (this.field_4180_q[((i1 + 0) * l + j1 + 0) * byte2 + k1 + 1] - d1) * d;
          double d6 = (this.field_4180_q[((i1 + 0) * l + j1 + 1) * byte2 + k1 + 1] - d2) * d;
          double d7 = (this.field_4180_q[((i1 + 1) * l + j1 + 0) * byte2 + k1 + 1] - d3) * d;
          double d8 = (this.field_4180_q[((i1 + 1) * l + j1 + 1) * byte2 + k1 + 1] - d4) * d;
          for (int l1 = 0; l1 < 8; l1++) {
            double d9 = 0.25D;
            double d10 = d1;
            double d11 = d2;
            double d12 = (d3 - d1) * d9;
            double d13 = (d4 - d2) * d9;
            for (int i2 = 0; i2 < 4; i2++) {
              int j2 = i2 + i1 * 4 << 11 | 0 + j1 * 4 << 7 | k1 * 8 + l1;
              char c = '';
              double d14 = 0.25D;
              double d15 = d10;
              double d16 = (d11 - d10) * d14;
              for (int k2 = 0; k2 < 4; k2++) {
                double d17 = ad[(i1 * 4 + i2) * 16 + j1 * 4 + k2];
                int l2 = 0;
                if (k1 * 8 + l1 < byte1)
                  if (d17 < 0.5D && k1 * 8 + l1 >= byte1 - 1) {
                    l2 = yy.aT.bM;
                  } else {
                    l2 = yy.B.bM;
                  }  
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
  
  public void replaceBlocksForBiome(int i, int j, byte[] abyte0, OldBiomeGenBase[] abiomegenbase) {
    byte byte0 = 64;
    double d = 0.03125D;
    this.sandNoise = this.field_909_n.generateNoiseOctaves(this.sandNoise, (i * 16), (j * 16), 0.0D, 16, 16, 1, d, d, 1.0D);
    this.gravelNoise = this.field_909_n.generateNoiseOctaves(this.gravelNoise, (i * 16), 109.0134D, (j * 16), 16, 1, 16, d, 1.0D, d);
    this.stoneNoise = this.field_908_o.generateNoiseOctaves(this.stoneNoise, (i * 16), (j * 16), 0.0D, 16, 16, 1, d * 2.0D, d * 2.0D, d * 2.0D);
    for (int k = 0; k < 16; k++) {
      for (int l = 0; l < 16; l++) {
        OldBiomeGenBase biomegenbase = abiomegenbase[k + l * 16];
        boolean flag = (this.sandNoise[k + l * 16] + this.rand.nextDouble() * 0.2D > 0.0D);
        boolean flag1 = (this.gravelNoise[k + l * 16] + this.rand.nextDouble() * 0.2D > 3.0D);
        int i1 = (int)(this.stoneNoise[k + l * 16] / 3.0D + 3.0D + this.rand.nextDouble() * 0.25D);
        int j1 = -1;
        byte byte1 = biomegenbase.topBlock;
        byte byte2 = biomegenbase.fillerBlock;
        for (int k1 = 127; k1 >= 0; k1--) {
          int l1 = (l * 16 + k) * 128 + k1;
          if (k1 <= 0 + this.rand.nextInt(5)) {
            abyte0[l1] = (byte)yy.z.bM;
          } else {
            byte byte3 = abyte0[l1];
            if (byte3 == 0) {
              j1 = -1;
            } else if (byte3 == yy.t.bM) {
              if (j1 == -1) {
                if (i1 <= 0) {
                  byte1 = 0;
                  byte2 = (byte)yy.t.bM;
                } else if (k1 >= byte0 - 4 && k1 <= byte0 + 1) {
                  byte1 = biomegenbase.topBlock;
                  byte2 = biomegenbase.fillerBlock;
                  if (flag1)
                    byte1 = 0; 
                  if (flag1)
                    byte2 = (byte)yy.F.bM; 
                  if (flag)
                    byte1 = (byte)yy.E.bM; 
                  if (flag)
                    byte2 = (byte)yy.E.bM; 
                } 
                if (k1 < byte0 && byte1 == 0)
                  byte1 = (byte)yy.B.bM; 
                j1 = i1;
                if (k1 >= byte0 - 1) {
                  abyte0[l1] = byte1;
                } else {
                  abyte0[l1] = byte2;
                } 
              } else if (j1 > 0) {
                j1--;
                abyte0[l1] = byte2;
                if (j1 == 0 && byte2 == yy.E.bM) {
                  j1 = this.rand.nextInt(4);
                  if (((Boolean)mod_noBiomesX.GenerateSandstone.get()).booleanValue())
                    byte2 = (byte)yy.Q.bM; 
                } 
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
  
  public zx b(int i, int j) {
    this.rand.setSeed(i * 341873128712L + j * 132897987541L);
    byte[] abyte0 = new byte[32768];
    zx chunk = new zx(this.worldObj, abyte0, i, j);
    this.biomesForGeneration = this.worldObj.a().oldLoadBlockGeneratorData(this.biomesForGeneration, i * 16, j * 16, 16, 16);
    double[] ad = (this.worldObj.a()).temperature;
    generateTerrain(i, j, abyte0, this.biomesForGeneration, ad);
    replaceBlocksForBiome(i, j, abyte0, this.biomesForGeneration);
    this.caveGenerator.generate(this, this.worldObj, i, j, abyte0);
    chunk.c();
    return chunk;
  }
  
  private double[] initializeNoiseField(double[] ad, int i, int j, int k, int l, int i1, int j1) {
    if (ad == null)
      ad = new double[l * i1 * j1]; 
    double d = 684.412D;
    double d1 = 684.412D;
    double[] ad1 = (this.worldObj.a()).temperature;
    double[] ad2 = (this.worldObj.a()).humidity;
    this.field_4182_g = this.field_922_a.func_4109_a(this.field_4182_g, i, k, l, j1, 1.121D, 1.121D, 0.5D);
    this.field_4181_h = this.field_921_b.func_4109_a(this.field_4181_h, i, k, l, j1, 200.0D, 200.0D, 0.5D);
    this.field_4185_d = this.field_910_m.generateNoiseOctaves(this.field_4185_d, i, j, k, l, i1, j1, d / 80.0D, d1 / 160.0D, d / 80.0D);
    this.field_4184_e = this.field_912_k.generateNoiseOctaves(this.field_4184_e, i, j, k, l, i1, j1, d, d1, d);
    this.field_4183_f = this.field_911_l.generateNoiseOctaves(this.field_4183_f, i, j, k, l, i1, j1, d, d1, d);
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
        double d5 = (this.field_4182_g[l1] + 256.0D) / 512.0D;
        d5 *= d4;
        if (d5 > 1.0D)
          d5 = 1.0D; 
        double d6 = this.field_4181_h[l1] / 8000.0D;
        if (d6 < 0.0D)
          d6 = -d6 * 0.3D; 
        d6 = d6 * 3.0D - 2.0D;
        if (d6 < 0.0D) {
          d6 /= 2.0D;
          if (d6 < -1.0D)
            d6 = -1.0D; 
          d6 /= 1.4D;
          d6 /= 2.0D;
          d5 = 0.0D;
        } else {
          if (d6 > 1.0D)
            d6 = 1.0D; 
          d6 /= 8.0D;
        } 
        if (d5 < 0.0D)
          d5 = 0.0D; 
        d5 += 0.5D;
        d6 = d6 * i1 / 16.0D;
        double d7 = i1 / 2.0D + d6 * 4.0D;
        l1++;
        for (int j3 = 0; j3 < i1; j3++) {
          double d8 = 0.0D;
          double d9 = (j3 - d7) * 12.0D / d5;
          if (d9 < 0.0D)
            d9 *= 4.0D; 
          double d10 = this.field_4184_e[k1] / 512.0D;
          double d11 = this.field_4183_f[k1] / 512.0D;
          double d12 = (this.field_4185_d[k1] / 10.0D + 1.0D) / 2.0D;
          if (d12 < 0.0D) {
            d8 = d10;
          } else if (d12 > 1.0D) {
            d8 = d11;
          } else {
            d8 = d10 + (d11 - d10) * d12;
          } 
          d8 -= d9;
          if (j3 > i1 - 4) {
            double d13 = ((j3 - i1 - 4) / 3.0F);
            d8 = d8 * (1.0D - d13) + -10.0D * d13;
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
    int genType = ((Integer)mod_noBiomesX.MapFeatures.get()).intValue();
    if (genType == 0) {
      populate_halloween(ichunkprovider, i, j);
      return;
    } 
    if (genType == 1) {
      populate_oldbeta(ichunkprovider, i, j);
      return;
    } 
    cj.a = true;
    int k = i * 16;
    int l = j * 16;
    OldBiomeGenBase biomegenbase = this.worldObj.a().oldGetBiomeGenAt(k + 16, l + 16);
    this.rand.setSeed(this.worldObj.t());
    long l1 = this.rand.nextLong() / 2L * 2L + 1L;
    long l2 = this.rand.nextLong() / 2L * 2L + 1L;
    this.rand.setSeed(i * l1 + j * l2 ^ this.worldObj.t());
    double d = 0.25D;
    if (this.rand.nextInt(4) == 0) {
      int i1 = k + this.rand.nextInt(16) + 8;
      int l4 = this.rand.nextInt(128);
      int i8 = l + this.rand.nextInt(16) + 8;
      (new qv(yy.B.bM)).a(this.worldObj, this.rand, i1, l4, i8);
    } 
    if (this.rand.nextInt(8) == 0) {
      int j1 = k + this.rand.nextInt(16) + 8;
      int i5 = this.rand.nextInt(this.rand.nextInt(120) + 8);
      int j8 = l + this.rand.nextInt(16) + 8;
      if (i5 < 64 || this.rand.nextInt(10) == 0)
        (new qv(yy.D.bM)).a(this.worldObj, this.rand, j1, i5, j8); 
    } 
    for (int k1 = 0; k1 < 8; k1++) {
      int j5 = k + this.rand.nextInt(16) + 8;
      int k8 = this.rand.nextInt(128);
      int j11 = l + this.rand.nextInt(16) + 8;
      (new acj()).a(this.worldObj, this.rand, j5, k8, j11);
    } 
    for (int i2 = 0; i2 < 10; i2++) {
      int k5 = k + this.rand.nextInt(16);
      int l8 = this.rand.nextInt(128);
      int k11 = l + this.rand.nextInt(16);
      (new OldWorldGenClay(32)).a(this.worldObj, this.rand, k5, l8, k11);
    } 
    for (int j2 = 0; j2 < 20; j2++) {
      int l5 = k + this.rand.nextInt(16);
      int i9 = this.rand.nextInt(128);
      int l11 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.v.bM, 32)).a(this.worldObj, this.rand, l5, i9, l11);
    } 
    for (int k2 = 0; k2 < 10; k2++) {
      int i6 = k + this.rand.nextInt(16);
      int j9 = this.rand.nextInt(128);
      int i12 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.F.bM, 32)).a(this.worldObj, this.rand, i6, j9, i12);
    } 
    for (int i3 = 0; i3 < 20; i3++) {
      int j6 = k + this.rand.nextInt(16);
      int k9 = this.rand.nextInt(128);
      int j12 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.I.bM, 16)).a(this.worldObj, this.rand, j6, k9, j12);
    } 
    for (int j3 = 0; j3 < 20; j3++) {
      int k6 = k + this.rand.nextInt(16);
      int l9 = this.rand.nextInt(64);
      int k12 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.H.bM, 8)).a(this.worldObj, this.rand, k6, l9, k12);
    } 
    for (int k3 = 0; k3 < 2; k3++) {
      int l6 = k + this.rand.nextInt(16);
      int i10 = this.rand.nextInt(32);
      int l12 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.G.bM, 8)).a(this.worldObj, this.rand, l6, i10, l12);
    } 
    for (int l3 = 0; l3 < 8; l3++) {
      int i7 = k + this.rand.nextInt(16);
      int j10 = this.rand.nextInt(16);
      int i13 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.aN.bM, 7)).a(this.worldObj, this.rand, i7, j10, i13);
    } 
    for (int i4 = 0; i4 < 1; i4++) {
      int j7 = k + this.rand.nextInt(16);
      int k10 = this.rand.nextInt(16);
      int j13 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.aw.bM, 7)).a(this.worldObj, this.rand, j7, k10, j13);
    } 
    for (int j4 = 0; j4 < 1; j4++) {
      int k7 = k + this.rand.nextInt(16);
      int l10 = this.rand.nextInt(16) + this.rand.nextInt(16);
      int k13 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.N.bM, 6)).a(this.worldObj, this.rand, k7, l10, k13);
    } 
    d = 0.5D;
    int k4 = (int)((this.mobSpawnerNoise.func_806_a(k * d, l * d) / 8.0D + this.rand.nextDouble() * 4.0D + 4.0D) / 3.0D);
    int l7 = 0;
    if (this.rand.nextInt(10) == 0)
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
      int l13 = k + this.rand.nextInt(16) + 8;
      int j14 = l + this.rand.nextInt(16) + 8;
      ig worldgenerator = biomegenbase.getRandomWorldGenForTrees(this.rand);
      worldgenerator.a(1.0D, 1.0D, 1.0D);
      worldgenerator.a(this.worldObj, this.rand, l13, this.worldObj.d(l13, j14), j14);
    } 
    byte byte0 = 0;
    if (biomegenbase == OldBiomeGenBase.forest)
      byte0 = 2; 
    if (biomegenbase == OldBiomeGenBase.seasonalForest)
      byte0 = 4; 
    if (biomegenbase == OldBiomeGenBase.taiga)
      byte0 = 2; 
    if (biomegenbase == OldBiomeGenBase.plains)
      byte0 = 3; 
    for (int i14 = 0; i14 < byte0; i14++) {
      int k14 = k + this.rand.nextInt(16) + 8;
      int l16 = this.rand.nextInt(128);
      int k19 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.ad.bM)).a(this.worldObj, this.rand, k14, l16, k19);
    } 
    byte byte1 = 0;
    if (biomegenbase == OldBiomeGenBase.forest)
      byte1 = 2; 
    if (biomegenbase == OldBiomeGenBase.rainforest)
      byte1 = 10; 
    if (biomegenbase == OldBiomeGenBase.seasonalForest)
      byte1 = 2; 
    if (biomegenbase == OldBiomeGenBase.taiga)
      byte1 = 1; 
    if (biomegenbase == OldBiomeGenBase.plains)
      byte1 = 10; 
    for (int l14 = 0; l14 < byte1; l14++) {
      byte byte2 = 1;
      if (biomegenbase == OldBiomeGenBase.rainforest && this.rand.nextInt(3) != 0)
        byte2 = 2; 
      int l19 = k + this.rand.nextInt(16) + 8;
      int k22 = this.rand.nextInt(128);
      int j24 = l + this.rand.nextInt(16) + 8;
      (new ahu(yy.X.bM, byte2)).a(this.worldObj, this.rand, l19, k22, j24);
    } 
    byte1 = 0;
    if (biomegenbase == OldBiomeGenBase.desert)
      byte1 = 2; 
    for (int i15 = 0; i15 < byte1; i15++) {
      int i17 = k + this.rand.nextInt(16) + 8;
      int i20 = this.rand.nextInt(128);
      int l22 = l + this.rand.nextInt(16) + 8;
      (new mb(yy.Y.bM)).a(this.worldObj, this.rand, i17, i20, l22);
    } 
    if (this.rand.nextInt(2) == 0) {
      int j15 = k + this.rand.nextInt(16) + 8;
      int j17 = this.rand.nextInt(128);
      int j20 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.ae.bM)).a(this.worldObj, this.rand, j15, j17, j20);
    } 
    if (this.rand.nextInt(4) == 0) {
      int k15 = k + this.rand.nextInt(16) + 8;
      int k17 = this.rand.nextInt(128);
      int k20 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.af.bM)).a(this.worldObj, this.rand, k15, k17, k20);
    } 
    if (this.rand.nextInt(8) == 0) {
      int l15 = k + this.rand.nextInt(16) + 8;
      int l17 = this.rand.nextInt(128);
      int l20 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.ag.bM)).a(this.worldObj, this.rand, l15, l17, l20);
    } 
    for (int i16 = 0; i16 < 10; i16++) {
      int i18 = k + this.rand.nextInt(16) + 8;
      int i21 = this.rand.nextInt(128);
      int i23 = l + this.rand.nextInt(16) + 8;
      (new tw()).a(this.worldObj, this.rand, i18, i21, i23);
    } 
    if (this.rand.nextInt(32) == 0) {
      int j16 = k + this.rand.nextInt(16) + 8;
      int j18 = this.rand.nextInt(128);
      int j21 = l + this.rand.nextInt(16) + 8;
      (new sz()).a(this.worldObj, this.rand, j16, j18, j21);
    } 
    int k16 = 0;
    if (biomegenbase == OldBiomeGenBase.desert)
      k16 += 10; 
    for (int k18 = 0; k18 < k16; k18++) {
      int k21 = k + this.rand.nextInt(16) + 8;
      int j23 = this.rand.nextInt(128);
      int k24 = l + this.rand.nextInt(16) + 8;
      (new ade()).a(this.worldObj, this.rand, k21, j23, k24);
    } 
    for (int l18 = 0; l18 < 50; l18++) {
      int l21 = k + this.rand.nextInt(16) + 8;
      int k23 = this.rand.nextInt(this.rand.nextInt(120) + 8);
      int l24 = l + this.rand.nextInt(16) + 8;
      (new ib(yy.A.bM)).a(this.worldObj, this.rand, l21, k23, l24);
    } 
    for (int i19 = 0; i19 < 20; i19++) {
      int i22 = k + this.rand.nextInt(16) + 8;
      int l23 = this.rand.nextInt(this.rand.nextInt(this.rand.nextInt(112) + 8) + 8);
      int i25 = l + this.rand.nextInt(16) + 8;
      (new ib(yy.C.bM)).a(this.worldObj, this.rand, i22, l23, i25);
    } 
    this.generatedTemperatures = this.worldObj.a().getTemperatures_old(this.generatedTemperatures, k + 8, l + 8, 16, 16);
    for (int j19 = k + 8; j19 < k + 8 + 16; j19++) {
      for (int j22 = l + 8; j22 < l + 8 + 16; j22++) {
        int i24 = j19 - k + 8;
        int j25 = j22 - l + 8;
        int k25 = this.worldObj.e(j19, j22);
        double d1 = this.generatedTemperatures[i24 * 16 + j25] - (k25 - 64) / 64.0D * 0.3D;
        if (d1 < 0.5D && k25 > 0 && k25 < 128 && this.worldObj.h(j19, k25, j22) && this.worldObj.e(j19, k25 - 1, j22).d() && this.worldObj.e(j19, k25 - 1, j22) != p.t)
          this.worldObj.g(j19, k25, j22, yy.aS.bM); 
      } 
    } 
    cj.a = false;
  }
  
  public void populate_oldbeta(ej ichunkprovider, int i, int j) {
    cj.a = true;
    int k = i * 16;
    int l = j * 16;
    OldBiomeGenBase biomegenbase = this.worldObj.a().oldGetBiomeGenAt(k + 16, l + 16);
    this.rand.setSeed(this.worldObj.t());
    long l1 = this.rand.nextLong() / 2L * 2L + 1L;
    long l2 = this.rand.nextLong() / 2L * 2L + 1L;
    this.rand.setSeed(i * l1 + j * l2 ^ this.worldObj.t());
    double d = 0.25D;
    if (this.rand.nextInt(4) == 0) {
      int i1 = k + this.rand.nextInt(16) + 8;
      int l4 = this.rand.nextInt(128);
      int i8 = l + this.rand.nextInt(16) + 8;
      (new qv(yy.B.bM)).a(this.worldObj, this.rand, i1, l4, i8);
    } 
    if (this.rand.nextInt(8) == 0) {
      int j1 = k + this.rand.nextInt(16) + 8;
      int i5 = this.rand.nextInt(this.rand.nextInt(120) + 8);
      int j8 = l + this.rand.nextInt(16) + 8;
      if (i5 < 64 || this.rand.nextInt(10) == 0)
        (new qv(yy.D.bM)).a(this.worldObj, this.rand, j1, i5, j8); 
    } 
    for (int k1 = 0; k1 < 8; k1++) {
      int j5 = k + this.rand.nextInt(16) + 8;
      int k8 = this.rand.nextInt(128);
      int j11 = l + this.rand.nextInt(16) + 8;
      (new acj()).a(this.worldObj, this.rand, j5, k8, j11);
    } 
    for (int i2 = 0; i2 < 10; i2++) {
      int k5 = k + this.rand.nextInt(16);
      int l8 = this.rand.nextInt(128);
      int k11 = l + this.rand.nextInt(16);
      (new OldWorldGenClay(32)).a(this.worldObj, this.rand, k5, l8, k11);
    } 
    for (int j2 = 0; j2 < 20; j2++) {
      int l5 = k + this.rand.nextInt(16);
      int i9 = this.rand.nextInt(128);
      int l11 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.v.bM, 32)).a(this.worldObj, this.rand, l5, i9, l11);
    } 
    for (int k2 = 0; k2 < 10; k2++) {
      int i6 = k + this.rand.nextInt(16);
      int j9 = this.rand.nextInt(128);
      int i12 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.F.bM, 32)).a(this.worldObj, this.rand, i6, j9, i12);
    } 
    for (int i3 = 0; i3 < 20; i3++) {
      int j6 = k + this.rand.nextInt(16);
      int k9 = this.rand.nextInt(128);
      int j12 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.I.bM, 16)).a(this.worldObj, this.rand, j6, k9, j12);
    } 
    for (int j3 = 0; j3 < 20; j3++) {
      int k6 = k + this.rand.nextInt(16);
      int l9 = this.rand.nextInt(64);
      int k12 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.H.bM, 8)).a(this.worldObj, this.rand, k6, l9, k12);
    } 
    for (int k3 = 0; k3 < 2; k3++) {
      int l6 = k + this.rand.nextInt(16);
      int i10 = this.rand.nextInt(32);
      int l12 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.G.bM, 8)).a(this.worldObj, this.rand, l6, i10, l12);
    } 
    for (int l3 = 0; l3 < 8; l3++) {
      int i7 = k + this.rand.nextInt(16);
      int j10 = this.rand.nextInt(16);
      int i13 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.aN.bM, 7)).a(this.worldObj, this.rand, i7, j10, i13);
    } 
    for (int i4 = 0; i4 < 1; i4++) {
      int j7 = k + this.rand.nextInt(16);
      int k10 = this.rand.nextInt(16);
      int j13 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.aw.bM, 7)).a(this.worldObj, this.rand, j7, k10, j13);
    } 
    for (int j4 = 0; j4 < 1; j4++) {
      int k7 = k + this.rand.nextInt(16);
      int l10 = this.rand.nextInt(16) + this.rand.nextInt(16);
      int k13 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.N.bM, 6)).a(this.worldObj, this.rand, k7, l10, k13);
    } 
    d = 0.5D;
    int k4 = (int)((this.mobSpawnerNoise.func_806_a(k * d, l * d) / 8.0D + this.rand.nextDouble() * 4.0D + 4.0D) / 3.0D);
    int l7 = 0;
    if (this.rand.nextInt(10) == 0)
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
      int l13 = k + this.rand.nextInt(16) + 8;
      int j14 = l + this.rand.nextInt(16) + 8;
      ig worldgenerator = biomegenbase.getRandomWorldGenForTrees(this.rand);
      worldgenerator.a(1.0D, 1.0D, 1.0D);
      worldgenerator.a(this.worldObj, this.rand, l13, this.worldObj.d(l13, j14), j14);
    } 
    byte byte0 = 0;
    if (biomegenbase == OldBiomeGenBase.forest)
      byte0 = 2; 
    if (biomegenbase == OldBiomeGenBase.seasonalForest)
      byte0 = 4; 
    if (biomegenbase == OldBiomeGenBase.taiga)
      byte0 = 2; 
    if (biomegenbase == OldBiomeGenBase.plains)
      byte0 = 3; 
    for (int i14 = 0; i14 < byte0; i14++) {
      int k14 = k + this.rand.nextInt(16) + 8;
      int l16 = this.rand.nextInt(128);
      int k19 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.ad.bM)).a(this.worldObj, this.rand, k14, l16, k19);
    } 
    if (this.rand.nextInt(2) == 0) {
      int j15 = k + this.rand.nextInt(16) + 8;
      int j17 = this.rand.nextInt(128);
      int j20 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.ae.bM)).a(this.worldObj, this.rand, j15, j17, j20);
    } 
    if (this.rand.nextInt(4) == 0) {
      int k15 = k + this.rand.nextInt(16) + 8;
      int k17 = this.rand.nextInt(128);
      int k20 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.af.bM)).a(this.worldObj, this.rand, k15, k17, k20);
    } 
    if (this.rand.nextInt(8) == 0) {
      int l15 = k + this.rand.nextInt(16) + 8;
      int l17 = this.rand.nextInt(128);
      int l20 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.ag.bM)).a(this.worldObj, this.rand, l15, l17, l20);
    } 
    for (int i16 = 0; i16 < 10; i16++) {
      int i18 = k + this.rand.nextInt(16) + 8;
      int i21 = this.rand.nextInt(128);
      int i23 = l + this.rand.nextInt(16) + 8;
      (new tw()).a(this.worldObj, this.rand, i18, i21, i23);
    } 
    if (this.rand.nextInt(32) == 0) {
      int j16 = k + this.rand.nextInt(16) + 8;
      int j18 = this.rand.nextInt(128);
      int j21 = l + this.rand.nextInt(16) + 8;
      (new sz()).a(this.worldObj, this.rand, j16, j18, j21);
    } 
    int k16 = 0;
    if (biomegenbase == OldBiomeGenBase.desert)
      k16 += 10; 
    for (int k18 = 0; k18 < k16; k18++) {
      int k21 = k + this.rand.nextInt(16) + 8;
      int j23 = this.rand.nextInt(128);
      int k24 = l + this.rand.nextInt(16) + 8;
      (new ade()).a(this.worldObj, this.rand, k21, j23, k24);
    } 
    for (int l18 = 0; l18 < 50; l18++) {
      int l21 = k + this.rand.nextInt(16) + 8;
      int k23 = this.rand.nextInt(this.rand.nextInt(120) + 8);
      int l24 = l + this.rand.nextInt(16) + 8;
      (new ib(yy.A.bM)).a(this.worldObj, this.rand, l21, k23, l24);
    } 
    for (int i19 = 0; i19 < 20; i19++) {
      int i22 = k + this.rand.nextInt(16) + 8;
      int l23 = this.rand.nextInt(this.rand.nextInt(this.rand.nextInt(112) + 8) + 8);
      int i25 = l + this.rand.nextInt(16) + 8;
      (new ib(yy.C.bM)).a(this.worldObj, this.rand, i22, l23, i25);
    } 
    this.generatedTemperatures = this.worldObj.a().getTemperatures_old(this.generatedTemperatures, k + 8, l + 8, 16, 16);
    for (int j19 = k + 8; j19 < k + 8 + 16; j19++) {
      for (int j22 = l + 8; j22 < l + 8 + 16; j22++) {
        int i24 = j19 - k + 8;
        int j25 = j22 - l + 8;
        int k25 = this.worldObj.e(j19, j22);
        double d1 = this.generatedTemperatures[i24 * 16 + j25] - (k25 - 64) / 64.0D * 0.3D;
        if (d1 < 0.5D && k25 > 0 && k25 < 128 && this.worldObj.h(j19, k25, j22) && this.worldObj.e(j19, k25 - 1, j22).d() && this.worldObj.e(j19, k25 - 1, j22) != p.t)
          this.worldObj.g(j19, k25, j22, yy.aS.bM); 
      } 
    } 
    cj.a = false;
  }
  
  public void populate_halloween(ej ichunkprovider, int i, int j) {
    cj.a = true;
    int k = i * 16;
    int l = j * 16;
    OldBiomeGenBase biomegenbase = this.worldObj.a().oldGetBiomeGenAt(k + 16, l + 16);
    this.rand.setSeed(this.worldObj.t());
    long l1 = this.rand.nextLong() / 2L * 2L + 1L;
    long l2 = this.rand.nextLong() / 2L * 2L + 1L;
    this.rand.setSeed(i * l1 + j * l2 ^ this.worldObj.t());
    double d = 0.25D;
    for (int k1 = 0; k1 < 8; k1++) {
      int j5 = k + this.rand.nextInt(16) + 8;
      int k8 = this.rand.nextInt(128);
      int j11 = l + this.rand.nextInt(16) + 8;
      (new acj()).a(this.worldObj, this.rand, j5, k8, j11);
    } 
    for (int i2 = 0; i2 < 10; i2++) {
      int k5 = k + this.rand.nextInt(16);
      int l8 = this.rand.nextInt(128);
      int k11 = l + this.rand.nextInt(16);
      (new OldWorldGenClay(32)).a(this.worldObj, this.rand, k5, l8, k11);
    } 
    for (int j2 = 0; j2 < 20; j2++) {
      int l5 = k + this.rand.nextInt(16);
      int i9 = this.rand.nextInt(128);
      int l11 = l + this.rand.nextInt(16);
      (new OldWorldGenMinable(yy.v.bM, 32)).a(this.worldObj, this.rand, l5, i9, l11);
    } 
    for (int k2 = 0; k2 < 10; k2++) {
      int i6 = k + this.rand.nextInt(16);
      int j9 = this.rand.nextInt(128);
      int i12 = l + this.rand.nextInt(16);
      (new SuperOldWorldGenMinable(yy.F.bM, 32)).a(this.worldObj, this.rand, i6, j9, i12);
    } 
    for (int i3 = 0; i3 < 20; i3++) {
      int j6 = k + this.rand.nextInt(16);
      int k9 = this.rand.nextInt(128);
      int j12 = l + this.rand.nextInt(16);
      (new SuperOldWorldGenMinable(yy.I.bM, 16)).a(this.worldObj, this.rand, j6, k9, j12);
    } 
    for (int j3 = 0; j3 < 20; j3++) {
      int k6 = k + this.rand.nextInt(16);
      int l9 = this.rand.nextInt(64);
      int k12 = l + this.rand.nextInt(16);
      (new SuperOldWorldGenMinable(yy.H.bM, 8)).a(this.worldObj, this.rand, k6, l9, k12);
    } 
    for (int k3 = 0; k3 < 2; k3++) {
      int l6 = k + this.rand.nextInt(16);
      int i10 = this.rand.nextInt(32);
      int l12 = l + this.rand.nextInt(16);
      (new SuperOldWorldGenMinable(yy.G.bM, 8)).a(this.worldObj, this.rand, l6, i10, l12);
    } 
    for (int l3 = 0; l3 < 8; l3++) {
      int i7 = k + this.rand.nextInt(16);
      int j10 = this.rand.nextInt(16);
      int i13 = l + this.rand.nextInt(16);
      (new SuperOldWorldGenMinable(yy.aN.bM, 7)).a(this.worldObj, this.rand, i7, j10, i13);
    } 
    for (int i4 = 0; i4 < 1; i4++) {
      int j7 = k + this.rand.nextInt(16);
      int k10 = this.rand.nextInt(16);
      int j13 = l + this.rand.nextInt(16);
      (new SuperOldWorldGenMinable(yy.aw.bM, 7)).a(this.worldObj, this.rand, j7, k10, j13);
    } 
    d = 0.5D;
    int k4 = (int)((this.mobSpawnerNoise.func_806_a(k * d, l * d) / 8.0D + this.rand.nextDouble() * 4.0D + 4.0D) / 3.0D);
    int l7 = 0;
    if (this.rand.nextInt(10) == 0)
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
    Object obj = new gq(false);
    if (this.rand.nextInt(10) == 0)
      obj = new yd(false); 
    if (biomegenbase == OldBiomeGenBase.rainforest && this.rand.nextInt(3) == 0)
      obj = new yd(false); 
    for (int i11 = 0; i11 < l7; i11++) {
      int l13 = k + this.rand.nextInt(16) + 8;
      int j14 = l + this.rand.nextInt(16) + 8;
      ((ig)obj).a(1.0D, 1.0D, 1.0D);
      ((ig)obj).a(this.worldObj, this.rand, l13, this.worldObj.d(l13, j14), j14);
    } 
    for (int i14 = 0; i14 < 2; i14++) {
      int k14 = k + this.rand.nextInt(16) + 8;
      int l16 = this.rand.nextInt(128);
      int k19 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.ad.bM)).a(this.worldObj, this.rand, k14, l16, k19);
    } 
    if (this.rand.nextInt(2) == 0) {
      int j15 = k + this.rand.nextInt(16) + 8;
      int j17 = this.rand.nextInt(128);
      int j20 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.ae.bM)).a(this.worldObj, this.rand, j15, j17, j20);
    } 
    if (this.rand.nextInt(4) == 0) {
      int k15 = k + this.rand.nextInt(16) + 8;
      int k17 = this.rand.nextInt(128);
      int k20 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.af.bM)).a(this.worldObj, this.rand, k15, k17, k20);
    } 
    if (this.rand.nextInt(8) == 0) {
      int l15 = k + this.rand.nextInt(16) + 8;
      int l17 = this.rand.nextInt(128);
      int l20 = l + this.rand.nextInt(16) + 8;
      (new bu(yy.ag.bM)).a(this.worldObj, this.rand, l15, l17, l20);
    } 
    for (int i16 = 0; i16 < 10; i16++) {
      int i18 = k + this.rand.nextInt(16) + 8;
      int i21 = this.rand.nextInt(128);
      int i23 = l + this.rand.nextInt(16) + 8;
      (new tw()).a(this.worldObj, this.rand, i18, i21, i23);
    } 
    if (this.rand.nextInt(32) == 0) {
      int j16 = k + this.rand.nextInt(16) + 8;
      int j18 = this.rand.nextInt(128);
      int j21 = l + this.rand.nextInt(16) + 8;
      (new sz()).a(this.worldObj, this.rand, j16, j18, j21);
    } 
    int k16 = 0;
    if (biomegenbase == OldBiomeGenBase.desert)
      k16 += 10; 
    for (int k18 = 0; k18 < k16; k18++) {
      int k21 = k + this.rand.nextInt(16) + 8;
      int j23 = this.rand.nextInt(128);
      int k24 = l + this.rand.nextInt(16) + 8;
      (new ade()).a(this.worldObj, this.rand, k21, j23, k24);
    } 
    for (int l18 = 0; l18 < 50; l18++) {
      int l21 = k + this.rand.nextInt(16) + 8;
      int k23 = this.rand.nextInt(this.rand.nextInt(120) + 8);
      int l24 = l + this.rand.nextInt(16) + 8;
      (new ib(yy.A.bM)).a(this.worldObj, this.rand, l21, k23, l24);
    } 
    for (int i19 = 0; i19 < 20; i19++) {
      int i22 = k + this.rand.nextInt(16) + 8;
      int l23 = this.rand.nextInt(this.rand.nextInt(this.rand.nextInt(112) + 8) + 8);
      int i25 = l + this.rand.nextInt(16) + 8;
      (new ib(yy.C.bM)).a(this.worldObj, this.rand, i22, l23, i25);
    } 
    this.generatedTemperatures = this.worldObj.a().getTemperatures_old(this.generatedTemperatures, k + 8, l + 8, 16, 16);
    for (int j19 = k + 8; j19 < k + 8 + 16; j19++) {
      for (int j22 = l + 8; j22 < l + 8 + 16; j22++) {
        int i24 = j19 - k + 8;
        int j25 = j22 - l + 8;
        int k25 = this.worldObj.e(j19, j22);
        double d1 = this.generatedTemperatures[i24 * 16 + j25] - (k25 - 64) / 64.0D * 0.3D;
        if (d1 < 0.5D && k25 > 0 && k25 < 128 && this.worldObj.h(j19, k25, j22) && this.worldObj.e(j19, k25 - 1, j22).d() && this.worldObj.e(j19, k25 - 1, j22) != p.t)
          this.worldObj.g(j19, k25, j22, yy.aS.bM); 
      } 
    } 
    if (((Boolean)mod_noBiomesX.GenerateLapis.get()).booleanValue())
      for (int j4 = 0; j4 < 1; j4++) {
        int k7 = k + this.rand.nextInt(16);
        int l10 = this.rand.nextInt(16) + this.rand.nextInt(16);
        int k13 = l + this.rand.nextInt(16);
        (new OldWorldGenMinable(yy.N.bM, 6)).a(this.worldObj, this.rand, k7, l10, k13);
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
