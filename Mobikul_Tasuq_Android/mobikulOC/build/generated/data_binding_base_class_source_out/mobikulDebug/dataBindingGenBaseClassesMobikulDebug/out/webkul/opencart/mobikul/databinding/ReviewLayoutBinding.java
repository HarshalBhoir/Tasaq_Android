package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public abstract class ReviewLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView auther;

  @NonNull
  public final TextView date;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView reviewMsg;

  protected ReviewLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView auther, TextView date, RatingBar ratingBar,
      TextView reviewMsg) {
    super(_bindingComponent, _root, _localFieldCount);
    this.auther = auther;
    this.date = date;
    this.ratingBar = ratingBar;
    this.reviewMsg = reviewMsg;
  }

  @NonNull
  public static ReviewLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ReviewLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ReviewLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.review_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ReviewLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ReviewLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ReviewLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.review_layout, null, false, component);
  }

  public static ReviewLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ReviewLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ReviewLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.review_layout);
  }
}
