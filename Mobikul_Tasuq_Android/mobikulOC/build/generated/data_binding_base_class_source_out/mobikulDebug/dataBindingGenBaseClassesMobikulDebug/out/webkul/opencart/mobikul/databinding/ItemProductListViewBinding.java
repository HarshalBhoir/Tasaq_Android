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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.Product;
import webkul.opencart.mobikul.handlers.CategoryActivityHandler;

public abstract class ItemProductListViewBinding extends ViewDataBinding {
  @NonNull
  public final Button addToCart;

  @NonNull
  public final CardView cardViewNewsletter;

  @NonNull
  public final RelativeLayout list;

  @NonNull
  public final TextView model;

  @NonNull
  public final TextView newPrice;

  @NonNull
  public final TextView outOfStock;

  @NonNull
  public final TextView price;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final RelativeLayout productImageLayout;

  @NonNull
  public final LinearLayout productInfoLayoutList;

  @NonNull
  public final RelativeLayout productInfoLayoutPrice;

  @NonNull
  public final TextView productName;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final RatingBar ratingBarFiller;

  @NonNull
  public final TextView sale;

  @NonNull
  public final TextView sellerStringTV;

  @NonNull
  public final TextView shortDescription;

  @NonNull
  public final ImageView wishlist;

  @NonNull
  public final ImageView wishpopup;

  @Bindable
  protected Product mData;

  @Bindable
  protected CategoryActivityHandler mHandler;

  protected ItemProductListViewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button addToCart, CardView cardViewNewsletter, RelativeLayout list,
      TextView model, TextView newPrice, TextView outOfStock, TextView price,
      ImageView productImage, RelativeLayout productImageLayout, LinearLayout productInfoLayoutList,
      RelativeLayout productInfoLayoutPrice, TextView productName, RatingBar ratingBar,
      RatingBar ratingBarFiller, TextView sale, TextView sellerStringTV, TextView shortDescription,
      ImageView wishlist, ImageView wishpopup) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addToCart = addToCart;
    this.cardViewNewsletter = cardViewNewsletter;
    this.list = list;
    this.model = model;
    this.newPrice = newPrice;
    this.outOfStock = outOfStock;
    this.price = price;
    this.productImage = productImage;
    this.productImageLayout = productImageLayout;
    this.productInfoLayoutList = productInfoLayoutList;
    this.productInfoLayoutPrice = productInfoLayoutPrice;
    this.productName = productName;
    this.ratingBar = ratingBar;
    this.ratingBarFiller = ratingBarFiller;
    this.sale = sale;
    this.sellerStringTV = sellerStringTV;
    this.shortDescription = shortDescription;
    this.wishlist = wishlist;
    this.wishpopup = wishpopup;
  }

  public abstract void setData(@Nullable Product data);

  @Nullable
  public Product getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable CategoryActivityHandler handler);

  @Nullable
  public CategoryActivityHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ItemProductListViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemProductListViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemProductListViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_product_list_view, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProductListViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemProductListViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemProductListViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_product_list_view, null, false, component);
  }

  public static ItemProductListViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemProductListViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemProductListViewBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_product_list_view);
  }
}
