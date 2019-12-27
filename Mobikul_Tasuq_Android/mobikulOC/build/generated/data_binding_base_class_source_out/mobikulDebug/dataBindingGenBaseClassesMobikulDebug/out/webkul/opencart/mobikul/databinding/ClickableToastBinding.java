package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class ClickableToastBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout container;

  @NonNull
  public final TextView refresh;

  protected ClickableToastBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout container, TextView refresh) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
    this.refresh = refresh;
  }

  @NonNull
  public static ClickableToastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ClickableToastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ClickableToastBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.clickable_toast, root, attachToRoot, component);
  }

  @NonNull
  public static ClickableToastBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ClickableToastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ClickableToastBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.clickable_toast, null, false, component);
  }

  public static ClickableToastBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ClickableToastBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ClickableToastBinding)bind(component, view, webkul.opencart.mobikul.R.layout.clickable_toast);
  }
}
