package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class NoInternetBinding extends ViewDataBinding {
  @NonNull
  public final TextView ok;

  protected NoInternetBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView ok) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ok = ok;
  }

  @NonNull
  public static NoInternetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static NoInternetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<NoInternetBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.no_internet, root, attachToRoot, component);
  }

  @NonNull
  public static NoInternetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static NoInternetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<NoInternetBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.no_internet, null, false, component);
  }

  public static NoInternetBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static NoInternetBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (NoInternetBinding)bind(component, view, webkul.opencart.mobikul.R.layout.no_internet);
  }
}
