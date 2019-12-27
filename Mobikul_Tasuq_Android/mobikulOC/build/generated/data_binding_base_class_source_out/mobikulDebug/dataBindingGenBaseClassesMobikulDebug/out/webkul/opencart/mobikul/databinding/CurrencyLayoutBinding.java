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
import android.widget.LinearLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.CurrencyAdapterModel;
import webkul.opencart.mobikul.handlers.CurrencyHandler;

public abstract class CurrencyLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView categoryName;

  @NonNull
  public final LinearLayout rightNavLl;

  @Bindable
  protected CurrencyAdapterModel mData;

  @Bindable
  protected CurrencyHandler mHandler;

  protected CurrencyLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView categoryName, LinearLayout rightNavLl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoryName = categoryName;
    this.rightNavLl = rightNavLl;
  }

  public abstract void setData(@Nullable CurrencyAdapterModel data);

  @Nullable
  public CurrencyAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable CurrencyHandler handler);

  @Nullable
  public CurrencyHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static CurrencyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CurrencyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CurrencyLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.currency_layout, root, attachToRoot, component);
  }

  @NonNull
  public static CurrencyLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CurrencyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CurrencyLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.currency_layout, null, false, component);
  }

  public static CurrencyLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CurrencyLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CurrencyLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.currency_layout);
  }
}
