package e.u.b;

import androidx.recyclerview.widget.RecyclerView;
import e.u.b.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public class a implements s.a {

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0056a f2838d;
    public e.i.i.c<b> a = new e.i.i.d(30);
    public final ArrayList<b> b = new ArrayList<>();
    public final ArrayList<b> c = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f2840f = 0;

    /* renamed from: e  reason: collision with root package name */
    public final s f2839e = new s(this);

    /* compiled from: AdapterHelper.java */
    /* renamed from: e.u.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0056a {
    }

    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public int b;
        public Object c;

        /* renamed from: d  reason: collision with root package name */
        public int f2841d;

        public b(int i2, int i3, int i4, Object obj) {
            this.a = i2;
            this.b = i3;
            this.f2841d = i4;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.a;
            if (i2 != bVar.a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f2841d - this.b) == 1 && this.f2841d == bVar.b && this.b == bVar.f2841d) {
                return true;
            }
            if (this.f2841d == bVar.f2841d && this.b == bVar.b) {
                Object obj2 = this.c;
                if (obj2 != null) {
                    if (!obj2.equals(bVar.c)) {
                        return false;
                    }
                } else if (bVar.c != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.f2841d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i2 = this.a;
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.f2841d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(InterfaceC0056a interfaceC0056a) {
        this.f2838d = interfaceC0056a;
    }

    public final boolean a(int i2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                if (f(bVar.f2841d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.b;
                int i6 = bVar.f2841d + i5;
                while (i5 < i6) {
                    if (f(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((z) this.f2838d).a(this.c.get(i2));
        }
        l(this.c);
        this.f2840f = 0;
    }

    public void c() {
        b();
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                ((z) this.f2838d).a(bVar);
                ((z) this.f2838d).d(bVar.b, bVar.f2841d);
            } else if (i3 == 2) {
                ((z) this.f2838d).a(bVar);
                InterfaceC0056a interfaceC0056a = this.f2838d;
                int i4 = bVar.b;
                int i5 = bVar.f2841d;
                z zVar = (z) interfaceC0056a;
                zVar.a.U(i4, i5, true);
                RecyclerView recyclerView = zVar.a;
                recyclerView.p0 = true;
                recyclerView.m0.c += i5;
            } else if (i3 == 4) {
                ((z) this.f2838d).a(bVar);
                ((z) this.f2838d).c(bVar.b, bVar.f2841d, bVar.c);
            } else if (i3 == 8) {
                ((z) this.f2838d).a(bVar);
                ((z) this.f2838d).e(bVar.b, bVar.f2841d);
            }
        }
        l(this.b);
        this.f2840f = 0;
    }

    public final void d(b bVar) {
        int i2;
        int i3 = bVar.a;
        if (i3 != 1 && i3 != 8) {
            int m2 = m(bVar.b, i3);
            int i4 = bVar.b;
            int i5 = bVar.a;
            if (i5 == 2) {
                i2 = 0;
            } else if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            } else {
                i2 = 1;
            }
            int i6 = 1;
            for (int i7 = 1; i7 < bVar.f2841d; i7++) {
                int m3 = m((i2 * i7) + bVar.b, bVar.a);
                int i8 = bVar.a;
                if (i8 == 2 ? m3 == m2 : i8 == 4 && m3 == m2 + 1) {
                    i6++;
                } else {
                    b h2 = h(i8, m2, i6, bVar.c);
                    e(h2, i4);
                    k(h2);
                    if (bVar.a == 4) {
                        i4 += i6;
                    }
                    m2 = m3;
                    i6 = 1;
                }
            }
            Object obj = bVar.c;
            k(bVar);
            if (i6 > 0) {
                b h3 = h(bVar.a, m2, i6, obj);
                e(h3, i4);
                k(h3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void e(b bVar, int i2) {
        ((z) this.f2838d).a(bVar);
        int i3 = bVar.a;
        if (i3 != 2) {
            if (i3 == 4) {
                ((z) this.f2838d).c(i2, bVar.f2841d, bVar.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        InterfaceC0056a interfaceC0056a = this.f2838d;
        int i4 = bVar.f2841d;
        z zVar = (z) interfaceC0056a;
        zVar.a.U(i2, i4, true);
        RecyclerView recyclerView = zVar.a;
        recyclerView.p0 = true;
        recyclerView.m0.c += i4;
    }

    public int f(int i2, int i3) {
        int size = this.c.size();
        while (i3 < size) {
            b bVar = this.c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.b;
                if (i5 == i2) {
                    i2 = bVar.f2841d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f2841d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f2841d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f2841d;
                }
            }
            i3++;
        }
        return i2;
    }

    public boolean g() {
        return this.b.size() > 0;
    }

    public b h(int i2, int i3, int i4, Object obj) {
        b b2 = this.a.b();
        if (b2 == null) {
            return new b(i2, i3, i4, obj);
        }
        b2.a = i2;
        b2.b = i3;
        b2.f2841d = i4;
        b2.c = obj;
        return b2;
    }

    public final void i(b bVar) {
        this.c.add(bVar);
        int i2 = bVar.a;
        if (i2 == 1) {
            ((z) this.f2838d).d(bVar.b, bVar.f2841d);
        } else if (i2 == 2) {
            InterfaceC0056a interfaceC0056a = this.f2838d;
            z zVar = (z) interfaceC0056a;
            zVar.a.U(bVar.b, bVar.f2841d, false);
            zVar.a.p0 = true;
        } else if (i2 == 4) {
            ((z) this.f2838d).c(bVar.b, bVar.f2841d, bVar.c);
        } else if (i2 == 8) {
            ((z) this.f2838d).e(bVar.b, bVar.f2841d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.u.b.a.j():void");
    }

    public void k(b bVar) {
        bVar.c = null;
        this.a.a(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            k(list.get(i2));
        }
        list.clear();
    }

    public final int m(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i6 = bVar.a;
            if (i6 == 8) {
                int i7 = bVar.b;
                int i8 = bVar.f2841d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            bVar.b = i7 + 1;
                            bVar.f2841d = i8 + 1;
                        } else if (i3 == 2) {
                            bVar.b = i7 - 1;
                            bVar.f2841d = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        bVar.f2841d = i8 + 1;
                    } else if (i3 == 2) {
                        bVar.f2841d = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        bVar.b = i7 + 1;
                    } else if (i3 == 2) {
                        bVar.b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = bVar.b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= bVar.f2841d;
                    } else if (i6 == 2) {
                        i2 += bVar.f2841d;
                    }
                } else if (i3 == 1) {
                    bVar.b = i9 + 1;
                } else if (i3 == 2) {
                    bVar.b = i9 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i10 = bVar2.f2841d;
                if (i10 == bVar2.b || i10 < 0) {
                    this.c.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f2841d <= 0) {
                this.c.remove(size2);
                k(bVar2);
            }
        }
        return i2;
    }
}
