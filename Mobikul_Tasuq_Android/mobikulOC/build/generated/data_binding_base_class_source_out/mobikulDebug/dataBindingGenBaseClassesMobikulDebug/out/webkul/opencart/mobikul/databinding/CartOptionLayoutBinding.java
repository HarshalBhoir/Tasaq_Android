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

public abstract class CartOptionLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView title;

  @NonNull
  public final TextView value;

  protected CartOptionLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView title, TextView value) {
    super(_bindingComponent, _root, _localFieldCount);
    this.title = title;
    this.value = value;
  }

  @NonNull
  public static CartOptionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CartOptionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CartOptionLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.cart_option_layout, root, attachToRoot, component);
  }

  @NonNull
  public static CartOptionLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CartOptionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CartOptionLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.cart_option_layout, null, false, component);
  }

  public static CartOptionLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CartOptionLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CartOptionLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.cart_option_layout);
  }
}
