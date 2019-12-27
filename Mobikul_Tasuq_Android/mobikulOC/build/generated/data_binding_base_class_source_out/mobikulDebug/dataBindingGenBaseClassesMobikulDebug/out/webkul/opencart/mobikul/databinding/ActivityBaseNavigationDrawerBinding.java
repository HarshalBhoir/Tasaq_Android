package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;

public abstract class ActivityBaseNavigationDrawerBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout baseContentFrame;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final ExpandableListView lvExp;

  protected ActivityBaseNavigationDrawerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout baseContentFrame, DrawerLayout drawerLayout,
      ExpandableListView lvExp) {
    super(_bindingComponent, _root, _localFieldCount);
    this.baseContentFrame = baseContentFrame;
    this.drawerLayout = drawerLayout;
    this.lvExp = lvExp;
  }

  @NonNull
  public static ActivityBaseNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBaseNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBaseNavigationDrawerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_base_navigation_drawer, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityBaseNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBaseNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBaseNavigationDrawerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_base_navigation_drawer, null, false, component);
  }

  public static ActivityBaseNavigationDrawerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityBaseNavigationDrawerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityBaseNavigationDrawerBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_base_navigation_drawer);
  }
}
