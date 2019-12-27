package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class FragmentFeatureProductBinding extends ViewDataBinding {
  @NonNull
  public final TextView errorTv;

  @NonNull
  public final RecyclerView featuredProduct;

  protected FragmentFeatureProductBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView errorTv, RecyclerView featuredProduct) {
    super(_bindingComponent, _root, _localFieldCount);
    this.errorTv = errorTv;
    this.featuredProduct = featuredProduct;
  }

  @NonNull
  public static FragmentFeatureProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentFeatureProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentFeatureProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_feature_product, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFeatureProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentFeatureProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentFeatureProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_feature_product, null, false, component);
  }

  public static FragmentFeatureProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentFeatureProductBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentFeatureProductBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_feature_product);
  }
}
