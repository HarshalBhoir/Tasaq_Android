package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;

public abstract class ActivityViewDownloadableProductBinding extends ViewDataBinding {
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
  public final TextView contactUs;

  @NonNull
  public final HorizontalScrollView featuredProductHsv;

  @NonNull
  public final LinearLayout linksLl;

  @NonNull
  public final LinearLayout linksLlOuter;

  @NonNull
  public final TextView moveTOWishList;

  @NonNull
  public final TextView noOfReviewTV;

  @NonNull
  public final TextView productAvailability;

  @NonNull
  public final TextView productCustomOptions;

  @NonNull
  public final TextView productCustomOptionsRequiredField;

  @NonNull
  public final ImageView productImageView;

  @NonNull
  public final TextView productName;

  @NonNull
  public final RatingBar productRating;

  @NonNull
  public final LinearLayout productRatinglayout;

  @NonNull
  public final TextView productShortDescription;

  @NonNull
  public final TextView sellerratingTV;

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
  public final LinearLayout tierPricesLinearLayout;

  @NonNull
  public final LinearLayout tierPricesLinearLayoutStyle;

  @NonNull
  public final LinearLayout viewProductDownloadableDetailLayout;

  @NonNull
  public final ScrollView viewProductScrollView;

  protected ActivityViewDownloadableProductBinding(DataBindingComponent _bindingComponent,
      View _root, int _localFieldCount, TextView averageRatingLabel1, TextView averageRatingLabel2,
      TextView averageRatingLabel3, RatingBar averageRatingRating1, RatingBar averageRatingRating2,
      RatingBar averageRatingRating3, TextView averageRatingTitle, TextView contactUs,
      HorizontalScrollView featuredProductHsv, LinearLayout linksLl, LinearLayout linksLlOuter,
      TextView moveTOWishList, TextView noOfReviewTV, TextView productAvailability,
      TextView productCustomOptions, TextView productCustomOptionsRequiredField,
      ImageView productImageView, TextView productName, RatingBar productRating,
      LinearLayout productRatinglayout, TextView productShortDescription, TextView sellerratingTV,
      LinearLayout smallImageBtnlayout, LinearLayout soldByContainer, TextView soldByLabel,
      LinearLayout soldByLayout, TextView soldByTitle, LinearLayout tierPricesLinearLayout,
      LinearLayout tierPricesLinearLayoutStyle, LinearLayout viewProductDownloadableDetailLayout,
      ScrollView viewProductScrollView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.averageRatingLabel1 = averageRatingLabel1;
    this.averageRatingLabel2 = averageRatingLabel2;
    this.averageRatingLabel3 = averageRatingLabel3;
    this.averageRatingRating1 = averageRatingRating1;
    this.averageRatingRating2 = averageRatingRating2;
    this.averageRatingRating3 = averageRatingRating3;
    this.averageRatingTitle = averageRatingTitle;
    this.contactUs = contactUs;
    this.featuredProductHsv = featuredProductHsv;
    this.linksLl = linksLl;
    this.linksLlOuter = linksLlOuter;
    this.moveTOWishList = moveTOWishList;
    this.noOfReviewTV = noOfReviewTV;
    this.productAvailability = productAvailability;
    this.productCustomOptions = productCustomOptions;
    this.productCustomOptionsRequiredField = productCustomOptionsRequiredField;
    this.productImageView = productImageView;
    this.productName = productName;
    this.productRating = productRating;
    this.productRatinglayout = productRatinglayout;
    this.productShortDescription = productShortDescription;
    this.sellerratingTV = sellerratingTV;
    this.smallImageBtnlayout = smallImageBtnlayout;
    this.soldByContainer = soldByContainer;
    this.soldByLabel = soldByLabel;
    this.soldByLayout = soldByLayout;
    this.soldByTitle = soldByTitle;
    this.tierPricesLinearLayout = tierPricesLinearLayout;
    this.tierPricesLinearLayoutStyle = tierPricesLinearLayoutStyle;
    this.viewProductDownloadableDetailLayout = viewProductDownloadableDetailLayout;
    this.viewProductScrollView = viewProductScrollView;
  }

  @NonNull
  public static ActivityViewDownloadableProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewDownloadableProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewDownloadableProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_downloadable_product, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityViewDownloadableProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityViewDownloadableProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityViewDownloadableProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_view_downloadable_product, null, false, component);
  }

  public static ActivityViewDownloadableProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityViewDownloadableProductBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityViewDownloadableProductBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_view_downloadable_product);
  }
}
