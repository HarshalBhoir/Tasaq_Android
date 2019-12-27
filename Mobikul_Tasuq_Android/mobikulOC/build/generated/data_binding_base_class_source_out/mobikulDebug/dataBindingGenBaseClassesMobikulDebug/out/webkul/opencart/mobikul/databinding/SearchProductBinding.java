package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class SearchProductBinding extends ViewDataBinding {
  @NonNull
  public final TextView search;

  @NonNull
  public final ImageView subCategoryImage;

  protected SearchProductBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView search, ImageView subCategoryImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.search = search;
    this.subCategoryImage = subCategoryImage;
  }

  @NonNull
  public static SearchProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_product, root, attachToRoot, component);
  }

  @NonNull
  public static SearchProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_product, null, false, component);
  }

  public static SearchProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchProductBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchProductBinding)bind(component, view, webkul.opencart.mobikul.R.layout.search_product);
  }
}
