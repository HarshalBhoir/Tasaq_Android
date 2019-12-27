package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.ViewProductSimpleHandler;
import webkul.opencart.mobikul.model.getProduct.ProductDetail;

public abstract class ActivityViewSimpleProductBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout addToCartLL;

  @NonNull
  public final TextView addTocartButton;

  @NonNull
  public final TextView addYourReviewTxt;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ImageView arbtn;

  @NonNull
  public final LinearLayout assignProductLayout;

  @NonNull
  public final LinearLayout assignSellerNewList;

  @NonNull
  public final LinearLayout assignSellerUsedList;

  @NonNull
  public final TextView averageRatingLabel1;

  @NonNull
  public final TextView averageRatingLabel2;

  @NonNull
  public final TextView averageRatingLabel3;

  @NonNull
  public final RatingBar averageRatingRating1;

  @NonNull
  public final RatingBar averageRatingRating2;

  @NonNull
  public final RatingBar averageRatingRating3;

  @NonNull
  public final TextView averageRatingTitle;

  @NonNull
  public final RelativeLayout bannerImage;

  @NonNull
  public final ViewPager bannerPager;

  @NonNull
  public final TextView brand;

  @NonNull
  public final TextView buyNowButton;

  @NonNull
  public final TextView contactUs;

  @NonNull
  public final RelativeLayout container;

  @NonNull
  public final LinearLayout customOptionLL;

  @NonNull
  public final LinearLayout customOptionLLOuter;

  @NonNull
  public final LinearLayout descriptionLayotu;

  @NonNull
  public final TextView descriptionTv;

  @NonNull
  public final LinearLayout dotGroup;

  @NonNull
  public final LinearLayout featureLayout;

  @NonNull
  public final TextView featureTv;

  @NonNull
  public final HorizontalScrollView featuredProductHsv;

  @NonNull
  public final RelativeLayout layoutContainer;

  @NonNull
  public final LinearLayout minimumContainer;

  @NonNull
  public final TextView minimumText;

  @NonNull
  public final LinearLayout newAssignProduct;

  @NonNull
  public final TextView newProduct;

  @NonNull
  public final TextView newProductCount;

  @NonNull
  public final TextView nextProduct;

  @NonNull
  public final TextView noOfReviewTV;

  @NonNull
  public final ViewProductSimpleOptionLayoutBinding optionLayout;

  @NonNull
  public final LinearLayout pagerLayout;

  @NonNull
  public final LinearLayout pagerLayout1;

  @NonNull
  public final TextView previousProduct;

  @NonNull
  public final TextView priceInRewardPoints;

  @NonNull
  public final TextView productAvailability;

  @NonNull
  public final LinearLayout productCode;

  @NonNull
  public final ImageView productImageView;

  @NonNull
  public final TextView productModel;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productPrice;

  @NonNull
  public final RatingBar productRating;

  @NonNull
  public final RatingBar productRating1;

  @NonNull
  public final LinearLayout productRatinglayout;

  @NonNull
  public final TextView productShortDescription;

  @NonNull
  public final LinearLayout relatedProductLl;

  @NonNull
  public final TextView relatedProductTv;

  @NonNull
  public final TextView requiredFieldTV;

  @NonNull
  public final LinearLayout reviewContainer;

  @NonNull
  public final LinearLayout reviewGuest;

  @NonNull
  public final LinearLayout reviewLayout;

  @NonNull
  public final TextView reviewTv;

  @NonNull
  public final TextView rewardPoints;

  @NonNull
  public final LinearLayout sellerDetails;

  @NonNull
  public final LinearLayout sellerInfo;

  @NonNull
  public final TextView sellerName;

  @NonNull
  public final TextView sellerratingTV;

  @NonNull
  public final ImageView shareProduct;

  @NonNull
  public final LinearLayout smallImageBtnlayout;

  @NonNull
  public final LinearLayout soldByContainer;

  @NonNull
  public final TextView soldByLabel;

  @NonNull
  public final LinearLayout soldByLayout;

  @NonNull
  public final TextView soldByTitle;

  @NonNull
  public final LinearLayout spaces;

  @NonNull
  public final TextView specialProductPrice;

  @NonNull
  public final TextView specialProductPriceSave;

  @NonNull
  public final TextView tax;

  @NonNull
  public final LinearLayout tierPricesLinearLayout;

  @NonNull
  public final RelativeLayout tierPricesLinearLayoutPrice;

  @NonNull
  public final LinearLayout tierPricesLinearLayoutStyle;

  @NonNull
  public final View toolbar;

  @NonNull
  public final LinearLayout usedAssignProduct;

  @NonNull
  public final TextView usedProduct;

  @NonNull
  public final TextView usedProductCount;

  @NonNull
  public final ProgressBar viewProductProgressBar;

  @NonNull
  public final ScrollView viewProductScrollView;

  @NonNull
  public final LinearLayout viewProductSimpleDetailLayout;

  @NonNull
  public final TextView wishlistTv;

  @Bindable
  protected ProductDetail mData;

  @Bindable
  protected ViewProductSimpleHandler mHandler;

  protected ActivityViewSimpleProductBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout addToCartLL, TextView addTocartButton,
      TextView addYourReviewTxt, AppBarLayout appbar, ImageView arbtn,
      LinearLayout assignProductLayout, LinearLayout assignSellerNewList,
      LinearLayout assignSellerUsedList, TextView averageRatingLabel1, TextView averageRatingLabel2,
      TextView averageRatingLabel3, RatingBar averageRatingRating1, RatingBar averageRatingRating2,
      RatingBar averageRatingRating3, TextView averageRatingTitle, RelativeLayout bannerImage,
      ViewPager bannerPager, TextView brand, TextView buyNowButton, TextView contactUs,
      RelativeLayout container, LinearLayout customOptionLL, LinearLayout customOptionLLOuter,
      LinearLayout descriptionLayotu, TextView descriptionTv, LinearLayout dotGroup,
      LinearLayout featureLayout, TextView featureTv, HorizontalScrollView featuredProductHsv,
      RelativeLayout layoutContainer, LinearLayout minimumContainer, TextView minimumText,
      LinearLayout newAssignProduct, TextView newProduct, TextView newProductCount,
      TextView nextProduct, TextView noOfReviewTV,
      ViewProductSimpleOptionLayoutBinding optionLayout, LinearLayout pagerLayout,
      LinearLayout pagerLayout1, TextView previousProduct, TextView priceInRewardPoints,
      TextView productAvailability, LinearLayout productCode, ImageView productImageView,
      TextView productModel, TextView productName, TextView productPrice, RatingBar productRating,
      RatingBar productRating1, LinearLayout productRatinglayout, TextView productShortDescription,
      LinearLayout relatedProductLl, TextView relatedProductTv, TextView requiredFieldTV,
      LinearLayout reviewContainer, LinearLayout reviewGuest, LinearLayout reviewLayout,
      TextView reviewTv, TextView rewardPoints, LinearLayout sellerDetails, LinearLayout sellerInfo,
      TextView sellerName, TextView sellerratingTV, ImageView shareProduct,
      LinearLayout smallImageBtnlayout, LinearLayout soldByContainer, TextView soldByLabel,
      LinearLayout soldByLayout, TextView soldByTitle, LinearLayout spaces,
      TextView specialProductPrice, TextView specialProductPriceSave, TextView tax,
      LinearLayout tierPricesLinearLayout, RelativeLayout tierPricesLinearLayoutPrice,
      LinearLayout tierPricesLinearLayoutStyle, View toolbar, LinearLayout usedAssignProduct,
      TextView usedProduct, TextView usedProductCount, ProgressBar viewProductProgressBar,
      ScrollView viewProductScrollView, LinearLayout viewProductSimpleDetailLayout,
      TextView wishlistTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addToCartLL = addToCartLL;
    this.addTocartButton = addTocartButton;
    this.addYourReviewTxt = addYourReviewTxt;
    this.appbar = appbar;
    this.arbtn = arbtn;
    this.assignProductLayout = assignProductLayout;
    this.assignSellerNewList = assignSellerNewList;
    this.assignSellerUsedList = assignSellerUsedList;
    this.averageRatingLabel1 = averageRatingLabel1;
    this.averageRatingLabel2 = averageRatingLabel2;
    this.averageRatingLabel3 = averageRatingLabel3;
    this.averageRatingRating1 = averageRatingRating1;
    this.averageRatingRating2 = averageRatingRating2;
    this.averageRatingRating3 = averageRatingRating3;
    this.averageRatingTitle = averageRatingTitle;
    this.bannerImage = bannerImage;
    this.bannerPager = bannerPager;
    this.brand = brand;
    this.buyNowButton = buyNowButton;
    this.contactUs = contactUs;
    this.container = container;
    this.customOptionLL = customOptionLL;
    this.customOptionLLOuter = customOptionLLOuter;
    this.descriptionLayotu = descriptionLayotu;
    this.descriptionTv = descriptionTv;
    this.dotGroup = dotGroup;
    this.featureLayout = featureLayout;
    this.featureTv = featureTv;
    this.featuredProductHsv = featuredProductHsv;
    this.layoutContainer = layoutContainer;
    this.minimumContainer = minimumContainer;
    this.minimumText = minimumText;
    this.newAssignProduct = newAssignProduct;
    this.newProduct = newProduct;
    this.newProductCount = newProductCount;
    this.nextProduct = nextProduct;
    this.noOfReviewTV = noOfReviewTV;
    this.optionLayout = optionLayout;
    setContainedBinding(this.optionLayout);;
    this.pagerLayout = pagerLayout;
    this.pagerLayout1 = pagerLayout1;
    this.previousProduct = previousProduct;
    this.priceInRewardPoints = priceInRewardPoints;
    this.productAvailability = productAvailability;
    this.productCode = productCode;
    this.productImageView = productImageView;
    this.productModel = productModel;
    this.productName = productName;
    this.productPrice = productPrice;
    this.productRating = productRating;
    this.productRating1 = productRating1;
    this.productRatinglayout = productRatinglayout;
    this.productShortDescription = productShortDescription;
    this.relatedProductLl = relatedProductLl;
    this.relatedProductTv = relatedProductTv;
    this.requiredFieldTV = requiredFieldTV;
    this.reviewContainer = reviewContainer;
    this.reviewGuest = reviewGuest;
    this.reviewLayout = reviewLayout;
    this.reviewTv = reviewTv;
    this.rewardPoints = rewardPoints;
    this.sellerDetails = sellerDetails;
    this.sellerInfo = sellerInfo;
    this.sellerName = sellerName;
    this.sellerratingTV = sellerratingTV;
    this.shareProduct = shareProduct;
    this.smallImageBtnlayout = smallImageBtnlayout;
    this.soldByContainer = soldByContainer;
    this.soldByLabel = soldByLabel;
    this.soldByLayout = soldByLayout;
    this.soldByTitle = soldByTitle;
    this.spaces = spaces;
    this.specialProductPrice = specialProductPrice;
    this.specialProductPriceSave = specialProductPriceSave;
    this.tax = tax;
    this.tierPricesLinearLayout = tierPricesLinearLayout;
    this.tierPricesLinearLayoutPrice = tierPricesLinearLayoutPrice;
    this.tierPricesLinearLayoutStyle = tierPricesLinearLayoutStyle;
    this.toolbar = toolbar;
    this.usedAssignProduct = usedAssignProduct;
    this.usedProduct = usedProduct;
    this.usedProductCount = usedProductCount;
    this.viewProductProgressBar = viewProductProgressBar;
    this.viewProductScrollView = viewProductScrollView;
    this.viewProductSimpleDetailLayout = viewProductSimpleDetailLayout;
    this.wishlistTv = wishlistTv;
  }

  public abstract void setData(@Nullable ProductDetail data);

  @Nullable
  public ProductDetail getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable ViewProductSimpleHandler handler);

  @Nullable
  public ViewProductSimpleHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityViewSimpleProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewSimpleProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewSimpleProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_simple_product, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityViewSimpleProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewSimpleProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewSimpleProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_simple_product, null, false, component);
  }

  public static ActivityViewSimpleProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityViewSimpleProductBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityViewSimpleProductBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_view_simple_product);
  }
}
