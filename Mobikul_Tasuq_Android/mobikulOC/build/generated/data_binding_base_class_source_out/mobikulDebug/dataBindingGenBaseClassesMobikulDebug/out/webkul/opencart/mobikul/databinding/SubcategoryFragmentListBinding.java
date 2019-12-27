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

public abstract class SubcategoryFragmentListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerview;

  protected SubcategoryFragmentListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView recyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerview = recyclerview;
  }

  @NonNull
  public static SubcategoryFragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubcategoryFragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubcategoryFragmentListBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.subcategory_fragment_list, root, attachToRoot, component);
  }

  @NonNull
  public static SubcategoryFragmentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubcategoryFragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubcategoryFragmentListBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.subcategory_fragment_list, null, false, component);
  }

  public static SubcategoryFragmentListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SubcategoryFragmentListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SubcategoryFragmentListBinding)bind(component, view, webkul.opencart.mobikul.R.layout.subcategory_fragment_list);
  }
}
