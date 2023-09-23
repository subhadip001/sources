package com.inverseai.billing.db;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.room.RoomDatabase;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e.v.f;
import e.v.g;
import e.v.n.c;
import e.x.a.b;
import e.x.a.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class BillingDb_Impl extends BillingDb {

    /* renamed from: m  reason: collision with root package name */
    public volatile f.j.b.b.a f1308m;

    /* loaded from: classes2.dex */
    public class a extends g.a {
        public a(int i2) {
            super(i2);
        }

        @Override // e.v.g.a
        public void a(b bVar) {
            ((e.x.a.f.a) bVar).f2999f.execSQL("CREATE TABLE IF NOT EXISTS `product_table` (`title` TEXT NOT NULL, `type` TEXT NOT NULL, `sku` TEXT NOT NULL, `freeTrialPeriod` TEXT NOT NULL, `subscriptionPeriod` TEXT NOT NULL, `price` TEXT NOT NULL, `originalPRice` TEXT NOT NULL, `priceCurrencyCode` TEXT NOT NULL, `introductoryPrice` TEXT NOT NULL, `introductoryPricePeriod` TEXT NOT NULL, `introductoryPriceCycle` INTEGER NOT NULL, `originalPriceAmountMicros` INTEGER NOT NULL, `introductoryPriceAmountMicros` INTEGER NOT NULL, `originalJson` TEXT NOT NULL, `iconUrl` TEXT NOT NULL, `description` TEXT NOT NULL, `selected` INTEGER NOT NULL, `payLoad` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
            e.x.a.f.a aVar = (e.x.a.f.a) bVar;
            aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS `purchase_table` (`orderId` TEXT NOT NULL, `packageName` TEXT NOT NULL, `productId` TEXT NOT NULL, `purchaseTime` INTEGER NOT NULL, `purchaseState` INTEGER NOT NULL, `purchaseToken` TEXT NOT NULL, `autoRenewing` INTEGER NOT NULL, `acknowledged` INTEGER NOT NULL, `originalJson` TEXT, PRIMARY KEY(`purchaseToken`))");
            aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.f2999f.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e14ca8129c2ee631be9489f2e33fc568')");
        }

        @Override // e.v.g.a
        public void b(b bVar) {
            e.x.a.f.a aVar = (e.x.a.f.a) bVar;
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS `product_table`");
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS `purchase_table`");
            List<RoomDatabase.b> list = BillingDb_Impl.this.f561h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(BillingDb_Impl.this.f561h.get(i2));
                }
            }
        }

        @Override // e.v.g.a
        public void c(b bVar) {
            List<RoomDatabase.b> list = BillingDb_Impl.this.f561h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(BillingDb_Impl.this.f561h.get(i2));
                }
            }
        }

        @Override // e.v.g.a
        public void d(b bVar) {
            BillingDb_Impl.this.a = bVar;
            BillingDb_Impl.this.i(bVar);
            List<RoomDatabase.b> list = BillingDb_Impl.this.f561h;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    BillingDb_Impl.this.f561h.get(i2).a(bVar);
                }
            }
        }

        @Override // e.v.g.a
        public void e(b bVar) {
        }

        @Override // e.v.g.a
        public void f(b bVar) {
            e.v.n.b.a(bVar);
        }

        @Override // e.v.g.a
        public g.b g(b bVar) {
            HashMap hashMap = new HashMap(19);
            hashMap.put("title", new c.a("title", "TEXT", true, 0, null, 1));
            hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE, new c.a(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE, "TEXT", true, 0, null, 1));
            hashMap.put("sku", new c.a("sku", "TEXT", true, 0, null, 1));
            hashMap.put("freeTrialPeriod", new c.a("freeTrialPeriod", "TEXT", true, 0, null, 1));
            hashMap.put("subscriptionPeriod", new c.a("subscriptionPeriod", "TEXT", true, 0, null, 1));
            hashMap.put(FirebaseAnalytics.Param.PRICE, new c.a(FirebaseAnalytics.Param.PRICE, "TEXT", true, 0, null, 1));
            hashMap.put("originalPRice", new c.a("originalPRice", "TEXT", true, 0, null, 1));
            hashMap.put("priceCurrencyCode", new c.a("priceCurrencyCode", "TEXT", true, 0, null, 1));
            hashMap.put("introductoryPrice", new c.a("introductoryPrice", "TEXT", true, 0, null, 1));
            hashMap.put("introductoryPricePeriod", new c.a("introductoryPricePeriod", "TEXT", true, 0, null, 1));
            hashMap.put("introductoryPriceCycle", new c.a("introductoryPriceCycle", "INTEGER", true, 0, null, 1));
            hashMap.put("originalPriceAmountMicros", new c.a("originalPriceAmountMicros", "INTEGER", true, 0, null, 1));
            hashMap.put("introductoryPriceAmountMicros", new c.a("introductoryPriceAmountMicros", "INTEGER", true, 0, null, 1));
            hashMap.put("originalJson", new c.a("originalJson", "TEXT", true, 0, null, 1));
            hashMap.put("iconUrl", new c.a("iconUrl", "TEXT", true, 0, null, 1));
            hashMap.put("description", new c.a("description", "TEXT", true, 0, null, 1));
            hashMap.put("selected", new c.a("selected", "INTEGER", true, 0, null, 1));
            hashMap.put("payLoad", new c.a("payLoad", "TEXT", true, 0, null, 1));
            hashMap.put(Chapter.KEY_ID, new c.a(Chapter.KEY_ID, "INTEGER", false, 1, null, 1));
            c cVar = new c("product_table", hashMap, new HashSet(0), new HashSet(0));
            c a = c.a(bVar, "product_table");
            if (!cVar.equals(a)) {
                return new g.b(false, "product_table(com.inverseai.billing.model.ProductItem).\n Expected:\n" + cVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(9);
            hashMap2.put("orderId", new c.a("orderId", "TEXT", true, 0, null, 1));
            hashMap2.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, new c.a(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "TEXT", true, 0, null, 1));
            hashMap2.put("productId", new c.a("productId", "TEXT", true, 0, null, 1));
            hashMap2.put("purchaseTime", new c.a("purchaseTime", "INTEGER", true, 0, null, 1));
            hashMap2.put("purchaseState", new c.a("purchaseState", "INTEGER", true, 0, null, 1));
            hashMap2.put("purchaseToken", new c.a("purchaseToken", "TEXT", true, 1, null, 1));
            hashMap2.put("autoRenewing", new c.a("autoRenewing", "INTEGER", true, 0, null, 1));
            hashMap2.put("acknowledged", new c.a("acknowledged", "INTEGER", true, 0, null, 1));
            hashMap2.put("originalJson", new c.a("originalJson", "TEXT", false, 0, null, 1));
            c cVar2 = new c("purchase_table", hashMap2, new HashSet(0), new HashSet(0));
            c a2 = c.a(bVar, "purchase_table");
            if (!cVar2.equals(a2)) {
                return new g.b(false, "purchase_table(com.inverseai.billing.model.PurchasedItem).\n Expected:\n" + cVar2 + "\n Found:\n" + a2);
            }
            return new g.b(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public f e() {
        return new f(this, new HashMap(0), new HashMap(0), "product_table", "purchase_table");
    }

    @Override // androidx.room.RoomDatabase
    public e.x.a.c f(e.v.a aVar) {
        g gVar = new g(aVar, new a(1), "e14ca8129c2ee631be9489f2e33fc568", "1008894c1a215ff3ba0c4527bc6e29c6");
        Context context = aVar.b;
        String str = aVar.c;
        if (context != null) {
            return aVar.a.a(new c.b(context, str, gVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // com.inverseai.billing.db.BillingDb
    public f.j.b.b.a m() {
        f.j.b.b.a aVar;
        if (this.f1308m != null) {
            return this.f1308m;
        }
        synchronized (this) {
            if (this.f1308m == null) {
                this.f1308m = new f.j.b.b.b(this);
            }
            aVar = this.f1308m;
        }
        return aVar;
    }
}
