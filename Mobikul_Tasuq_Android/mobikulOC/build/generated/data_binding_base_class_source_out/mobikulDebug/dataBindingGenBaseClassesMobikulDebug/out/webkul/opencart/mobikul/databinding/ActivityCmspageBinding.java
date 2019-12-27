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
import android.webkit.WebView;

public abstract class ActivityCmspageBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final View toolbar;

  @NonNull
  public final WebView webView;

  protected ActivityCmspageBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, View toolbar, WebView webView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.toolbar = toolbar;
    this.webView = webView;
  }

  @NonNull
  public static ActivityCmspageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCmspageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCmspageBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_cmspage, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCmspageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCmspageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCmspageBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_cmspage, null, false, component);
  }

  public static ActivityCmspageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCmspageBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCmspageBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_cmspage);
  }
}
