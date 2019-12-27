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
import webkul.opencart.mobikul.adapterModel.ViewProductSimpleBannerAdapterModel;
import webkul.opencart.mobikul.handlers.ViewProductSimpleHandler;

public abstract class ViewProductSimpleBannerBinding extends ViewDataBinding {
  @NonNull
  public final ImageView image;

  @Bindable
  protected ViewProductSimpleBannerAdapterModel mData;

  @Bindable
  protected ViewProductSimpleHandler mHandler;

  protected ViewProductSimpleBannerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView image) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
  }

  public abstract void setData(@Nullable ViewProductSimpleBannerAdapterModel data);

  @Nullable
  public ViewProductSimpleBannerAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable ViewProductSimpleHandler handler);

  @Nullable
  public ViewProductSimpleHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ViewProductSimpleBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ViewProductSimpleBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ViewProductSimpleBannerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.view_product_simple_banner, root, attachToRoot, component);
  }

  @NonNull
  public static ViewProductSimpleBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ViewProductSimpleBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ViewProductSimpleBannerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.view_product_simple_banner, null, false, component);
  }

  public static ViewProductSimpleBannerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ViewProductSimpleBannerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ViewProductSimpleBannerBinding)bind(component, view, webkul.opencart.mobikul.R.layout.view_product_simple_banner);
  }
}
