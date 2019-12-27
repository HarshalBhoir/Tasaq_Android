package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.card.MaterialCardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.SimiliarProductsAdapterModel;
import webkul.opencart.mobikul.handlers.SimilarProductHandler;

public abstract class SimilarProductsBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton addToCart;

  @NonNull
  public final MaterialCardView cardViewNewsletter;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView model;

  @NonNull
  public final TextView outOfStock;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final RelativeLayout productImageLayout;

  @NonNull
  public final LinearLayout productInfoLayout;

  @NonNull
  public final LinearLayout productInfoLayoutInner;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productprice;

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
  public final TextView specialProductPrice;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final RelativeLayout trans;

  @NonNull
  public final TextView tvAddToCart;

  @NonNull
  public final ImageView wishlist;

  @Bindable
  protected SimiliarProductsAdapterModel mData;

  @Bindable
  protected SimilarProductHandler mHandler;

  protected SimilarProductsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, MaterialButton addToCart, MaterialCardView cardViewNewsletter,
      LinearLayout linearLayout, TextView model, TextView outOfStock, ImageView productImage,
      RelativeLayout productImageLayout, LinearLayout productInfoLayout,
      LinearLayout productInfoLayoutInner, TextView productName, TextView productprice,
      RatingBar ratingBar, RelativeLayout relative, RelativeLayout relativeLayout, TextView sale,
      TextView sellerStringTV, TextView shortDescription, TextView specialProductPrice,
      TextView textView6, RelativeLayout trans, TextView tvAddToCart, ImageView wishlist) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addToCart = addToCart;
    this.cardViewNewsletter = cardViewNewsletter;
    this.linearLayout = linearLayout;
    this.model = model;
    this.outOfStock = outOfStock;
    this.productImage = productImage;
    this.productImageLayout = productImageLayout;
    this.productInfoLayout = productInfoLayout;
    this.productInfoLayoutInner = productInfoLayoutInner;
    this.productName = productName;
    this.productprice = productprice;
    this.ratingBar = ratingBar;
    this.relative = relative;
    this.relativeLayout = relativeLayout;
    this.sale = sale;
    this.sellerStringTV = sellerStringTV;
    this.shortDescription = shortDescription;
    this.specialProductPrice = specialProductPrice;
    this.textView6 = textView6;
    this.trans = trans;
    this.tvAddToCart = tvAddToCart;
    this.wishlist = wishlist;
  }

  public abstract void setData(@Nullable SimiliarProductsAdapterModel data);

  @Nullable
  public SimiliarProductsAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable SimilarProductHandler handler);

  @Nullable
  public SimilarProductHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static SimilarProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SimilarProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SimilarProductsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.similar_products, root, attachToRoot, component);
  }

  @NonNull
  public static SimilarProductsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SimilarProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SimilarProductsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.similar_products, null, false, component);
  }

  public static SimilarProductsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SimilarProductsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SimilarProductsBinding)bind(component, view, webkul.opencart.mobikul.R.layout.similar_products);
  }
}
