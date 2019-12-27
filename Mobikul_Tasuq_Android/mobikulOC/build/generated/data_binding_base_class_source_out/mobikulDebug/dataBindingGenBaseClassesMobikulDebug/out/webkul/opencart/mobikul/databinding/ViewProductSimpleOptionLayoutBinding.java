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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.ViewProductSimpleHandler;
import webkul.opencart.mobikul.model.getProduct.ProductDetail;

public abstract class ViewProductSimpleOptionLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView addQty;

  @NonNull
  public final LinearLayout newThemeLayout;

  @NonNull
  public final TextView qty;

  @NonNull
  public final LinearLayout qtyLayout;

  @NonNull
  public final ImageView subQty;

  @Bindable
  protected ViewProductSimpleHandler mHandler;

  @Bindable
  protected ProductDetail mData;

  protected ViewProductSimpleOptionLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView addQty, LinearLayout newThemeLayout, TextView qty,
      LinearLayout qtyLayout, ImageView subQty) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addQty = addQty;
    this.newThemeLayout = newThemeLayout;
    this.qty = qty;
    this.qtyLayout = qtyLayout;
    this.subQty = subQty;
  }

  public abstract void setHandler(@Nullable ViewProductSimpleHandler handler);

  @Nullable
  public ViewProductSimpleHandler getHandler() {
    return mHandler;
  }

  public abstract void setData(@Nullable ProductDetail data);

  @Nullable
  public ProductDetail getData() {
    return mData;
  }

  @NonNull
  public static ViewProductSimpleOptionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ViewProductSimpleOptionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ViewProductSimpleOptionLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.view_product_simple_option_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ViewProductSimpleOptionLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ViewProductSimpleOptionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ViewProductSimpleOptionLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.view_product_simple_option_layout, null, false, component);
  }

  public static ViewProductSimpleOptionLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ViewProductSimpleOptionLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ViewProductSimpleOptionLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.view_product_simple_option_layout);
  }
}
