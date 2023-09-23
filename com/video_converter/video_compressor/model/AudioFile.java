package com.video_converter.video_compressor.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class AudioFile extends MediaFile {
    public static final Parcelable.Creator<AudioFile> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<AudioFile> {
        @Override // android.os.Parcelable.Creator
        public AudioFile createFromParcel(Parcel parcel) {
            return new AudioFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public AudioFile[] newArray(int i2) {
            return new AudioFile[i2];
        }
    }

    public AudioFile(Parcel parcel) {
        super(parcel);
    }
}
