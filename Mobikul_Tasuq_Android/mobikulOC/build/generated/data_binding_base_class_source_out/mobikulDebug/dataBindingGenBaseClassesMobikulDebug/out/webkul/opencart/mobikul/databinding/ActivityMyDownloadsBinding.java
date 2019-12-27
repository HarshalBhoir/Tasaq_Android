package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public abstract class ActivityMyDownloadsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final RelativeLayout listContainer;

  @NonNull
  public final RelativeLayout mostParenLayout;

  @NonNull
  public final ProgressBar myDownloadableProductRequestBar;

  @NonNull
  public final LinearLayout mydownloadsContainer;

  @NonNull
  public final ListView mydownloadsLayout;

  @NonNull
  public final ProgressBar mydownloadsprogress;

  @NonNull
  public final View toolbar;

  protected ActivityMyDownloadsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, TextView errorTv, RelativeLayout listContainer,
      RelativeLayout mostParenLayout, ProgressBar myDownloadableProductRequestBar,
      LinearLayout mydownloadsContainer, ListView mydownloadsLayout,
      ProgressBar mydownloadsprogress, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.errorTv = errorTv;
    this.listContainer = listContainer;
    this.mostParenLayout = mostParenLayout;
    this.myDownloadableProductRequestBar = myDownloadableProductRequestBar;
    this.mydownloadsContainer = mydownloadsContainer;
    this.mydownloadsLayout = mydownloadsLayout;
    this.mydownloadsprogress = mydownloadsprogress;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityMyDownloadsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMyDownloadsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMyDownloadsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_my_downloads, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMyDownloadsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMyDownloadsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMyDownloadsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_my_downloads, null, false, component);
  }

  public static ActivityMyDownloadsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMyDownloadsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMyDownloadsBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_my_downloads);
  }
}
