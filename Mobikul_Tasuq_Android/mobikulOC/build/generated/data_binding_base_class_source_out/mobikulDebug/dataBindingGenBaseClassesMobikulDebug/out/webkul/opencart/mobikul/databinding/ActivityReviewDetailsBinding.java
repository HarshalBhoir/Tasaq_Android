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
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TableLayout;
import android.widget.TextView;

public abstract class ActivityReviewDetailsBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout ContainerReviewDetails;

  @NonNull
  public final RatingBar averageRating;

  @NonNull
  public final LinearLayout layoutContainer;

  @NonNull
  public final ImageView productReviewImage;

  @NonNull
  public final TextView reviewDate;

  @NonNull
  public final TextView reviewDetail;

  @NonNull
  public final TextView reviewProductHeading;

  @NonNull
  public final ProgressBar signupprogress;

  @NonNull
  public final TableLayout tableLayout;

  protected ActivityReviewDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout ContainerReviewDetails, RatingBar averageRating,
      LinearLayout layoutContainer, ImageView productReviewImage, TextView reviewDate,
      TextView reviewDetail, TextView reviewProductHeading, ProgressBar signupprogress,
      TableLayout tableLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ContainerReviewDetails = ContainerReviewDetails;
    this.averageRating = averageRating;
    this.layoutContainer = layoutContainer;
    this.productReviewImage = productReviewImage;
    this.reviewDate = reviewDate;
    this.reviewDetail = reviewDetail;
    this.reviewProductHeading = reviewProductHeading;
    this.signupprogress = signupprogress;
    this.tableLayout = tableLayout;
  }

  @NonNull
  public static ActivityReviewDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityReviewDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityReviewDetailsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_review_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityReviewDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityReviewDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityReviewDetailsBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_review_details, null, false, component);
  }

  public static ActivityReviewDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityReviewDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityReviewDetailsBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_review_details);
  }
}
