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

public abstract class ActivityBrowerByBrandsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView brandsRecyclerview;

  @NonNull
  public final View toolbar;

  protected ActivityBrowerByBrandsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView brandsRecyclerview, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.brandsRecyclerview = brandsRecyclerview;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityBrowerByBrandsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBrowerByBrandsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBrowerByBrandsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_brower_by_brands, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityBrowerByBrandsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBrowerByBrandsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBrowerByBrandsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_brower_by_brands, null, false, component);
  }

  public static ActivityBrowerByBrandsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityBrowerByBrandsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityBrowerByBrandsBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_brower_by_brands);
  }
}
