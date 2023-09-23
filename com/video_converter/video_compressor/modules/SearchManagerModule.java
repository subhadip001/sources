package com.video_converter.video_compressor.modules;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.common.api.Api;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.OrderBy;
import f.n.a.p.c;

/* loaded from: classes2.dex */
public abstract class SearchManagerModule extends c implements PopupMenu.OnMenuItemClickListener {
    public TextView A;
    public SearchView y;
    public String z;

    /* loaded from: classes2.dex */
    public enum ListType {
        ALL_FILES,
        FOLDER,
        DEFAULT_FILE_PICKER
    }

    /* loaded from: classes2.dex */
    public class a implements SearchView.l {
        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ MenuItem f1383f;

        public b(MenuItem menuItem) {
            this.f1383f = menuItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchManagerModule.this.onOptionsItemSelected(this.f1383f);
        }
    }

    public abstract void S(String str);

    public abstract void T(ListType listType);

    public abstract void U(String str);

    public abstract void V(OrderBy orderBy);

    @Override // f.n.a.p.c, e.p.c.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
    }

    @Override // f.n.a.p.c, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        SearchView searchView = this.y;
        if (searchView != null && !searchView.V) {
            searchView.B("", false);
            this.y.clearFocus();
            this.y.setIconified(true);
        }
        this.f44k.a();
    }

    @Override // f.n.a.p.c, f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.z = getString(Build.VERSION.SDK_INT > 28 ? R.string.browse : R.string.all_files);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.file_list_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        this.y = searchView;
        searchView.setSearchableInfo(((SearchManager) getSystemService(FirebaseAnalytics.Event.SEARCH)).getSearchableInfo(getComponentName()));
        this.y.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.y.setOnQueryTextListener(new a());
        if (this.z.equals(getString(R.string.all_files))) {
            menu.findItem(R.id.action_search).setVisible(true);
            menu.findItem(R.id.action_sort).setVisible(true);
            menu.findItem(R.id.action_filter).setVisible(true);
        } else {
            this.z.equals(getString(R.string.folder));
            if (this.z.equals(getString(R.string.folder))) {
                menu.findItem(R.id.action_search).setVisible(true);
                menu.findItem(R.id.action_sort).setVisible(true);
                menu.findItem(R.id.action_filter).setVisible(true);
            } else {
                menu.findItem(R.id.action_search).setVisible(false);
                menu.findItem(R.id.action_sort).setVisible(false);
                menu.findItem(R.id.action_filter).setVisible(false);
            }
        }
        return true;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_all_file) {
            T(ListType.ALL_FILES);
            return true;
        } else if (itemId == R.id.action_default_browser) {
            T(ListType.DEFAULT_FILE_PICKER);
            return true;
        } else if (itemId != R.id.action_folder) {
            switch (itemId) {
                case R.id.action_sort_by_duration /* 2131361888 */:
                    V(OrderBy.DURATION);
                    return true;
                case R.id.action_sort_by_last_modified /* 2131361889 */:
                    V(OrderBy.LAST_MODIFIED);
                    return true;
                case R.id.action_sort_by_size /* 2131361890 */:
                    V(OrderBy.SIZE);
                    return true;
                case R.id.action_sort_by_title /* 2131361891 */:
                    V(OrderBy.TITLE);
                    return true;
                default:
                    return false;
            }
        } else {
            T(ListType.FOLDER);
            return true;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_search) {
            return true;
        }
        if (itemId == R.id.picker_mode) {
            PopupMenu popupMenu = new PopupMenu(this, findViewById(R.id.picker_mode));
            popupMenu.setOnMenuItemClickListener(this);
            popupMenu.inflate(R.menu.picker_mode_menu);
            popupMenu.show();
        } else if (itemId == R.id.action_filter) {
            PopupMenu popupMenu2 = new PopupMenu(this, findViewById(R.id.action_filter));
            popupMenu2.setOnMenuItemClickListener(this);
            popupMenu2.inflate(R.menu.popup_sort_menu);
            popupMenu2.show();
        } else if (itemId == R.id.action_sort) {
            if (menuItem.getTitle().equals(getResources().getString(R.string.action_asc))) {
                menuItem.setTitle(getResources().getString(R.string.action_dsc));
                menuItem.setIcon(R.drawable.ic_arrow_up);
                U(getResources().getString(R.string.action_dsc));
            } else {
                menuItem.setTitle(getResources().getString(R.string.action_asc));
                menuItem.setIcon(R.drawable.ic_arrow_down);
                U(getResources().getString(R.string.action_asc));
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.picker_mode);
        if (findItem != null) {
            LinearLayout linearLayout = (LinearLayout) findItem.getActionView();
            TextView textView = (TextView) linearLayout.findViewById(R.id.picker_mode_txt_view);
            this.A = textView;
            textView.setText(getString(R.string.all_files));
            linearLayout.setOnClickListener(new b(findItem));
        }
        return super.onPrepareOptionsMenu(menu);
    }
}
