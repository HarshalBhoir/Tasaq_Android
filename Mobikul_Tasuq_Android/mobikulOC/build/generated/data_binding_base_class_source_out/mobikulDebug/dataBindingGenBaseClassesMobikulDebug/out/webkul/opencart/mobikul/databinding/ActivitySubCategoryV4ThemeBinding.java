package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public abstract class ActivitySubCategoryV4ThemeBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final RelativeLayout container;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final RecyclerView navDrawerRecyclerView;

  @NonNull
  public final RecyclerView navDrawerRecyclerViewCurrency;

  @NonNull
  public final RecyclerView navDrawerRecyclerViewLanguage;

  @NonNull
  public final NavigationView navigationView;

  @NonNull
  public final ViewPager pager;

  @NonNull
  public final TabLayout tablayout;

  @NonNull
  public final View toolbar;

  protected ActivitySubCategoryV4ThemeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, RelativeLayout container,
      DrawerLayout drawerLayout, RecyclerView navDrawerRecyclerView,
      RecyclerView navDrawerRecyclerViewCurrency, RecyclerView navDrawerRecyclerViewLanguage,
      NavigationView navigationView, ViewPager pager, TabLayout tablayout, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.container = container;
    this.drawerLayout = drawerLayout;
    this.navDrawerRecyclerView = navDrawerRecyclerView;
    this.navDrawerRecyclerViewCurrency = navDrawerRecyclerViewCurrency;
    this.navDrawerRecyclerViewLanguage = navDrawerRecyclerViewLanguage;
    this.navigationView = navigationView;
    this.pager = pager;
    this.tablayout = tablayout;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivitySubCategoryV4ThemeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySubCategoryV4ThemeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySubCategoryV4ThemeBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_sub_category_v4_theme, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySubCategoryV4ThemeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySubCategoryV4ThemeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySubCategoryV4ThemeBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_sub_category_v4_theme, null, false, component);
  }

  public static ActivitySubCategoryV4ThemeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivitySubCategoryV4ThemeBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivitySubCategoryV4ThemeBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_sub_category_v4_theme);
  }
}
