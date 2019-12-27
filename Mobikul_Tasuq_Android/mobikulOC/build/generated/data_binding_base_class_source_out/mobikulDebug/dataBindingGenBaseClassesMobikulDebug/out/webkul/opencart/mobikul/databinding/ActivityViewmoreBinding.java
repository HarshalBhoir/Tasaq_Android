package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.CategoryActivityHandler;

public abstract class ActivityViewmoreBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final View line2;

  @NonNull
  public final RelativeLayout listCategoryContainer;

  @NonNull
  public final ProgressBar listcategoryRequestBar;

  @NonNull
  public final LinearLayout notificationLayout;

  @NonNull
  public final TextView notificationMessage;

  @NonNull
  public final Button sort;

  @NonNull
  public final LinearLayout sortByButtonLayout;

  @NonNull
  public final View toolbar;

  @NonNull
  public final RecyclerView viewList;

  @Bindable
  protected CategoryActivityHandler mHandlers;

  protected ActivityViewmoreBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, FloatingActionButton fab, View line2,
      RelativeLayout listCategoryContainer, ProgressBar listcategoryRequestBar,
      LinearLayout notificationLayout, TextView notificationMessage, Button sort,
      LinearLayout sortByButtonLayout, View toolbar, RecyclerView viewList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.fab = fab;
    this.line2 = line2;
    this.listCategoryContainer = listCategoryContainer;
    this.listcategoryRequestBar = listcategoryRequestBar;
    this.notificationLayout = notificationLayout;
    this.notificationMessage = notificationMessage;
    this.sort = sort;
    this.sortByButtonLayout = sortByButtonLayout;
    this.toolbar = toolbar;
    this.viewList = viewList;
  }

  public abstract void setHandlers(@Nullable CategoryActivityHandler handlers);

  @Nullable
  public CategoryActivityHandler getHandlers() {
    return mHandlers;
  }

  @NonNull
  public static ActivityViewmoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewmoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewmoreBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_viewmore, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityViewmoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewmoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewmoreBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_viewmore, null, false, component);
  }

  public static ActivityViewmoreBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityViewmoreBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityViewmoreBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_viewmore);
  }
}
