package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public abstract class ActivityMyorderBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final RelativeLayout mostParenLayout;

  @NonNull
  public final ProgressBar myOrderRequestBar;

  @NonNull
  public final RelativeLayout myorderContainer;

  @NonNull
  public final RelativeLayout myorderContainerList;

  @NonNull
  public final RecyclerView myorderLayout;

  @NonNull
  public final TextView myorderheading;

  @NonNull
  public final ProgressBar myorderprogress;

  @NonNull
  public final Button sellerOrderFilter;

  @NonNull
  public final View toolbar;

  protected ActivityMyorderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, TextView errorTv, RelativeLayout mostParenLayout,
      ProgressBar myOrderRequestBar, RelativeLayout myorderContainer,
      RelativeLayout myorderContainerList, RecyclerView myorderLayout, TextView myorderheading,
      ProgressBar myorderprogress, Button sellerOrderFilter, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.errorTv = errorTv;
    this.mostParenLayout = mostParenLayout;
    this.myOrderRequestBar = myOrderRequestBar;
    this.myorderContainer = myorderContainer;
    this.myorderContainerList = myorderContainerList;
    this.myorderLayout = myorderLayout;
    this.myorderheading = myorderheading;
    this.myorderprogress = myorderprogress;
    this.sellerOrderFilter = sellerOrderFilter;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityMyorderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMyorderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMyorderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_myorder, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMyorderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMyorderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMyorderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_myorder, null, false, component);
  }

  public static ActivityMyorderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMyorderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMyorderBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_myorder);
  }
}
