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
import webkul.opencart.mobikul.adapterModel.DashBoardOrderAdapterModel;

public abstract class ReviewOrderBinding extends ViewDataBinding {
  @Bindable
  protected DashBoardOrderAdapterModel mData;

  protected ReviewOrderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setData(@Nullable DashBoardOrderAdapterModel data);

  @Nullable
  public DashBoardOrderAdapterModel getData() {
    return mData;
  }

  @NonNull
  public static ReviewOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ReviewOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ReviewOrderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.review_order, root, attachToRoot, component);
  }

  @NonNull
  public static ReviewOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ReviewOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ReviewOrderBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.review_order, null, false, component);
  }

  public static ReviewOrderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ReviewOrderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ReviewOrderBinding)bind(component, view, webkul.opencart.mobikul.R.layout.review_order);
  }
}
