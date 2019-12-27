package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.RecentSearchHandler;
import webkul.opencart.mobikul.model.getHomePage.Product;

public abstract class SearchProductItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView firstItem;

  @NonNull
  public final CardView mainLinear;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView search;

  @Bindable
  protected Product mData;

  @Bindable
  protected RecentSearchHandler mHandler;

  protected SearchProductItemLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView firstItem, CardView mainLinear, ImageView productImage,
      TextView search) {
    super(_bindingComponent, _root, _localFieldCount);
    this.firstItem = firstItem;
    this.mainLinear = mainLinear;
    this.productImage = productImage;
    this.search = search;
  }

  public abstract void setData(@Nullable Product data);

  @Nullable
  public Product getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable RecentSearchHandler handler);

  @Nullable
  public RecentSearchHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static SearchProductItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchProductItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchProductItemLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_product_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SearchProductItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchProductItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchProductItemLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_product_item_layout, null, false, component);
  }

  public static SearchProductItemLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchProductItemLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchProductItemLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.search_product_item_layout);
  }
}
