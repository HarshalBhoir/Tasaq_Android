package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.CategoryActivityHandler;

public abstract class ActivityCategoryBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final TextView filter;

  @NonNull
  public final LinearLayout funtionBar;

  @NonNull
  public final View line2;

  @NonNull
  public final RelativeLayout listCategoryContainer;

  @NonNull
  public final ProgressBar listcategoryRequestBar;

  @NonNull
  public final RelativeLayout mainContent;

  @NonNull
  public final RecyclerView myRecyclerView;

  @NonNull
  public final LinearLayout notificationLayout;

  @NonNull
  public final TextView notificationMessage;

  @NonNull
  public final LinearLayout shopByButtonLayout;

  @NonNull
  public final TextView sort;

  @NonNull
  public final LinearLayout sortByButtonLayout;

  @NonNull
  public final RecyclerView subCategoryRecyclerView;

  @NonNull
  public final View toolbar;

  @NonNull
  public final LinearLayout vendorLayout;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  @NonNull
  public final ImageButton viewSwitcher;

  @NonNull
  public final LinearLayout viewSwitcherButtonLayout;

  @Bindable
  protected CategoryActivityHandler mHandlers;

  protected ActivityCategoryBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, TextView errorTv, TextView filter,
      LinearLayout funtionBar, View line2, RelativeLayout listCategoryContainer,
      ProgressBar listcategoryRequestBar, RelativeLayout mainContent, RecyclerView myRecyclerView,
      LinearLayout notificationLayout, TextView notificationMessage,
      LinearLayout shopByButtonLayout, TextView sort, LinearLayout sortByButtonLayout,
      RecyclerView subCategoryRecyclerView, View toolbar, LinearLayout vendorLayout, View view1,
      View view2, ImageButton viewSwitcher, LinearLayout viewSwitcherButtonLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.errorTv = errorTv;
    this.filter = filter;
    this.funtionBar = funtionBar;
    this.line2 = line2;
    this.listCategoryContainer = listCategoryContainer;
    this.listcategoryRequestBar = listcategoryRequestBar;
    this.mainContent = mainContent;
    this.myRecyclerView = myRecyclerView;
    this.notificationLayout = notificationLayout;
    this.notificationMessage = notificationMessage;
    this.shopByButtonLayout = shopByButtonLayout;
    this.sort = sort;
    this.sortByButtonLayout = sortByButtonLayout;
    this.subCategoryRecyclerView = subCategoryRecyclerView;
    this.toolbar = toolbar;
    this.vendorLayout = vendorLayout;
    this.view1 = view1;
    this.view2 = view2;
    this.viewSwitcher = viewSwitcher;
    this.viewSwitcherButtonLayout = viewSwitcherButtonLayout;
  }

  public abstract void setHandlers(@Nullable CategoryActivityHandler handlers);

  @Nullable
  public CategoryActivityHandler getHandlers() {
    return mHandlers;
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCategoryBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_category, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCategoryBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_category, null, false, component);
  }

  public static ActivityCategoryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCategoryBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCategoryBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_category);
  }
}
