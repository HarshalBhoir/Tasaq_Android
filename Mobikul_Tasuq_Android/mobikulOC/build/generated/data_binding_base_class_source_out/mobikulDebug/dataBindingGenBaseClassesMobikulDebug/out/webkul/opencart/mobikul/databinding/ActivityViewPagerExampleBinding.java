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
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import webkul.opencart.mobikul.ExtendedViewPager;

public abstract class ActivityViewPagerExampleBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final HorizontalScrollView smallImageBtnHSV;

  @NonNull
  public final LinearLayout smallImageBtnlayout;

  @NonNull
  public final View toolbar;

  @NonNull
  public final ExtendedViewPager viewPager;

  protected ActivityViewPagerExampleBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, HorizontalScrollView smallImageBtnHSV,
      LinearLayout smallImageBtnlayout, View toolbar, ExtendedViewPager viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.smallImageBtnHSV = smallImageBtnHSV;
    this.smallImageBtnlayout = smallImageBtnlayout;
    this.toolbar = toolbar;
    this.viewPager = viewPager;
  }

  @NonNull
  public static ActivityViewPagerExampleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewPagerExampleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewPagerExampleBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_pager_example, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityViewPagerExampleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewPagerExampleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewPagerExampleBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_pager_example, null, false, component);
  }

  public static ActivityViewPagerExampleBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityViewPagerExampleBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityViewPagerExampleBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_view_pager_example);
  }
}
