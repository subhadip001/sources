package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public interface DataBufferObserver {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i2, int i3);

    void onDataRangeInserted(int i2, int i3);

    void onDataRangeMoved(int i2, int i3, int i4);

    void onDataRangeRemoved(int i2, int i3);
}
