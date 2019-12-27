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
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public abstract class ActivityItemTwopaneBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final LinearLayout btnLayout;

  @NonNull
  public final Button clearBtn;

  @NonNull
  public final Button filterBtn;

  @NonNull
  public final LinearLayout fragmentLayout;

  @NonNull
  public final FrameLayout itemDetailContainer;

  @NonNull
  public final View toolbar;

  protected ActivityItemTwopaneBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, LinearLayout btnLayout, Button clearBtn,
      Button filterBtn, LinearLayout fragmentLayout, FrameLayout itemDetailContainer,
      View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.btnLayout = btnLayout;
    this.clearBtn = clearBtn;
    this.filterBtn = filterBtn;
    this.fragmentLayout = fragmentLayout;
    this.itemDetailContainer = itemDetailContainer;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityItemTwopaneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityItemTwopaneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityItemTwopaneBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_item_twopane, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityItemTwopaneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityItemTwopaneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityItemTwopaneBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_item_twopane, null, false, component);
  }

  public static ActivityItemTwopaneBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityItemTwopaneBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityItemTwopaneBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_item_twopane);
  }
}
