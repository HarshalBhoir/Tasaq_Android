package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class NewAddressLayoutBinding extends ViewDataBinding {
  protected NewAddressLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  @NonNull
  public static NewAddressLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static NewAddressLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<NewAddressLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.new_address_layout, root, attachToRoot, component);
  }

  @NonNull
  public static NewAddressLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static NewAddressLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<NewAddressLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.new_address_layout, null, false, component);
  }

  public static NewAddressLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static NewAddressLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (NewAddressLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.new_address_layout);
  }
}
