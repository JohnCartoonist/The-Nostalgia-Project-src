import java.util.ArrayList;
import java.util.List;

class afp extends pj {
  public List a = new ArrayList();
  
  public afp(vi entityplayer) {
    yy[] ablock = { 
        yy.w, yy.t, yy.aw, yy.G, yy.H, yy.I, yy.N, yy.aN, yy.bm, yy.bm, 
        yy.bm, yy.aW, yy.ax, yy.ah, yy.ai, yy.z, yy.O, yy.al, yy.ao, yy.ak, 
        yy.ak, yy.ak, yy.ak, yy.ak, yy.ak, yy.ap, yy.bb, yy.bc, yy.bd, yy.J, 
        yy.J, yy.J, (yy)yy.K, (yy)yy.K, (yy)yy.K, yy.v, yy.u, yy.E, yy.Q, yy.F, 
        yy.W, yy.x, yy.y, yy.y, yy.y, (yy)yy.Y, yy.L, yy.aT, yy.aU, (yy)yy.ad, 
        (yy)yy.ae, (yy)yy.af, (yy)yy.ag, yy.aV, yy.br, yy.ba, yy.bf, yy.bu, yy.bp, yy.bq, 
        yy.bA, yy.bB, yy.bC, yy.bJ, (yy)yy.by, yy.bz, (yy)yy.X, (yy)yy.X, yy.au, yy.ay, 
        yy.M, yy.am, yy.an, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, 
        yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.P, 
        yy.aB, yy.R, yy.aY, yy.V, yy.Z, yy.aZ, yy.bv, yy.aF, yy.aG, yy.T, 
        yy.U, yy.aq, yy.at, yy.aH, yy.bw, yy.bx, yy.aJ, yy.aK, yy.aM, yy.aQ, 
        yy.aR, yy.bk, yy.bE, yy.bI, yy.bH, (yy)yy.be };
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    int i1 = 0;
    int j1 = 0;
    int k1 = 1;
    for (int l1 = 0; l1 < ablock.length; l1++) {
      int k2 = 0;
      if (ablock[l1] == yy.ab) {
        k2 = i++;
      } else if (ablock[l1] == yy.ak) {
        k2 = j++;
      } else if (ablock[l1] == yy.J) {
        k2 = k++;
      } else if (ablock[l1] == yy.y) {
        k2 = l++;
      } else if (ablock[l1] == yy.bm) {
        k2 = i1++;
      } else if (ablock[l1] == yy.X) {
        k2 = k1++;
      } else if (ablock[l1] == yy.K) {
        k2 = j1++;
      } 
      this.a.add(new dk(ablock[l1], 1, k2));
    } 
    for (int i2 = 256; i2 < acy.d.length; i2++) {
      if (acy.d[i2] != null && (acy.d[i2]).bM != acy.br.bM)
        this.a.add(new dk(acy.d[i2])); 
    } 
    for (int j2 = 1; j2 < 16; j2++)
      this.a.add(new dk(acy.aV.bM, 1, j2)); 
    x inventoryplayer = entityplayer.by;
    for (int l2 = 0; l2 < 9; l2++) {
      for (int j3 = 0; j3 < 8; j3++)
        a(new vv((de)aec.e(), j3 + l2 * 8, 8 + j3 * 18, 18 + l2 * 18)); 
    } 
    for (int i3 = 0; i3 < 9; i3++)
      a(new vv(inventoryplayer, i3, 8 + i3 * 18, 184)); 
    a(0.0F);
  }
  
  public boolean a(vi entityplayer) {
    return true;
  }
  
  public void a(float f) {
    int i = this.a.size() / 8 - 8 + 1;
    int j = (int)((f * i) + 0.5D);
    if (j < 0)
      j = 0; 
    for (int k = 0; k < 9; k++) {
      for (int l = 0; l < 8; l++) {
        int i1 = l + (k + j) * 8;
        if (i1 >= 0 && i1 < this.a.size()) {
          aec.e().a(l + k * 8, this.a.get(i1));
        } else {
          aec.e().a(l + k * 8, null);
        } 
      } 
    } 
  }
  
  protected void b(int i, int j, boolean flag, vi entityplayer) {}
}
