package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList<Integer> zab;

    @KeepForSdk
    public EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.zab = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    for (int i2 = 1; i2 < count; i2++) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i2);
                        String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i2, windowIndex);
                        if (string2 != null) {
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i2));
                                string = string2;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(primaryDataMarkerColumn).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(primaryDataMarkerColumn);
                            sb.append(", at row: ");
                            sb.append(i2);
                            sb.append(", for window: ");
                            sb.append(windowIndex);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.zaa = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public final T get(int i2) {
        int intValue;
        int intValue2;
        zab();
        int zaa = zaa(i2);
        int i3 = 0;
        if (i2 >= 0 && i2 != this.zab.size()) {
            if (i2 == this.zab.size() - 1) {
                intValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                intValue2 = this.zab.get(i2).intValue();
            } else {
                intValue = this.zab.get(i2 + 1).intValue();
                intValue2 = this.zab.get(i2).intValue();
            }
            int i4 = intValue - intValue2;
            if (i4 == 1) {
                int zaa2 = zaa(i2);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(zaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, zaa2, windowIndex) != null) {
                    i3 = 1;
                }
            } else {
                i3 = i4;
            }
        }
        return getEntry(zaa, i3);
    }

    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @KeepForSdk
    public abstract T getEntry(int i2, int i3);

    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int i2) {
        if (i2 >= 0 && i2 < this.zab.size()) {
            return this.zab.get(i2).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i2);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }
}
