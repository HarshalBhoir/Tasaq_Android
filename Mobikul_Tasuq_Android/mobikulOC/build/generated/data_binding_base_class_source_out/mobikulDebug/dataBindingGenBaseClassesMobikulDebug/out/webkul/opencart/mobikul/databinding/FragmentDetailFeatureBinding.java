package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public abstract class FragmentDetailFeatureBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout recyclerview;

  @NonNull
  public final Toolbar toolbar;

  protected FragmentDetailFeatureBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout recyclerview, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerview = recyclerview;
    this.toolbar = toolbar;
  }

  @NonNull
  public static FragmentDetailFeatureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDetailFeatureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDetailFeatureBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_detail_feature, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailFeatureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDetailFeatureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDetailFeatureBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_detail_feature, null, false, component);
  }

  public static FragmentDetailFeatureBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDetailFeatureBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDetailFeatureBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_detail_feature);
  }
}
