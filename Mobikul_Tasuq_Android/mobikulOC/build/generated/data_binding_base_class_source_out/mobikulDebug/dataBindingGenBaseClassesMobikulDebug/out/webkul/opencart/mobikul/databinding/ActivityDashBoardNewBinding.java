package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class ActivityDashBoardNewBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final ViewPager dashboardPager;

  @NonNull
  public final TabLayout dashboardTablayout;

  @NonNull
  public final TextView title;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityDashBoardNewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, CollapsingToolbarLayout collapsingToolbar,
      ViewPager dashboardPager, TabLayout dashboardTablayout, TextView title, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.collapsingToolbar = collapsingToolbar;
    this.dashboardPager = dashboardPager;
    this.dashboardTablayout = dashboardTablayout;
    this.title = title;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityDashBoardNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityDashBoardNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityDashBoardNewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_dash_board_new, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDashBoardNewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityDashBoardNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityDashBoardNewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_dash_board_new, null, false, component);
  }

  public static ActivityDashBoardNewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityDashBoardNewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityDashBoardNewBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_dash_board_new);
  }
}
