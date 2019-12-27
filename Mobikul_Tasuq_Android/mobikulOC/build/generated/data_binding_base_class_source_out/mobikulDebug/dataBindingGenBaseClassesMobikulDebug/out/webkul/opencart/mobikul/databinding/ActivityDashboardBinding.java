package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public abstract class ActivityDashboardBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ImageView bannerDashboard;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final LinearLayout dashboardContainer;

  @NonNull
  public final ProgressBar dashboardprogress;

  @NonNull
  public final TextView heading;

  @NonNull
  public final CoordinatorLayout mainContent;

  @NonNull
  public final TextView newslettersheading;

  @NonNull
  public final TextView newslettersinfo;

  @NonNull
  public final TextView recentordersheading;

  @NonNull
  public final View toolbar;

  protected ActivityDashboardBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, ImageView bannerDashboard,
      CollapsingToolbarLayout collapsingToolbar, LinearLayout dashboardContainer,
      ProgressBar dashboardprogress, TextView heading, CoordinatorLayout mainContent,
      TextView newslettersheading, TextView newslettersinfo, TextView recentordersheading,
      View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.bannerDashboard = bannerDashboard;
    this.collapsingToolbar = collapsingToolbar;
    this.dashboardContainer = dashboardContainer;
    this.dashboardprogress = dashboardprogress;
    this.heading = heading;
    this.mainContent = mainContent;
    this.newslettersheading = newslettersheading;
    this.newslettersinfo = newslettersinfo;
    this.recentordersheading = recentordersheading;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityDashboardBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_dashboard, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityDashboardBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_dashboard, null, false, component);
  }

  public static ActivityDashboardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityDashboardBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityDashboardBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_dashboard);
  }
}
