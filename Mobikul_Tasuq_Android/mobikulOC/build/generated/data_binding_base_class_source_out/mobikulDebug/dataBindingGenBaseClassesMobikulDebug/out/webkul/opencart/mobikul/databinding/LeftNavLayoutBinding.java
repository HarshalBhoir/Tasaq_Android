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
import webkul.opencart.mobikul.adapterModel.RightNavAdapterModel;
import webkul.opencart.mobikul.handlers.LeftNavHandlers;

public abstract class LeftNavLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView categoryName;

  @NonNull
  public final ImageView image;

  @NonNull
  public final LinearLayout leftNavLl;

  @Bindable
  protected RightNavAdapterModel mData;

  @Bindable
  protected LeftNavHandlers mHandler;

  protected LeftNavLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView categoryName, ImageView image, LinearLayout leftNavLl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoryName = categoryName;
    this.image = image;
    this.leftNavLl = leftNavLl;
  }

  public abstract void setData(@Nullable RightNavAdapterModel data);

  @Nullable
  public RightNavAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable LeftNavHandlers handler);

  @Nullable
  public LeftNavHandlers getHandler() {
    return mHandler;
  }

  @NonNull
  public static LeftNavLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LeftNavLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LeftNavLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.left_nav_layout, root, attachToRoot, component);
  }

  @NonNull
  public static LeftNavLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LeftNavLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LeftNavLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.left_nav_layout, null, false, component);
  }

  public static LeftNavLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LeftNavLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LeftNavLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.left_nav_layout);
  }
}
