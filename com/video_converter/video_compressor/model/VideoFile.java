package com.video_converter.video_compressor.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class VideoFile extends MediaFile {
    public static final Parcelable.Creator<VideoFile> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<VideoFile> {
        @Override // android.os.Parcelable.Creator
        public VideoFile createFromParcel(Parcel parcel) {
            return new VideoFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public VideoFile[] newArray(int i2) {
            return new VideoFile[i2];
        }
    }

    public VideoFile(String str, String str2, String str3, Uri uri, long j2) {
        super(str, str2, str3, uri, j2);
    }

    public VideoFile(Parcel parcel) {
        super(parcel);
    }
}
