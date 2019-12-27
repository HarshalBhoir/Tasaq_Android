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

public abstract class FragmentLatestProductBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView latestProduct;

  protected FragmentLatestProductBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView latestProduct) {
    super(_bindingComponent, _root, _localFieldCount);
    this.latestProduct = latestProduct;
  }

  @NonNull
  public static FragmentLatestProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentLatestProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentLatestProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_latest_product, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLatestProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentLatestProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentLatestProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_latest_product, null, false, component);
  }

  public static FragmentLatestProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentLatestProductBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentLatestProductBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_latest_product);
  }
}
