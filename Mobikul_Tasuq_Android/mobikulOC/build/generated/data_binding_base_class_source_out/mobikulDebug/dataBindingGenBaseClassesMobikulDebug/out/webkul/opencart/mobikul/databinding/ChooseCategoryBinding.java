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

public abstract class ChooseCategoryBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView chooseCategoryRecyclerview;

  protected ChooseCategoryBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView chooseCategoryRecyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.chooseCategoryRecyclerview = chooseCategoryRecyclerview;
  }

  @NonNull
  public static ChooseCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ChooseCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ChooseCategoryBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.choose_category, root, attachToRoot, component);
  }

  @NonNull
  public static ChooseCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ChooseCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ChooseCategoryBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.choose_category, null, false, component);
  }

  public static ChooseCategoryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ChooseCategoryBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ChooseCategoryBinding)bind(component, view, webkul.opencart.mobikul.R.layout.choose_category);
  }
}
