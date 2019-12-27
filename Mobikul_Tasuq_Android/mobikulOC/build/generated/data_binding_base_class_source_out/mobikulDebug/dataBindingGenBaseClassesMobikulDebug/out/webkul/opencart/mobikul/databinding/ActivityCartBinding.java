package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.CartHandler;

public abstract class ActivityCartBinding extends ViewDataBinding {
  @NonNull
  public final Button EmptyCartTitle;

  @NonNull
  public final ImageView WishListImage;

  @NonNull
  public final TextView WishListText;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final RecyclerView cartRecycler;

  @NonNull
  public final TextView continueShopping;

  @NonNull
  public final CardView couponContainer;

  @NonNull
  public final EditText couponEdittxt;

  @NonNull
  public final Button discountApplyBtn;

  @NonNull
  public final Button discountCancelBtn;

  @NonNull
  public final EditText discoutCOdeET;

  @NonNull
  public final TextView emptyCart;

  @NonNull
  public final TextView emptyCart1;

  @NonNull
  public final Button errorBStn;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final TextView itemsOnTop;

  @NonNull
  public final LinearLayout linearLaoyutAddMoreFromWishlist;

  @NonNull
  public final LinearLayout linearLaoyutAddMoreFromWishlistChild;

  @NonNull
  public final LinearLayout linearLaoyutApplyVoucher;

  @NonNull
  public final LinearLayout linearLaoyutCartTotals;

  @NonNull
  public final LinearLayout linearLaoyutDiscount;

  @NonNull
  public final LinearLayout linearLaoyutDiscountTop;

  @NonNull
  public final LinearLayout linearLayoutMain;

  @NonNull
  public final ProgressBar mainProgressBar;

  @NonNull
  public final RelativeLayout mostParenLayout;

  @NonNull
  public final TextView outOfStockError;

  @NonNull
  public final MaterialButton proceedToCheckout2;

  @NonNull
  public final Button rewardButton;

  @NonNull
  public final CardView rewardCard;

  @NonNull
  public final LinearLayout rewardDiscountTop;

  @NonNull
  public final EditText rewardEdittxt;

  @NonNull
  public final TextView rewardPointsTv;

  @NonNull
  public final TextView rewardTv;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final LinearLayout scrollViewMainContainer;

  @NonNull
  public final RelativeLayout svHeader;

  @NonNull
  public final View toolbar;

  @NonNull
  public final TextView totalAmountOnTop;

  @NonNull
  public final CardView voucherContainer;

  @NonNull
  public final EditText voucherEdittxt;

  @Bindable
  protected CartHandler mHandler;

  protected ActivityCartBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button EmptyCartTitle, ImageView WishListImage, TextView WishListText,
      AppBarLayout appbar, RecyclerView cartRecycler, TextView continueShopping,
      CardView couponContainer, EditText couponEdittxt, Button discountApplyBtn,
      Button discountCancelBtn, EditText discoutCOdeET, TextView emptyCart, TextView emptyCart1,
      Button errorBStn, TextView errorTv, TextView itemsOnTop,
      LinearLayout linearLaoyutAddMoreFromWishlist,
      LinearLayout linearLaoyutAddMoreFromWishlistChild, LinearLayout linearLaoyutApplyVoucher,
      LinearLayout linearLaoyutCartTotals, LinearLayout linearLaoyutDiscount,
      LinearLayout linearLaoyutDiscountTop, LinearLayout linearLayoutMain,
      ProgressBar mainProgressBar, RelativeLayout mostParenLayout, TextView outOfStockError,
      MaterialButton proceedToCheckout2, Button rewardButton, CardView rewardCard,
      LinearLayout rewardDiscountTop, EditText rewardEdittxt, TextView rewardPointsTv,
      TextView rewardTv, ScrollView scrollView, LinearLayout scrollViewMainContainer,
      RelativeLayout svHeader, View toolbar, TextView totalAmountOnTop, CardView voucherContainer,
      EditText voucherEdittxt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.EmptyCartTitle = EmptyCartTitle;
    this.WishListImage = WishListImage;
    this.WishListText = WishListText;
    this.appbar = appbar;
    this.cartRecycler = cartRecycler;
    this.continueShopping = continueShopping;
    this.couponContainer = couponContainer;
    this.couponEdittxt = couponEdittxt;
    this.discountApplyBtn = discountApplyBtn;
    this.discountCancelBtn = discountCancelBtn;
    this.discoutCOdeET = discoutCOdeET;
    this.emptyCart = emptyCart;
    this.emptyCart1 = emptyCart1;
    this.errorBStn = errorBStn;
    this.errorTv = errorTv;
    this.itemsOnTop = itemsOnTop;
    this.linearLaoyutAddMoreFromWishlist = linearLaoyutAddMoreFromWishlist;
    this.linearLaoyutAddMoreFromWishlistChild = linearLaoyutAddMoreFromWishlistChild;
    this.linearLaoyutApplyVoucher = linearLaoyutApplyVoucher;
    this.linearLaoyutCartTotals = linearLaoyutCartTotals;
    this.linearLaoyutDiscount = linearLaoyutDiscount;
    this.linearLaoyutDiscountTop = linearLaoyutDiscountTop;
    this.linearLayoutMain = linearLayoutMain;
    this.mainProgressBar = mainProgressBar;
    this.mostParenLayout = mostParenLayout;
    this.outOfStockError = outOfStockError;
    this.proceedToCheckout2 = proceedToCheckout2;
    this.rewardButton = rewardButton;
    this.rewardCard = rewardCard;
    this.rewardDiscountTop = rewardDiscountTop;
    this.rewardEdittxt = rewardEdittxt;
    this.rewardPointsTv = rewardPointsTv;
    this.rewardTv = rewardTv;
    this.scrollView = scrollView;
    this.scrollViewMainContainer = scrollViewMainContainer;
    this.svHeader = svHeader;
    this.toolbar = toolbar;
    this.totalAmountOnTop = totalAmountOnTop;
    this.voucherContainer = voucherContainer;
    this.voucherEdittxt = voucherEdittxt;
  }

  public abstract void setHandler(@Nullable CartHandler handler);

  @Nullable
  public CartHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCartBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_cart, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCartBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_cart, null, false, component);
  }

  public static ActivityCartBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCartBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCartBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_cart);
  }
}
