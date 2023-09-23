package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import f.a.b.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {
    private final int arch;
    private final int availableProcessors;
    private final long diskSpace;
    private final boolean isEmulator;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final int state;
    private final long totalRam;

    public AutoValue_StaticSessionData_DeviceData(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.arch = i2;
        Objects.requireNonNull(str, "Null model");
        this.model = str;
        this.availableProcessors = i3;
        this.totalRam = j2;
        this.diskSpace = j3;
        this.isEmulator = z;
        this.state = i4;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.manufacturer = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.modelClass = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int arch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
        return this.availableProcessors;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
        return this.diskSpace;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.DeviceData) {
            StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
            return this.arch == deviceData.arch() && this.model.equals(deviceData.model()) && this.availableProcessors == deviceData.availableProcessors() && this.totalRam == deviceData.totalRam() && this.diskSpace == deviceData.diskSpace() && this.isEmulator == deviceData.isEmulator() && this.state == deviceData.state() && this.manufacturer.equals(deviceData.manufacturer()) && this.modelClass.equals(deviceData.modelClass());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.totalRam;
        long j3 = this.diskSpace;
        return ((((((((((((((((this.arch ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.availableProcessors) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.isEmulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.modelClass.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
        return this.isEmulator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String manufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String model() {
        return this.model;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String modelClass() {
        return this.modelClass;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
        return this.state;
    }

    public String toString() {
        StringBuilder A = a.A("DeviceData{arch=");
        A.append(this.arch);
        A.append(", model=");
        A.append(this.model);
        A.append(", availableProcessors=");
        A.append(this.availableProcessors);
        A.append(", totalRam=");
        A.append(this.totalRam);
        A.append(", diskSpace=");
        A.append(this.diskSpace);
        A.append(", isEmulator=");
        A.append(this.isEmulator);
        A.append(", state=");
        A.append(this.state);
        A.append(", manufacturer=");
        A.append(this.manufacturer);
        A.append(", modelClass=");
        return a.u(A, this.modelClass, "}");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
        return this.totalRam;
    }
}
