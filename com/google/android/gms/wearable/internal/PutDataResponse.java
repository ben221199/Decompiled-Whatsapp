package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PutDataResponse implements SafeParcelable {
    public static final Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final DataItemParcelable zzbaA;

    static {
        CREATOR = new zzbe();
    }

    PutDataResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbaA = dataItemParcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbe.zza(this, parcel, i);
    }
}
