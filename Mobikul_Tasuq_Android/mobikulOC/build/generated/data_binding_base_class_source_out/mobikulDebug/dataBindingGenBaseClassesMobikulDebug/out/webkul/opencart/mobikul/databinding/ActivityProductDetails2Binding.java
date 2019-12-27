package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ActivityProductDetails2Binding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ViewPager pager;

  @NonNull
  public final TabLayout tablayout;

  @NonNull
  public final View toolbar;

  protected ActivityProductDetails2Binding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, ViewPager pager, TabLayout tablayout,
      View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.pager = pager;
    this.tablayout = tablayout;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityProductDetails2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityProductDetails2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityProductDetails2Binding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_product_details2, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityProductDetails2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityProductDetails2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityProductDetails2Binding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_product_details2, null, false, component);
  }

  public static ActivityProductDetails2Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityProductDetails2Binding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityProductDetails2Binding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_product_details2);
  }
}
