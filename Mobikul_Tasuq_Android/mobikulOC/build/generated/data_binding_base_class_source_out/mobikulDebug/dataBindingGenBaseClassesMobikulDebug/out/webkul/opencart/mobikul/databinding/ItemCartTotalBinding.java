package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.CartTotalAdapterModel;

public abstract class ItemCartTotalBinding extends ViewDataBinding {
  @NonNull
  public final TextView tv1;

  @NonNull
  public final TextView tv2;

  @Bindable
  protected CartTotalAdapterModel mData;

  protected ItemCartTotalBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView tv1, TextView tv2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tv1 = tv1;
    this.tv2 = tv2;
  }

  public abstract void setData(@Nullable CartTotalAdapterModel data);

  @Nullable
  public CartTotalAdapterModel getData() {
    return mData;
  }

  @NonNull
  public static ItemCartTotalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemCartTotalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemCartTotalBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_cart_total, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCartTotalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemCartTotalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemCartTotalBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_cart_total, null, false, component);
  }

  public static ItemCartTotalBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemCartTotalBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemCartTotalBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_cart_total);
  }
}
