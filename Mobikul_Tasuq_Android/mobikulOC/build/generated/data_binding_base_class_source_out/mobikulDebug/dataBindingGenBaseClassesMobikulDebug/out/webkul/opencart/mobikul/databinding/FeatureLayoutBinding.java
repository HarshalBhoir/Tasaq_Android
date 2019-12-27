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
import webkul.opencart.mobikul.adapterModel.ProductFeatureAdapterModel;

public abstract class FeatureLayoutBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout featured;

  @Bindable
  protected ProductFeatureAdapterModel mData;

  protected FeatureLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout featured) {
    super(_bindingComponent, _root, _localFieldCount);
    this.featured = featured;
  }

  public abstract void setData(@Nullable ProductFeatureAdapterModel data);

  @Nullable
  public ProductFeatureAdapterModel getData() {
    return mData;
  }

  @NonNull
  public static FeatureLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FeatureLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FeatureLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.feature_layout, root, attachToRoot, component);
  }

  @NonNull
  public static FeatureLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FeatureLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FeatureLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.feature_layout, null, false, component);
  }

  public static FeatureLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FeatureLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FeatureLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.feature_layout);
  }
}
