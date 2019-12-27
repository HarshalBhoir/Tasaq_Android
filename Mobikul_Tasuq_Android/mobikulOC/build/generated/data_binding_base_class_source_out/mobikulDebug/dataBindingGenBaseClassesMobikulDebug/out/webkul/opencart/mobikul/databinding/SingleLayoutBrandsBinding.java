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
import webkul.opencart.mobikul.adapterModel.CarousalAdapterModel;
import webkul.opencart.mobikul.handlers.CarousalHandler;

public abstract class SingleLayoutBrandsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView brandImage;

  @Bindable
  protected CarousalHandler mHandler;

  @Bindable
  protected CarousalAdapterModel mData;

  protected SingleLayoutBrandsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView brandImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.brandImage = brandImage;
  }

  public abstract void setHandler(@Nullable CarousalHandler handler);

  @Nullable
  public CarousalHandler getHandler() {
    return mHandler;
  }

  public abstract void setData(@Nullable CarousalAdapterModel data);

  @Nullable
  public CarousalAdapterModel getData() {
    return mData;
  }

  @NonNull
  public static SingleLayoutBrandsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SingleLayoutBrandsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SingleLayoutBrandsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.single_layout_brands, root, attachToRoot, component);
  }

  @NonNull
  public static SingleLayoutBrandsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SingleLayoutBrandsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SingleLayoutBrandsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.single_layout_brands, null, false, component);
  }

  public static SingleLayoutBrandsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SingleLayoutBrandsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SingleLayoutBrandsBinding)bind(component, view, webkul.opencart.mobikul.R.layout.single_layout_brands);
  }
}
