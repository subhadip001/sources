package com.video_converter.video_compressor.screens.homeScreen.dynamicPromoApps;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import f.a.b.a.a;
import f.e.a.b;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class DynamicPromoAppsRecyclerAdapter extends RecyclerView.e<ViewHolder> {
    private CallBack callBack;
    private Context context;
    private ArrayList<DynamicPromoAppsModel> dynamicPromoAppsList = new ArrayList<>();

    /* loaded from: classes2.dex */
    public interface CallBack {
        void onItemClicked(ArrayList<DynamicPromoAppsModel> arrayList, int i2);
    }

    /* loaded from: classes2.dex */
    public class ViewHolder extends RecyclerView.a0 {
        public ImageView ivAppIcon;
        public TextView tvAppTitle;
        public View vRecyclerLay;

        public ViewHolder(View view) {
            super(view);
            this.tvAppTitle = (TextView) view.findViewById(R.id.tvAppTitle);
            this.ivAppIcon = (ImageView) view.findViewById(R.id.ivAppIcon);
            this.vRecyclerLay = view.findViewById(R.id.acDynamicPromoAppsLay);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.dynamicPromoAppsList.size();
    }

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    public void setItems(Context context, ArrayList<DynamicPromoAppsModel> arrayList) {
        this.dynamicPromoAppsList = arrayList;
        this.context = context;
        StringBuilder A = a.A("setItems: promo ");
        A.append(arrayList.size());
        Log.d("TAG", A.toString());
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(ViewHolder viewHolder, final int i2) {
        DynamicPromoAppsModel dynamicPromoAppsModel = this.dynamicPromoAppsList.get(i2);
        viewHolder.tvAppTitle.setText(dynamicPromoAppsModel.getTitle());
        b.d(this.context).e(dynamicPromoAppsModel.getIconUrl()).B(b.e(viewHolder.ivAppIcon).a().z("file:///android_asset/loading_gif.gif")).y(viewHolder.ivAppIcon);
        viewHolder.vRecyclerLay.setOnClickListener(new View.OnClickListener() { // from class: com.video_converter.video_compressor.screens.homeScreen.dynamicPromoApps.DynamicPromoAppsRecyclerAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DynamicPromoAppsRecyclerAdapter.this.callBack.onItemClicked(DynamicPromoAppsRecyclerAdapter.this.dynamicPromoAppsList, i2);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new ViewHolder(a.T(viewGroup, R.layout.promo_apps_recycler, viewGroup, false));
    }

    public void setItems(ArrayList<DynamicPromoAppsModel> arrayList) {
        this.dynamicPromoAppsList = arrayList;
        notifyDataSetChanged();
    }
}
