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

public abstract class ItemProductGridViewBinding extends ViewDataBinding {
  @NonNull
  public final Button addToCart;

  @NonNull
  public final ImageView addToCartPop;

  @NonNull
  public final LinearLayout btnLayout;

  @NonNull
  public final CardView cardViewNewsletter;

  @NonNull
  public final LinearLayout linearLayout;

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
  public final LinearLayout productInfoLayout;

  @NonNull
  public final LinearLayout productInfoLayoutInner;

  @NonNull
  public final RelativeLayout productInfoLayoutPrice;

  @NonNull
  public final TextView productName;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final RelativeLayout relative;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final TextView sale;

  @NonNull
  public final TextView sellerStringTV;

  @NonNull
  public final TextView shortDescription;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final RelativeLayout trans;

  @NonNull
  public final TextView tvAddToCart;

  @NonNull
  public final ImageView wishlist;

  @Bindable
  protected Product mData;

  @Bindable
  protected CategoryActivityHandler mHandler;

  protected ItemProductGridViewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button addToCart, ImageView addToCartPop, LinearLayout btnLayout,
      CardView cardViewNewsletter, LinearLayout linearLayout, TextView model, TextView newPrice,
      TextView outOfStock, TextView price, ImageView productImage,
      RelativeLayout productImageLayout, LinearLayout productInfoLayout,
      LinearLayout productInfoLayoutInner, RelativeLayout productInfoLayoutPrice,
      TextView productName, RatingBar ratingBar, RelativeLayout relative,
      RelativeLayout relativeLayout, TextView sale, TextView sellerStringTV,
      TextView shortDescription, TextView textView6, RelativeLayout trans, TextView tvAddToCart,
      ImageView wishlist) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addToCart = addToCart;
    this.addToCartPop = addToCartPop;
    this.btnLayout = btnLayout;
    this.cardViewNewsletter = cardViewNewsletter;
    this.linearLayout = linearLayout;
    this.model = model;
    this.newPrice = newPrice;
    this.outOfStock = outOfStock;
    this.price = price;
    this.productImage = productImage;
    this.productImageLayout = productImageLayout;
    this.productInfoLayout = productInfoLayout;
    this.productInfoLayoutInner = productInfoLayoutInner;
    this.productInfoLayoutPrice = productInfoLayoutPrice;
    this.productName = productName;
    this.ratingBar = ratingBar;
    this.relative = relative;
    this.relativeLayout = relativeLayout;
    this.sale = sale;
    this.sellerStringTV = sellerStringTV;
    this.shortDescription = shortDescription;
    this.textView6 = textView6;
    this.trans = trans;
    this.tvAddToCart = tvAddToCart;
    this.wishlist = wishlist;
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
  public static ItemProductGridViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemProductGridViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemProductGridViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_product_grid_view, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProductGridViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemProductGridViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemProductGridViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_product_grid_view, null, false, component);
  }

  public static ItemProductGridViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemProductGridViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemProductGridViewBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_product_grid_view);
  }
}
