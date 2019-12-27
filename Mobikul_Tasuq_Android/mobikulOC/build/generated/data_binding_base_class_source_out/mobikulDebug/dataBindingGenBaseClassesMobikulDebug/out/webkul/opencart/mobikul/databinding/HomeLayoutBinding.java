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

public abstract class HomeLayoutBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final BottomNavigationBinding navigation;

  @NonNull
  public final View toolbar;

  protected HomeLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, BottomNavigationBinding navigation, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.navigation = navigation;
    setContainedBinding(this.navigation);;
    this.toolbar = toolbar;
  }

  @NonNull
  public static HomeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static HomeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<HomeLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.home_layout, root, attachToRoot, component);
  }

  @NonNull
  public static HomeLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static HomeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<HomeLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.home_layout, null, false, component);
  }

  public static HomeLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static HomeLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (HomeLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.home_layout);
  }
}
