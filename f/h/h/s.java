package f.h.h;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.Writer;
import f.h.h.f;
import f.h.h.q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes2.dex */
public final class s extends r<GeneratedMessageLite.d> {
    @Override // f.h.h.r
    public int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.d) entry.getKey()).f1298g;
    }

    @Override // f.h.h.r
    public Object b(q qVar, n0 n0Var, int i2) {
        return qVar.a.get(new q.a(n0Var, i2));
    }

    @Override // f.h.h.r
    public u<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).extensions;
    }

    @Override // f.h.h.r
    public u<GeneratedMessageLite.d> d(Object obj) {
        return ((GeneratedMessageLite.c) obj).a();
    }

    @Override // f.h.h.r
    public boolean e(n0 n0Var) {
        return n0Var instanceof GeneratedMessageLite.c;
    }

    @Override // f.h.h.r
    public void f(Object obj) {
        ((GeneratedMessageLite.c) obj).extensions.n();
    }

    @Override // f.h.h.r
    public <UT, UB> UB g(z0 z0Var, Object obj, q qVar, u<GeneratedMessageLite.d> uVar, UB ub, g1<UT, UB> g1Var) {
        Object g2;
        ArrayList arrayList;
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        GeneratedMessageLite.d dVar = eVar.f1302d;
        int i2 = dVar.f1298g;
        if (dVar.f1300i && dVar.f1301j) {
            switch (dVar.f1299h.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    z0Var.M(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    z0Var.H(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    z0Var.q(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    z0Var.n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    z0Var.s(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    z0Var.P(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    z0Var.v(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    z0Var.y(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    StringBuilder A = f.a.b.a.a.A("Type cannot be packed: ");
                    A.append(eVar.f1302d.f1299h);
                    throw new IllegalStateException(A.toString());
                case 12:
                    arrayList = new ArrayList();
                    z0Var.h(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    z0Var.t(arrayList);
                    ub = (UB) c1.y(i2, arrayList, eVar.f1302d.f1297f, ub, g1Var);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    z0Var.e(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    z0Var.r(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    z0Var.b(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    z0Var.f(arrayList);
                    break;
            }
            uVar.p(eVar.f1302d, arrayList);
        } else {
            Object obj2 = null;
            WireFormat$FieldType wireFormat$FieldType = dVar.f1299h;
            if (wireFormat$FieldType == WireFormat$FieldType.ENUM) {
                int I = z0Var.I();
                if (eVar.f1302d.f1297f.findValueByNumber(I) == null) {
                    Class<?> cls = c1.a;
                    if (ub == null) {
                        ub = g1Var.m();
                    }
                    g1Var.e(ub, i2, I);
                    return ub;
                }
                obj2 = Integer.valueOf(I);
            } else {
                switch (wireFormat$FieldType.ordinal()) {
                    case 0:
                        obj2 = Double.valueOf(z0Var.readDouble());
                        break;
                    case 1:
                        obj2 = Float.valueOf(z0Var.readFloat());
                        break;
                    case 2:
                        obj2 = Long.valueOf(z0Var.N());
                        break;
                    case 3:
                        obj2 = Long.valueOf(z0Var.c());
                        break;
                    case 4:
                        obj2 = Integer.valueOf(z0Var.I());
                        break;
                    case 5:
                        obj2 = Long.valueOf(z0Var.d());
                        break;
                    case 6:
                        obj2 = Integer.valueOf(z0Var.j());
                        break;
                    case 7:
                        obj2 = Boolean.valueOf(z0Var.k());
                        break;
                    case 8:
                        obj2 = z0Var.z();
                        break;
                    case 9:
                        obj2 = z0Var.A(eVar.c.getClass(), qVar);
                        break;
                    case 10:
                        obj2 = z0Var.i(eVar.c.getClass(), qVar);
                        break;
                    case 11:
                        obj2 = z0Var.G();
                        break;
                    case 12:
                        obj2 = Integer.valueOf(z0Var.p());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        obj2 = Integer.valueOf(z0Var.K());
                        break;
                    case 15:
                        obj2 = Long.valueOf(z0Var.m());
                        break;
                    case 16:
                        obj2 = Integer.valueOf(z0Var.w());
                        break;
                    case 17:
                        obj2 = Long.valueOf(z0Var.x());
                        break;
                }
            }
            GeneratedMessageLite.d dVar2 = eVar.f1302d;
            if (dVar2.f1300i) {
                uVar.a(dVar2, obj2);
            } else {
                int ordinal = dVar2.f1299h.ordinal();
                if ((ordinal == 9 || ordinal == 10) && (g2 = uVar.g(eVar.f1302d)) != null) {
                    obj2 = y.c(g2, obj2);
                }
                uVar.p(eVar.f1302d, obj2);
            }
        }
        return ub;
    }

    @Override // f.h.h.r
    public void h(z0 z0Var, Object obj, q qVar, u<GeneratedMessageLite.d> uVar) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        uVar.p(eVar.f1302d, z0Var.i(eVar.c.getClass(), qVar));
    }

    @Override // f.h.h.r
    public void i(j jVar, Object obj, q qVar, u<GeneratedMessageLite.d> uVar) {
        byte[] bArr;
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        n0 buildPartial = eVar.c.newBuilderForType().buildPartial();
        int size = jVar.size();
        if (size == 0) {
            bArr = y.b;
        } else {
            byte[] bArr2 = new byte[size];
            jVar.e(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray()) {
            f.b bVar = new f.b(wrap, true);
            w0.c.b(buildPartial).e(buildPartial, bVar, qVar);
            uVar.p(eVar.f1302d, buildPartial);
            if (bVar.B() != Integer.MAX_VALUE) {
                throw InvalidProtocolBufferException.a();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // f.h.h.r
    public void j(Writer writer, Map.Entry<?, ?> entry) {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) entry.getKey();
        if (dVar.f1300i) {
            switch (dVar.f1299h.ordinal()) {
                case 0:
                    c1.G(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 1:
                    c1.K(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 2:
                    c1.N(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 3:
                    c1.V(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 4:
                    c1.M(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 5:
                    c1.J(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 6:
                    c1.I(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 7:
                    c1.E(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 8:
                    c1.T(dVar.f1298g, (List) entry.getValue(), writer);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    c1.L(dVar.f1298g, (List) entry.getValue(), writer, w0.c.a(list.get(0).getClass()));
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    c1.O(dVar.f1298g, (List) entry.getValue(), writer, w0.c.a(list2.get(0).getClass()));
                    return;
                case 11:
                    c1.F(dVar.f1298g, (List) entry.getValue(), writer);
                    return;
                case 12:
                    c1.U(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 13:
                    c1.M(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 14:
                    c1.P(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 15:
                    c1.Q(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 16:
                    c1.R(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                case 17:
                    c1.S(dVar.f1298g, (List) entry.getValue(), writer, dVar.f1301j);
                    return;
                default:
                    return;
            }
        }
        switch (dVar.f1299h.ordinal()) {
            case 0:
                ((m) writer).a(dVar.f1298g, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                ((m) writer).b(dVar.f1298g, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                ((m) writer).a.b0(dVar.f1298g, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                ((m) writer).a.b0(dVar.f1298g, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ((m) writer).a.Q(dVar.f1298g, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                ((m) writer).a.O(dVar.f1298g, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                ((m) writer).a.M(dVar.f1298g, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                ((m) writer).a.I(dVar.f1298g, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                ((m) writer).a.W(dVar.f1298g, (String) entry.getValue());
                return;
            case 9:
                ((m) writer).c(dVar.f1298g, entry.getValue(), w0.c.a(entry.getValue().getClass()));
                return;
            case 10:
                ((m) writer).d(dVar.f1298g, entry.getValue(), w0.c.a(entry.getValue().getClass()));
                return;
            case 11:
                ((m) writer).a.K(dVar.f1298g, (j) entry.getValue());
                return;
            case 12:
                ((m) writer).a.Z(dVar.f1298g, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((m) writer).a.Q(dVar.f1298g, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                ((m) writer).a.M(dVar.f1298g, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((m) writer).a.O(dVar.f1298g, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                ((m) writer).f(dVar.f1298g, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                ((m) writer).g(dVar.f1298g, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
