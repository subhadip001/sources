package f.j.b.b;

import androidx.room.RoomDatabase;
import e.v.k;
import e.x.a.f.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BillingDao_Impl.java */
/* loaded from: classes2.dex */
public final class b implements f.j.b.b.a {
    public final RoomDatabase a;
    public final e.v.b<f.j.b.c.a> b;
    public final e.v.b<f.j.b.c.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final k f6575d;

    /* renamed from: e  reason: collision with root package name */
    public final k f6576e;

    /* compiled from: BillingDao_Impl.java */
    /* loaded from: classes2.dex */
    public class a extends e.v.b<f.j.b.c.a> {
        public a(b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "INSERT OR REPLACE INTO `product_table` (`title`,`type`,`sku`,`freeTrialPeriod`,`subscriptionPeriod`,`price`,`originalPRice`,`priceCurrencyCode`,`introductoryPrice`,`introductoryPricePeriod`,`introductoryPriceCycle`,`originalPriceAmountMicros`,`introductoryPriceAmountMicros`,`originalJson`,`iconUrl`,`description`,`selected`,`payLoad`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // e.v.b
        public void d(f fVar, f.j.b.c.a aVar) {
            f.j.b.c.a aVar2 = aVar;
            String str = aVar2.a;
            if (str == null) {
                fVar.f3010f.bindNull(1);
            } else {
                fVar.f3010f.bindString(1, str);
            }
            String str2 = aVar2.b;
            if (str2 == null) {
                fVar.f3010f.bindNull(2);
            } else {
                fVar.f3010f.bindString(2, str2);
            }
            String str3 = aVar2.c;
            if (str3 == null) {
                fVar.f3010f.bindNull(3);
            } else {
                fVar.f3010f.bindString(3, str3);
            }
            String str4 = aVar2.f6581d;
            if (str4 == null) {
                fVar.f3010f.bindNull(4);
            } else {
                fVar.f3010f.bindString(4, str4);
            }
            String str5 = aVar2.f6582e;
            if (str5 == null) {
                fVar.f3010f.bindNull(5);
            } else {
                fVar.f3010f.bindString(5, str5);
            }
            String str6 = aVar2.f6583f;
            if (str6 == null) {
                fVar.f3010f.bindNull(6);
            } else {
                fVar.f3010f.bindString(6, str6);
            }
            String str7 = aVar2.f6584g;
            if (str7 == null) {
                fVar.f3010f.bindNull(7);
            } else {
                fVar.f3010f.bindString(7, str7);
            }
            String str8 = aVar2.f6585h;
            if (str8 == null) {
                fVar.f3010f.bindNull(8);
            } else {
                fVar.f3010f.bindString(8, str8);
            }
            String str9 = aVar2.f6586i;
            if (str9 == null) {
                fVar.f3010f.bindNull(9);
            } else {
                fVar.f3010f.bindString(9, str9);
            }
            String str10 = aVar2.f6587j;
            if (str10 == null) {
                fVar.f3010f.bindNull(10);
            } else {
                fVar.f3010f.bindString(10, str10);
            }
            fVar.f3010f.bindLong(11, aVar2.f6588k);
            fVar.f3010f.bindLong(12, aVar2.f6589l);
            fVar.f3010f.bindLong(13, aVar2.f6590m);
            String str11 = aVar2.n;
            if (str11 == null) {
                fVar.f3010f.bindNull(14);
            } else {
                fVar.f3010f.bindString(14, str11);
            }
            String str12 = aVar2.o;
            if (str12 == null) {
                fVar.f3010f.bindNull(15);
            } else {
                fVar.f3010f.bindString(15, str12);
            }
            String str13 = aVar2.p;
            if (str13 == null) {
                fVar.f3010f.bindNull(16);
            } else {
                fVar.f3010f.bindString(16, str13);
            }
            fVar.f3010f.bindLong(17, aVar2.q ? 1L : 0L);
            String str14 = aVar2.r;
            if (str14 == null) {
                fVar.f3010f.bindNull(18);
            } else {
                fVar.f3010f.bindString(18, str14);
            }
            Integer num = aVar2.s;
            if (num == null) {
                fVar.f3010f.bindNull(19);
                return;
            }
            fVar.f3010f.bindLong(19, num.intValue());
        }
    }

    /* compiled from: BillingDao_Impl.java */
    /* renamed from: f.j.b.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0156b extends e.v.b<f.j.b.c.b> {
        public C0156b(b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "INSERT OR REPLACE INTO `purchase_table` (`orderId`,`packageName`,`productId`,`purchaseTime`,`purchaseState`,`purchaseToken`,`autoRenewing`,`acknowledged`,`originalJson`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // e.v.b
        public void d(f fVar, f.j.b.c.b bVar) {
            f.j.b.c.b bVar2 = bVar;
            String str = bVar2.a;
            if (str == null) {
                fVar.f3010f.bindNull(1);
            } else {
                fVar.f3010f.bindString(1, str);
            }
            String str2 = bVar2.b;
            if (str2 == null) {
                fVar.f3010f.bindNull(2);
            } else {
                fVar.f3010f.bindString(2, str2);
            }
            String str3 = bVar2.c;
            if (str3 == null) {
                fVar.f3010f.bindNull(3);
            } else {
                fVar.f3010f.bindString(3, str3);
            }
            fVar.f3010f.bindLong(4, bVar2.f6591d);
            fVar.f3010f.bindLong(5, bVar2.f6592e);
            String str4 = bVar2.f6593f;
            if (str4 == null) {
                fVar.f3010f.bindNull(6);
            } else {
                fVar.f3010f.bindString(6, str4);
            }
            fVar.f3010f.bindLong(7, bVar2.f6594g ? 1L : 0L);
            fVar.f3010f.bindLong(8, bVar2.f6595h ? 1L : 0L);
            String str5 = bVar2.f6596i;
            if (str5 == null) {
                fVar.f3010f.bindNull(9);
            } else {
                fVar.f3010f.bindString(9, str5);
            }
        }
    }

    /* compiled from: BillingDao_Impl.java */
    /* loaded from: classes2.dex */
    public class c extends k {
        public c(b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "DELETE FROM product_table WHERE 1";
        }
    }

    /* compiled from: BillingDao_Impl.java */
    /* loaded from: classes2.dex */
    public class d extends k {
        public d(b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "DELETE FROM purchase_table WHERE 1";
        }
    }

    public b(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new C0156b(this, roomDatabase);
        new AtomicBoolean(false);
        this.f6575d = new c(this, roomDatabase);
        this.f6576e = new d(this, roomDatabase);
    }
}
